import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.*;
import java.util.LinkedList;

public class rppWalk extends rppBaseVisitor<String>
{
	int tabCount = 0;
	boolean inArgs = false;
	LinkedList<String> typeLevel = new LinkedList<String>();

	public String tabs()
	{
		String ans = "";
		for (int i = 0; i < tabCount; i++)
			ans += "\t";
		return ans;
	}

	public String types()
	{
		String output = "";
		boolean first = true;

		for(String elem : typeLevel)
		{
			if(!first)
				output = " " + output;
			output = elem + output;
			first = false;
		}
		return output;
	}

	@Override
	public String visitCompilationUnit(rppParser.CompilationUnitContext ctx)
	{
		if(ctx.globals() != null)
			return visit(ctx.globals());
		return visit(ctx.classGlobals());
	}

	@Override
	public String visitClassGlobals(rppParser.ClassGlobalsContext ctx)
	{
		String ans = "class " + visit(ctx.name()) + "\n{\n";
		ans += visit(ctx.classScope()) + "\n}";
		return ans;
	}

	@Override
	public String visitClassScope(rppParser.ClassScopeContext ctx)
	{
		tabCount++;
		String ans = "";

		int numChildren = ctx.getChildCount();
		for (int i = 0; i < numChildren; i++)
		{
			if(ctx.getChild(i) instanceof TerminalNode)
			{
				if(ctx.getChild(i).getText().equals("\n"))
					ans += "\n";
			}
			else
				ans += visit(ctx.getChild(i));
		}

		tabCount--;
		return ans;
	}

	@Override
	public String visitMember(rppParser.MemberContext ctx)
	{
		return visit(ctx.initialize());
	}

	@Override
	public String visitInitialize(rppParser.InitializeContext ctx)
	{
		String ans = "";

		if (ctx.typeSpecifiers() != null)
			typeLevel.push(ctx.typeSpecifiers().getText());
		else
			typeLevel.push(ctx.declarationSpecifiers().getText());

		int numChildren = ctx.getChildCount();
		boolean first = true;
		for (int i = 1; i < numChildren; i++)
		{
			if (!(ctx.getChild(i) instanceof TerminalNode))
			{
				if(!first && inArgs)
					ans += ", ";

				ans += visit(ctx.getChild(i));
				first = false;
			}
		}

		typeLevel.pop();

		return ans;
	}

	@Override
	public String visitTypeScope(rppParser.TypeScopeContext ctx)
	{
		String ans = "";
		boolean first = true;
		for (rppParser.TypeInitializeContext ttx : ctx.typeInitialize())
		{
			if(!first)
				ans += ", ";
			ans += visit(ttx);
			first = false;
		}
		return ans;
	}

	@Override
	public String visitTypeInitialize(rppParser.TypeInitializeContext ctx)
	{
		String ans = "";
		if(ctx.declarationSpecifiers() == null)
			return visit(ctx.getChild(0));

		typeLevel.push(ctx.declarationSpecifiers().getText());

		int numChildren = ctx.getChildCount();
		boolean first = true;
		for (int i = 1; i < numChildren; i++)
		{
			if (!(ctx.getChild(i) instanceof TerminalNode))
			{
				if(!first)
				{
					if(inArgs)
						ans += ", ";
				}

				ans += visit(ctx.getChild(i));
				first = false;
			}
		}

		typeLevel.pop();
		return ans;
	}

	@Override
	public String visitTypeSpecifiers(rppParser.TypeSpecifiersContext ctx)
	{
		return ctx.type().getText();
	}

	@Override
	public String visitFunction(rppParser.FunctionContext ctx)
	{
		String ans = tabs();
		if(ctx.functionSpecifiers() != null)
			ans += ctx.functionSpecifiers().getText() + " ";
		ans += ctx.type().getText()+ " " + visit(ctx.name());
		return ans + visit(ctx.functionDefinition());
	}

