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
		String ans = "class " + ctx.name().getText() + "\n{\n";
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
				ans += tabs() + visit(ctx.getChild(i));
		}

		// for(rppParser.GlobalContext gtx : ctx.global())
		// {
		// 	if(gtx.function() != null)
		// 		ans += tabs()+visit(gtx.function())+"\n";
		// 	else ans += tabs()+visit(gtx.member())+"\n";
		// }
		// //remember to add the new lines
		// for(rppParser.ConstructorContext con : ctx.constructor())
		// 	ans += "\tconstructor\n";

		// for(rppParser.DestructorContext dtx : ctx.destructor())
		// 	ans += "\tdestructor\n";
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
		boolean firstTime = true;
		for (int i = 1; i < numChildren; i++)
		{
			if (!(ctx.getChild(i) instanceof TerminalNode))
			{
				if(!firstTime)
					ans += ", ";

				ans += visit(ctx.getChild(i));
				firstTime = false;
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
		boolean firstTime = true;
		for (int i = 1; i < numChildren; i++)
		{
			if (!(ctx.getChild(i) instanceof TerminalNode))
			{
				if(!firstTime)
				{
					if(inArgs)
						ans += ", ";
					else
						ans += ";\n";
				}

				ans += visit(ctx.getChild(i));
				firstTime = false;
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
		String ans = "";
		if(ctx.functionSpecifiers() != null)
			ans += ctx.functionSpecifiers().getText() + " ";
		ans += ctx.type().getText()+ " " + ctx.name().getText();
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
		if(ctx.argScope() != null)
		{
			if(j > 0) ans += ", ";
			ans += visit(ctx.argScope());
			j++;
		}
        ans += ")\n"+tabs()+"{\n";
		inArgs = false;
		int numChildren = ctx.getChildCount();
		boolean firstTime = true;
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

		ans += "\n"+tabs()+"}";
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
		boolean firstTime = true;
		boolean popped = false;
		for (int i = 1; i < numChildren; i++)
		{
			if (!(ctx.getChild(i) instanceof TerminalNode))
			{
				if(!firstTime)
					ans += ", ";

				ans += visit(ctx.getChild(i));
				firstTime = false;
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
	public String visitArgScope(rppParser.ArgScopeContext ctx)
	{
		inArgs = true;
		String ans = "";
		if(ctx.initialize().size() > 0)
			ans += visit(ctx.initialize(0));
		for (int i = 1 ; i < ctx.initialize().size(); i++)
			ans += ", " + visit(ctx.initialize(i));
		inArgs = false;
		return ans;
	}

	@Override
	public String visitScope(rppParser.ScopeContext ctx)
	{
		tabCount++;
		String ans = "";
		ans += tabs() + "bodey\n";
		tabCount--;
		return ans;
	}

	@Override
	public String visitLinemix(rppParser.LinemixContext ctx)
	{
		int numChildren = ctx.getChildCount();
		boolean firstTime = true;
		String ans = "";
		for (int i = 0; i < numChildren; i++)
		{
			if (!(ctx.getChild(i) instanceof TerminalNode))
			{
				if(!firstTime && inArgs)
					ans += ", ";

				ans += visit(ctx.getChild(i));
				firstTime = false;
			}
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
			ans += types() +" "+ ntx.getText();
			if(!inArgs)
				ans += ";\n"+tabs();

			first = false;
		}
		return ans;
	}

}
