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
		INSERTONE=5, DD=35, HH=36, UNDERSCORE=13, MILLISEC=32, ISTO_CHAR=21, COMMAR_CHAR=22, 
		DELETEONE=10, SPACE=1, INSERTMANY=6, FIND=3, UPDATE=7, ID=12, CustomDate=31, 
		CLOSE_SQUARE_BRACKET=18, MM=34, NUMBER=27, NULL=25, OPEN_ROUND_BRACKET=15, 
		DATETYPE=30, DELETEMANY=11, DOT=14, TRUE=23, YYYY=33, SEC=38, CLOSE_ROUND_BRACKET=16, 
		DATE=29, MIN=37, UPDATEONE=9, CLOSE_CURLY_BRACKET=20, UPDATEMANY=8, STRING=26, 
		INSERT=4, FALSE=24, OPEN_SQUARE_BRACKET=17, DB=2, OPEN_CURLY_BRACKET=19, 
		KEYWORDS=28;
	public static final String[] tokenNames = {
		"<INVALID>", "SPACE", "DB", "FIND", "INSERT", "INSERTONE", "INSERTMANY", 
		"UPDATE", "UPDATEMANY", "UPDATEONE", "DELETEONE", "DELETEMANY", "ID", 
		"'_'", "'.'", "'('", "')'", "'['", "']'", "'{'", "'}'", "':'", "','", 
		"'true'", "'false'", "'null'", "STRING", "NUMBER", "KEYWORDS", "DATE", 
		"DATETYPE", "CustomDate", "MILLISEC", "YYYY", "MM", "DD", "HH", "MIN", 
		"SEC"
	};
	public static final int
		RULE_mongo_statements = 0, RULE_mongo_statement = 1, RULE_intialQuerry = 2, 
		RULE_type1 = 3, RULE_type2 = 4, RULE_dml_statement = 5, RULE_find_statements = 6, 
		RULE_insert_statements = 7, RULE_update_statements = 8, RULE_delete_statements = 9, 
		RULE_json_input = 10, RULE_db_name = 11, RULE_collection_name = 12, RULE_json = 13, 
		RULE_object = 14, RULE_pair = 15, RULE_array = 16, RULE_value = 17;
	public static final String[] ruleNames = {
		"mongo_statements", "mongo_statement", "intialQuerry", "type1", "type2", 
		"dml_statement", "find_statements", "insert_statements", "update_statements", 
		"delete_statements", "json_input", "db_name", "collection_name", "json", 
		"object", "pair", "array", "value"
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
			setState(36); mongo_statement();
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
			setState(50);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38); intialQuerry();
				setState(39); dml_statement();
				setState(42);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(40); type1();
					}
					break;
				case 2:
					{
					setState(41); type2();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44); intialQuerry();
				setState(45); match(ID);
				setState(48);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(46); type1();
					}
					break;
				case 2:
					{
					setState(47); type2();
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
		enterRule(_localctx, 4, RULE_intialQuerry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); db_name();
			setState(53); match(DOT);
			setState(54); collection_name();
			setState(58);
			_la = _input.LA(1);
			if (_la==OPEN_ROUND_BRACKET) {
				{
				setState(55); match(OPEN_ROUND_BRACKET);
				setState(56); match(STRING);
				setState(57); match(CLOSE_ROUND_BRACKET);
				}
			}

			setState(60); match(DOT);
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
		enterRule(_localctx, 6, RULE_type1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); match(OPEN_ROUND_BRACKET);
			setState(63); json_input();
			setState(64); match(CLOSE_ROUND_BRACKET);
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
		enterRule(_localctx, 8, RULE_type2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); match(OPEN_ROUND_BRACKET);
			setState(67); match(OPEN_SQUARE_BRACKET);
			setState(68); json_input();
			setState(69); match(CLOSE_SQUARE_BRACKET);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMAR_CHAR) {
				{
				{
				setState(70); match(COMMAR_CHAR);
				setState(71); match(OPEN_CURLY_BRACKET);
				setState(72); json_input();
				setState(73); match(CLOSE_CURLY_BRACKET);
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80); match(CLOSE_ROUND_BRACKET);
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
		enterRule(_localctx, 10, RULE_dml_statement);
		try {
			setState(86);
			switch (_input.LA(1)) {
			case INSERT:
			case INSERTONE:
			case INSERTMANY:
				enterOuterAlt(_localctx, 1);
				{
				setState(82); insert_statements();
				}
				break;
			case UPDATE:
			case UPDATEMANY:
			case UPDATEONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(83); update_statements();
				}
				break;
			case DELETEONE:
			case DELETEMANY:
				enterOuterAlt(_localctx, 3);
				{
				setState(84); delete_statements();
				}
				break;
			case FIND:
				enterOuterAlt(_localctx, 4);
				{
				setState(85); find_statements();
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
		enterRule(_localctx, 12, RULE_find_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(FIND);
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
		enterRule(_localctx, 14, RULE_insert_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
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
		enterRule(_localctx, 16, RULE_update_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
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
		enterRule(_localctx, 18, RULE_delete_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
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
		enterRule(_localctx, 20, RULE_json_input);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96); object();
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(97); match(COMMAR_CHAR);
					setState(98); object();
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		enterRule(_localctx, 22, RULE_db_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); match(DB);
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
		enterRule(_localctx, 24, RULE_collection_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(ID);
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
		enterRule(_localctx, 26, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); value();
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
		enterRule(_localctx, 28, RULE_object);
		int _la;
		try {
			setState(123);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110); match(OPEN_CURLY_BRACKET);
				setState(111); pair();
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMAR_CHAR) {
					{
					{
					setState(112); match(COMMAR_CHAR);
					setState(113); pair();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119); match(CLOSE_CURLY_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121); match(OPEN_CURLY_BRACKET);
				setState(122); match(CLOSE_CURLY_BRACKET);
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
		enterRule(_localctx, 30, RULE_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(126); match(ISTO_CHAR);
			setState(127); value();
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
		enterRule(_localctx, 32, RULE_array);
		int _la;
		try {
			setState(142);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129); match(OPEN_SQUARE_BRACKET);
				setState(130); value();
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMAR_CHAR) {
					{
					{
					setState(131); match(COMMAR_CHAR);
					setState(132); value();
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(138); match(CLOSE_SQUARE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140); match(OPEN_SQUARE_BRACKET);
				setState(141); match(CLOSE_SQUARE_BRACKET);
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
		enterRule(_localctx, 34, RULE_value);
		try {
			setState(152);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(144); match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(145); match(NUMBER);
				}
				break;
			case OPEN_CURLY_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(146); object();
				}
				break;
			case OPEN_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 4);
				{
				setState(147); array();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(148); match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(149); match(FALSE);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(150); match(NULL);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(151); match(DATE);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u009d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\3\5\3-\n\3\3\3\3\3\3\3\3\3\5\3\63\n\3"+
		"\5\3\65\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6N\n\6\f\6\16\6Q\13\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\5\7Y\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\7"+
		"\ff\n\f\f\f\16\fi\13\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\7\20u\n\20\f\20\16\20x\13\20\3\20\3\20\3\20\3\20\5\20~\n\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u0088\n\22\f\22\16\22\u008b\13\22"+
		"\3\22\3\22\3\22\3\22\5\22\u0091\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u009b\n\23\3\23\3g\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$\2\6\3\2\6\b\3\2\t\13\3\2\f\r\4\2\16\16\34\34\u009e\2&\3\2\2\2"+
		"\4\64\3\2\2\2\6\66\3\2\2\2\b@\3\2\2\2\nD\3\2\2\2\fX\3\2\2\2\16Z\3\2\2"+
		"\2\20\\\3\2\2\2\22^\3\2\2\2\24`\3\2\2\2\26b\3\2\2\2\30j\3\2\2\2\32l\3"+
		"\2\2\2\34n\3\2\2\2\36}\3\2\2\2 \177\3\2\2\2\"\u0090\3\2\2\2$\u009a\3\2"+
		"\2\2&\'\5\4\3\2\'\3\3\2\2\2()\5\6\4\2),\5\f\7\2*-\5\b\5\2+-\5\n\6\2,*"+
		"\3\2\2\2,+\3\2\2\2-\65\3\2\2\2./\5\6\4\2/\62\7\16\2\2\60\63\5\b\5\2\61"+
		"\63\5\n\6\2\62\60\3\2\2\2\62\61\3\2\2\2\63\65\3\2\2\2\64(\3\2\2\2\64."+
		"\3\2\2\2\65\5\3\2\2\2\66\67\5\30\r\2\678\7\20\2\28<\5\32\16\29:\7\21\2"+
		"\2:;\7\34\2\2;=\7\22\2\2<9\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7\20\2\2?\7\3"+
		"\2\2\2@A\7\21\2\2AB\5\26\f\2BC\7\22\2\2C\t\3\2\2\2DE\7\21\2\2EF\7\23\2"+
		"\2FG\5\26\f\2GO\7\24\2\2HI\7\30\2\2IJ\7\25\2\2JK\5\26\f\2KL\7\26\2\2L"+
		"N\3\2\2\2MH\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2"+
		"RS\7\22\2\2S\13\3\2\2\2TY\5\20\t\2UY\5\22\n\2VY\5\24\13\2WY\5\16\b\2X"+
		"T\3\2\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\r\3\2\2\2Z[\7\5\2\2[\17\3\2\2"+
		"\2\\]\t\2\2\2]\21\3\2\2\2^_\t\3\2\2_\23\3\2\2\2`a\t\4\2\2a\25\3\2\2\2"+
		"bg\5\36\20\2cd\7\30\2\2df\5\36\20\2ec\3\2\2\2fi\3\2\2\2gh\3\2\2\2ge\3"+
		"\2\2\2h\27\3\2\2\2ig\3\2\2\2jk\7\4\2\2k\31\3\2\2\2lm\7\16\2\2m\33\3\2"+
		"\2\2no\5$\23\2o\35\3\2\2\2pq\7\25\2\2qv\5 \21\2rs\7\30\2\2su\5 \21\2t"+
		"r\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7\26\2\2"+
		"z~\3\2\2\2{|\7\25\2\2|~\7\26\2\2}p\3\2\2\2}{\3\2\2\2~\37\3\2\2\2\177\u0080"+
		"\t\5\2\2\u0080\u0081\7\27\2\2\u0081\u0082\5$\23\2\u0082!\3\2\2\2\u0083"+
		"\u0084\7\23\2\2\u0084\u0089\5$\23\2\u0085\u0086\7\30\2\2\u0086\u0088\5"+
		"$\23\2\u0087\u0085\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7\24"+
		"\2\2\u008d\u0091\3\2\2\2\u008e\u008f\7\23\2\2\u008f\u0091\7\24\2\2\u0090"+
		"\u0083\3\2\2\2\u0090\u008e\3\2\2\2\u0091#\3\2\2\2\u0092\u009b\7\34\2\2"+
		"\u0093\u009b\7\35\2\2\u0094\u009b\5\36\20\2\u0095\u009b\5\"\22\2\u0096"+
		"\u009b\7\31\2\2\u0097\u009b\7\32\2\2\u0098\u009b\7\33\2\2\u0099\u009b"+
		"\7\37\2\2\u009a\u0092\3\2\2\2\u009a\u0093\3\2\2\2\u009a\u0094\3\2\2\2"+
		"\u009a\u0095\3\2\2\2\u009a\u0096\3\2\2\2\u009a\u0097\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009a\u0099\3\2\2\2\u009b%\3\2\2\2\16,\62\64<OXgv}\u0089\u0090"+
		"\u009a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}