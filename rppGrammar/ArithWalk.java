import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.*;
import java.util.List;


public class ArithWalk extends arithmeticsBaseVisitor<String>
{
	@Override public String visitAName(@NotNull arithmeticsParser.ANameContext ctx)
	{
		return ctx.getText();
	}

	@Override public String visitMulDiv(@NotNull arithmeticsParser.MulDivContext ctx)
	{
		String left  = visit(ctx.arithmetic(0));
		String middle = ctx.mdop().getText();
		String right = visit(ctx.arithmetic(1));
		return left + middle + right;
	}

	@Override public String visitAddSub(@NotNull arithmeticsParser.AddSubContext ctx)
	{
		String left  = visit(ctx.arithmetic(0));
		String middle = ctx.asop().getText();
		String right = visit(ctx.arithmetic(1));
		return left + middle + right;
	}

	@Override public String visitParen(@NotNull arithmeticsParser.ParenContext ctx)
	{
		return "("+visit(ctx.arithmetic())+")";
	}

	@Override public String visitParenl(@NotNull arithmeticsParser.ParenlContext ctx)
	{
		return "("+visit(ctx.clogic())+")";
	}


	@Override public String visitLine(@NotNull arithmeticsParser.LineContext ctx)
	{
		String ans = "";
		for (int i = 0; i < ctx.getChildCount(); i++)
			if (!(ctx.getChild(i) instanceof TerminalNode))
				ans += visit(ctx.getChild(i));
		return ans;
	}

	@Override public String visitNewLines(@NotNull arithmeticsParser.NewLinesContext ctx)
	{
		return ctx.getText();
	}

	@Override public String visitOrl(@NotNull arithmeticsParser.OrlContext ctx)
	{
		String left  = visit(ctx.clogic(0));
		String right = visit(ctx.clogic(1));
		return left + " || " + right;
	}

	@Override public String visitAndl(@NotNull arithmeticsParser.AndlContext ctx)
	{
		String left  = visit(ctx.clogic(0));
		String right = visit(ctx.clogic(1));
		return left + " && " + right;
	}

	@Override public String visitArithl(@NotNull arithmeticsParser.ArithlContext ctx)
	{
		return visit(ctx.arithmetic());
	}

	@Override public String visitDop(@NotNull arithmeticsParser.DopContext ctx)
	{
		return ctx.getChild(0).getText();
	}

	public String getMultiLogic(int i, arithmeticsParser.ComplContext ctx)
	{
		String ans = "";
		String middle = visit(ctx.comparison(i));
		List<arithmeticsParser.ClogicContext> multiLeft = ctx.multiLogic(i).clogic();
		List<arithmeticsParser.ClogicContext> multiRight = ctx.multiLogic(i+1).clogic();
		List<arithmeticsParser.DopContext> dopsLeft = ctx.multiLogic(i).dop();
		List<arithmeticsParser.DopContext> dopsRight = ctx.multiLogic(i+1).dop();
		int l = 0;
		for (arithmeticsParser.ClogicContext cleft: multiLeft)
		{
			if(l > 0)
				ans += visit(dopsLeft.get(l-1));

			int j = 0;
			String left = visit(cleft);
			if(dopsLeft != null)
				ans += "(";
			for (arithmeticsParser.ClogicContext cright: multiRight)
			{
				if(j > 0)
					ans += visit(dopsRight.get(j-1));

				ans += left + " " + middle + " " + visit(cright);
				j++;
			}
			l++;
			if(dopsLeft != null)
				ans += ")";
		}
		return ans;
	}

	@Override public String visitCompl(@NotNull arithmeticsParser.ComplContext ctx)
	{
		String ans = getMultiLogic(0,ctx);
		for(int i = 1; i < ctx.comparison().size(); i++)
			ans += " && " +  getMultiLogic(i,ctx);

		return ans;
	}

	@Override public String visitClogl(@NotNull arithmeticsParser.CloglContext ctx)
	{
		return visit(ctx.clogic());
	}

	@Override public String visitComparison(@NotNull arithmeticsParser.ComparisonContext ctx)
	{
		if (ctx.cop().getText().equals("?"))
			return "==";
		if (ctx.cop().getText().equals("~?"))
			return "!=";
		else if(ctx.cop().getText().equals(">"))
			return ">";
		else if(ctx.cop().getText().equals("<"))
			return "<";
		else if(ctx.cop().getText().equals(">?"))
			return ">=";
		else if(ctx.cop().getText().equals("?>"))
			return ">=";
		else if(ctx.cop().getText().equals("<?"))
			return "<=";
		else if(ctx.cop().getText().equals("?<"))
			return "<=";
		else return "notpossible";
	}


}