	@Override
	public String visitFunctionDefinition(rppParser.FunctionDefinitionContext ctx)
	{
		String ans = "";
		ans += "(";
		int j = 0;
		inArgs = true;
		if(ctx.lineScope() != null)
		{
			ans += visit(ctx.lineScope());
			j++;
		}
		if(ctx.initializeScope() != null)
		{
			if(j > 0) ans += ", ";
			ans += visit(ctx.initializeScope());
			j++;
		}
        ans += ")\n"+tabs()+"{\n";
		tabCount++;
		inArgs = false;
		int numChildren = ctx.getChildCount();
		boolean first = true;
		int i = 0;
		while ( i < numChildren)
		{
			if (!(ctx.getChild(i) instanceof TerminalNode))
			{
				if(j == 0)
					ans += visit(ctx.getChild(i));
				else
					j--;
			}
			i++;
		}
		tabCount--;
		ans += tabs()+"}";
		return ans;
	}

	@Override
	public String visitLineScope(rppParser.LineScopeContext ctx)
	{
		String ans = "";

		if (ctx.typeSpecifiers() != null)
			typeLevel.push(ctx.typeSpecifiers().getText());
		else
			typeLevel.push(ctx.declarationSpecifiers().getText());

		int numChildren = ctx.getChildCount();
		boolean first = true;
		boolean popped = false;
		for (int i = 1; i < numChildren; i++)
		{
			if (!(ctx.getChild(i) instanceof TerminalNode))
			{
				if(!first && inArgs)
					ans += ", ";
				ans += visit(ctx.getChild(i));
				first = false;
			}
			else if(ctx.getChild(i).getText().equals("|"))
			{
				if(!popped)
					typeLevel.pop();
				popped = true;
			}
		}

		if(!popped)
			typeLevel.pop();

		return ans;
	}

	@Override
	public String visitInitializeScope(rppParser.InitializeScopeContext ctx)
	{
		String ans = "";
		boolean first = true;
		for (rppParser.InitializeContext itx : ctx.initialize())
		{
			if(!first && inArgs)
				ans += ", ";
			ans += visit(itx);
			first = false;
		}
		return ans;
	}

	@Override
	public String visitScope(rppParser.ScopeContext ctx)
	{
		return visit(ctx.body());
	}

	@Override
	public String visitLinemix(rppParser.LinemixContext ctx)
	{
		int numChildren = ctx.getChildCount();
		boolean first = true;
		String ans = "";
		for (int i = 0; i < numChildren; i++)
		{
			if (!(ctx.getChild(i) instanceof TerminalNode))
			{
				if(!first && inArgs)
					ans += ", ";

				ans += visit(ctx.getChild(i));

				first = false;
			}
		}

		return ans;
	}

	@Override
	public String visitLineAssign(rppParser.LineAssignContext ctx)
	{
		String ans = "";
		String expr = visit(ctx.expr());
		boolean first = true;
		for(rppParser.NameContext ntx : ctx.declarators().name())
		{
			if(!inArgs)
				ans += tabs();
			ans += types() + " " + ntx.getText() +" = "+ expr;
			if(!inArgs)
				ans += ";\n";

			first = false;
		}
		return ans;
	}

	@Override
	public String visitDeclarators(rppParser.DeclaratorsContext ctx)
	{
		String ans = "";
		boolean first = true;
		for(rppParser.NameContext ntx : ctx.name())
		{
			if (!first && inArgs)
				ans += ", ";

			if(!inArgs)
				ans += tabs();

			ans += types() +" "+ ntx.getText();

			if(!inArgs)
				ans += ";\n";

			first = false;
		}
		return ans;
	}

