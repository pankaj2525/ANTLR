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
		INSERTONE=5, DD=36, HH=37, UNDERSCORE=14, MILLISEC=33, ISTO_CHAR=22, COMMAR_CHAR=23, 
		DELETEONE=10, SPACE=1, INSERTMANY=6, AGGREGATE=12, FIND=3, UPDATE=7, ID=13, 
		CustomDate=32, CLOSE_SQUARE_BRACKET=19, MM=35, NUMBER=28, NULL=26, OPEN_ROUND_BRACKET=16, 
		DATETYPE=31, DELETEMANY=11, DOT=15, TRUE=24, YYYY=34, SEC=39, CLOSE_ROUND_BRACKET=17, 
		DATE=30, MIN=38, UPDATEONE=9, CLOSE_CURLY_BRACKET=21, UPDATEMANY=8, STRING=27, 
		INSERT=4, FALSE=25, OPEN_SQUARE_BRACKET=18, DB=2, OPEN_CURLY_BRACKET=20, 
		KEYWORDS=29;
	public static final String[] tokenNames = {
		"<INVALID>", "SPACE", "DB", "FIND", "'insert'", "'insertOne'", "'insertMany'", 
		"'update'", "'updateMany'", "'updateOne'", "'deleteOne'", "'deleteMany'", 
		"'aggregate'", "ID", "'_'", "'.'", "'('", "')'", "'['", "']'", "'{'", 
		"'}'", "':'", "','", "'true'", "'false'", "'null'", "STRING", "NUMBER", 
		"KEYWORDS", "DATE", "DATETYPE", "CustomDate", "MILLISEC", "YYYY", "MM", 
		"DD", "HH", "MIN", "SEC"
	};
	public static final int
		RULE_mongo_statements = 0, RULE_mongo_statement = 1, RULE_aggregate_statement = 2, 
		RULE_intialQuerry = 3, RULE_document = 4, RULE_document_array = 5, RULE_collection_methods = 6, 
		RULE_parameter = 7, RULE_other_methods = 8, RULE_single_doc_input_method = 9, 
		RULE_multiple_doc_input_method = 10, RULE_single_or_multiple_doc_input_method = 11, 
		RULE_find_statements = 12, RULE_delete_statements = 13, RULE_json_input = 14, 
		RULE_db_name = 15, RULE_collection_name = 16, RULE_json = 17, RULE_object = 18, 
		RULE_pair = 19, RULE_array = 20, RULE_value = 21;
	public static final String[] ruleNames = {
		"mongo_statements", "mongo_statement", "aggregate_statement", "intialQuerry", 
		"document", "document_array", "collection_methods", "parameter", "other_methods", 
		"single_doc_input_method", "multiple_doc_input_method", "single_or_multiple_doc_input_method", 
		"find_statements", "delete_statements", "json_input", "db_name", "collection_name", 
		"json", "object", "pair", "array", "value"
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
			setState(44); mongo_statement();
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
			setState(46); intialQuerry();
			setState(47); collection_methods();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(48); match(DOT);
				setState(49); collection_methods();
				}
				}
				setState(54);
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
		enterRule(_localctx, 4, RULE_aggregate_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); match(AGGREGATE);
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
		enterRule(_localctx, 6, RULE_intialQuerry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); db_name();
			setState(58); match(DOT);
			setState(59); collection_name();
			setState(63);
			_la = _input.LA(1);
			if (_la==OPEN_ROUND_BRACKET) {
				{
				setState(60); match(OPEN_ROUND_BRACKET);
				setState(61); match(STRING);
				setState(62); match(CLOSE_ROUND_BRACKET);
				}
			}

			setState(65); match(DOT);
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
		enterRule(_localctx, 8, RULE_document);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(OPEN_ROUND_BRACKET);
			setState(68); json_input();
			setState(69); match(CLOSE_ROUND_BRACKET);
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
		enterRule(_localctx, 10, RULE_document_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(OPEN_ROUND_BRACKET);
			setState(72); match(OPEN_SQUARE_BRACKET);
			setState(73); json_input();
			setState(74); match(CLOSE_SQUARE_BRACKET);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMAR_CHAR) {
				{
				{
				setState(75); match(COMMAR_CHAR);
				setState(76); match(OPEN_CURLY_BRACKET);
				setState(77); json_input();
				setState(78); match(CLOSE_CURLY_BRACKET);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85); match(CLOSE_ROUND_BRACKET);
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
		public Single_doc_input_methodContext single_doc_input_method() {
			return getRuleContext(Single_doc_input_methodContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public Aggregate_statementContext aggregate_statement() {
			return getRuleContext(Aggregate_statementContext.class,0);
		}
		public Other_methodsContext other_methods() {
			return getRuleContext(Other_methodsContext.class,0);
		}
		public DocumentContext document() {
			return getRuleContext(DocumentContext.class,0);
		}
		public Single_or_multiple_doc_input_methodContext single_or_multiple_doc_input_method() {
			return getRuleContext(Single_or_multiple_doc_input_methodContext.class,0);
		}
		public Multiple_doc_input_methodContext multiple_doc_input_method() {
			return getRuleContext(Multiple_doc_input_methodContext.class,0);
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
		enterRule(_localctx, 12, RULE_collection_methods);
		try {
			setState(105);
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
				setState(88); single_doc_input_method();
				setState(89); document();
				}
				break;
			case INSERTMANY:
			case UPDATEMANY:
			case DELETEMANY:
				enterOuterAlt(_localctx, 3);
				{
				setState(91); multiple_doc_input_method();
				setState(92); document_array();
				}
				break;
			case FIND:
			case INSERT:
			case UPDATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(94); single_or_multiple_doc_input_method();
				setState(97);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(95); document();
					}
					break;
				case 2:
					{
					setState(96); document_array();
					}
					break;
				}
				}
				break;
			case AGGREGATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(99); aggregate_statement();
				setState(100); parameter();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(102); other_methods();
				setState(103); parameter();
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode COMMAR_CHAR(int i) {
			return getToken(MONGOParser.COMMAR_CHAR, i);
		}
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> OPEN_CURLY_BRACKET() { return getTokens(MONGOParser.OPEN_CURLY_BRACKET); }
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(MONGOParser.CLOSE_SQUARE_BRACKET, 0); }
		public List<TerminalNode> COMMAR_CHAR() { return getTokens(MONGOParser.COMMAR_CHAR); }
		public List<Json_inputContext> json_input() {
			return getRuleContexts(Json_inputContext.class);
		}
		public TerminalNode OPEN_CURLY_BRACKET(int i) {
			return getToken(MONGOParser.OPEN_CURLY_BRACKET, i);
		}
		public Json_inputContext json_input(int i) {
			return getRuleContext(Json_inputContext.class,i);
		}
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(MONGOParser.OPEN_SQUARE_BRACKET, 0); }
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
		enterRule(_localctx, 14, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(OPEN_ROUND_BRACKET);
			setState(123);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(108); value();
				}
				break;
			case 2:
				{
				setState(109); json_input();
				}
				break;
			case 3:
				{
				setState(110); match(OPEN_SQUARE_BRACKET);
				setState(111); json_input();
				setState(112); match(CLOSE_SQUARE_BRACKET);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMAR_CHAR) {
					{
					{
					setState(113); match(COMMAR_CHAR);
					setState(114); match(OPEN_CURLY_BRACKET);
					setState(115); json_input();
					setState(116); match(CLOSE_CURLY_BRACKET);
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(125); match(CLOSE_ROUND_BRACKET);
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
		public TerminalNode ID() { return getToken(MONGOParser.ID, 0); }
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
		enterRule(_localctx, 16, RULE_other_methods);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(ID);
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
		enterRule(_localctx, 18, RULE_single_doc_input_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
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
		enterRule(_localctx, 20, RULE_multiple_doc_input_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
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
		public TerminalNode FIND() { return getToken(MONGOParser.FIND, 0); }
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
		enterRule(_localctx, 22, RULE_single_or_multiple_doc_input_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FIND) | (1L << INSERT) | (1L << UPDATE))) != 0)) ) {
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

	public static class Find_statementsContext extends ParserRuleContext {
		public TerminalNode FIND() { return getToken(MONGOParser.FIND, 0); }
		public Find_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_find_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterFind_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitFind_statements(this);
		}
	}

	public final Find_statementsContext find_statements() throws RecognitionException {
		Find_statementsContext _localctx = new Find_statementsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_find_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); match(FIND);
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

	public static class Delete_statementsContext extends ParserRuleContext {
		public TerminalNode DELETEONE() { return getToken(MONGOParser.DELETEONE, 0); }
		public TerminalNode DELETEMANY() { return getToken(MONGOParser.DELETEMANY, 0); }
		public Delete_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterDelete_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitDelete_statements(this);
		}
	}

	public final Delete_statementsContext delete_statements() throws RecognitionException {
		Delete_statementsContext _localctx = new Delete_statementsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_delete_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !(_la==DELETEONE || _la==DELETEMANY) ) {
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
		enterRule(_localctx, 28, RULE_json_input);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139); object();
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(140); match(COMMAR_CHAR);
					setState(141); object();
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 30, RULE_db_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); match(DB);
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
		public TerminalNode ID() { return getToken(MONGOParser.ID, 0); }
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
		enterRule(_localctx, 32, RULE_collection_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); match(ID);
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
		enterRule(_localctx, 34, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); value();
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
		enterRule(_localctx, 36, RULE_object);
		int _la;
		try {
			setState(166);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153); match(OPEN_CURLY_BRACKET);
				setState(154); pair();
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMAR_CHAR) {
					{
					{
					setState(155); match(COMMAR_CHAR);
					setState(156); pair();
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(162); match(CLOSE_CURLY_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164); match(OPEN_CURLY_BRACKET);
				setState(165); match(CLOSE_CURLY_BRACKET);
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
		public TerminalNode ID() { return getToken(MONGOParser.ID, 0); }
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
		enterRule(_localctx, 38, RULE_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(169); match(ISTO_CHAR);
			setState(170); value();
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
		enterRule(_localctx, 40, RULE_array);
		int _la;
		try {
			setState(185);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172); match(OPEN_SQUARE_BRACKET);
				setState(173); value();
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMAR_CHAR) {
					{
					{
					setState(174); match(COMMAR_CHAR);
					setState(175); value();
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(181); match(CLOSE_SQUARE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183); match(OPEN_SQUARE_BRACKET);
				setState(184); match(CLOSE_SQUARE_BRACKET);
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
		public TerminalNode ID() { return getToken(MONGOParser.ID, 0); }
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
		enterRule(_localctx, 42, RULE_value);
		try {
			setState(196);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(187); match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(188); match(NUMBER);
				}
				break;
			case OPEN_CURLY_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(189); object();
				}
				break;
			case OPEN_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 4);
				{
				setState(190); array();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(191); match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(192); match(FALSE);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(193); match(NULL);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 8);
				{
				setState(194); match(ID);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 9);
				{
				setState(195); match(DATE);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u00c9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\7\3\65\n\3\f\3\16\38\13\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5B\n"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7S\n"+
		"\7\f\7\16\7V\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"d\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bl\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\7\ty\n\t\f\t\16\t|\13\t\5\t~\n\t\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\7\20\u0091\n\20\f"+
		"\20\16\20\u0094\13\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\7\24\u00a0\n\24\f\24\16\24\u00a3\13\24\3\24\3\24\3\24\3\24\5\24\u00a9"+
		"\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u00b3\n\26\f\26\16"+
		"\26\u00b6\13\26\3\26\3\26\3\26\3\26\5\26\u00bc\n\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u00c7\n\27\3\27\3\u0092\2\30\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\7\4\2\7\7\13\f\5\2\b\b\n\n\r\r"+
		"\4\2\5\6\t\t\3\2\f\r\4\2\17\17\35\35\u00cb\2.\3\2\2\2\4\60\3\2\2\2\69"+
		"\3\2\2\2\b;\3\2\2\2\nE\3\2\2\2\fI\3\2\2\2\16k\3\2\2\2\20m\3\2\2\2\22\u0081"+
		"\3\2\2\2\24\u0083\3\2\2\2\26\u0085\3\2\2\2\30\u0087\3\2\2\2\32\u0089\3"+
		"\2\2\2\34\u008b\3\2\2\2\36\u008d\3\2\2\2 \u0095\3\2\2\2\"\u0097\3\2\2"+
		"\2$\u0099\3\2\2\2&\u00a8\3\2\2\2(\u00aa\3\2\2\2*\u00bb\3\2\2\2,\u00c6"+
		"\3\2\2\2./\5\4\3\2/\3\3\2\2\2\60\61\5\b\5\2\61\66\5\16\b\2\62\63\7\21"+
		"\2\2\63\65\5\16\b\2\64\62\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2"+
		"\2\2\67\5\3\2\2\28\66\3\2\2\29:\7\16\2\2:\7\3\2\2\2;<\5 \21\2<=\7\21\2"+
		"\2=A\5\"\22\2>?\7\22\2\2?@\7\35\2\2@B\7\23\2\2A>\3\2\2\2AB\3\2\2\2BC\3"+
		"\2\2\2CD\7\21\2\2D\t\3\2\2\2EF\7\22\2\2FG\5\36\20\2GH\7\23\2\2H\13\3\2"+
		"\2\2IJ\7\22\2\2JK\7\24\2\2KL\5\36\20\2LT\7\25\2\2MN\7\31\2\2NO\7\26\2"+
		"\2OP\5\36\20\2PQ\7\27\2\2QS\3\2\2\2RM\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3"+
		"\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\23\2\2X\r\3\2\2\2Yl\3\2\2\2Z[\5\24\13\2"+
		"[\\\5\n\6\2\\l\3\2\2\2]^\5\26\f\2^_\5\f\7\2_l\3\2\2\2`c\5\30\r\2ad\5\n"+
		"\6\2bd\5\f\7\2ca\3\2\2\2cb\3\2\2\2dl\3\2\2\2ef\5\6\4\2fg\5\20\t\2gl\3"+
		"\2\2\2hi\5\22\n\2ij\5\20\t\2jl\3\2\2\2kY\3\2\2\2kZ\3\2\2\2k]\3\2\2\2k"+
		"`\3\2\2\2ke\3\2\2\2kh\3\2\2\2l\17\3\2\2\2m}\7\22\2\2n~\5,\27\2o~\5\36"+
		"\20\2pq\7\24\2\2qr\5\36\20\2rz\7\25\2\2st\7\31\2\2tu\7\26\2\2uv\5\36\20"+
		"\2vw\7\27\2\2wy\3\2\2\2xs\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{~\3\2"+
		"\2\2|z\3\2\2\2}n\3\2\2\2}o\3\2\2\2}p\3\2\2\2~\177\3\2\2\2\177\u0080\7"+
		"\23\2\2\u0080\21\3\2\2\2\u0081\u0082\7\17\2\2\u0082\23\3\2\2\2\u0083\u0084"+
		"\t\2\2\2\u0084\25\3\2\2\2\u0085\u0086\t\3\2\2\u0086\27\3\2\2\2\u0087\u0088"+
		"\t\4\2\2\u0088\31\3\2\2\2\u0089\u008a\7\5\2\2\u008a\33\3\2\2\2\u008b\u008c"+
		"\t\5\2\2\u008c\35\3\2\2\2\u008d\u0092\5&\24\2\u008e\u008f\7\31\2\2\u008f"+
		"\u0091\5&\24\2\u0090\u008e\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0092\u0090\3\2\2\2\u0093\37\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096"+
		"\7\4\2\2\u0096!\3\2\2\2\u0097\u0098\7\17\2\2\u0098#\3\2\2\2\u0099\u009a"+
		"\5,\27\2\u009a%\3\2\2\2\u009b\u009c\7\26\2\2\u009c\u00a1\5(\25\2\u009d"+
		"\u009e\7\31\2\2\u009e\u00a0\5(\25\2\u009f\u009d\3\2\2\2\u00a0\u00a3\3"+
		"\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a5\7\27\2\2\u00a5\u00a9\3\2\2\2\u00a6\u00a7\7"+
		"\26\2\2\u00a7\u00a9\7\27\2\2\u00a8\u009b\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\'\3\2\2\2\u00aa\u00ab\t\6\2\2\u00ab\u00ac\7\30\2\2\u00ac\u00ad\5,\27"+
		"\2\u00ad)\3\2\2\2\u00ae\u00af\7\24\2\2\u00af\u00b4\5,\27\2\u00b0\u00b1"+
		"\7\31\2\2\u00b1\u00b3\5,\27\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2"+
		"\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4"+
		"\3\2\2\2\u00b7\u00b8\7\25\2\2\u00b8\u00bc\3\2\2\2\u00b9\u00ba\7\24\2\2"+
		"\u00ba\u00bc\7\25\2\2\u00bb\u00ae\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc+\3"+
		"\2\2\2\u00bd\u00c7\7\35\2\2\u00be\u00c7\7\36\2\2\u00bf\u00c7\5&\24\2\u00c0"+
		"\u00c7\5*\26\2\u00c1\u00c7\7\32\2\2\u00c2\u00c7\7\33\2\2\u00c3\u00c7\7"+
		"\34\2\2\u00c4\u00c7\7\17\2\2\u00c5\u00c7\7 \2\2\u00c6\u00bd\3\2\2\2\u00c6"+
		"\u00be\3\2\2\2\u00c6\u00bf\3\2\2\2\u00c6\u00c0\3\2\2\2\u00c6\u00c1\3\2"+
		"\2\2\u00c6\u00c2\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7-\3\2\2\2\17\66ATckz}\u0092\u00a1\u00a8\u00b4\u00bb"+
		"\u00c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}