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
		"<INVALID>", "SPACE", "DB", "FIND", "INSERT", "INSERTONE", "INSERTMANY", 
		"UPDATE", "UPDATEMANY", "UPDATEONE", "DELETEONE", "DELETEMANY", "AGGREGATE", 
		"ID", "'_'", "'.'", "'('", "')'", "'['", "']'", "'{'", "'}'", "':'", "','", 
		"'true'", "'false'", "'null'", "STRING", "NUMBER", "KEYWORDS", "DATE", 
		"DATETYPE", "CustomDate", "MILLISEC", "YYYY", "MM", "DD", "HH", "MIN", 
		"SEC"
	};
	public static final int
		RULE_mongo_statements = 0, RULE_mongo_statement = 1, RULE_aggregate_statement = 2, 
		RULE_intialQuerry = 3, RULE_type1 = 4, RULE_type2 = 5, RULE_dml_statement = 6, 
		RULE_find_statements = 7, RULE_insert_statements = 8, RULE_update_statements = 9, 
		RULE_delete_statements = 10, RULE_json_input = 11, RULE_db_name = 12, 
		RULE_collection_name = 13, RULE_json = 14, RULE_object = 15, RULE_pair = 16, 
		RULE_array = 17, RULE_value = 18;
	public static final String[] ruleNames = {
		"mongo_statements", "mongo_statement", "aggregate_statement", "intialQuerry", 
		"type1", "type2", "dml_statement", "find_statements", "insert_statements", 
		"update_statements", "delete_statements", "json_input", "db_name", "collection_name", 
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
			setState(38); mongo_statement();
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
		public Type1Context type1() {
			return getRuleContext(Type1Context.class,0);
		}
		public TerminalNode ID() { return getToken(MONGOParser.ID, 0); }
		public IntialQuerryContext intialQuerry() {
			return getRuleContext(IntialQuerryContext.class,0);
		}
		public Aggregate_statementContext aggregate_statement() {
			return getRuleContext(Aggregate_statementContext.class,0);
		}
		public Dml_statementContext dml_statement() {
			return getRuleContext(Dml_statementContext.class,0);
		}
		public Type2Context type2() {
			return getRuleContext(Type2Context.class,0);
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
		try {
			setState(58);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40); intialQuerry();
				setState(41); dml_statement();
				setState(44);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(42); type1();
					}
					break;
				case 2:
					{
					setState(43); type2();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46); intialQuerry();
				setState(47); aggregate_statement();
				setState(50);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(48); type1();
					}
					break;
				case 2:
					{
					setState(49); type2();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52); intialQuerry();
				setState(53); match(ID);
				setState(56);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(54); type1();
					}
					break;
				case 2:
					{
					setState(55); type2();
					}
					break;
				}
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
			setState(60); match(AGGREGATE);
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
			setState(62); db_name();
			setState(63); match(DOT);
			setState(64); collection_name();
			setState(68);
			_la = _input.LA(1);
			if (_la==OPEN_ROUND_BRACKET) {
				{
				setState(65); match(OPEN_ROUND_BRACKET);
				setState(66); match(STRING);
				setState(67); match(CLOSE_ROUND_BRACKET);
				}
			}

			setState(70); match(DOT);
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

	public static class Type1Context extends ParserRuleContext {
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public Json_inputContext json_input() {
			return getRuleContext(Json_inputContext.class,0);
		}
		public Type1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterType1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitType1(this);
		}
	}

	public final Type1Context type1() throws RecognitionException {
		Type1Context _localctx = new Type1Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_type1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(OPEN_ROUND_BRACKET);
			setState(73); json_input();
			setState(74); match(CLOSE_ROUND_BRACKET);
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

	public static class Type2Context extends ParserRuleContext {
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
		public Type2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterType2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitType2(this);
		}
	}

	public final Type2Context type2() throws RecognitionException {
		Type2Context _localctx = new Type2Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_type2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(OPEN_ROUND_BRACKET);
			setState(77); match(OPEN_SQUARE_BRACKET);
			setState(78); json_input();
			setState(79); match(CLOSE_SQUARE_BRACKET);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMAR_CHAR) {
				{
				{
				setState(80); match(COMMAR_CHAR);
				setState(81); match(OPEN_CURLY_BRACKET);
				setState(82); json_input();
				setState(83); match(CLOSE_CURLY_BRACKET);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90); match(CLOSE_ROUND_BRACKET);
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

	public static class Dml_statementContext extends ParserRuleContext {
		public Find_statementsContext find_statements() {
			return getRuleContext(Find_statementsContext.class,0);
		}
		public Update_statementsContext update_statements() {
			return getRuleContext(Update_statementsContext.class,0);
		}
		public Insert_statementsContext insert_statements() {
			return getRuleContext(Insert_statementsContext.class,0);
		}
		public Delete_statementsContext delete_statements() {
			return getRuleContext(Delete_statementsContext.class,0);
		}
		public Dml_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dml_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterDml_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitDml_statement(this);
		}
	}

	public final Dml_statementContext dml_statement() throws RecognitionException {
		Dml_statementContext _localctx = new Dml_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dml_statement);
		try {
			setState(96);
			switch (_input.LA(1)) {
			case INSERT:
			case INSERTONE:
			case INSERTMANY:
				enterOuterAlt(_localctx, 1);
				{
				setState(92); insert_statements();
				}
				break;
			case UPDATE:
			case UPDATEMANY:
			case UPDATEONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); update_statements();
				}
				break;
			case DELETEONE:
			case DELETEMANY:
				enterOuterAlt(_localctx, 3);
				{
				setState(94); delete_statements();
				}
				break;
			case FIND:
				enterOuterAlt(_localctx, 4);
				{
				setState(95); find_statements();
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
		enterRule(_localctx, 14, RULE_find_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); match(FIND);
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

	public static class Insert_statementsContext extends ParserRuleContext {
		public TerminalNode INSERTMANY() { return getToken(MONGOParser.INSERTMANY, 0); }
		public TerminalNode INSERTONE() { return getToken(MONGOParser.INSERTONE, 0); }
		public TerminalNode INSERT() { return getToken(MONGOParser.INSERT, 0); }
		public Insert_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterInsert_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitInsert_statements(this);
		}
	}

	public final Insert_statementsContext insert_statements() throws RecognitionException {
		Insert_statementsContext _localctx = new Insert_statementsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_insert_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INSERT) | (1L << INSERTONE) | (1L << INSERTMANY))) != 0)) ) {
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

	public static class Update_statementsContext extends ParserRuleContext {
		public TerminalNode UPDATEMANY() { return getToken(MONGOParser.UPDATEMANY, 0); }
		public TerminalNode UPDATE() { return getToken(MONGOParser.UPDATE, 0); }
		public TerminalNode UPDATEONE() { return getToken(MONGOParser.UPDATEONE, 0); }
		public Update_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterUpdate_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitUpdate_statements(this);
		}
	}

	public final Update_statementsContext update_statements() throws RecognitionException {
		Update_statementsContext _localctx = new Update_statementsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_update_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << UPDATE) | (1L << UPDATEMANY) | (1L << UPDATEONE))) != 0)) ) {
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
		enterRule(_localctx, 20, RULE_delete_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
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
		enterRule(_localctx, 22, RULE_json_input);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106); object();
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(107); match(COMMAR_CHAR);
					setState(108); object();
					}
					} 
				}
				setState(113);
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
		enterRule(_localctx, 24, RULE_db_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(DB);
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
		enterRule(_localctx, 26, RULE_collection_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(ID);
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
		enterRule(_localctx, 28, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); value();
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
		enterRule(_localctx, 30, RULE_object);
		int _la;
		try {
			setState(133);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120); match(OPEN_CURLY_BRACKET);
				setState(121); pair();
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMAR_CHAR) {
					{
					{
					setState(122); match(COMMAR_CHAR);
					setState(123); pair();
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(129); match(CLOSE_CURLY_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131); match(OPEN_CURLY_BRACKET);
				setState(132); match(CLOSE_CURLY_BRACKET);
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
		enterRule(_localctx, 32, RULE_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(136); match(ISTO_CHAR);
			setState(137); value();
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
		enterRule(_localctx, 34, RULE_array);
		int _la;
		try {
			setState(152);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139); match(OPEN_SQUARE_BRACKET);
				setState(140); value();
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMAR_CHAR) {
					{
					{
					setState(141); match(COMMAR_CHAR);
					setState(142); value();
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148); match(CLOSE_SQUARE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150); match(OPEN_SQUARE_BRACKET);
				setState(151); match(CLOSE_SQUARE_BRACKET);
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
		enterRule(_localctx, 36, RULE_value);
		try {
			setState(162);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(154); match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(155); match(NUMBER);
				}
				break;
			case OPEN_CURLY_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(156); object();
				}
				break;
			case OPEN_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 4);
				{
				setState(157); array();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(158); match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(159); match(FALSE);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(160); match(NULL);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(161); match(DATE);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u00a7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\3\3\3\5\3/\n\3\3\3\3\3\3\3\3\3"+
		"\5\3\65\n\3\3\3\3\3\3\3\3\3\5\3;\n\3\5\3=\n\3\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5G\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7X\n\7\f\7\16\7[\13\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bc\n\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\7\rp\n\r\f\r\16\rs\13\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\7\21\177\n\21\f\21\16\21"+
		"\u0082\13\21\3\21\3\21\3\21\3\21\5\21\u0088\n\21\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\23\7\23\u0092\n\23\f\23\16\23\u0095\13\23\3\23\3\23\3"+
		"\23\3\23\5\23\u009b\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u00a5\n\24\3\24\3q\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2"+
		"\6\3\2\6\b\3\2\t\13\3\2\f\r\4\2\17\17\35\35\u00a9\2(\3\2\2\2\4<\3\2\2"+
		"\2\6>\3\2\2\2\b@\3\2\2\2\nJ\3\2\2\2\fN\3\2\2\2\16b\3\2\2\2\20d\3\2\2\2"+
		"\22f\3\2\2\2\24h\3\2\2\2\26j\3\2\2\2\30l\3\2\2\2\32t\3\2\2\2\34v\3\2\2"+
		"\2\36x\3\2\2\2 \u0087\3\2\2\2\"\u0089\3\2\2\2$\u009a\3\2\2\2&\u00a4\3"+
		"\2\2\2()\5\4\3\2)\3\3\2\2\2*+\5\b\5\2+.\5\16\b\2,/\5\n\6\2-/\5\f\7\2."+
		",\3\2\2\2.-\3\2\2\2/=\3\2\2\2\60\61\5\b\5\2\61\64\5\6\4\2\62\65\5\n\6"+
		"\2\63\65\5\f\7\2\64\62\3\2\2\2\64\63\3\2\2\2\65=\3\2\2\2\66\67\5\b\5\2"+
		"\67:\7\17\2\28;\5\n\6\29;\5\f\7\2:8\3\2\2\2:9\3\2\2\2;=\3\2\2\2<*\3\2"+
		"\2\2<\60\3\2\2\2<\66\3\2\2\2=\5\3\2\2\2>?\7\16\2\2?\7\3\2\2\2@A\5\32\16"+
		"\2AB\7\21\2\2BF\5\34\17\2CD\7\22\2\2DE\7\35\2\2EG\7\23\2\2FC\3\2\2\2F"+
		"G\3\2\2\2GH\3\2\2\2HI\7\21\2\2I\t\3\2\2\2JK\7\22\2\2KL\5\30\r\2LM\7\23"+
		"\2\2M\13\3\2\2\2NO\7\22\2\2OP\7\24\2\2PQ\5\30\r\2QY\7\25\2\2RS\7\31\2"+
		"\2ST\7\26\2\2TU\5\30\r\2UV\7\27\2\2VX\3\2\2\2WR\3\2\2\2X[\3\2\2\2YW\3"+
		"\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7\23\2\2]\r\3\2\2\2^c\5\22\n"+
		"\2_c\5\24\13\2`c\5\26\f\2ac\5\20\t\2b^\3\2\2\2b_\3\2\2\2b`\3\2\2\2ba\3"+
		"\2\2\2c\17\3\2\2\2de\7\5\2\2e\21\3\2\2\2fg\t\2\2\2g\23\3\2\2\2hi\t\3\2"+
		"\2i\25\3\2\2\2jk\t\4\2\2k\27\3\2\2\2lq\5 \21\2mn\7\31\2\2np\5 \21\2om"+
		"\3\2\2\2ps\3\2\2\2qr\3\2\2\2qo\3\2\2\2r\31\3\2\2\2sq\3\2\2\2tu\7\4\2\2"+
		"u\33\3\2\2\2vw\7\17\2\2w\35\3\2\2\2xy\5&\24\2y\37\3\2\2\2z{\7\26\2\2{"+
		"\u0080\5\"\22\2|}\7\31\2\2}\177\5\"\22\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2"+
		"\u0083\u0084\7\27\2\2\u0084\u0088\3\2\2\2\u0085\u0086\7\26\2\2\u0086\u0088"+
		"\7\27\2\2\u0087z\3\2\2\2\u0087\u0085\3\2\2\2\u0088!\3\2\2\2\u0089\u008a"+
		"\t\5\2\2\u008a\u008b\7\30\2\2\u008b\u008c\5&\24\2\u008c#\3\2\2\2\u008d"+
		"\u008e\7\24\2\2\u008e\u0093\5&\24\2\u008f\u0090\7\31\2\2\u0090\u0092\5"+
		"&\24\2\u0091\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\7\25"+
		"\2\2\u0097\u009b\3\2\2\2\u0098\u0099\7\24\2\2\u0099\u009b\7\25\2\2\u009a"+
		"\u008d\3\2\2\2\u009a\u0098\3\2\2\2\u009b%\3\2\2\2\u009c\u00a5\7\35\2\2"+
		"\u009d\u00a5\7\36\2\2\u009e\u00a5\5 \21\2\u009f\u00a5\5$\23\2\u00a0\u00a5"+
		"\7\32\2\2\u00a1\u00a5\7\33\2\2\u00a2\u00a5\7\34\2\2\u00a3\u00a5\7 \2\2"+
		"\u00a4\u009c\3\2\2\2\u00a4\u009d\3\2\2\2\u00a4\u009e\3\2\2\2\u00a4\u009f"+
		"\3\2\2\2\u00a4\u00a0\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\'\3\2\2\2\17.\64:<FYbq\u0080\u0087\u0093\u009a\u00a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}