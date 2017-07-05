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
		HH=109, UNDERSCORE=86, KOI8U=68, MILLISEC=105, ISTO_CHAR=94, TEXT=41, 
		DELETEONE=9, ARMSCII8=46, GLOBAL_ID=15, FORMATEDDATE=102, INSERTMANY=5, 
		YEAR=31, ID=11, LONGBLOB=39, CP932=56, CLOSE_SQUARE_BRACKET=91, ENUM=44, 
		MACROMAN=74, DOT=87, BIGINT=21, SEC=111, HP8=65, MIN=110, UPDATEONE=8, 
		TIS620=77, TINYBLOB=36, VARCHAR=33, UTF16=80, OPEN_SQUARE_BRACKET=90, 
		STRING_USER_NAME=13, CHAR=32, BIG5=48, MEDIUMTEXT=42, SPACE=1, UJIS=79, 
		UPDATE=6, DOUBLE=23, CustomDate=104, TINYINT=16, GEOSTD8=62, NUMERIC=26, 
		DATETYPE=103, YYYY=106, UCS2=78, CLOSE_ROUND_BRACKET=89, CLOSE_CURLY_BRACKET=93, 
		VARBINARY=35, STRING=99, KOI8R=67, LOCAL_ID=14, DB=2, KEYWORDS=101, DD=108, 
		BLOB=37, DECIMAL=25, DEC8=57, COMMAR_CHAR=95, MACCE=73, ASCII=47, CP850=53, 
		EUCJPMS=58, REVERSE_QUOTE_ID=12, TIMESTAMP=29, TINYTEXT=40, GB2312=60, 
		CP852=54, INTEGER=20, MM=107, NUMBER=100, CP1257=52, NULL=98, LATIN2=70, 
		LONGTEXT=43, LATIN1=69, DELETEMANY=10, TRUE=96, UTF8MB3=84, DATE=27, UTF8MB4=85, 
		UTF8=83, HEBREW=64, REAL=22, LATIN7=72, CP1251=50, INSERT=3, CP1250=49, 
		LATIN5=71, CP1256=51, CHARSET_REVERSE_QOUTE_STRING=45, CP866=55, INSERTONE=4, 
		FLOAT=24, BINARY=34, EUCKR=59, KEYBCS2=66, INT=19, GBK=61, SWE7=76, UTF16LE=81, 
		OPEN_ROUND_BRACKET=88, SJIS=75, TIME=28, MEDIUMINT=18, GREEK=63, UTF32=82, 
		DATETIME=30, MEDIUMBLOB=38, SMALLINT=17, UPDATEMANY=7, FALSE=97, OPEN_CURLY_BRACKET=92;
	public static final String[] tokenNames = {
		"<INVALID>", "SPACE", "DB", "INSERT", "INSERTONE", "INSERTMANY", "UPDATE", 
		"UPDATEMANY", "UPDATEONE", "DELETEONE", "DELETEMANY", "ID", "REVERSE_QUOTE_ID", 
		"STRING_USER_NAME", "LOCAL_ID", "GLOBAL_ID", "TINYINT", "SMALLINT", "MEDIUMINT", 
		"INT", "INTEGER", "BIGINT", "REAL", "DOUBLE", "FLOAT", "DECIMAL", "NUMERIC", 
		"DATE", "TIME", "TIMESTAMP", "DATETIME", "YEAR", "CHAR", "VARCHAR", "BINARY", 
		"VARBINARY", "TINYBLOB", "BLOB", "MEDIUMBLOB", "LONGBLOB", "TINYTEXT", 
		"TEXT", "MEDIUMTEXT", "LONGTEXT", "ENUM", "CHARSET_REVERSE_QOUTE_STRING", 
		"ARMSCII8", "ASCII", "BIG5", "CP1250", "CP1251", "CP1256", "CP1257", "CP850", 
		"CP852", "CP866", "CP932", "DEC8", "EUCJPMS", "EUCKR", "GB2312", "GBK", 
		"GEOSTD8", "GREEK", "HEBREW", "HP8", "KEYBCS2", "KOI8R", "KOI8U", "LATIN1", 
		"LATIN2", "LATIN5", "LATIN7", "MACCE", "MACROMAN", "SJIS", "SWE7", "TIS620", 
		"UCS2", "UJIS", "UTF16", "UTF16LE", "UTF32", "UTF8", "UTF8MB3", "UTF8MB4", 
		"'_'", "'.'", "'('", "')'", "'['", "']'", "'{'", "'}'", "':'", "','", 
		"'true'", "'false'", "'null'", "STRING", "NUMBER", "KEYWORDS", "FORMATEDDATE", 
		"DATETYPE", "CustomDate", "MILLISEC", "YYYY", "MM", "DD", "HH", "MIN", 
		"SEC"
	};
	public static final int
		RULE_root = 0, RULE_mongo_statements = 1, RULE_mongo_statement = 2, RULE_tYPE1 = 3, 
		RULE_tYPE2 = 4, RULE_dml_statement = 5, RULE_insert_statements = 6, RULE_update_statements = 7, 
		RULE_delete_statements = 8, RULE_insert_one_statement = 9, RULE_insert_many_statement = 10, 
		RULE_insert_statement = 11, RULE_update_one_statement = 12, RULE_update_many_statement = 13, 
		RULE_update_statement = 14, RULE_delete_one_statement = 15, RULE_delete_many_statement = 16, 
		RULE_array_input = 17, RULE_json_input = 18, RULE_db_name = 19, RULE_collection_name = 20, 
		RULE_json = 21, RULE_object = 22, RULE_pair = 23, RULE_array = 24, RULE_value = 25;
	public static final String[] ruleNames = {
		"root", "mongo_statements", "mongo_statement", "tYPE1", "tYPE2", "dml_statement", 
		"insert_statements", "update_statements", "delete_statements", "insert_one_statement", 
		"insert_many_statement", "insert_statement", "update_one_statement", "update_many_statement", 
		"update_statement", "delete_one_statement", "delete_many_statement", "array_input", 
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
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MONGOParser.EOF, 0); }
		public Mongo_statementsContext mongo_statements() {
			return getRuleContext(Mongo_statementsContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if (_la==DB) {
				{
				setState(52); mongo_statements();
				}
			}

			setState(55); match(EOF);
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
		enterRule(_localctx, 2, RULE_mongo_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); mongo_statement();
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
		public TerminalNode ID() { return getToken(MONGOParser.ID, 0); }
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public Db_nameContext db_name() {
			return getRuleContext(Db_nameContext.class,0);
		}
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public Collection_nameContext collection_name() {
			return getRuleContext(Collection_nameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(MONGOParser.STRING, 0); }
		public TYPE2Context tYPE2() {
			return getRuleContext(TYPE2Context.class,0);
		}
		public TYPE1Context tYPE1() {
			return getRuleContext(TYPE1Context.class,0);
		}
		public TerminalNode DOT(int i) {
			return getToken(MONGOParser.DOT, i);
		}
		public TerminalNode INSERT() { return getToken(MONGOParser.INSERT, 0); }
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
		enterRule(_localctx, 4, RULE_mongo_statement);
		int _la;
		try {
			setState(83);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59); db_name();
				setState(60); match(DOT);
				setState(61); collection_name();
				setState(65);
				_la = _input.LA(1);
				if (_la==OPEN_ROUND_BRACKET) {
					{
					setState(62); match(OPEN_ROUND_BRACKET);
					setState(63); match(STRING);
					setState(64); match(CLOSE_ROUND_BRACKET);
					}
				}

				setState(67); match(DOT);
				setState(68);
				_la = _input.LA(1);
				if ( !(_la==INSERT || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(69); tYPE1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71); db_name();
				setState(72); match(DOT);
				setState(73); collection_name();
				setState(77);
				_la = _input.LA(1);
				if (_la==OPEN_ROUND_BRACKET) {
					{
					setState(74); match(OPEN_ROUND_BRACKET);
					setState(75); match(STRING);
					setState(76); match(CLOSE_ROUND_BRACKET);
					}
				}

				setState(79); match(DOT);
				setState(80); match(ID);
				setState(81); tYPE2();
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

	public static class TYPE1Context extends ParserRuleContext {
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public Json_inputContext json_input() {
			return getRuleContext(Json_inputContext.class,0);
		}
		public TYPE1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tYPE1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterTYPE1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitTYPE1(this);
		}
	}

	public final TYPE1Context tYPE1() throws RecognitionException {
		TYPE1Context _localctx = new TYPE1Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_tYPE1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(OPEN_ROUND_BRACKET);
			setState(86); json_input();
			setState(87); match(CLOSE_ROUND_BRACKET);
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

	public static class TYPE2Context extends ParserRuleContext {
		public Array_inputContext array_input() {
			return getRuleContext(Array_inputContext.class,0);
		}
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(MONGOParser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(MONGOParser.CLOSE_SQUARE_BRACKET, 0); }
		public TYPE2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tYPE2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterTYPE2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitTYPE2(this);
		}
	}

	public final TYPE2Context tYPE2() throws RecognitionException {
		TYPE2Context _localctx = new TYPE2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_tYPE2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); match(OPEN_ROUND_BRACKET);
			setState(90); match(OPEN_SQUARE_BRACKET);
			setState(91); array_input();
			setState(92); match(CLOSE_SQUARE_BRACKET);
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

	public static class Dml_statementContext extends ParserRuleContext {
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
			setState(99);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95); insert_statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96); update_statements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97); delete_statements();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class Insert_statementsContext extends ParserRuleContext {
		public Insert_one_statementContext insert_one_statement() {
			return getRuleContext(Insert_one_statementContext.class,0);
		}
		public Insert_many_statementContext insert_many_statement() {
			return getRuleContext(Insert_many_statementContext.class,0);
		}
		public Insert_statementContext insert_statement() {
			return getRuleContext(Insert_statementContext.class,0);
		}
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
		enterRule(_localctx, 12, RULE_insert_statements);
		try {
			setState(104);
			switch (_input.LA(1)) {
			case INSERTONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(101); insert_one_statement();
				}
				break;
			case INSERTMANY:
				enterOuterAlt(_localctx, 2);
				{
				setState(102); insert_many_statement();
				}
				break;
			case INSERT:
			case OPEN_ROUND_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(103); insert_statement();
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

	public static class Update_statementsContext extends ParserRuleContext {
		public Update_statementContext update_statement() {
			return getRuleContext(Update_statementContext.class,0);
		}
		public Update_one_statementContext update_one_statement() {
			return getRuleContext(Update_one_statementContext.class,0);
		}
		public Update_many_statementContext update_many_statement() {
			return getRuleContext(Update_many_statementContext.class,0);
		}
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
		enterRule(_localctx, 14, RULE_update_statements);
		try {
			setState(109);
			switch (_input.LA(1)) {
			case UPDATEONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(106); update_one_statement();
				}
				break;
			case UPDATEMANY:
				enterOuterAlt(_localctx, 2);
				{
				setState(107); update_many_statement();
				}
				break;
			case UPDATE:
			case OPEN_ROUND_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(108); update_statement();
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

	public static class Delete_statementsContext extends ParserRuleContext {
		public Delete_many_statementContext delete_many_statement() {
			return getRuleContext(Delete_many_statementContext.class,0);
		}
		public Delete_one_statementContext delete_one_statement() {
			return getRuleContext(Delete_one_statementContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_delete_statements);
		try {
			setState(113);
			switch (_input.LA(1)) {
			case DELETEONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(111); delete_one_statement();
				}
				break;
			case DELETEMANY:
				enterOuterAlt(_localctx, 2);
				{
				setState(112); delete_many_statement();
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

	public static class Insert_one_statementContext extends ParserRuleContext {
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public Json_inputContext json_input() {
			return getRuleContext(Json_inputContext.class,0);
		}
		public TerminalNode INSERTONE() { return getToken(MONGOParser.INSERTONE, 0); }
		public Insert_one_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_one_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterInsert_one_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitInsert_one_statement(this);
		}
	}

	public final Insert_one_statementContext insert_one_statement() throws RecognitionException {
		Insert_one_statementContext _localctx = new Insert_one_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_insert_one_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); match(INSERTONE);
			setState(116); match(OPEN_ROUND_BRACKET);
			setState(117); json_input();
			setState(118); match(CLOSE_ROUND_BRACKET);
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

	public static class Insert_many_statementContext extends ParserRuleContext {
		public Array_inputContext array_input() {
			return getRuleContext(Array_inputContext.class,0);
		}
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public TerminalNode INSERTMANY() { return getToken(MONGOParser.INSERTMANY, 0); }
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(MONGOParser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(MONGOParser.CLOSE_SQUARE_BRACKET, 0); }
		public Insert_many_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_many_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterInsert_many_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitInsert_many_statement(this);
		}
	}

	public final Insert_many_statementContext insert_many_statement() throws RecognitionException {
		Insert_many_statementContext _localctx = new Insert_many_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_insert_many_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(INSERTMANY);
			setState(121); match(OPEN_ROUND_BRACKET);
			setState(122); match(OPEN_SQUARE_BRACKET);
			setState(123); array_input();
			setState(124); match(CLOSE_SQUARE_BRACKET);
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

	public static class Insert_statementContext extends ParserRuleContext {
		public Array_inputContext array_input() {
			return getRuleContext(Array_inputContext.class,0);
		}
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(MONGOParser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(MONGOParser.CLOSE_SQUARE_BRACKET, 0); }
		public Json_inputContext json_input() {
			return getRuleContext(Json_inputContext.class,0);
		}
		public TerminalNode INSERT() { return getToken(MONGOParser.INSERT, 0); }
		public Insert_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterInsert_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitInsert_statement(this);
		}
	}

	public final Insert_statementContext insert_statement() throws RecognitionException {
		Insert_statementContext _localctx = new Insert_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_insert_statement);
		try {
			setState(138);
			switch (_input.LA(1)) {
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(127); match(INSERT);
				setState(128); match(OPEN_ROUND_BRACKET);
				setState(129); json_input();
				setState(130); match(CLOSE_ROUND_BRACKET);
				}
				break;
			case OPEN_ROUND_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(132); match(OPEN_ROUND_BRACKET);
				setState(133); match(OPEN_SQUARE_BRACKET);
				setState(134); array_input();
				setState(135); match(CLOSE_SQUARE_BRACKET);
				setState(136); match(CLOSE_ROUND_BRACKET);
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

	public static class Update_one_statementContext extends ParserRuleContext {
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public TerminalNode UPDATEONE() { return getToken(MONGOParser.UPDATEONE, 0); }
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public Json_inputContext json_input() {
			return getRuleContext(Json_inputContext.class,0);
		}
		public Update_one_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_one_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterUpdate_one_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitUpdate_one_statement(this);
		}
	}

	public final Update_one_statementContext update_one_statement() throws RecognitionException {
		Update_one_statementContext _localctx = new Update_one_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_update_one_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); match(UPDATEONE);
			setState(141); match(OPEN_ROUND_BRACKET);
			setState(142); json_input();
			setState(143); match(CLOSE_ROUND_BRACKET);
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

	public static class Update_many_statementContext extends ParserRuleContext {
		public Array_inputContext array_input() {
			return getRuleContext(Array_inputContext.class,0);
		}
		public TerminalNode UPDATEMANY() { return getToken(MONGOParser.UPDATEMANY, 0); }
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(MONGOParser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(MONGOParser.CLOSE_SQUARE_BRACKET, 0); }
		public Update_many_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_many_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterUpdate_many_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitUpdate_many_statement(this);
		}
	}

	public final Update_many_statementContext update_many_statement() throws RecognitionException {
		Update_many_statementContext _localctx = new Update_many_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_update_many_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); match(UPDATEMANY);
			setState(146); match(OPEN_ROUND_BRACKET);
			setState(147); match(OPEN_SQUARE_BRACKET);
			setState(148); array_input();
			setState(149); match(CLOSE_SQUARE_BRACKET);
			setState(150); match(CLOSE_ROUND_BRACKET);
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

	public static class Update_statementContext extends ParserRuleContext {
		public Array_inputContext array_input() {
			return getRuleContext(Array_inputContext.class,0);
		}
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public TerminalNode UPDATE() { return getToken(MONGOParser.UPDATE, 0); }
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(MONGOParser.OPEN_SQUARE_BRACKET, 0); }
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(MONGOParser.CLOSE_SQUARE_BRACKET, 0); }
		public Json_inputContext json_input() {
			return getRuleContext(Json_inputContext.class,0);
		}
		public Update_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterUpdate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitUpdate_statement(this);
		}
	}

	public final Update_statementContext update_statement() throws RecognitionException {
		Update_statementContext _localctx = new Update_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_update_statement);
		try {
			setState(163);
			switch (_input.LA(1)) {
			case UPDATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(152); match(UPDATE);
				setState(153); match(OPEN_ROUND_BRACKET);
				setState(154); json_input();
				setState(155); match(CLOSE_ROUND_BRACKET);
				}
				break;
			case OPEN_ROUND_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(157); match(OPEN_ROUND_BRACKET);
				setState(158); match(OPEN_SQUARE_BRACKET);
				setState(159); array_input();
				setState(160); match(CLOSE_SQUARE_BRACKET);
				setState(161); match(CLOSE_ROUND_BRACKET);
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

	public static class Delete_one_statementContext extends ParserRuleContext {
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public TerminalNode DELETEONE() { return getToken(MONGOParser.DELETEONE, 0); }
		public Json_inputContext json_input() {
			return getRuleContext(Json_inputContext.class,0);
		}
		public Delete_one_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_one_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterDelete_one_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitDelete_one_statement(this);
		}
	}

	public final Delete_one_statementContext delete_one_statement() throws RecognitionException {
		Delete_one_statementContext _localctx = new Delete_one_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_delete_one_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); match(DELETEONE);
			setState(166); match(OPEN_ROUND_BRACKET);
			setState(167); json_input();
			setState(168); match(CLOSE_ROUND_BRACKET);
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

	public static class Delete_many_statementContext extends ParserRuleContext {
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public Json_inputContext json_input() {
			return getRuleContext(Json_inputContext.class,0);
		}
		public TerminalNode DELETEMANY() { return getToken(MONGOParser.DELETEMANY, 0); }
		public Delete_many_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_many_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterDelete_many_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitDelete_many_statement(this);
		}
	}

	public final Delete_many_statementContext delete_many_statement() throws RecognitionException {
		Delete_many_statementContext _localctx = new Delete_many_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_delete_many_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); match(DELETEMANY);
			setState(171); match(OPEN_ROUND_BRACKET);
			setState(172); json_input();
			setState(173); match(CLOSE_ROUND_BRACKET);
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

	public static class Array_inputContext extends ParserRuleContext {
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
		public Array_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterArray_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitArray_input(this);
		}
	}

	public final Array_inputContext array_input() throws RecognitionException {
		Array_inputContext _localctx = new Array_inputContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_array_input);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175); object();
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(176); match(COMMAR_CHAR);
					setState(177); object();
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class Json_inputContext extends ParserRuleContext {
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public TerminalNode COMMAR_CHAR() { return getToken(MONGOParser.COMMAR_CHAR, 0); }
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
		enterRule(_localctx, 36, RULE_json_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); object();
			setState(186);
			_la = _input.LA(1);
			if (_la==COMMAR_CHAR) {
				{
				setState(184); match(COMMAR_CHAR);
				setState(185); object();
				}
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
		enterRule(_localctx, 38, RULE_db_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188); match(DB);
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
		enterRule(_localctx, 40, RULE_collection_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); match(ID);
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
		enterRule(_localctx, 42, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192); value();
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
		enterRule(_localctx, 44, RULE_object);
		int _la;
		try {
			setState(207);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194); match(OPEN_CURLY_BRACKET);
				setState(195); pair();
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMAR_CHAR) {
					{
					{
					setState(196); match(COMMAR_CHAR);
					setState(197); pair();
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(203); match(CLOSE_CURLY_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205); match(OPEN_CURLY_BRACKET);
				setState(206); match(CLOSE_CURLY_BRACKET);
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
		enterRule(_localctx, 46, RULE_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(210); match(ISTO_CHAR);
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
		enterRule(_localctx, 48, RULE_array);
		int _la;
		try {
			setState(226);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213); match(OPEN_SQUARE_BRACKET);
				setState(214); value();
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMAR_CHAR) {
					{
					{
					setState(215); match(COMMAR_CHAR);
					setState(216); value();
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(222); match(CLOSE_SQUARE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224); match(OPEN_SQUARE_BRACKET);
				setState(225); match(CLOSE_SQUARE_BRACKET);
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
		public TerminalNode FORMATEDDATE() { return getToken(MONGOParser.FORMATEDDATE, 0); }
		public TerminalNode STRING() { return getToken(MONGOParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(MONGOParser.NUMBER, 0); }
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
		enterRule(_localctx, 50, RULE_value);
		try {
			setState(236);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(228); match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(229); match(NUMBER);
				}
				break;
			case OPEN_CURLY_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(230); object();
				}
				break;
			case OPEN_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 4);
				{
				setState(231); array();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(232); match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(233); match(FALSE);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(234); match(NULL);
				}
				break;
			case FORMATEDDATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(235); match(FORMATEDDATE);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3q\u00f1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\5\28\n\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4D\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3\4\3\4"+
		"\3\4\3\4\5\4V\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\5\7f\n\7\3\b\3\b\3\b\5\bk\n\b\3\t\3\t\3\t\5\tp\n\t\3\n\3\n\5\nt\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008d\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00a6\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\7\23\u00b5\n\23\f\23\16\23\u00b8\13\23"+
		"\3\24\3\24\3\24\5\24\u00bd\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\7\30\u00c9\n\30\f\30\16\30\u00cc\13\30\3\30\3\30\3\30\3\30"+
		"\5\30\u00d2\n\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u00dc\n"+
		"\32\f\32\16\32\u00df\13\32\3\32\3\32\3\32\3\32\5\32\u00e5\n\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00ef\n\33\3\33\3\u00b6\2\34\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\4\4\2\5\5\r"+
		"\r\4\2\r\ree\u00f1\2\67\3\2\2\2\4;\3\2\2\2\6U\3\2\2\2\bW\3\2\2\2\n[\3"+
		"\2\2\2\fe\3\2\2\2\16j\3\2\2\2\20o\3\2\2\2\22s\3\2\2\2\24u\3\2\2\2\26z"+
		"\3\2\2\2\30\u008c\3\2\2\2\32\u008e\3\2\2\2\34\u0093\3\2\2\2\36\u00a5\3"+
		"\2\2\2 \u00a7\3\2\2\2\"\u00ac\3\2\2\2$\u00b1\3\2\2\2&\u00b9\3\2\2\2(\u00be"+
		"\3\2\2\2*\u00c0\3\2\2\2,\u00c2\3\2\2\2.\u00d1\3\2\2\2\60\u00d3\3\2\2\2"+
		"\62\u00e4\3\2\2\2\64\u00ee\3\2\2\2\668\5\4\3\2\67\66\3\2\2\2\678\3\2\2"+
		"\289\3\2\2\29:\7\2\2\3:\3\3\2\2\2;<\5\6\4\2<\5\3\2\2\2=>\5(\25\2>?\7Y"+
		"\2\2?C\5*\26\2@A\7Z\2\2AB\7e\2\2BD\7[\2\2C@\3\2\2\2CD\3\2\2\2DE\3\2\2"+
		"\2EF\7Y\2\2FG\t\2\2\2GH\5\b\5\2HV\3\2\2\2IJ\5(\25\2JK\7Y\2\2KO\5*\26\2"+
		"LM\7Z\2\2MN\7e\2\2NP\7[\2\2OL\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7Y\2\2RS\7"+
		"\r\2\2ST\5\n\6\2TV\3\2\2\2U=\3\2\2\2UI\3\2\2\2V\7\3\2\2\2WX\7Z\2\2XY\5"+
		"&\24\2YZ\7[\2\2Z\t\3\2\2\2[\\\7Z\2\2\\]\7\\\2\2]^\5$\23\2^_\7]\2\2_`\7"+
		"[\2\2`\13\3\2\2\2af\5\16\b\2bf\5\20\t\2cf\5\22\n\2df\3\2\2\2ea\3\2\2\2"+
		"eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\r\3\2\2\2gk\5\24\13\2hk\5\26\f\2ik\5\30"+
		"\r\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2\2k\17\3\2\2\2lp\5\32\16\2mp\5\34\17\2"+
		"np\5\36\20\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2p\21\3\2\2\2qt\5 \21\2rt\5\""+
		"\22\2sq\3\2\2\2sr\3\2\2\2t\23\3\2\2\2uv\7\6\2\2vw\7Z\2\2wx\5&\24\2xy\7"+
		"[\2\2y\25\3\2\2\2z{\7\7\2\2{|\7Z\2\2|}\7\\\2\2}~\5$\23\2~\177\7]\2\2\177"+
		"\u0080\7[\2\2\u0080\27\3\2\2\2\u0081\u0082\7\5\2\2\u0082\u0083\7Z\2\2"+
		"\u0083\u0084\5&\24\2\u0084\u0085\7[\2\2\u0085\u008d\3\2\2\2\u0086\u0087"+
		"\7Z\2\2\u0087\u0088\7\\\2\2\u0088\u0089\5$\23\2\u0089\u008a\7]\2\2\u008a"+
		"\u008b\7[\2\2\u008b\u008d\3\2\2\2\u008c\u0081\3\2\2\2\u008c\u0086\3\2"+
		"\2\2\u008d\31\3\2\2\2\u008e\u008f\7\n\2\2\u008f\u0090\7Z\2\2\u0090\u0091"+
		"\5&\24\2\u0091\u0092\7[\2\2\u0092\33\3\2\2\2\u0093\u0094\7\t\2\2\u0094"+
		"\u0095\7Z\2\2\u0095\u0096\7\\\2\2\u0096\u0097\5$\23\2\u0097\u0098\7]\2"+
		"\2\u0098\u0099\7[\2\2\u0099\35\3\2\2\2\u009a\u009b\7\b\2\2\u009b\u009c"+
		"\7Z\2\2\u009c\u009d\5&\24\2\u009d\u009e\7[\2\2\u009e\u00a6\3\2\2\2\u009f"+
		"\u00a0\7Z\2\2\u00a0\u00a1\7\\\2\2\u00a1\u00a2\5$\23\2\u00a2\u00a3\7]\2"+
		"\2\u00a3\u00a4\7[\2\2\u00a4\u00a6\3\2\2\2\u00a5\u009a\3\2\2\2\u00a5\u009f"+
		"\3\2\2\2\u00a6\37\3\2\2\2\u00a7\u00a8\7\13\2\2\u00a8\u00a9\7Z\2\2\u00a9"+
		"\u00aa\5&\24\2\u00aa\u00ab\7[\2\2\u00ab!\3\2\2\2\u00ac\u00ad\7\f\2\2\u00ad"+
		"\u00ae\7Z\2\2\u00ae\u00af\5&\24\2\u00af\u00b0\7[\2\2\u00b0#\3\2\2\2\u00b1"+
		"\u00b6\5.\30\2\u00b2\u00b3\7a\2\2\u00b3\u00b5\5.\30\2\u00b4\u00b2\3\2"+
		"\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7"+
		"%\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\5.\30\2\u00ba\u00bb\7a\2\2\u00bb"+
		"\u00bd\5.\30\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\'\3\2\2\2"+
		"\u00be\u00bf\7\4\2\2\u00bf)\3\2\2\2\u00c0\u00c1\7\r\2\2\u00c1+\3\2\2\2"+
		"\u00c2\u00c3\5\64\33\2\u00c3-\3\2\2\2\u00c4\u00c5\7^\2\2\u00c5\u00ca\5"+
		"\60\31\2\u00c6\u00c7\7a\2\2\u00c7\u00c9\5\60\31\2\u00c8\u00c6\3\2\2\2"+
		"\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd"+
		"\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7_\2\2\u00ce\u00d2\3\2\2\2\u00cf"+
		"\u00d0\7^\2\2\u00d0\u00d2\7_\2\2\u00d1\u00c4\3\2\2\2\u00d1\u00cf\3\2\2"+
		"\2\u00d2/\3\2\2\2\u00d3\u00d4\t\3\2\2\u00d4\u00d5\7`\2\2\u00d5\u00d6\5"+
		"\64\33\2\u00d6\61\3\2\2\2\u00d7\u00d8\7\\\2\2\u00d8\u00dd\5\64\33\2\u00d9"+
		"\u00da\7a\2\2\u00da\u00dc\5\64\33\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3"+
		"\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00e1\7]\2\2\u00e1\u00e5\3\2\2\2\u00e2\u00e3\7\\"+
		"\2\2\u00e3\u00e5\7]\2\2\u00e4\u00d7\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\63\3\2\2\2\u00e6\u00ef\7e\2\2\u00e7\u00ef\7f\2\2\u00e8\u00ef\5.\30\2"+
		"\u00e9\u00ef\5\62\32\2\u00ea\u00ef\7b\2\2\u00eb\u00ef\7c\2\2\u00ec\u00ef"+
		"\7d\2\2\u00ed\u00ef\7h\2\2\u00ee\u00e6\3\2\2\2\u00ee\u00e7\3\2\2\2\u00ee"+
		"\u00e8\3\2\2\2\u00ee\u00e9\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ee\u00eb\3\2"+
		"\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\65\3\2\2\2\23\67CO"+
		"Uejos\u008c\u00a5\u00b6\u00bc\u00ca\u00d1\u00dd\u00e4\u00ee";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}