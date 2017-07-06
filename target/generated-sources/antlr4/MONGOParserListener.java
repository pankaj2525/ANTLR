// Generated from MONGOParser.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MONGOParser}.
 */
public interface MONGOParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MONGOParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(@NotNull MONGOParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(@NotNull MONGOParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#operations_input_method_input}.
	 * @param ctx the parse tree
	 */
	void enterOperations_input_method_input(@NotNull MONGOParser.Operations_input_method_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#operations_input_method_input}.
	 * @param ctx the parse tree
	 */
	void exitOperations_input_method_input(@NotNull MONGOParser.Operations_input_method_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#other_methods}.
	 * @param ctx the parse tree
	 */
	void enterOther_methods(@NotNull MONGOParser.Other_methodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#other_methods}.
	 * @param ctx the parse tree
	 */
	void exitOther_methods(@NotNull MONGOParser.Other_methodsContext ctx);
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
	 * Enter a parse tree produced by {@link MONGOParser#single_doc_input_method}.
	 * @param ctx the parse tree
	 */
	void enterSingle_doc_input_method(@NotNull MONGOParser.Single_doc_input_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#single_doc_input_method}.
	 * @param ctx the parse tree
	 */
	void exitSingle_doc_input_method(@NotNull MONGOParser.Single_doc_input_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#single_or_multiple_doc_input_method}.
	 * @param ctx the parse tree
	 */
	void enterSingle_or_multiple_doc_input_method(@NotNull MONGOParser.Single_or_multiple_doc_input_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#single_or_multiple_doc_input_method}.
	 * @param ctx the parse tree
	 */
	void exitSingle_or_multiple_doc_input_method(@NotNull MONGOParser.Single_or_multiple_doc_input_methodContext ctx);
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
	 * Enter a parse tree produced by {@link MONGOParser#multiple_doc_input_method}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_doc_input_method(@NotNull MONGOParser.Multiple_doc_input_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#multiple_doc_input_method}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_doc_input_method(@NotNull MONGOParser.Multiple_doc_input_methodContext ctx);
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
	 * Enter a parse tree produced by {@link MONGOParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull MONGOParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull MONGOParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#document_array}.
	 * @param ctx the parse tree
	 */
	void enterDocument_array(@NotNull MONGOParser.Document_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#document_array}.
	 * @param ctx the parse tree
	 */
	void exitDocument_array(@NotNull MONGOParser.Document_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#collection_methods}.
	 * @param ctx the parse tree
	 */
	void enterCollection_methods(@NotNull MONGOParser.Collection_methodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#collection_methods}.
	 * @param ctx the parse tree
	 */
	void exitCollection_methods(@NotNull MONGOParser.Collection_methodsContext ctx);
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
	 * Enter a parse tree produced by {@link MONGOParser#operations_input_method}.
	 * @param ctx the parse tree
	 */
	void enterOperations_input_method(@NotNull MONGOParser.Operations_input_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#operations_input_method}.
	 * @param ctx the parse tree
	 */
	void exitOperations_input_method(@NotNull MONGOParser.Operations_input_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#query_statements}.
	 * @param ctx the parse tree
	 */
	void enterQuery_statements(@NotNull MONGOParser.Query_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#query_statements}.
	 * @param ctx the parse tree
	 */
	void exitQuery_statements(@NotNull MONGOParser.Query_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#cursor_methods}.
	 * @param ctx the parse tree
	 */
	void enterCursor_methods(@NotNull MONGOParser.Cursor_methodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#cursor_methods}.
	 * @param ctx the parse tree
	 */
	void exitCursor_methods(@NotNull MONGOParser.Cursor_methodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#aggregate_statement}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_statement(@NotNull MONGOParser.Aggregate_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#aggregate_statement}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_statement(@NotNull MONGOParser.Aggregate_statementContext ctx);
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