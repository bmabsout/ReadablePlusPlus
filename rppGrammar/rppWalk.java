import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;

public class rppWalk extends rppBaseVisitor<String>
{
	int tabCount = 0;

	public String tabs()
	{
		String ans = "";
		for (int i = 0; i < tabCount; i++)
			ans += "\t";
		return ans;
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
		for(rppParser.GlobalContext gtx : ctx.global())
		{
			if(gtx.function() != null)
				ans += tabs()+visit(gtx.function())+"\n";
			else ans += tabs()+visit(gtx.member())+"\n";
		}
		//remember to add the new lines
		for(rppParser.ConstructorContext con : ctx.constructor())
			ans += "\tconstructor\n";

		for(rppParser.DestructorContext dtx : ctx.destructor())
			ans += "\tdestructor\n";
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
		if (ctx.typeSpecifiers() != null)
		{
			return visit(ctx.typeSpecifiers());
		}
		return "crazy";
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
		if(ctx.lineScope() != null)
			ans += visit(ctx.lineScope());
		else
			ans += visit(ctx.argScope());
		ans += ")\n"+tabs()+"{\n";

		ans += visit(ctx.scope());
		ans += "\n"+tabs()+"}";
		return ans;
	}

	@Override
	public String visitArgScope(rppParser.ArgScopeContext ctx)
	{
		String ans = "";
		for (rppParser.InitializeContext itx : ctx.initialize())
			ans += "initialize, ";
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

}
