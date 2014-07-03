// Generated from /media/ssd/Dropbox/ReadablePlusPlus/antlr/rppgrammar/rpp.g4 by ANTLR 4.3
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link rppParser}.
 */
public interface rppListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link rppParser#functions}.
	 * @param ctx the parse tree
	 */
	void enterFunctions(@NotNull rppParser.FunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link rppParser#functions}.
	 * @param ctx the parse tree
	 */
	void exitFunctions(@NotNull rppParser.FunctionsContext ctx);

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
	 * Enter a parse tree produced by {@link rppParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull rppParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rppParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull rppParser.FunctionContext ctx);
}