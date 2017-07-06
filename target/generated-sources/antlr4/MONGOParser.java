// Generated from MONGOParser.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MONGOParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INSERTONE=5, BULKWRITE=14, DD=38, HH=39, UNDERSCORE=16, MILLISEC=35, ISTO_CHAR=24, 
		COMMAR_CHAR=25, TEXT=15, DELETEONE=10, SPACE=1, INSERTMANY=6, AGGREGATE=13, 
		FIND=3, REPLACEONE=11, UPDATE=7, CustomDate=34, CLOSE_SQUARE_BRACKET=21, 
		MM=37, NUMBER=30, NULL=28, OPEN_ROUND_BRACKET=18, DATETYPE=33, DELETEMANY=12, 
		DOT=17, TRUE=26, YYYY=36, SEC=41, CLOSE_ROUND_BRACKET=19, DATE=32, MIN=40, 
		UPDATEONE=9, CLOSE_CURLY_BRACKET=23, UPDATEMANY=8, STRING=29, INSERT=4, 
		FALSE=27, OPEN_SQUARE_BRACKET=20, DB=2, OPEN_CURLY_BRACKET=22, KEYWORDS=31;
	public static final String[] tokenNames = {
		"<INVALID>", "SPACE", "DB", "'find'", "'insert'", "'insertOne'", "'insertMany'", 
		"'update'", "'updateMany'", "'updateOne'", "'deleteOne'", "'replaceOne'", 
		"'deleteMany'", "'aggregate'", "'bulkWrite'", "TEXT", "'_'", "'.'", "'('", 
		"')'", "'['", "']'", "'{'", "'}'", "':'", "','", "'true'", "'false'", 
		"'null'", "STRING", "NUMBER", "KEYWORDS", "DATE", "DATETYPE", "CustomDate", 
		"MILLISEC", "YYYY", "MM", "DD", "HH", "MIN", "SEC"
	};
	public static final int
		RULE_mongo_statements = 0, RULE_mongo_statement = 1, RULE_cursor_methods = 2, 
		RULE_aggregate_statement = 3, RULE_intialQuerry = 4, RULE_document = 5, 
		RULE_document_array = 6, RULE_collection_methods = 7, RULE_operations_input_method_input = 8, 
		RULE_operations_input_method = 9, RULE_parameter = 10, RULE_other_methods = 11, 
		RULE_single_doc_input_method = 12, RULE_multiple_doc_input_method = 13, 
		RULE_single_or_multiple_doc_input_method = 14, RULE_query_statements = 15, 
		RULE_json_input = 16, RULE_db_name = 17, RULE_collection_name = 18, RULE_json = 19, 
		RULE_object = 20, RULE_pair = 21, RULE_array = 22, RULE_value = 23;
	public static final String[] ruleNames = {
		"mongo_statements", "mongo_statement", "cursor_methods", "aggregate_statement", 
		"intialQuerry", "document", "document_array", "collection_methods", "operations_input_method_input", 
		"operations_input_method", "parameter", "other_methods", "single_doc_input_method", 
		"multiple_doc_input_method", "single_or_multiple_doc_input_method", "query_statements", 
		"json_input", "db_name", "collection_name", "json", "object", "pair", 
		"array", "value"
	};

	@Override
	public String getGrammarFileName() { return "MONGOParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MONGOParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Mongo_statementsContext extends ParserRuleContext {
		public Mongo_statementContext mongo_statement() {
			return getRuleContext(Mongo_statementContext.class,0);
		}
		public Mongo_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mongo_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterMongo_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitMongo_statements(this);
		}
	}

	public final Mongo_statementsContext mongo_statements() throws RecognitionException {
		Mongo_statementsContext _localctx = new Mongo_statementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mongo_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); mongo_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mongo_statementContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(MONGOParser.DOT); }
		public IntialQuerryContext intialQuerry() {
			return getRuleContext(IntialQuerryContext.class,0);
		}
		public List<Collection_methodsContext> collection_methods() {
			return getRuleContexts(Collection_methodsContext.class);
		}
		public TerminalNode DOT(int i) {
			return getToken(MONGOParser.DOT, i);
		}
		public Collection_methodsContext collection_methods(int i) {
			return getRuleContext(Collection_methodsContext.class,i);
		}
		public Mongo_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mongo_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterMongo_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitMongo_statement(this);
		}
	}

	public final Mongo_statementContext mongo_statement() throws RecognitionException {
		Mongo_statementContext _localctx = new Mongo_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mongo_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); intialQuerry();
			{
			setState(51); collection_methods();
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(52); match(DOT);
				setState(53); collection_methods();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cursor_methodsContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(MONGOParser.TEXT, 0); }
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public Cursor_methodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_methods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterCursor_methods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitCursor_methods(this);
		}
	}

	public final Cursor_methodsContext cursor_methods() throws RecognitionException {
		Cursor_methodsContext _localctx = new Cursor_methodsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cursor_methods);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59); match(TEXT);
			setState(60); match(OPEN_ROUND_BRACKET);
			setState(61); match(CLOSE_ROUND_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aggregate_statementContext extends ParserRuleContext {
		public TerminalNode AGGREGATE() { return getToken(MONGOParser.AGGREGATE, 0); }
		public Aggregate_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterAggregate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitAggregate_statement(this);
		}
	}

	public final Aggregate_statementContext aggregate_statement() throws RecognitionException {
		Aggregate_statementContext _localctx = new Aggregate_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_aggregate_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); match(AGGREGATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntialQuerryContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(MONGOParser.DOT); }
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public Db_nameContext db_name() {
			return getRuleContext(Db_nameContext.class,0);
		}
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public Collection_nameContext collection_name() {
			return getRuleContext(Collection_nameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(MONGOParser.STRING, 0); }
		public TerminalNode DOT(int i) {
			return getToken(MONGOParser.DOT, i);
		}
		public IntialQuerryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intialQuerry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterIntialQuerry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitIntialQuerry(this);
		}
	}

	public final IntialQuerryContext intialQuerry() throws RecognitionException {
		IntialQuerryContext _localctx = new IntialQuerryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_intialQuerry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); db_name();
			setState(66); match(DOT);
			setState(67); collection_name();
			setState(71);
			_la = _input.LA(1);
			if (_la==OPEN_ROUND_BRACKET) {
				{
				setState(68); match(OPEN_ROUND_BRACKET);
				setState(69); match(STRING);
				setState(70); match(CLOSE_ROUND_BRACKET);
				}
			}

			setState(73); match(DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DocumentContext extends ParserRuleContext {
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public Json_inputContext json_input() {
			return getRuleContext(Json_inputContext.class,0);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitDocument(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_document);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); match(OPEN_ROUND_BRACKET);
			setState(76); json_input();
			setState(77); match(CLOSE_ROUND_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Document_arrayContext extends ParserRuleContext {
		public TerminalNode COMMAR_CHAR(int i) {
			return getToken(MONGOParser.COMMAR_CHAR, i);
		}
		public TerminalNode OPEN_CURLY_BRACKET(int i) {
			return getToken(MONGOParser.OPEN_CURLY_BRACKET, i);
		}
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public Json_inputContext json_input(int i) {
			return getRuleContext(Json_inputContext.class,i);
		}
		public List<TerminalNode> OPEN_CURLY_BRACKET() { return getTokens(MONGOParser.OPEN_CURLY_BRACKET); }
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(MONGOParser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(MONGOParser.CLOSE_SQUARE_BRACKET, 0); }
		public List<TerminalNode> COMMAR_CHAR() { return getTokens(MONGOParser.COMMAR_CHAR); }
		public List<Json_inputContext> json_input() {
			return getRuleContexts(Json_inputContext.class);
		}
		public List<TerminalNode> CLOSE_CURLY_BRACKET() { return getTokens(MONGOParser.CLOSE_CURLY_BRACKET); }
		public TerminalNode CLOSE_CURLY_BRACKET(int i) {
			return getToken(MONGOParser.CLOSE_CURLY_BRACKET, i);
		}
		public Document_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterDocument_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitDocument_array(this);
		}
	}

	public final Document_arrayContext document_array() throws RecognitionException {
		Document_arrayContext _localctx = new Document_arrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_document_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(OPEN_ROUND_BRACKET);
			setState(80); match(OPEN_SQUARE_BRACKET);
			setState(81); json_input();
			setState(82); match(CLOSE_SQUARE_BRACKET);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMAR_CHAR) {
				{
				{
				setState(83); match(COMMAR_CHAR);
				setState(84); match(OPEN_CURLY_BRACKET);
				setState(85); json_input();
				setState(86); match(CLOSE_CURLY_BRACKET);
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93); match(CLOSE_ROUND_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collection_methodsContext extends ParserRuleContext {
		public Operations_input_method_inputContext operations_input_method_input() {
			return getRuleContext(Operations_input_method_inputContext.class,0);
		}
		public Operations_input_methodContext operations_input_method() {
			return getRuleContext(Operations_input_methodContext.class,0);
		}
		public List<Cursor_methodsContext> cursor_methods() {
			return getRuleContexts(Cursor_methodsContext.class);
		}
		public Single_or_multiple_doc_input_methodContext single_or_multiple_doc_input_method() {
			return getRuleContext(Single_or_multiple_doc_input_methodContext.class,0);
		}
		public Multiple_doc_input_methodContext multiple_doc_input_method() {
			return getRuleContext(Multiple_doc_input_methodContext.class,0);
		}
		public TerminalNode DOT(int i) {
			return getToken(MONGOParser.DOT, i);
		}
		public Single_doc_input_methodContext single_doc_input_method() {
			return getRuleContext(Single_doc_input_methodContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(MONGOParser.DOT); }
		public Aggregate_statementContext aggregate_statement() {
			return getRuleContext(Aggregate_statementContext.class,0);
		}
		public Other_methodsContext other_methods() {
			return getRuleContext(Other_methodsContext.class,0);
		}
		public DocumentContext document() {
			return getRuleContext(DocumentContext.class,0);
		}
		public Cursor_methodsContext cursor_methods(int i) {
			return getRuleContext(Cursor_methodsContext.class,i);
		}
		public Query_statementsContext query_statements() {
			return getRuleContext(Query_statementsContext.class,0);
		}
		public Document_arrayContext document_array() {
			return getRuleContext(Document_arrayContext.class,0);
		}
		public Collection_methodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_methods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterCollection_methods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitCollection_methods(this);
		}
	}

	public final Collection_methodsContext collection_methods() throws RecognitionException {
		Collection_methodsContext _localctx = new Collection_methodsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_collection_methods);
		try {
			int _alt;
			setState(129);
			switch (_input.LA(1)) {
			case EOF:
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case INSERTONE:
			case UPDATEONE:
			case DELETEONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(96); single_doc_input_method();
				setState(97); document();
				}
				break;
			case INSERTMANY:
			case UPDATEMANY:
			case DELETEMANY:
				enterOuterAlt(_localctx, 3);
				{
				setState(99); multiple_doc_input_method();
				setState(100); document_array();
				}
				break;
			case INSERT:
			case UPDATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(102); single_or_multiple_doc_input_method();
				setState(105);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(103); document();
					}
					break;
				case 2:
					{
					setState(104); document_array();
					}
					break;
				}
				}
				break;
			case AGGREGATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(107); aggregate_statement();
				setState(108); parameter();
				}
				break;
			case FIND:
				enterOuterAlt(_localctx, 6);
				{
				setState(110); query_statements();
				setState(114);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(111); document();
					}
					break;
				case 2:
					{
					setState(112); document_array();
					}
					break;
				case 3:
					{
					setState(113); parameter();
					}
					break;
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(116); match(DOT);
						setState(117); cursor_methods();
						}
						} 
					}
					setState(122);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			case BULKWRITE:
				enterOuterAlt(_localctx, 7);
				{
				setState(123); operations_input_method();
				setState(124); operations_input_method_input();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 8);
				{
				setState(126); other_methods();
				setState(127); parameter();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operations_input_method_inputContext extends ParserRuleContext {
		public List<TerminalNode> UPDATEMANY() { return getTokens(MONGOParser.UPDATEMANY); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public List<TerminalNode> OPEN_CURLY_BRACKET() { return getTokens(MONGOParser.OPEN_CURLY_BRACKET); }
		public TerminalNode UPDATEMANY(int i) {
			return getToken(MONGOParser.UPDATEMANY, i);
		}
		public List<TerminalNode> DELETEONE() { return getTokens(MONGOParser.DELETEONE); }
		public List<TerminalNode> ISTO_CHAR() { return getTokens(MONGOParser.ISTO_CHAR); }
		public TerminalNode INSERTONE(int i) {
			return getToken(MONGOParser.INSERTONE, i);
		}
		public TerminalNode DELETEMANY(int i) {
			return getToken(MONGOParser.DELETEMANY, i);
		}
		public TerminalNode REPLACEONE(int i) {
			return getToken(MONGOParser.REPLACEONE, i);
		}
		public TerminalNode UPDATEONE(int i) {
			return getToken(MONGOParser.UPDATEONE, i);
		}
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(MONGOParser.OPEN_SQUARE_BRACKET, 0); }
		public List<TerminalNode> CLOSE_CURLY_BRACKET() { return getTokens(MONGOParser.CLOSE_CURLY_BRACKET); }
		public TerminalNode CLOSE_CURLY_BRACKET(int i) {
			return getToken(MONGOParser.CLOSE_CURLY_BRACKET, i);
		}
		public TerminalNode ISTO_CHAR(int i) {
			return getToken(MONGOParser.ISTO_CHAR, i);
		}
		public TerminalNode COMMAR_CHAR(int i) {
			return getToken(MONGOParser.COMMAR_CHAR, i);
		}
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(MONGOParser.CLOSE_SQUARE_BRACKET, 0); }
		public List<TerminalNode> COMMAR_CHAR() { return getTokens(MONGOParser.COMMAR_CHAR); }
		public TerminalNode DELETEONE(int i) {
			return getToken(MONGOParser.DELETEONE, i);
		}
		public List<TerminalNode> DELETEMANY() { return getTokens(MONGOParser.DELETEMANY); }
		public TerminalNode OPEN_CURLY_BRACKET(int i) {
			return getToken(MONGOParser.OPEN_CURLY_BRACKET, i);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> UPDATEONE() { return getTokens(MONGOParser.UPDATEONE); }
		public List<TerminalNode> INSERTONE() { return getTokens(MONGOParser.INSERTONE); }
		public List<TerminalNode> REPLACEONE() { return getTokens(MONGOParser.REPLACEONE); }
		public Operations_input_method_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operations_input_method_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterOperations_input_method_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitOperations_input_method_input(this);
		}
	}

	public final Operations_input_method_inputContext operations_input_method_input() throws RecognitionException {
		Operations_input_method_inputContext _localctx = new Operations_input_method_inputContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operations_input_method_input);
		int _la;
		try {
			setState(162);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131); match(OPEN_ROUND_BRACKET);
				setState(132); match(OPEN_SQUARE_BRACKET);
				setState(133); match(OPEN_CURLY_BRACKET);
				setState(134);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INSERTONE) | (1L << UPDATEMANY) | (1L << UPDATEONE) | (1L << DELETEONE) | (1L << REPLACEONE) | (1L << DELETEMANY))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(135); match(ISTO_CHAR);
				setState(136); value();
				setState(137); match(CLOSE_CURLY_BRACKET);
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMAR_CHAR) {
					{
					{
					setState(138); match(COMMAR_CHAR);
					setState(139); match(OPEN_CURLY_BRACKET);
					setState(140);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INSERTONE) | (1L << UPDATEMANY) | (1L << UPDATEONE) | (1L << DELETEONE) | (1L << REPLACEONE) | (1L << DELETEMANY))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(141); match(ISTO_CHAR);
					setState(142); value();
					setState(143); match(CLOSE_CURLY_BRACKET);
					}
					}
					setState(149);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(150); match(CLOSE_SQUARE_BRACKET);
				setState(151); match(CLOSE_ROUND_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153); match(OPEN_ROUND_BRACKET);
				{
				setState(154); match(OPEN_CURLY_BRACKET);
				setState(155);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INSERTONE) | (1L << UPDATEMANY) | (1L << UPDATEONE) | (1L << DELETEONE) | (1L << REPLACEONE) | (1L << DELETEMANY))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(156); match(ISTO_CHAR);
				setState(157); value();
				setState(158); match(CLOSE_CURLY_BRACKET);
				}
				setState(160); match(CLOSE_ROUND_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operations_input_methodContext extends ParserRuleContext {
		public TerminalNode BULKWRITE() { return getToken(MONGOParser.BULKWRITE, 0); }
		public Operations_input_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operations_input_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterOperations_input_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitOperations_input_method(this);
		}
	}

	public final Operations_input_methodContext operations_input_method() throws RecognitionException {
		Operations_input_methodContext _localctx = new Operations_input_methodContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operations_input_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); match(BULKWRITE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode COMMAR_CHAR(int i) {
			return getToken(MONGOParser.COMMAR_CHAR, i);
		}
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public List<TerminalNode> OPEN_CURLY_BRACKET() { return getTokens(MONGOParser.OPEN_CURLY_BRACKET); }
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public List<TerminalNode> CLOSE_SQUARE_BRACKET() { return getTokens(MONGOParser.CLOSE_SQUARE_BRACKET); }
		public TerminalNode CLOSE_SQUARE_BRACKET(int i) {
			return getToken(MONGOParser.CLOSE_SQUARE_BRACKET, i);
		}
		public List<TerminalNode> COMMAR_CHAR() { return getTokens(MONGOParser.COMMAR_CHAR); }
		public List<Json_inputContext> json_input() {
			return getRuleContexts(Json_inputContext.class);
		}
		public TerminalNode OPEN_CURLY_BRACKET(int i) {
			return getToken(MONGOParser.OPEN_CURLY_BRACKET, i);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Json_inputContext json_input(int i) {
			return getRuleContext(Json_inputContext.class,i);
		}
		public List<TerminalNode> OPEN_SQUARE_BRACKET() { return getTokens(MONGOParser.OPEN_SQUARE_BRACKET); }
		public TerminalNode OPEN_SQUARE_BRACKET(int i) {
			return getToken(MONGOParser.OPEN_SQUARE_BRACKET, i);
		}
		public List<TerminalNode> CLOSE_CURLY_BRACKET() { return getTokens(MONGOParser.CLOSE_CURLY_BRACKET); }
		public TerminalNode CLOSE_CURLY_BRACKET(int i) {
			return getToken(MONGOParser.CLOSE_CURLY_BRACKET, i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); match(OPEN_ROUND_BRACKET);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << OPEN_SQUARE_BRACKET) | (1L << OPEN_CURLY_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << STRING) | (1L << NUMBER) | (1L << DATE))) != 0)) {
				{
				setState(182);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(167); value();
					}
					break;
				case 2:
					{
					setState(168); json_input();
					}
					break;
				case 3:
					{
					setState(169); match(OPEN_SQUARE_BRACKET);
					setState(170); json_input();
					setState(171); match(CLOSE_SQUARE_BRACKET);
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMAR_CHAR) {
						{
						{
						setState(172); match(COMMAR_CHAR);
						setState(173); match(OPEN_CURLY_BRACKET);
						setState(174); json_input();
						setState(175); match(CLOSE_CURLY_BRACKET);
						}
						}
						setState(181);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187); match(CLOSE_ROUND_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Other_methodsContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(MONGOParser.TEXT, 0); }
		public Other_methodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_methods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterOther_methods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitOther_methods(this);
		}
	}

	public final Other_methodsContext other_methods() throws RecognitionException {
		Other_methodsContext _localctx = new Other_methodsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_other_methods);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); match(TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_doc_input_methodContext extends ParserRuleContext {
		public TerminalNode UPDATEONE() { return getToken(MONGOParser.UPDATEONE, 0); }
		public TerminalNode DELETEONE() { return getToken(MONGOParser.DELETEONE, 0); }
		public TerminalNode INSERTONE() { return getToken(MONGOParser.INSERTONE, 0); }
		public Single_doc_input_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_doc_input_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterSingle_doc_input_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitSingle_doc_input_method(this);
		}
	}

	public final Single_doc_input_methodContext single_doc_input_method() throws RecognitionException {
		Single_doc_input_methodContext _localctx = new Single_doc_input_methodContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_single_doc_input_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INSERTONE) | (1L << UPDATEONE) | (1L << DELETEONE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiple_doc_input_methodContext extends ParserRuleContext {
		public TerminalNode UPDATEMANY() { return getToken(MONGOParser.UPDATEMANY, 0); }
		public TerminalNode INSERTMANY() { return getToken(MONGOParser.INSERTMANY, 0); }
		public TerminalNode DELETEMANY() { return getToken(MONGOParser.DELETEMANY, 0); }
		public Multiple_doc_input_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_doc_input_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterMultiple_doc_input_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitMultiple_doc_input_method(this);
		}
	}

	public final Multiple_doc_input_methodContext multiple_doc_input_method() throws RecognitionException {
		Multiple_doc_input_methodContext _localctx = new Multiple_doc_input_methodContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_multiple_doc_input_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INSERTMANY) | (1L << UPDATEMANY) | (1L << DELETEMANY))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_or_multiple_doc_input_methodContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(MONGOParser.UPDATE, 0); }
		public TerminalNode INSERT() { return getToken(MONGOParser.INSERT, 0); }
		public Single_or_multiple_doc_input_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_or_multiple_doc_input_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterSingle_or_multiple_doc_input_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitSingle_or_multiple_doc_input_method(this);
		}
	}

	public final Single_or_multiple_doc_input_methodContext single_or_multiple_doc_input_method() throws RecognitionException {
		Single_or_multiple_doc_input_methodContext _localctx = new Single_or_multiple_doc_input_methodContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_single_or_multiple_doc_input_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_la = _input.LA(1);
			if ( !(_la==INSERT || _la==UPDATE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_statementsContext extends ParserRuleContext {
		public TerminalNode FIND() { return getToken(MONGOParser.FIND, 0); }
		public Query_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterQuery_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitQuery_statements(this);
		}
	}

	public final Query_statementsContext query_statements() throws RecognitionException {
		Query_statementsContext _localctx = new Query_statementsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_query_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); match(FIND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Json_inputContext extends ParserRuleContext {
		public TerminalNode COMMAR_CHAR(int i) {
			return getToken(MONGOParser.COMMAR_CHAR, i);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public List<TerminalNode> COMMAR_CHAR() { return getTokens(MONGOParser.COMMAR_CHAR); }
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public Json_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterJson_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitJson_input(this);
		}
	}

	public final Json_inputContext json_input() throws RecognitionException {
		Json_inputContext _localctx = new Json_inputContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_json_input);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199); object();
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(200); match(COMMAR_CHAR);
					setState(201); object();
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Db_nameContext extends ParserRuleContext {
		public TerminalNode DB() { return getToken(MONGOParser.DB, 0); }
		public Db_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_db_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterDb_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitDb_name(this);
		}
	}

	public final Db_nameContext db_name() throws RecognitionException {
		Db_nameContext _localctx = new Db_nameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_db_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); match(DB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collection_nameContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(MONGOParser.TEXT, 0); }
		public Collection_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterCollection_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitCollection_name(this);
		}
	}

	public final Collection_nameContext collection_name() throws RecognitionException {
		Collection_nameContext _localctx = new Collection_nameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_collection_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); match(TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JsonContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitJson(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode COMMAR_CHAR(int i) {
			return getToken(MONGOParser.COMMAR_CHAR, i);
		}
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(MONGOParser.OPEN_CURLY_BRACKET, 0); }
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public List<TerminalNode> COMMAR_CHAR() { return getTokens(MONGOParser.COMMAR_CHAR); }
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(MONGOParser.CLOSE_CURLY_BRACKET, 0); }
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_object);
		int _la;
		try {
			setState(226);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213); match(OPEN_CURLY_BRACKET);
				setState(214); pair();
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMAR_CHAR) {
					{
					{
					setState(215); match(COMMAR_CHAR);
					setState(216); pair();
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(222); match(CLOSE_CURLY_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224); match(OPEN_CURLY_BRACKET);
				setState(225); match(CLOSE_CURLY_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PairContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(MONGOParser.TEXT, 0); }
		public TerminalNode ISTO_CHAR() { return getToken(MONGOParser.ISTO_CHAR, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(MONGOParser.STRING, 0); }
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitPair(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_la = _input.LA(1);
			if ( !(_la==TEXT || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(229); match(ISTO_CHAR);
			setState(230); value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode COMMAR_CHAR(int i) {
			return getToken(MONGOParser.COMMAR_CHAR, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(MONGOParser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(MONGOParser.CLOSE_SQUARE_BRACKET, 0); }
		public List<TerminalNode> COMMAR_CHAR() { return getTokens(MONGOParser.COMMAR_CHAR); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_array);
		int _la;
		try {
			setState(245);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232); match(OPEN_SQUARE_BRACKET);
				setState(233); value();
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMAR_CHAR) {
					{
					{
					setState(234); match(COMMAR_CHAR);
					setState(235); value();
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(241); match(CLOSE_SQUARE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243); match(OPEN_SQUARE_BRACKET);
				setState(244); match(CLOSE_SQUARE_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(MONGOParser.TEXT, 0); }
		public TerminalNode NULL() { return getToken(MONGOParser.NULL, 0); }
		public TerminalNode FALSE() { return getToken(MONGOParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(MONGOParser.TRUE, 0); }
		public TerminalNode STRING() { return getToken(MONGOParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(MONGOParser.NUMBER, 0); }
		public TerminalNode DATE() { return getToken(MONGOParser.DATE, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_value);
		try {
			setState(256);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(247); match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(248); match(NUMBER);
				}
				break;
			case OPEN_CURLY_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(249); object();
				}
				break;
			case OPEN_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 4);
				{
				setState(250); array();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(251); match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(252); match(FALSE);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(253); match(NULL);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 8);
				{
				setState(254); match(TEXT);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 9);
				{
				setState(255); match(DATE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u0105\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6J\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b[\n\b\f\b\16\b^\13\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tl\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"u\n\t\3\t\3\t\7\ty\n\t\f\t\16\t|\13\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0084"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0094"+
		"\n\n\f\n\16\n\u0097\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u00a5\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\7\f\u00b4\n\f\f\f\16\f\u00b7\13\f\7\f\u00b9\n\f\f\f\16\f\u00bc\13\f\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22"+
		"\7\22\u00cd\n\22\f\22\16\22\u00d0\13\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\7\26\u00dc\n\26\f\26\16\26\u00df\13\26\3\26\3\26"+
		"\3\26\3\26\5\26\u00e5\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30"+
		"\u00ef\n\30\f\30\16\30\u00f2\13\30\3\30\3\30\3\30\3\30\5\30\u00f8\n\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0103\n\31\3\31\3\u00ce"+
		"\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\7\4\2\7\7\n"+
		"\16\4\2\7\7\13\f\5\2\b\b\n\n\16\16\4\2\6\6\t\t\4\2\21\21\37\37\u010d\2"+
		"\62\3\2\2\2\4\64\3\2\2\2\6=\3\2\2\2\bA\3\2\2\2\nC\3\2\2\2\fM\3\2\2\2\16"+
		"Q\3\2\2\2\20\u0083\3\2\2\2\22\u00a4\3\2\2\2\24\u00a6\3\2\2\2\26\u00a8"+
		"\3\2\2\2\30\u00bf\3\2\2\2\32\u00c1\3\2\2\2\34\u00c3\3\2\2\2\36\u00c5\3"+
		"\2\2\2 \u00c7\3\2\2\2\"\u00c9\3\2\2\2$\u00d1\3\2\2\2&\u00d3\3\2\2\2(\u00d5"+
		"\3\2\2\2*\u00e4\3\2\2\2,\u00e6\3\2\2\2.\u00f7\3\2\2\2\60\u0102\3\2\2\2"+
		"\62\63\5\4\3\2\63\3\3\2\2\2\64\65\5\n\6\2\65:\5\20\t\2\66\67\7\23\2\2"+
		"\679\5\20\t\28\66\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\5\3\2\2\2<:\3"+
		"\2\2\2=>\7\21\2\2>?\7\24\2\2?@\7\25\2\2@\7\3\2\2\2AB\7\17\2\2B\t\3\2\2"+
		"\2CD\5$\23\2DE\7\23\2\2EI\5&\24\2FG\7\24\2\2GH\7\37\2\2HJ\7\25\2\2IF\3"+
		"\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\7\23\2\2L\13\3\2\2\2MN\7\24\2\2NO\5\"\22"+
		"\2OP\7\25\2\2P\r\3\2\2\2QR\7\24\2\2RS\7\26\2\2ST\5\"\22\2T\\\7\27\2\2"+
		"UV\7\33\2\2VW\7\30\2\2WX\5\"\22\2XY\7\31\2\2Y[\3\2\2\2ZU\3\2\2\2[^\3\2"+
		"\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\25\2\2`\17\3\2\2\2"+
		"a\u0084\3\2\2\2bc\5\32\16\2cd\5\f\7\2d\u0084\3\2\2\2ef\5\34\17\2fg\5\16"+
		"\b\2g\u0084\3\2\2\2hk\5\36\20\2il\5\f\7\2jl\5\16\b\2ki\3\2\2\2kj\3\2\2"+
		"\2l\u0084\3\2\2\2mn\5\b\5\2no\5\26\f\2o\u0084\3\2\2\2pt\5 \21\2qu\5\f"+
		"\7\2ru\5\16\b\2su\5\26\f\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2uz\3\2\2\2vw\7"+
		"\23\2\2wy\5\6\4\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\u0084\3\2\2"+
		"\2|z\3\2\2\2}~\5\24\13\2~\177\5\22\n\2\177\u0084\3\2\2\2\u0080\u0081\5"+
		"\30\r\2\u0081\u0082\5\26\f\2\u0082\u0084\3\2\2\2\u0083a\3\2\2\2\u0083"+
		"b\3\2\2\2\u0083e\3\2\2\2\u0083h\3\2\2\2\u0083m\3\2\2\2\u0083p\3\2\2\2"+
		"\u0083}\3\2\2\2\u0083\u0080\3\2\2\2\u0084\21\3\2\2\2\u0085\u0086\7\24"+
		"\2\2\u0086\u0087\7\26\2\2\u0087\u0088\7\30\2\2\u0088\u0089\t\2\2\2\u0089"+
		"\u008a\7\32\2\2\u008a\u008b\5\60\31\2\u008b\u0095\7\31\2\2\u008c\u008d"+
		"\7\33\2\2\u008d\u008e\7\30\2\2\u008e\u008f\t\2\2\2\u008f\u0090\7\32\2"+
		"\2\u0090\u0091\5\60\31\2\u0091\u0092\7\31\2\2\u0092\u0094\3\2\2\2\u0093"+
		"\u008c\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2"+
		"\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7\27\2\2\u0099"+
		"\u009a\7\25\2\2\u009a\u00a5\3\2\2\2\u009b\u009c\7\24\2\2\u009c\u009d\7"+
		"\30\2\2\u009d\u009e\t\2\2\2\u009e\u009f\7\32\2\2\u009f\u00a0\5\60\31\2"+
		"\u00a0\u00a1\7\31\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\25\2\2\u00a3\u00a5"+
		"\3\2\2\2\u00a4\u0085\3\2\2\2\u00a4\u009b\3\2\2\2\u00a5\23\3\2\2\2\u00a6"+
		"\u00a7\7\20\2\2\u00a7\25\3\2\2\2\u00a8\u00ba\7\24\2\2\u00a9\u00b9\5\60"+
		"\31\2\u00aa\u00b9\5\"\22\2\u00ab\u00ac\7\26\2\2\u00ac\u00ad\5\"\22\2\u00ad"+
		"\u00b5\7\27\2\2\u00ae\u00af\7\33\2\2\u00af\u00b0\7\30\2\2\u00b0\u00b1"+
		"\5\"\22\2\u00b1\u00b2\7\31\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00ae\3\2\2\2"+
		"\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b9"+
		"\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00a9\3\2\2\2\u00b8\u00aa\3\2\2\2\u00b8"+
		"\u00ab\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7\25\2\2\u00be"+
		"\27\3\2\2\2\u00bf\u00c0\7\21\2\2\u00c0\31\3\2\2\2\u00c1\u00c2\t\3\2\2"+
		"\u00c2\33\3\2\2\2\u00c3\u00c4\t\4\2\2\u00c4\35\3\2\2\2\u00c5\u00c6\t\5"+
		"\2\2\u00c6\37\3\2\2\2\u00c7\u00c8\7\5\2\2\u00c8!\3\2\2\2\u00c9\u00ce\5"+
		"*\26\2\u00ca\u00cb\7\33\2\2\u00cb\u00cd\5*\26\2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\u00d0\3\2\2\2\u00ce\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf#\3\2\2\2"+
		"\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7\4\2\2\u00d2%\3\2\2\2\u00d3\u00d4\7"+
		"\21\2\2\u00d4\'\3\2\2\2\u00d5\u00d6\5\60\31\2\u00d6)\3\2\2\2\u00d7\u00d8"+
		"\7\30\2\2\u00d8\u00dd\5,\27\2\u00d9\u00da\7\33\2\2\u00da\u00dc\5,\27\2"+
		"\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7\31\2\2"+
		"\u00e1\u00e5\3\2\2\2\u00e2\u00e3\7\30\2\2\u00e3\u00e5\7\31\2\2\u00e4\u00d7"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5+\3\2\2\2\u00e6\u00e7\t\6\2\2\u00e7"+
		"\u00e8\7\32\2\2\u00e8\u00e9\5\60\31\2\u00e9-\3\2\2\2\u00ea\u00eb\7\26"+
		"\2\2\u00eb\u00f0\5\60\31\2\u00ec\u00ed\7\33\2\2\u00ed\u00ef\5\60\31\2"+
		"\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\7\27\2\2"+
		"\u00f4\u00f8\3\2\2\2\u00f5\u00f6\7\26\2\2\u00f6\u00f8\7\27\2\2\u00f7\u00ea"+
		"\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8/\3\2\2\2\u00f9\u0103\7\37\2\2\u00fa"+
		"\u0103\7 \2\2\u00fb\u0103\5*\26\2\u00fc\u0103\5.\30\2\u00fd\u0103\7\34"+
		"\2\2\u00fe\u0103\7\35\2\2\u00ff\u0103\7\36\2\2\u0100\u0103\7\21\2\2\u0101"+
		"\u0103\7\"\2\2\u0102\u00f9\3\2\2\2\u0102\u00fa\3\2\2\2\u0102\u00fb\3\2"+
		"\2\2\u0102\u00fc\3\2\2\2\u0102\u00fd\3\2\2\2\u0102\u00fe\3\2\2\2\u0102"+
		"\u00ff\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0101\3\2\2\2\u0103\61\3\2\2"+
		"\2\24:I\\ktz\u0083\u0095\u00a4\u00b5\u00b8\u00ba\u00ce\u00dd\u00e4\u00f0"+
		"\u00f7\u0102";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}