	@Override
	public String visitClosedItem(rppParser.ClosedItemContext ctx)
	{
		String ans = "";
		String expr = "";
		if(ctx.expr() != null)
			expr = visit(ctx.expr());
		else
			expr = visit(ctx.closedExpr());
		boolean first = true;
		for(rppParser.NameContext ntx : ctx.declarators().name())
		{

			if (!first && inArgs)
				ans += ", ";

			if(!inArgs)
				ans += tabs();

			ans += types() + " " + ntx.getText() +" = "+ expr;
			if(!inArgs)
				ans += ";\n";

			first = false;
		}
		return ans;
	}

	@Override
	public String visitExpr(rppParser.ExprContext ctx)
	{
		return visit(ctx.getChild(0));
	}

	@Override
	public String visitClosedExpr(rppParser.ClosedExprContext ctx)
	{
		return visit(ctx.getChild(0));
	}

	@Override
	public String visitOpenFunction(rppParser.OpenFunctionContext ctx)
	{
		String ans = visit(ctx.name())+"(";
		boolean first = true;
		for(rppParser.ClosedExprContext etx : ctx.closedExpr())
		{
			if (!first)
				ans += ", ";
			ans += visit(etx);
			first = false;
		}
		ans += ")";
		return ans;
	}

	@Override
	public String visitClosedFunction(rppParser.ClosedFunctionContext ctx)
	{
		String ans = visit(ctx.name())+"(";
		boolean first = true;
		for(rppParser.ClosedExprContext etx : ctx.closedExpr())
		{
			if (!first)
				ans += ", ";
			ans += visit(etx);
			first = false;
		}
		ans += ")";
		return ans;
	}

	@Override
	public String visitName(rppParser.NameContext ctx)
	{
		return ctx.getText();
	}

	@Override
	public String visitType(rppParser.TypeContext ctx)
	{
		return ctx.getText();
	}

	@Override
	public String visitUnaryExpr(rppParser.UnaryExprContext ctx)
	{
		return ctx.getText();
	}

	@Override
	public String visitNumber(rppParser.NumberContext ctx)
	{
		return ctx.getText();
	}

	@Override
	public String visitFlat(rppParser.FlatContext ctx)
	{
		String ans = "";
		for (rppParser.LineContext ltx : ctx.line())
		{
			ans += visit(ltx);
		}
		return ans;
	}

	@Override
	public String visitLine(rppParser.LineContext ctx)
	{
		if(ctx.initialize() != null)
			return visit(ctx.initialize());
		if(ctx.expr() != null)
			return tabs() + visit(ctx.expr()) + ";\n";
		return visit(ctx.getChild(0));
	}

	@Override
	public String visitBody(rppParser.BodyContext ctx)
	{
		String ans = "";
		int numChildren = ctx.getChildCount();
		for(int i = 0; i < numChildren; i++)
		{
			if(ctx.getChild(i) instanceof TerminalNode)
				ans += "\n";
			else
				ans += visit(ctx.getChild(i));
		}
		return ans;
	}

	@Override
	public String visitAssignment(rppParser.AssignmentContext ctx)
	{
		String ans = "";
		boolean first = true;
		for (rppParser.NameContext ntx: ctx.declarators().name())
		{
			if(!first && inArgs)
				ans += ", ";
			if(!inArgs)
				ans += tabs();
			ans += ntx.getText() + " " + visit(ctx.assignmentOperator()) + " " + visit(ctx.expr());
			if(!inArgs)
				ans += ";\n";
			first = false;
		}
		return ans;
	}

	@Override
	public String visitAssignmentOperator(rppParser.AssignmentOperatorContext ctx)
	{
		return ctx.getChild(0).getText();
	}

	@Override
	public String visitIfStatement(rppParser.IfStatementContext ctx)
	{
		String ans = tabs()+"if";
		boolean first = true;
		for(rppParser.StatementHelperContext stx : ctx.statementHelper())
		{
			if(!first)
				ans += tabs()+"else if";
			ans += visit(stx);
			first = false;
		}
		if(ctx.scope() != null)
		{
			ans += tabs()+"else\n" + tabs() + "{\n";
			tabCount++;
			if(ctx.flat() != null)
				ans += visit(ctx.flat());
			ans += visit(ctx.scope());
			tabCount--;
			ans += tabs()+"}\n";
		}
		return ans;
	}

