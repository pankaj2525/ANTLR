// Generated from MONGOParser.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MONGOParser}.
 */
public interface MONGOParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MONGOParser#delete_statements}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statements(@NotNull MONGOParser.Delete_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#delete_statements}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statements(@NotNull MONGOParser.Delete_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#type2}.
	 * @param ctx the parse tree
	 */
	void enterType2(@NotNull MONGOParser.Type2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#type2}.
	 * @param ctx the parse tree
	 */
	void exitType2(@NotNull MONGOParser.Type2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#insert_statements}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statements(@NotNull MONGOParser.Insert_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#insert_statements}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statements(@NotNull MONGOParser.Insert_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#update_statements}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statements(@NotNull MONGOParser.Update_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#update_statements}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statements(@NotNull MONGOParser.Update_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#find_statements}.
	 * @param ctx the parse tree
	 */
	void enterFind_statements(@NotNull MONGOParser.Find_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#find_statements}.
	 * @param ctx the parse tree
	 */
	void exitFind_statements(@NotNull MONGOParser.Find_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#type1}.
	 * @param ctx the parse tree
	 */
	void enterType1(@NotNull MONGOParser.Type1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#type1}.
	 * @param ctx the parse tree
	 */
	void exitType1(@NotNull MONGOParser.Type1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(@NotNull MONGOParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(@NotNull MONGOParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#db_name}.
	 * @param ctx the parse tree
	 */
	void enterDb_name(@NotNull MONGOParser.Db_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#db_name}.
	 * @param ctx the parse tree
	 */
	void exitDb_name(@NotNull MONGOParser.Db_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull MONGOParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull MONGOParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#dml_statement}.
	 * @param ctx the parse tree
	 */
	void enterDml_statement(@NotNull MONGOParser.Dml_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#dml_statement}.
	 * @param ctx the parse tree
	 */
	void exitDml_statement(@NotNull MONGOParser.Dml_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(@NotNull MONGOParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(@NotNull MONGOParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#mongo_statements}.
	 * @param ctx the parse tree
	 */
	void enterMongo_statements(@NotNull MONGOParser.Mongo_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#mongo_statements}.
	 * @param ctx the parse tree
	 */
	void exitMongo_statements(@NotNull MONGOParser.Mongo_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#mongo_statement}.
	 * @param ctx the parse tree
	 */
	void enterMongo_statement(@NotNull MONGOParser.Mongo_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#mongo_statement}.
	 * @param ctx the parse tree
	 */
	void exitMongo_statement(@NotNull MONGOParser.Mongo_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#intialQuerry}.
	 * @param ctx the parse tree
	 */
	void enterIntialQuerry(@NotNull MONGOParser.IntialQuerryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#intialQuerry}.
	 * @param ctx the parse tree
	 */
	void exitIntialQuerry(@NotNull MONGOParser.IntialQuerryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#json_input}.
	 * @param ctx the parse tree
	 */
	void enterJson_input(@NotNull MONGOParser.Json_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#json_input}.
	 * @param ctx the parse tree
	 */
	void exitJson_input(@NotNull MONGOParser.Json_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull MONGOParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull MONGOParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#collection_name}.
	 * @param ctx the parse tree
	 */
	void enterCollection_name(@NotNull MONGOParser.Collection_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#collection_name}.
	 * @param ctx the parse tree
	 */
	void exitCollection_name(@NotNull MONGOParser.Collection_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(@NotNull MONGOParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(@NotNull MONGOParser.ObjectContext ctx);
}