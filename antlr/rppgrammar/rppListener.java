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
	 * Enter a parse tree produced by {@link rppParser#newLine}.
	 * @param ctx the parse tree
	 */
	void enterNewLine(@NotNull rppParser.NewLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link rppParser#newLine}.
	 * @param ctx the parse tree
	 */
	void exitNewLine(@NotNull rppParser.NewLineContext ctx);

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