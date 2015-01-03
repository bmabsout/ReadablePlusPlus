import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;

public class rppWalk extends rppBaseVisitor<String>
{
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
		String ans = "";
		for(rppParser.GlobalContext gtx : ctx.global())
		{
			if(gtx.function() != null)
				ans += "\tfunction here\n";
			else ans += "\t"+visit(gtx.member())+"\n";
		}
		//remember to add the new lines
		for(rppParser.ConstructorContext con : ctx.constructor())
			ans += "\tconstructor\n";

		for(rppParser.DestructorContext dtx : ctx.destructor())
			ans += "\tdestructor\n";
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
}
