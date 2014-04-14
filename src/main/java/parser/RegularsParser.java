// Generated from /home/mateusz/Dropbox/semVI/TK/tk-projekt/src/main/antlr4/Regulars.g4 by ANTLR 4.2.2
package parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RegularsParser extends Parser {
    public static final int
            T__12 = 1, T__11 = 2, T__10 = 3, T__9 = 4, T__8 = 5, T__7 = 6, T__6 = 7, T__5 = 8, T__4 = 9,
            T__3 = 10, T__2 = 11, T__1 = 12, T__0 = 13, ANONMETACHARACTER = 14, METACHARACTER = 15;
    public static final String[] tokenNames = {
            "<INVALID>", "']'", "'.'", "')'", "'+'", "'-'", "'['", "'*'", "'('", "'[^'",
            "'?'", "'''", "'|'", "'$'", "ANONMETACHARACTER", "METACHARACTER"
    };
    public static final int
            RULE_start = 0, RULE_regex = 1, RULE_simple_regex = 2, RULE_basic_regex = 3,
            RULE_star = 4, RULE_plus = 5, RULE_one_or_none = 6, RULE_elementary_regex = 7,
            RULE_group = 8, RULE_any = 9, RULE_eos = 10, RULE_set = 11, RULE_positive_set = 12,
            RULE_negative_set = 13, RULE_set_items = 14, RULE_set_item = 15, RULE_range = 16,
            RULE_character = 17;
    public static final String[] ruleNames = {
            "start", "regex", "simple_regex", "basic_regex", "star", "plus", "one_or_none",
            "elementary_regex", "group", "any", "eos", "set", "positive_set", "negative_set",
            "set_items", "set_item", "range", "character"
    };
    public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21{\4\2\t\2\4\3\t" +
                    "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4" +
                    "\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23" +
                    "\t\23\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3\4\3" +
                    "\4\3\4\3\4\5\48\n\4\3\5\3\5\3\5\3\5\5\5>\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3" +
                    "\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\tN\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f" +
                    "\3\f\3\r\3\r\5\rZ\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20" +
                    "\3\20\3\20\3\20\7\20i\n\20\f\20\16\20l\13\20\3\21\3\21\5\21p\n\21\3\22" +
                    "\3\22\3\22\3\22\3\23\3\23\3\23\5\23y\n\23\3\23\2\4\4\36\24\2\4\6\b\n\f" +
                    "\16\20\22\24\26\30\32\34\36 \"$\2\2u\2&\3\2\2\2\4(\3\2\2\2\6\67\3\2\2" +
                    "\2\b=\3\2\2\2\n?\3\2\2\2\fB\3\2\2\2\16E\3\2\2\2\20M\3\2\2\2\22O\3\2\2" +
                    "\2\24S\3\2\2\2\26U\3\2\2\2\30Y\3\2\2\2\32[\3\2\2\2\34_\3\2\2\2\36c\3\2" +
                    "\2\2 o\3\2\2\2\"q\3\2\2\2$x\3\2\2\2&\'\5\6\4\2\'\3\3\2\2\2()\b\3\1\2)" +
                    "*\5\6\4\2*\60\3\2\2\2+,\f\4\2\2,-\7\16\2\2-/\5\6\4\2.+\3\2\2\2/\62\3\2" +
                    "\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\5\3\2\2\2\62\60\3\2\2\2\63\64\5\b\5" +
                    "\2\64\65\5\6\4\2\658\3\2\2\2\668\5\b\5\2\67\63\3\2\2\2\67\66\3\2\2\28" +
                    "\7\3\2\2\29>\5\n\6\2:>\5\f\7\2;>\5\20\t\2<>\5\16\b\2=9\3\2\2\2=:\3\2\2" +
                    "\2=;\3\2\2\2=<\3\2\2\2>\t\3\2\2\2?@\5\20\t\2@A\7\t\2\2A\13\3\2\2\2BC\5" +
                    "\20\t\2CD\7\6\2\2D\r\3\2\2\2EF\5\20\t\2FG\7\f\2\2G\17\3\2\2\2HN\5\22\n" +
                    "\2IN\5\24\13\2JN\5\26\f\2KN\5$\23\2LN\5\30\r\2MH\3\2\2\2MI\3\2\2\2MJ\3" +
                    "\2\2\2MK\3\2\2\2ML\3\2\2\2N\21\3\2\2\2OP\7\n\2\2PQ\5\4\3\2QR\7\5\2\2R" +
                    "\23\3\2\2\2ST\7\4\2\2T\25\3\2\2\2UV\7\17\2\2V\27\3\2\2\2WZ\5\32\16\2X" +
                    "Z\5\34\17\2YW\3\2\2\2YX\3\2\2\2Z\31\3\2\2\2[\\\7\b\2\2\\]\5\36\20\2]^" +
                    "\7\3\2\2^\33\3\2\2\2_`\7\13\2\2`a\5\36\20\2ab\7\3\2\2b\35\3\2\2\2cd\b" +
                    "\20\1\2de\5 \21\2ej\3\2\2\2fg\f\4\2\2gi\5 \21\2hf\3\2\2\2il\3\2\2\2jh" +
                    "\3\2\2\2jk\3\2\2\2k\37\3\2\2\2lj\3\2\2\2mp\5\"\22\2np\5$\23\2om\3\2\2" +
                    "\2on\3\2\2\2p!\3\2\2\2qr\5$\23\2rs\7\7\2\2st\5$\23\2t#\3\2\2\2uy\7\20" +
                    "\2\2vw\7\r\2\2wy\7\21\2\2xu\3\2\2\2xv\3\2\2\2y%\3\2\2\2\n\60\67=MYjox";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();

    public RegularsParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "Regulars.g4";
    }

    @Override
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public final StartContext start() throws RecognitionException {
        StartContext _localctx = new StartContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_start);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(36);
                simple_regex();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final RegexContext regex() throws RecognitionException {
        return regex(0);
    }

    private RegexContext regex(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        RegexContext _localctx = new RegexContext(_ctx, _parentState);
        RegexContext _prevctx = _localctx;
        int _startState = 2;
        enterRecursionRule(_localctx, 2, RULE_regex, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(39);
                    simple_regex();
                }
                _ctx.stop = _input.LT(-1);
                setState(46);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 0, _ctx);
                while (_alt != 2 && _alt != ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new RegexContext(_parentctx, _parentState);
                                pushNewRecursionContext(_localctx, _startState, RULE_regex);
                                setState(41);
                                if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                setState(42);
                                match(12);
                                setState(43);
                                simple_regex();
                            }
                        }
                    }
                    setState(48);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 0, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public final Simple_regexContext simple_regex() throws RecognitionException {
        Simple_regexContext _localctx = new Simple_regexContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_simple_regex);
        try {
            setState(53);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(49);
                    basic_regex();
                    setState(50);
                    simple_regex();
                }
                break;

                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(52);
                    basic_regex();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Basic_regexContext basic_regex() throws RecognitionException {
        Basic_regexContext _localctx = new Basic_regexContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_basic_regex);
        try {
            setState(59);
            switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(55);
                    star();
                }
                break;

                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(56);
                    plus();
                }
                break;

                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(57);
                    elementary_regex();
                }
                break;

                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(58);
                    one_or_none();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StarContext star() throws RecognitionException {
        StarContext _localctx = new StarContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_star);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(61);
                elementary_regex();
                setState(62);
                match(7);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final PlusContext plus() throws RecognitionException {
        PlusContext _localctx = new PlusContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_plus);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(64);
                elementary_regex();
                setState(65);
                match(4);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final One_or_noneContext one_or_none() throws RecognitionException {
        One_or_noneContext _localctx = new One_or_noneContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_one_or_none);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(67);
                elementary_regex();
                setState(68);
                match(10);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Elementary_regexContext elementary_regex() throws RecognitionException {
        Elementary_regexContext _localctx = new Elementary_regexContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_elementary_regex);
        try {
            setState(75);
            switch (_input.LA(1)) {
                case 8:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(70);
                    group();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(71);
                    any();
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(72);
                    eos();
                }
                break;
                case 11:
                case ANONMETACHARACTER:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(73);
                    character();
                }
                break;
                case 6:
                case 9:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(74);
                    set();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final GroupContext group() throws RecognitionException {
        GroupContext _localctx = new GroupContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_group);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(77);
                match(8);
                setState(78);
                regex(0);
                setState(79);
                match(3);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final AnyContext any() throws RecognitionException {
        AnyContext _localctx = new AnyContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_any);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(81);
                match(2);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final EosContext eos() throws RecognitionException {
        EosContext _localctx = new EosContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_eos);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(83);
                match(13);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final SetContext set() throws RecognitionException {
        SetContext _localctx = new SetContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_set);
        try {
            setState(87);
            switch (_input.LA(1)) {
                case 6:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(85);
                    positive_set();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(86);
                    negative_set();
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Positive_setContext positive_set() throws RecognitionException {
        Positive_setContext _localctx = new Positive_setContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_positive_set);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(89);
                match(6);
                setState(90);
                set_items(0);
                setState(91);
                match(1);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Negative_setContext negative_set() throws RecognitionException {
        Negative_setContext _localctx = new Negative_setContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_negative_set);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(93);
                match(9);
                setState(94);
                set_items(0);
                setState(95);
                match(1);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Set_itemsContext set_items() throws RecognitionException {
        return set_items(0);
    }

    private Set_itemsContext set_items(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        Set_itemsContext _localctx = new Set_itemsContext(_ctx, _parentState);
        Set_itemsContext _prevctx = _localctx;
        int _startState = 28;
        enterRecursionRule(_localctx, 28, RULE_set_items, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(98);
                    set_item();
                }
                _ctx.stop = _input.LT(-1);
                setState(104);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                while (_alt != 2 && _alt != ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new Set_itemsContext(_parentctx, _parentState);
                                pushNewRecursionContext(_localctx, _startState, RULE_set_items);
                                setState(100);
                                if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                setState(101);
                                set_item();
                            }
                        }
                    }
                    setState(106);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public final Set_itemContext set_item() throws RecognitionException {
        Set_itemContext _localctx = new Set_itemContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_set_item);
        try {
            setState(109);
            switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(107);
                    range();
                }
                break;

                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(108);
                    character();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final RangeContext range() throws RecognitionException {
        RangeContext _localctx = new RangeContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_range);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(111);
                character();
                setState(112);
                match(5);
                setState(113);
                character();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final CharacterContext character() throws RecognitionException {
        CharacterContext _localctx = new CharacterContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_character);
        try {
            setState(118);
            switch (_input.LA(1)) {
                case ANONMETACHARACTER:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(115);
                    match(ANONMETACHARACTER);
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(116);
                    match(11);
                    setState(117);
                    match(METACHARACTER);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 1:
                return regex_sempred((RegexContext) _localctx, predIndex);

            case 14:
                return set_items_sempred((Set_itemsContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean regex_sempred(RegexContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 2);
        }
        return true;
    }

    private boolean set_items_sempred(Set_itemsContext _localctx, int predIndex) {
        switch (predIndex) {
            case 1:
                return precpred(_ctx, 2);
        }
        return true;
    }

    public static class StartContext extends ParserRuleContext {
        public StartContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public Simple_regexContext simple_regex() {
            return getRuleContext(Simple_regexContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_start;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RegularsVisitor) return ((RegularsVisitor<? extends T>) visitor).visitStart(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class RegexContext extends ParserRuleContext {
        public RegexContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public Simple_regexContext simple_regex() {
            return getRuleContext(Simple_regexContext.class, 0);
        }

        public RegexContext regex() {
            return getRuleContext(RegexContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_regex;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RegularsVisitor) return ((RegularsVisitor<? extends T>) visitor).visitRegex(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Simple_regexContext extends ParserRuleContext {
        public Simple_regexContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public Simple_regexContext simple_regex() {
            return getRuleContext(Simple_regexContext.class, 0);
        }

        public Basic_regexContext basic_regex() {
            return getRuleContext(Basic_regexContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_simple_regex;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RegularsVisitor)
                return ((RegularsVisitor<? extends T>) visitor).visitSimple_regex(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Basic_regexContext extends ParserRuleContext {
        public Basic_regexContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public Elementary_regexContext elementary_regex() {
            return getRuleContext(Elementary_regexContext.class, 0);
        }

        public One_or_noneContext one_or_none() {
            return getRuleContext(One_or_noneContext.class, 0);
        }

        public StarContext star() {
            return getRuleContext(StarContext.class, 0);
        }

        public PlusContext plus() {
            return getRuleContext(PlusContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_basic_regex;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RegularsVisitor)
                return ((RegularsVisitor<? extends T>) visitor).visitBasic_regex(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StarContext extends ParserRuleContext {
        public StarContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public Elementary_regexContext elementary_regex() {
            return getRuleContext(Elementary_regexContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_star;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RegularsVisitor) return ((RegularsVisitor<? extends T>) visitor).visitStar(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class PlusContext extends ParserRuleContext {
        public PlusContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public Elementary_regexContext elementary_regex() {
            return getRuleContext(Elementary_regexContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_plus;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RegularsVisitor) return ((RegularsVisitor<? extends T>) visitor).visitPlus(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class One_or_noneContext extends ParserRuleContext {
        public One_or_noneContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public Elementary_regexContext elementary_regex() {
            return getRuleContext(Elementary_regexContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_one_or_none;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RegularsVisitor)
                return ((RegularsVisitor<? extends T>) visitor).visitOne_or_none(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Elementary_regexContext extends ParserRuleContext {
        public Elementary_regexContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public EosContext eos() {
            return getRuleContext(EosContext.class, 0);
        }

        public CharacterContext character() {
            return getRuleContext(CharacterContext.class, 0);
        }

        public SetContext set() {
            return getRuleContext(SetContext.class, 0);
        }

        public GroupContext group() {
            return getRuleContext(GroupContext.class, 0);
        }

        public AnyContext any() {
            return getRuleContext(AnyContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_elementary_regex;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RegularsVisitor)
                return ((RegularsVisitor<? extends T>) visitor).visitElementary_regex(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class GroupContext extends ParserRuleContext {
        public GroupContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public RegexContext regex() {
            return getRuleContext(RegexContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_group;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RegularsVisitor) return ((RegularsVisitor<? extends T>) visitor).visitGroup(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AnyContext extends ParserRuleContext {
        public AnyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_any;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RegularsVisitor) return ((RegularsVisitor<? extends T>) visitor).visitAny(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class EosContext extends ParserRuleContext {
        public EosContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_eos;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RegularsVisitor) return ((RegularsVisitor<? extends T>) visitor).visitEos(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SetContext extends ParserRuleContext {
        public SetContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public Positive_setContext positive_set() {
            return getRuleContext(Positive_setContext.class, 0);
        }

        public Negative_setContext negative_set() {
            return getRuleContext(Negative_setContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_set;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RegularsVisitor) return ((RegularsVisitor<? extends T>) visitor).visitSet(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Positive_setContext extends ParserRuleContext {
        public Positive_setContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public Set_itemsContext set_items() {
            return getRuleContext(Set_itemsContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_positive_set;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RegularsVisitor)
                return ((RegularsVisitor<? extends T>) visitor).visitPositive_set(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Negative_setContext extends ParserRuleContext {
        public Negative_setContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public Set_itemsContext set_items() {
            return getRuleContext(Set_itemsContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_negative_set;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RegularsVisitor)
                return ((RegularsVisitor<? extends T>) visitor).visitNegative_set(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Set_itemsContext extends ParserRuleContext {
        public Set_itemsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public Set_itemContext set_item() {
            return getRuleContext(Set_itemContext.class, 0);
        }

        public Set_itemsContext set_items() {
            return getRuleContext(Set_itemsContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_set_items;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RegularsVisitor)
                return ((RegularsVisitor<? extends T>) visitor).visitSet_items(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Set_itemContext extends ParserRuleContext {
        public Set_itemContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public CharacterContext character() {
            return getRuleContext(CharacterContext.class, 0);
        }

        public RangeContext range() {
            return getRuleContext(RangeContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_set_item;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RegularsVisitor) return ((RegularsVisitor<? extends T>) visitor).visitSet_item(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class RangeContext extends ParserRuleContext {
        public RangeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public CharacterContext character(int i) {
            return getRuleContext(CharacterContext.class, i);
        }

        public List<CharacterContext> character() {
            return getRuleContexts(CharacterContext.class);
        }

        @Override
        public int getRuleIndex() {
            return RULE_range;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RegularsVisitor) return ((RegularsVisitor<? extends T>) visitor).visitRange(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CharacterContext extends ParserRuleContext {
        public CharacterContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode METACHARACTER() {
            return getToken(RegularsParser.METACHARACTER, 0);
        }

        public TerminalNode ANONMETACHARACTER() {
            return getToken(RegularsParser.ANONMETACHARACTER, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_character;
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof RegularsVisitor)
                return ((RegularsVisitor<? extends T>) visitor).visitCharacter(this);
            else return visitor.visitChildren(this);
        }
    }
}