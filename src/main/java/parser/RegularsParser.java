// Generated from /home/mateusz/Dropbox/semVI/TK/tk-projekt/src/main/antlr4/Regulars.g4 by ANTLR 4.2.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegularsParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, ANONMETACHARACTER=14, METACHARACTER=15, 
		WS=16;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'\\'", "')'", "'.'", "'+'", "'*'", "'['", "'-'", 
		"'('", "'|'", "'[^'", "'?'", "'$'", "ANONMETACHARACTER", "METACHARACTER", 
		"WS"
	};
	public static final int
		RULE_start = 0, RULE_regex = 1, RULE_simple_regex = 2, RULE_basic_regex = 3, 
		RULE_one_or_none = 4, RULE_star = 5, RULE_plus = 6, RULE_elementary_regex = 7, 
		RULE_group = 8, RULE_any = 9, RULE_eos = 10, RULE_set = 11, RULE_positive_set = 12, 
		RULE_negative_set = 13, RULE_set_items = 14, RULE_set_item = 15, RULE_character = 16, 
		RULE_range = 17, RULE_metacharacter = 18, RULE_nonmetacharacter = 19, 
		RULE_wh = 20;
	public static final String[] ruleNames = {
		"start", "regex", "simple_regex", "basic_regex", "one_or_none", "star", 
		"plus", "elementary_regex", "group", "any", "eos", "set", "positive_set", 
		"negative_set", "set_items", "set_item", "character", "range", "metacharacter", 
		"nonmetacharacter", "wh"
	};

	@Override
	public String getGrammarFileName() { return "Regulars.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RegularsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public RegexContext regex() {
			return getRuleContext(RegexContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularsVisitor ) return ((RegularsVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42); regex();
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

	public static class RegexContext extends ParserRuleContext {
		public Simple_regexContext simple_regex(int i) {
			return getRuleContext(Simple_regexContext.class,i);
		}
		public List<Simple_regexContext> simple_regex() {
			return getRuleContexts(Simple_regexContext.class);
		}
		public RegexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularsVisitor ) return ((RegularsVisitor<? extends T>)visitor).visitRegex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegexContext regex() throws RecognitionException {
		RegexContext _localctx = new RegexContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_regex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); simple_regex();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==10) {
				{
				{
				setState(45); match(10);
				setState(46); simple_regex();
				}
				}
				setState(51);
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

	public static class Simple_regexContext extends ParserRuleContext {
		public Basic_regexContext basic_regex(int i) {
			return getRuleContext(Basic_regexContext.class,i);
		}
		public List<Basic_regexContext> basic_regex() {
			return getRuleContexts(Basic_regexContext.class);
		}
		public Simple_regexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_regex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularsVisitor ) return ((RegularsVisitor<? extends T>)visitor).visitSimple_regex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_regexContext simple_regex() throws RecognitionException {
		Simple_regexContext _localctx = new Simple_regexContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simple_regex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 4) | (1L << 7) | (1L << 9) | (1L << 11) | (1L << 13) | (1L << ANONMETACHARACTER))) != 0)) {
				{
				{
				setState(52); basic_regex();
				}
				}
				setState(57);
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

	public static class Basic_regexContext extends ParserRuleContext {
		public Elementary_regexContext elementary_regex() {
			return getRuleContext(Elementary_regexContext.class,0);
		}
		public One_or_noneContext one_or_none() {
			return getRuleContext(One_or_noneContext.class,0);
		}
		public StarContext star() {
			return getRuleContext(StarContext.class,0);
		}
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public Basic_regexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_regex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularsVisitor ) return ((RegularsVisitor<? extends T>)visitor).visitBasic_regex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_regexContext basic_regex() throws RecognitionException {
		Basic_regexContext _localctx = new Basic_regexContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_basic_regex);
		try {
			setState(62);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58); star();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59); plus();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60); elementary_regex();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61); one_or_none();
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

	public static class One_or_noneContext extends ParserRuleContext {
		public Elementary_regexContext elementary_regex() {
			return getRuleContext(Elementary_regexContext.class,0);
		}
		public One_or_noneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_one_or_none; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularsVisitor ) return ((RegularsVisitor<? extends T>)visitor).visitOne_or_none(this);
			else return visitor.visitChildren(this);
		}
	}

	public final One_or_noneContext one_or_none() throws RecognitionException {
		One_or_noneContext _localctx = new One_or_noneContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_one_or_none);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); elementary_regex();
			setState(65); match(12);
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

	public static class StarContext extends ParserRuleContext {
		public Elementary_regexContext elementary_regex() {
			return getRuleContext(Elementary_regexContext.class,0);
		}
		public StarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularsVisitor ) return ((RegularsVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StarContext star() throws RecognitionException {
		StarContext _localctx = new StarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_star);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); elementary_regex();
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68); match(6);
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==6 );
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

	public static class PlusContext extends ParserRuleContext {
		public Elementary_regexContext elementary_regex() {
			return getRuleContext(Elementary_regexContext.class,0);
		}
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularsVisitor ) return ((RegularsVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusContext plus() throws RecognitionException {
		PlusContext _localctx = new PlusContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_plus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); elementary_regex();
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74); match(5);
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==5 );
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

	public static class Elementary_regexContext extends ParserRuleContext {
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public Elementary_regexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementary_regex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularsVisitor ) return ((RegularsVisitor<? extends T>)visitor).visitElementary_regex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elementary_regexContext elementary_regex() throws RecognitionException {
		Elementary_regexContext _localctx = new Elementary_regexContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elementary_regex);
		try {
			setState(84);
			switch (_input.LA(1)) {
			case 9:
				enterOuterAlt(_localctx, 1);
				{
				setState(79); group();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 2);
				{
				setState(80); any();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 3);
				{
				setState(81); eos();
				}
				break;
			case 2:
			case ANONMETACHARACTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(82); character();
				}
				break;
			case 7:
			case 11:
				enterOuterAlt(_localctx, 5);
				{
				setState(83); set();
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

	public static class GroupContext extends ParserRuleContext {
		public RegexContext regex() {
			return getRuleContext(RegexContext.class,0);
		}
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularsVisitor ) return ((RegularsVisitor<? extends T>)visitor).visitGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(9);
			setState(87); regex();
			setState(88); match(3);
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

	public static class AnyContext extends ParserRuleContext {
		public AnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularsVisitor ) return ((RegularsVisitor<? extends T>)visitor).visitAny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyContext any() throws RecognitionException {
		AnyContext _localctx = new AnyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_any);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); match(4);
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

	public static class EosContext extends ParserRuleContext {
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularsVisitor ) return ((RegularsVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_eos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); match(13);
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

	public static class SetContext extends ParserRuleContext {
		public Positive_setContext positive_set() {
			return getRuleContext(Positive_setContext.class,0);
		}
		public Negative_setContext negative_set() {
			return getRuleContext(Negative_setContext.class,0);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularsVisitor ) return ((RegularsVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_set);
		try {
			setState(96);
			switch (_input.LA(1)) {
			case 7:
				enterOuterAlt(_localctx, 1);
				{
				setState(94); positive_set();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 2);
				{
				setState(95); negative_set();
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

	public static class Positive_setContext extends ParserRuleContext {
		public Set_itemsContext set_items() {
			return getRuleContext(Set_itemsContext.class,0);
		}
		public Positive_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positive_set; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularsVisitor ) return ((RegularsVisitor<? extends T>)visitor).visitPositive_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Positive_setContext positive_set() throws RecognitionException {
		Positive_setContext _localctx = new Positive_setContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_positive_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); match(7);
			setState(99); set_items();
			setState(100); match(1);
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

	public static class Negative_setContext extends ParserRuleContext {
		public Set_itemsContext set_items() {
			return getRuleContext(Set_itemsContext.class,0);
		}
		public Negative_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negative_set; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularsVisitor ) return ((RegularsVisitor<? extends T>)visitor).visitNegative_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Negative_setContext negative_set() throws RecognitionException {
		Negative_setContext _localctx = new Negative_setContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_negative_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(11);
			setState(103); set_items();
			setState(104); match(1);
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

	public static class Set_itemsContext extends ParserRuleContext {
		public List<Set_itemContext> set_item() {
			return getRuleContexts(Set_itemContext.class);
		}
		public Set_itemContext set_item(int i) {
			return getRuleContext(Set_itemContext.class,i);
		}
		public Set_itemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_items; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularsVisitor ) return ((RegularsVisitor<? extends T>)visitor).visitSet_items(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_itemsContext set_items() throws RecognitionException {
		Set_itemsContext _localctx = new Set_itemsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_set_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==2 || _la==ANONMETACHARACTER) {
				{
				{
				setState(106); set_item();
				}
				}
				setState(111);
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

	public static class Set_itemContext extends ParserRuleContext {
		public CharacterContext character() {
			return getRuleContext(CharacterContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public Set_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularsVisitor ) return ((RegularsVisitor<? extends T>)visitor).visitSet_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_itemContext set_item() throws RecognitionException {
		Set_itemContext _localctx = new Set_itemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_set_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(112); range();
				}
				break;

			case 2:
				{
				setState(113); character();
				}
				break;
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

	public static class CharacterContext extends ParserRuleContext {
		public MetacharacterContext metacharacter() {
			return getRuleContext(MetacharacterContext.class,0);
		}
		public NonmetacharacterContext nonmetacharacter() {
			return getRuleContext(NonmetacharacterContext.class,0);
		}
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularsVisitor ) return ((RegularsVisitor<? extends T>)visitor).visitCharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_character);
		try {
			setState(118);
			switch (_input.LA(1)) {
			case ANONMETACHARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(116); nonmetacharacter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117); metacharacter();
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

	public static class RangeContext extends ParserRuleContext {
		public NonmetacharacterContext nonmetacharacter(int i) {
			return getRuleContext(NonmetacharacterContext.class,i);
		}
		public List<NonmetacharacterContext> nonmetacharacter() {
			return getRuleContexts(NonmetacharacterContext.class);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularsVisitor ) return ((RegularsVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); nonmetacharacter();
			setState(121); match(8);
			setState(122); nonmetacharacter();
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

	public static class MetacharacterContext extends ParserRuleContext {
		public TerminalNode METACHARACTER() { return getToken(RegularsParser.METACHARACTER, 0); }
		public MetacharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metacharacter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularsVisitor ) return ((RegularsVisitor<? extends T>)visitor).visitMetacharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetacharacterContext metacharacter() throws RecognitionException {
		MetacharacterContext _localctx = new MetacharacterContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_metacharacter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); match(2);
			setState(125); match(METACHARACTER);
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

	public static class NonmetacharacterContext extends ParserRuleContext {
		public TerminalNode ANONMETACHARACTER() { return getToken(RegularsParser.ANONMETACHARACTER, 0); }
		public NonmetacharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonmetacharacter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularsVisitor ) return ((RegularsVisitor<? extends T>)visitor).visitNonmetacharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonmetacharacterContext nonmetacharacter() throws RecognitionException {
		NonmetacharacterContext _localctx = new NonmetacharacterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_nonmetacharacter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(ANONMETACHARACTER);
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

	public static class WhContext extends ParserRuleContext {
		public List<TerminalNode> WS() { return getTokens(RegularsParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(RegularsParser.WS, i);
		}
		public WhContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wh; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularsVisitor ) return ((RegularsVisitor<? extends T>)visitor).visitWh(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhContext wh() throws RecognitionException {
		WhContext _localctx = new WhContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_wh);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(129); match(WS);
				}
				}
				setState(134);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22\u008a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\3\7\3\62\n"+
		"\3\f\3\16\3\65\13\3\3\4\7\48\n\4\f\4\16\4;\13\4\3\5\3\5\3\5\3\5\5\5A\n"+
		"\5\3\6\3\6\3\6\3\7\3\7\6\7H\n\7\r\7\16\7I\3\b\3\b\6\bN\n\b\r\b\16\bO\3"+
		"\t\3\t\3\t\3\t\3\t\5\tW\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\5\rc\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\7\20n\n\20\f\20"+
		"\16\20q\13\20\3\21\3\21\5\21u\n\21\3\22\3\22\5\22y\n\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\26\7\26\u0085\n\26\f\26\16\26\u0088\13"+
		"\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\2\u0084"+
		"\2,\3\2\2\2\4.\3\2\2\2\69\3\2\2\2\b@\3\2\2\2\nB\3\2\2\2\fE\3\2\2\2\16"+
		"K\3\2\2\2\20V\3\2\2\2\22X\3\2\2\2\24\\\3\2\2\2\26^\3\2\2\2\30b\3\2\2\2"+
		"\32d\3\2\2\2\34h\3\2\2\2\36o\3\2\2\2 t\3\2\2\2\"x\3\2\2\2$z\3\2\2\2&~"+
		"\3\2\2\2(\u0081\3\2\2\2*\u0086\3\2\2\2,-\5\4\3\2-\3\3\2\2\2.\63\5\6\4"+
		"\2/\60\7\f\2\2\60\62\5\6\4\2\61/\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63"+
		"\64\3\2\2\2\64\5\3\2\2\2\65\63\3\2\2\2\668\5\b\5\2\67\66\3\2\2\28;\3\2"+
		"\2\29\67\3\2\2\29:\3\2\2\2:\7\3\2\2\2;9\3\2\2\2<A\5\f\7\2=A\5\16\b\2>"+
		"A\5\20\t\2?A\5\n\6\2@<\3\2\2\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2A\t\3\2\2"+
		"\2BC\5\20\t\2CD\7\16\2\2D\13\3\2\2\2EG\5\20\t\2FH\7\b\2\2GF\3\2\2\2HI"+
		"\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\r\3\2\2\2KM\5\20\t\2LN\7\7\2\2ML\3\2\2\2"+
		"NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\17\3\2\2\2QW\5\22\n\2RW\5\24\13\2SW\5"+
		"\26\f\2TW\5\"\22\2UW\5\30\r\2VQ\3\2\2\2VR\3\2\2\2VS\3\2\2\2VT\3\2\2\2"+
		"VU\3\2\2\2W\21\3\2\2\2XY\7\13\2\2YZ\5\4\3\2Z[\7\5\2\2[\23\3\2\2\2\\]\7"+
		"\6\2\2]\25\3\2\2\2^_\7\17\2\2_\27\3\2\2\2`c\5\32\16\2ac\5\34\17\2b`\3"+
		"\2\2\2ba\3\2\2\2c\31\3\2\2\2de\7\t\2\2ef\5\36\20\2fg\7\3\2\2g\33\3\2\2"+
		"\2hi\7\r\2\2ij\5\36\20\2jk\7\3\2\2k\35\3\2\2\2ln\5 \21\2ml\3\2\2\2nq\3"+
		"\2\2\2om\3\2\2\2op\3\2\2\2p\37\3\2\2\2qo\3\2\2\2ru\5$\23\2su\5\"\22\2"+
		"tr\3\2\2\2ts\3\2\2\2u!\3\2\2\2vy\5(\25\2wy\5&\24\2xv\3\2\2\2xw\3\2\2\2"+
		"y#\3\2\2\2z{\5(\25\2{|\7\n\2\2|}\5(\25\2}%\3\2\2\2~\177\7\4\2\2\177\u0080"+
		"\7\21\2\2\u0080\'\3\2\2\2\u0081\u0082\7\20\2\2\u0082)\3\2\2\2\u0083\u0085"+
		"\7\22\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2"+
		"\u0086\u0087\3\2\2\2\u0087+\3\2\2\2\u0088\u0086\3\2\2\2\r\639@IOVbotx"+
		"\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}