	@Override
	public String visitWhileStatement(rppParser.WhileStatementContext ctx)
	{
		String ans = "";
		if(ctx.statementHelper() != null)
			ans +=  tabs() + "while" + visit(ctx.statementHelper());
		else
		{
			ans += "\n" + tabs() + "{\n";
			tabCount++;
			if(ctx.flat() != null)
				ans += visit(ctx.flat());
			if(ctx.scope() != null)
				ans += visit(ctx.scope());
			tabCount--;
			ans += tabs()+"} do(" + visit(ctx.logicExpr())+")\n";
		}
		return ans;
	}

	@Override
	public String visitForStatement(rppParser.ForStatementContext ctx)
	{
		String ans = tabs() + "for(";
		if(ctx.range() != null)
		{
			String range = ctx.range().getText();
			String[] elems = range.split("\\s?\\.\\.\\s?");
			ans += "int ____ = ";
			if(elems[1].compareTo(elems[0]) > 0)
				ans += elems[0] + "; ____ < " + elems[1] + "; ____++";
			else
				ans += elems[1] + "; ____ < " + elems[0] + "; ____++";

			ans += ")\n";
		}
		ans += "\n" + tabs() + "{\n";
		tabCount++;
		if(ctx.flat() != null)
			ans += visit(ctx.flat());
		if(ctx.scope() != null)
			ans += visit(ctx.scope());
		tabCount--;
		ans += tabs() +"}\n";
		return ans;
	}

	@Override
	public String visitSwitchStatement(rppParser.SwitchStatementContext ctx)
	{
		return tabs() + "switch("+visit(ctx.expr())+")\n" + visit(ctx.switchScope());
	}

	@Override
	public String visitSwitchScope(rppParser.SwitchScopeContext ctx)
	{
		String ans = tabs()+"{\n";
		tabCount++;
		for (rppParser.CaseScopeContext stx: ctx.caseScope())
			ans += visit(stx);

		tabCount--;
		ans += tabs() + "}\n";
		return ans;
	}

	@Override
	public String visitCaseScope(rppParser.CaseScopeContext ctx)
	{
		String ans = "";
		rppParser.CasesContext cax = ctx.cases();
		int numChildren = cax.getChildCount();
		for(int i = 0; i < numChildren; i++)
		{
			if(!(cax.getChild(i) instanceof TerminalNode))
			{

				if(cax.getChild(i) instanceof rppParser.RangeContext)
				{
					String range = cax.getChild(i).getText();
					String[] elems = range.split("\\s?\\.\\.\\s?");
					int from = Integer.parseInt(elems[0]);
					int to = Integer.parseInt(elems[1]);
					for(int j = from;j < to; j++)
						ans += tabs() + "case " + j + ":\n";
				}
				else
					ans += tabs() + "case " + visit(cax.getChild(i)) + ":\n";
			}
		}
		tabCount++;
		if(ctx.line() != null)
			ans += visit(ctx.line());
		if(ctx.scope() != null)
			ans += visit(ctx.scope());
		ans += tabs() + "break;\n";
		tabCount--;
		return ans;
	}

	@Override
	public String visitStatementHelper(rppParser.StatementHelperContext ctx)
	{
		String ans = "("+visit(ctx.logicExpr())+")\n"+tabs()+"{\n";
		tabCount++;
		if(ctx.scope() != null)
			ans += visit(ctx.scope());
		else
			ans += visit(ctx.body());

		tabCount--;
		ans += tabs()+"}\n";
		return ans;
	}

	@Override
	public String visitLogicExpr(rppParser.LogicExprContext ctx)
	{
		return ctx.getText();
	}

}
