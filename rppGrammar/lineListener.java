// Generated from /media/ssd/Dropbox/ReadablePlusPlus/rppGrammar/line.g4 by ANTLR 4.3
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link lineParser}.
 */
public interface lineListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link lineParser#assigns}.
	 * @param ctx the parse tree
	 */
	void enterAssigns(@NotNull lineParser.AssignsContext ctx);
	/**
	 * Exit a parse tree produced by {@link lineParser#assigns}.
	 * @param ctx the parse tree
	 */
	void exitAssigns(@NotNull lineParser.AssignsContext ctx);

	/**
	 * Enter a parse tree produced by {@link lineParser#lineTabs}.
	 * @param ctx the parse tree
	 */
	void enterLineTabs(@NotNull lineParser.LineTabsContext ctx);
	/**
	 * Exit a parse tree produced by {@link lineParser#lineTabs}.
	 * @param ctx the parse tree
	 */
	void exitLineTabs(@NotNull lineParser.LineTabsContext ctx);

	/**
	 * Enter a parse tree produced by {@link lineParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull lineParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link lineParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull lineParser.AssignContext ctx);

	/**
	 * Enter a parse tree produced by {@link lineParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(@NotNull lineParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link lineParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(@NotNull lineParser.DeclaratorContext ctx);

	/**
	 * Enter a parse tree produced by {@link lineParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgs(@NotNull lineParser.FunctionArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link lineParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgs(@NotNull lineParser.FunctionArgsContext ctx);

	/**
	 * Enter a parse tree produced by {@link lineParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull lineParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link lineParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull lineParser.LineContext ctx);

	/**
	 * Enter a parse tree produced by {@link lineParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull lineParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link lineParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull lineParser.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link lineParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull lineParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link lineParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull lineParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link lineParser#lineAssign}.
	 * @param ctx the parse tree
	 */
	void enterLineAssign(@NotNull lineParser.LineAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link lineParser#lineAssign}.
	 * @param ctx the parse tree
	 */
	void exitLineAssign(@NotNull lineParser.LineAssignContext ctx);

	/**
	 * Enter a parse tree produced by {@link lineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(@NotNull lineParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link lineParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(@NotNull lineParser.FunctionCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link lineParser#functionNoArgs}.
	 * @param ctx the parse tree
	 */
	void enterFunctionNoArgs(@NotNull lineParser.FunctionNoArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link lineParser#functionNoArgs}.
	 * @param ctx the parse tree
	 */
	void exitFunctionNoArgs(@NotNull lineParser.FunctionNoArgsContext ctx);

	/**
	 * Enter a parse tree produced by {@link lineParser#linemix}.
	 * @param ctx the parse tree
	 */
	void enterLinemix(@NotNull lineParser.LinemixContext ctx);
	/**
	 * Exit a parse tree produced by {@link lineParser#linemix}.
	 * @param ctx the parse tree
	 */
	void exitLinemix(@NotNull lineParser.LinemixContext ctx);

	/**
	 * Enter a parse tree produced by {@link lineParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull lineParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link lineParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull lineParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link lineParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull lineParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link lineParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull lineParser.NameContext ctx);

	/**
	 * Enter a parse tree produced by {@link lineParser#closedExpr}.
	 * @param ctx the parse tree
	 */
	void enterClosedExpr(@NotNull lineParser.ClosedExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link lineParser#closedExpr}.
	 * @param ctx the parse tree
	 */
	void exitClosedExpr(@NotNull lineParser.ClosedExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link lineParser#closedItem}.
	 * @param ctx the parse tree
	 */
	void enterClosedItem(@NotNull lineParser.ClosedItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link lineParser#closedItem}.
	 * @param ctx the parse tree
	 */
	void exitClosedItem(@NotNull lineParser.ClosedItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link lineParser#tabs}.
	 * @param ctx the parse tree
	 */
	void enterTabs(@NotNull lineParser.TabsContext ctx);
	/**
	 * Exit a parse tree produced by {@link lineParser#tabs}.
	 * @param ctx the parse tree
	 */
	void exitTabs(@NotNull lineParser.TabsContext ctx);
}