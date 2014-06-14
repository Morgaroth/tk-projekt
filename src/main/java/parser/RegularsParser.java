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
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		NUMBER=17, ANONMETACHARACTER=18, METACHARACTER=19, WS=20;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'.'", "')'", "','", "'+'", "'['", "'*'", "'-'", "'('", 
		"'[^'", "'?'", "'\\'", "'{'", "'}'", "'|'", "'$'", "NUMBER", "ANONMETACHARACTER", 
		"METACHARACTER", "WS"
	};
	public static final int
		RULE_start = 0, RULE_regex = 1, RULE_simple_regex = 2, RULE_basic_regex = 3, 
		RULE_fixed_repeat_regex = 4, RULE_one_or_none = 5, RULE_star = 6, RULE_plus = 7, 
		RULE_elementary_regex = 8, RULE_group = 9, RULE_any = 10, RULE_eos = 11, 
		RULE_set = 12, RULE_positive_set = 13, RULE_negative_set = 14, RULE_set_items = 15, 
		RULE_set_item = 16, RULE_character = 17, RULE_range = 18, RULE_metacharacter = 19, 
		RULE_nonmetacharacter = 20, RULE_number = 21;
	public static final String[] ruleNames = {
		"start", "regex", "simple_regex", "basic_regex", "fixed_repeat_regex", 
		"one_or_none", "star", "plus", "elementary_regex", "group", "any", "eos", 
		"set", "positive_set", "negative_set", "set_items", "set_item", "character", 
		"range", "metacharacter", "nonmetacharacter", "number"
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
			setState(44); regex();
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
			setState(46); simple_regex();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==15) {
				{
				{
				setState(47); match(15);
				setState(48); simple_regex();
				}
				}
				setState(53);
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
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 9) | (1L << 10) | (1L << 12) | (1L << 16) | (1L << ANONMETACHARACTER))) != 0)) {
				{
				{
				setState(54); basic_regex();
				}
				}
				setState(59);
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
		public Fixed_repeat_regexContext fixed_repeat_regex() {
			return getRuleContext(Fixed_repeat_regexContext.class,0);
		}
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
			setState(65);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60); star();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61); plus();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62); one_or_none();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(63); elementary_regex();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64); fixed_repeat_regex();
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

	public static class Fixed_repeat_regexContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public Elementary_regexContext elementary_regex() {
			return getRuleContext(Elementary_regexContext.class,0);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public Fixed_repeat_regexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixed_repeat_regex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularsVisitor ) return ((RegularsVisitor<? extends T>)visitor).visitFixed_repeat_regex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fixed_repeat_regexContext fixed_repeat_regex() throws RecognitionException {
		Fixed_repeat_regexContext _localctx = new Fixed_repeat_regexContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fixed_repeat_regex);
		try {
			setState(85);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67); elementary_regex();
				setState(68); match(13);
				setState(69); number();
				setState(70); match(14);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72); elementary_regex();
				setState(73); match(13);
				setState(74); number();
				setState(75); match(4);
				setState(76); match(14);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(78); elementary_regex();
				setState(79); match(13);
				setState(80); number();
				setState(81); match(4);
				setState(82); number();
				setState(83); match(14);
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
		enterRule(_localctx, 10, RULE_one_or_none);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); elementary_regex();
			setState(88); match(11);
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
		enterRule(_localctx, 12, RULE_star);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); elementary_regex();
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91); match(7);
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==7 );
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
		enterRule(_localctx, 14, RULE_plus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); elementary_regex();
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97); match(5);
				}
				}
				setState(100); 
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
		enterRule(_localctx, 16, RULE_elementary_regex);
		try {
			setState(107);
			switch (_input.LA(1)) {
			case 9:
				enterOuterAlt(_localctx, 1);
				{
				setState(102); group();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103); any();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 3);
				{
				setState(104); eos();
				}
				break;
			case 12:
			case ANONMETACHARACTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(105); character();
				}
				break;
			case 6:
			case 10:
				enterOuterAlt(_localctx, 5);
				{
				setState(106); set();
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
		enterRule(_localctx, 18, RULE_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); match(9);
			setState(110); regex();
			setState(111); match(3);
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
		enterRule(_localctx, 20, RULE_any);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(2);
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
		enterRule(_localctx, 22, RULE_eos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); match(16);
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
		enterRule(_localctx, 24, RULE_set);
		try {
			setState(119);
			switch (_input.LA(1)) {
			case 6:
				enterOuterAlt(_localctx, 1);
				{
				setState(117); positive_set();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 2);
				{
				setState(118); negative_set();
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
		enterRule(_localctx, 26, RULE_positive_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); match(6);
			setState(122); set_items();
			setState(123); match(1);
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
		enterRule(_localctx, 28, RULE_negative_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); match(10);
			setState(126); set_items();
			setState(127); match(1);
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
		enterRule(_localctx, 30, RULE_set_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==12 || _la==ANONMETACHARACTER) {
				{
				{
				setState(129); set_item();
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
		enterRule(_localctx, 32, RULE_set_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(135); range();
				}
				break;

			case 2:
				{
				setState(136); character();
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
		enterRule(_localctx, 34, RULE_character);
		try {
			setState(141);
			switch (_input.LA(1)) {
			case ANONMETACHARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(139); nonmetacharacter();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 2);
				{
				setState(140); metacharacter();
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
		enterRule(_localctx, 36, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); nonmetacharacter();
			setState(144); match(8);
			setState(145); nonmetacharacter();
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
		enterRule(_localctx, 38, RULE_metacharacter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); match(12);
			setState(148); match(METACHARACTER);
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
		enterRule(_localctx, 40, RULE_nonmetacharacter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); match(ANONMETACHARACTER);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER(int i) {
			return getToken(RegularsParser.NUMBER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(RegularsParser.NUMBER); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RegularsVisitor ) return ((RegularsVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER) {
				{
				{
				setState(152); match(NUMBER);
				}
				}
				setState(157);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\26\u00a1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\3"+
		"\7\3\64\n\3\f\3\16\3\67\13\3\3\4\7\4:\n\4\f\4\16\4=\13\4\3\5\3\5\3\5\3"+
		"\5\3\5\5\5D\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6X\n\6\3\7\3\7\3\7\3\b\3\b\6\b_\n\b\r\b\16\b`\3\t"+
		"\3\t\6\te\n\t\r\t\16\tf\3\n\3\n\3\n\3\n\3\n\5\nn\n\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\5\16z\n\16\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\21\7\21\u0085\n\21\f\21\16\21\u0088\13\21\3\22\3\22\5\22"+
		"\u008c\n\22\3\23\3\23\5\23\u0090\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\26\3\26\3\27\7\27\u009c\n\27\f\27\16\27\u009f\13\27\3\27\2\2\30"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\2\u009d\2.\3\2\2\2\4"+
		"\60\3\2\2\2\6;\3\2\2\2\bC\3\2\2\2\nW\3\2\2\2\fY\3\2\2\2\16\\\3\2\2\2\20"+
		"b\3\2\2\2\22m\3\2\2\2\24o\3\2\2\2\26s\3\2\2\2\30u\3\2\2\2\32y\3\2\2\2"+
		"\34{\3\2\2\2\36\177\3\2\2\2 \u0086\3\2\2\2\"\u008b\3\2\2\2$\u008f\3\2"+
		"\2\2&\u0091\3\2\2\2(\u0095\3\2\2\2*\u0098\3\2\2\2,\u009d\3\2\2\2./\5\4"+
		"\3\2/\3\3\2\2\2\60\65\5\6\4\2\61\62\7\21\2\2\62\64\5\6\4\2\63\61\3\2\2"+
		"\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\5\3\2\2\2\67\65\3\2\2"+
		"\28:\5\b\5\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\7\3\2\2\2=;\3\2"+
		"\2\2>D\5\16\b\2?D\5\20\t\2@D\5\f\7\2AD\5\22\n\2BD\5\n\6\2C>\3\2\2\2C?"+
		"\3\2\2\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2D\t\3\2\2\2EF\5\22\n\2FG\7\17\2"+
		"\2GH\5,\27\2HI\7\20\2\2IX\3\2\2\2JK\5\22\n\2KL\7\17\2\2LM\5,\27\2MN\7"+
		"\6\2\2NO\7\20\2\2OX\3\2\2\2PQ\5\22\n\2QR\7\17\2\2RS\5,\27\2ST\7\6\2\2"+
		"TU\5,\27\2UV\7\20\2\2VX\3\2\2\2WE\3\2\2\2WJ\3\2\2\2WP\3\2\2\2X\13\3\2"+
		"\2\2YZ\5\22\n\2Z[\7\r\2\2[\r\3\2\2\2\\^\5\22\n\2]_\7\t\2\2^]\3\2\2\2_"+
		"`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\17\3\2\2\2bd\5\22\n\2ce\7\7\2\2dc\3\2\2"+
		"\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\21\3\2\2\2hn\5\24\13\2in\5\26\f\2jn"+
		"\5\30\r\2kn\5$\23\2ln\5\32\16\2mh\3\2\2\2mi\3\2\2\2mj\3\2\2\2mk\3\2\2"+
		"\2ml\3\2\2\2n\23\3\2\2\2op\7\13\2\2pq\5\4\3\2qr\7\5\2\2r\25\3\2\2\2st"+
		"\7\4\2\2t\27\3\2\2\2uv\7\22\2\2v\31\3\2\2\2wz\5\34\17\2xz\5\36\20\2yw"+
		"\3\2\2\2yx\3\2\2\2z\33\3\2\2\2{|\7\b\2\2|}\5 \21\2}~\7\3\2\2~\35\3\2\2"+
		"\2\177\u0080\7\f\2\2\u0080\u0081\5 \21\2\u0081\u0082\7\3\2\2\u0082\37"+
		"\3\2\2\2\u0083\u0085\5\"\22\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2"+
		"\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087!\3\2\2\2\u0088\u0086\3"+
		"\2\2\2\u0089\u008c\5&\24\2\u008a\u008c\5$\23\2\u008b\u0089\3\2\2\2\u008b"+
		"\u008a\3\2\2\2\u008c#\3\2\2\2\u008d\u0090\5*\26\2\u008e\u0090\5(\25\2"+
		"\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090%\3\2\2\2\u0091\u0092\5"+
		"*\26\2\u0092\u0093\7\n\2\2\u0093\u0094\5*\26\2\u0094\'\3\2\2\2\u0095\u0096"+
		"\7\16\2\2\u0096\u0097\7\25\2\2\u0097)\3\2\2\2\u0098\u0099\7\24\2\2\u0099"+
		"+\3\2\2\2\u009a\u009c\7\23\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2"+
		"\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e-\3\2\2\2\u009f\u009d\3"+
		"\2\2\2\16\65;CW`fmy\u0086\u008b\u008f\u009d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}