// Generated from /media/ssd/Dropbox/ReadablePlusPlus/antlr/rppgrammar/rpp.g4 by ANTLR 4.3
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link rppParser}.
 */
public interface rppListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link rppParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(@NotNull rppParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link rppParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(@NotNull rppParser.BodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link rppParser#lineTabs}.
	 * @param ctx the parse tree
	 */
	void enterLineTabs(@NotNull rppParser.LineTabsContext ctx);
	/**
	 * Exit a parse tree produced by {@link rppParser#lineTabs}.
	 * @param ctx the parse tree
	 */
	void exitLineTabs(@NotNull rppParser.LineTabsContext ctx);

	/**
	 * Enter a parse tree produced by {@link rppParser#functionStuff}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStuff(@NotNull rppParser.FunctionStuffContext ctx);
	/**
	 * Exit a parse tree produced by {@link rppParser#functionStuff}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStuff(@NotNull rppParser.FunctionStuffContext ctx);

	/**
	 * Enter a parse tree produced by {@link rppParser#statementHelper}.
	 * @param ctx the parse tree
	 */
	void enterStatementHelper(@NotNull rppParser.StatementHelperContext ctx);
	/**
	 * Exit a parse tree produced by {@link rppParser#statementHelper}.
	 * @param ctx the parse tree
	 */
	void exitStatementHelper(@NotNull rppParser.StatementHelperContext ctx);

	/**
	 * Enter a parse tree produced by {@link rppParser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(@NotNull rppParser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link rppParser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(@NotNull rppParser.ArgsContext ctx);

	/**
	 * Enter a parse tree produced by {@link rppParser#global}.
	 * @param ctx the parse tree
	 */
	void enterGlobal(@NotNull rppParser.GlobalContext ctx);
	/**
	 * Exit a parse tree produced by {@link rppParser#global}.
	 * @param ctx the parse tree
	 */
	void exitGlobal(@NotNull rppParser.GlobalContext ctx);

	/**
	 * Enter a parse tree produced by {@link rppParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpression(@NotNull rppParser.LogicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rppParser#logicExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpression(@NotNull rppParser.LogicExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link rppParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull rppParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link rppParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull rppParser.LineContext ctx);

	/**
	 * Enter a parse tree produced by {@link rppParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull rppParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link rppParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull rppParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link rppParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull rppParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rppParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull rppParser.FunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link rppParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull rppParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rppParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull rppParser.IfStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link rppParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull rppParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rppParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull rppParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link rppParser#globals}.
	 * @param ctx the parse tree
	 */
	void enterGlobals(@NotNull rppParser.GlobalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link rppParser#globals}.
	 * @param ctx the parse tree
	 */
	void exitGlobals(@NotNull rppParser.GlobalsContext ctx);

	/**
	 * Enter a parse tree produced by {@link rppParser#classGlobals}.
	 * @param ctx the parse tree
	 */
	void enterClassGlobals(@NotNull rppParser.ClassGlobalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link rppParser#classGlobals}.
	 * @param ctx the parse tree
	 */
	void exitClassGlobals(@NotNull rppParser.ClassGlobalsContext ctx);

	/**
	 * Enter a parse tree produced by {@link rppParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull rppParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link rppParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull rppParser.WhileStatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link rppParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull rppParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link rppParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull rppParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link rppParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull rppParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link rppParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull rppParser.NameContext ctx);

	/**
	 * Enter a parse tree produced by {@link rppParser#tabs}.
	 * @param ctx the parse tree
	 */
	void enterTabs(@NotNull rppParser.TabsContext ctx);
	/**
	 * Exit a parse tree produced by {@link rppParser#tabs}.
	 * @param ctx the parse tree
	 */
	void exitTabs(@NotNull rppParser.TabsContext ctx);

	/**
	 * Enter a parse tree produced by {@link rppParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(@NotNull rppParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link rppParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(@NotNull rppParser.ConstructorContext ctx);
}