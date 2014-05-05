// Generated from C:\Users\HOUSE\Desktop\tk\tk-projekt\src\main\antlr4\Regulars.g4 by ANTLR 4.2.2
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
		T__3=10, T__2=11, T__1=12, T__0=13, ANONMETACHARACTER=14, METACHARACTER=15;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'.'", "')'", "'+'", "'-'", "'['", "'*'", "'('", "'[^'", 
		"'?'", "'''", "'|'", "'$'", "ANONMETACHARACTER", "METACHARACTER"
	};
	public static final int
		RULE_start = 0, RULE_regex = 1, RULE_simple_regex = 2, RULE_basic_regex = 3, 
		RULE_one_or_none = 4, RULE_star = 5, RULE_plus = 6, RULE_elementary_regex = 7, 
		RULE_group = 8, RULE_any = 9, RULE_eos = 10, RULE_set = 11, RULE_positive_set = 12, 
		RULE_negative_set = 13, RULE_set_items = 14, RULE_set_item = 15, RULE_character = 16, 
		RULE_range = 17, RULE_metacharacter = 18, RULE_nonmetacharacter = 19;
	public static final String[] ruleNames = {
		"start", "regex", "simple_regex", "basic_regex", "one_or_none", "star", 
		"plus", "elementary_regex", "group", "any", "eos", "set", "positive_set", 
		"negative_set", "set_items", "set_item", "character", "range", "metacharacter", 
		"nonmetacharacter"
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
			setState(40); regex();
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
			setState(42); simple_regex();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==12) {
				{
				{
				setState(43); match(12);
				setState(44); simple_regex();
				}
				}
				setState(49);
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 6) | (1L << 8) | (1L << 9) | (1L << 11) | (1L << 13) | (1L << ANONMETACHARACTER))) != 0)) {
				{
				{
				setState(50); basic_regex();
				}
				}
				setState(55);
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
			setState(60);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56); star();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57); plus();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58); elementary_regex();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(59); one_or_none();
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
			setState(62); elementary_regex();
			setState(63); match(10);
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
			setState(65); elementary_regex();
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66); match(7);
				}
				}
				setState(69); 
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
		enterRule(_localctx, 12, RULE_plus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); elementary_regex();
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(72); match(4);
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==4 );
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
			setState(82);
			switch (_input.LA(1)) {
			case 8:
				enterOuterAlt(_localctx, 1);
				{
				setState(77); group();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78); any();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 3);
				{
				setState(79); eos();
				}
				break;
			case 11:
			case ANONMETACHARACTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(80); character();
				}
				break;
			case 6:
			case 9:
				enterOuterAlt(_localctx, 5);
				{
				setState(81); set();
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
			setState(84); match(8);
			setState(85); regex();
			setState(86); match(3);
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
			setState(88); match(2);
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
			setState(90); match(13);
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
			setState(94);
			switch (_input.LA(1)) {
			case 6:
				enterOuterAlt(_localctx, 1);
				{
				setState(92); positive_set();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); negative_set();
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
			setState(96); match(6);
			setState(97); set_items();
			setState(98); match(1);
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
			setState(100); match(9);
			setState(101); set_items();
			setState(102); match(1);
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
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==11 || _la==ANONMETACHARACTER) {
				{
				{
				setState(104); set_item();
				}
				}
				setState(109);
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
			setState(112);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(110); range();
				}
				break;

			case 2:
				{
				setState(111); character();
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
			setState(116);
			switch (_input.LA(1)) {
			case ANONMETACHARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(114); nonmetacharacter();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 2);
				{
				setState(115); metacharacter();
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
			setState(118); nonmetacharacter();
			setState(119); match(5);
			setState(120); nonmetacharacter();
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
			setState(122); match(11);
			setState(123); match(METACHARACTER);
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
			setState(125); match(ANONMETACHARACTER);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21\u0082\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\7\3\60\n\3\f\3\16\3"+
		"\63\13\3\3\4\7\4\66\n\4\f\4\16\49\13\4\3\5\3\5\3\5\3\5\5\5?\n\5\3\6\3"+
		"\6\3\6\3\7\3\7\6\7F\n\7\r\7\16\7G\3\b\3\b\6\bL\n\b\r\b\16\bM\3\t\3\t\3"+
		"\t\3\t\3\t\5\tU\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\5\ra\n\r"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\7\20l\n\20\f\20\16\20o\13"+
		"\20\3\21\3\21\5\21s\n\21\3\22\3\22\5\22w\n\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(\2\2|\2*\3\2\2\2\4,\3\2\2\2\6\67\3\2\2\2\b>\3\2\2\2\n@\3\2\2\2\f"+
		"C\3\2\2\2\16I\3\2\2\2\20T\3\2\2\2\22V\3\2\2\2\24Z\3\2\2\2\26\\\3\2\2\2"+
		"\30`\3\2\2\2\32b\3\2\2\2\34f\3\2\2\2\36m\3\2\2\2 r\3\2\2\2\"v\3\2\2\2"+
		"$x\3\2\2\2&|\3\2\2\2(\177\3\2\2\2*+\5\4\3\2+\3\3\2\2\2,\61\5\6\4\2-.\7"+
		"\16\2\2.\60\5\6\4\2/-\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2"+
		"\62\5\3\2\2\2\63\61\3\2\2\2\64\66\5\b\5\2\65\64\3\2\2\2\669\3\2\2\2\67"+
		"\65\3\2\2\2\678\3\2\2\28\7\3\2\2\29\67\3\2\2\2:?\5\f\7\2;?\5\16\b\2<?"+
		"\5\20\t\2=?\5\n\6\2>:\3\2\2\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2?\t\3\2\2\2"+
		"@A\5\20\t\2AB\7\f\2\2B\13\3\2\2\2CE\5\20\t\2DF\7\t\2\2ED\3\2\2\2FG\3\2"+
		"\2\2GE\3\2\2\2GH\3\2\2\2H\r\3\2\2\2IK\5\20\t\2JL\7\6\2\2KJ\3\2\2\2LM\3"+
		"\2\2\2MK\3\2\2\2MN\3\2\2\2N\17\3\2\2\2OU\5\22\n\2PU\5\24\13\2QU\5\26\f"+
		"\2RU\5\"\22\2SU\5\30\r\2TO\3\2\2\2TP\3\2\2\2TQ\3\2\2\2TR\3\2\2\2TS\3\2"+
		"\2\2U\21\3\2\2\2VW\7\n\2\2WX\5\4\3\2XY\7\5\2\2Y\23\3\2\2\2Z[\7\4\2\2["+
		"\25\3\2\2\2\\]\7\17\2\2]\27\3\2\2\2^a\5\32\16\2_a\5\34\17\2`^\3\2\2\2"+
		"`_\3\2\2\2a\31\3\2\2\2bc\7\b\2\2cd\5\36\20\2de\7\3\2\2e\33\3\2\2\2fg\7"+
		"\13\2\2gh\5\36\20\2hi\7\3\2\2i\35\3\2\2\2jl\5 \21\2kj\3\2\2\2lo\3\2\2"+
		"\2mk\3\2\2\2mn\3\2\2\2n\37\3\2\2\2om\3\2\2\2ps\5$\23\2qs\5\"\22\2rp\3"+
		"\2\2\2rq\3\2\2\2s!\3\2\2\2tw\5(\25\2uw\5&\24\2vt\3\2\2\2vu\3\2\2\2w#\3"+
		"\2\2\2xy\5(\25\2yz\7\7\2\2z{\5(\25\2{%\3\2\2\2|}\7\r\2\2}~\7\21\2\2~\'"+
		"\3\2\2\2\177\u0080\7\20\2\2\u0080)\3\2\2\2\f\61\67>GMT`mrv";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}