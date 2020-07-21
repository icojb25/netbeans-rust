// Generated from xidstart.g4 by ANTLR 4.5.3
package com.gramrco.antlrlexer;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings(
{
    "all", "warnings", "unchecked", "unused", "cast"
})
public class Xidstart extends Lexer
{

    static
    {
        RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache
            = new PredictionContextCache();
    public static String[] modeNames =
    {
        "DEFAULT_MODE"
    };

    public static final String[] ruleNames =
    {
        "XID_Start"
    };

    private static final String[] _LITERAL_NAMES =
    {
    };
    private static final String[] _SYMBOLIC_NAMES =
    {
    };
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;

    static
    {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++)
        {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null)
            {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null)
            {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames()
    {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary()
    {
        return VOCABULARY;
    }

    public Xidstart(CharStream input)
    {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName()
    {
        return "xidstart.g4";
    }

    @Override
    public String[] getRuleNames()
    {
        return ruleNames;
    }

    @Override
    public String getSerializedATN()
    {
        return _serializedATN;
    }

    @Override
    public String[] getModeNames()
    {
        return modeNames;
    }

    @Override
    public ATN getATN()
    {
        return _ATN;
    }

    public static final String _serializedATN
            = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\2\u00bc\b\1\4\2\t"
            + "\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"
            + "\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"
            + "\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"
            + "\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"
            + "\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"
            + "\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"
            + "\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"
            + "\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"
            + "\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"
            + "\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"
            + "\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00bb\n\2\2\2\3\3\2\3\2\3\u011f\2C\\aa"
            + "c|\u00ac\u00ac\u00b7\u00b7\u00bc\u00bc\u00c2\u00d8\u00da\u00f8\u00fa\u0238"
            + "\u0252\u02c3\u02c8\u02d3\u02e2\u02e6\u02f0\u02f0\u0388\u0388\u038a\u038c"
            + "\u038e\u038e\u0390\u03a3\u03a5\u03d0\u03d2\u03f7\u03f9\u03fd\u0402\u0483"
            + "\u048c\u04d0\u04d2\u04f7\u04fa\u04fb\u0502\u0511\u0533\u0558\u055b\u055b"
            + "\u0563\u0589\u05d2\u05ec\u05f2\u05f4\u0623\u063c\u0642\u064c\u0670\u0671"
            + "\u0673\u06d5\u06d7\u06d7\u06e7\u06e8\u06f0\u06f1\u06fc\u06fe\u0701\u0701"
            + "\u0712\u0712\u0714\u0731\u074f\u0751\u0782\u07a7\u07b3\u07b3\u0906\u093b"
            + "\u093f\u093f\u0952\u0952\u095a\u0963\u0987\u098e\u0991\u0992\u0995\u09aa"
            + "\u09ac\u09b2\u09b4\u09b4\u09b8\u09bb\u09bf\u09bf\u09de\u09df\u09e1\u09e3"
            + "\u09f2\u09f3\u0a07\u0a0c\u0a11\u0a12\u0a15\u0a2a\u0a2c\u0a32\u0a34\u0a35"
            + "\u0a37\u0a38\u0a3a\u0a3b\u0a5b\u0a5e\u0a60\u0a60\u0a74\u0a76\u0a87\u0a8f"
            + "\u0a91\u0a93\u0a95\u0aaa\u0aac\u0ab2\u0ab4\u0ab5\u0ab7\u0abb\u0abf\u0abf"
            + "\u0ad2\u0ad2\u0ae2\u0ae3\u0b07\u0b0e\u0b11\u0b12\u0b15\u0b2a\u0b2c\u0b32"
            + "\u0b34\u0b35\u0b37\u0b3b\u0b3f\u0b3f\u0b5e\u0b5f\u0b61\u0b63\u0b73\u0b73"
            + "\u0b85\u0b85\u0b87\u0b8c\u0b90\u0b92\u0b94\u0b97\u0b9b\u0b9c\u0b9e\u0b9e"
            + "\u0ba0\u0ba1\u0ba5\u0ba6\u0baa\u0bac\u0bb0\u0bb7\u0bb9\u0bbb\u0c07\u0c0e"
            + "\u0c10\u0c12\u0c14\u0c2a\u0c2c\u0c35\u0c37\u0c3b\u0c62\u0c63\u0c87\u0c8e"
            + "\u0c90\u0c92\u0c94\u0caa\u0cac\u0cb5\u0cb7\u0cbb\u0cbf\u0cbf\u0ce0\u0ce0"
            + "\u0ce2\u0ce3\u0d07\u0d0e\u0d10\u0d12\u0d14\u0d2a\u0d2c\u0d3b\u0d62\u0d63"
            + "\u0d87\u0d98\u0d9c\u0db3\u0db5\u0dbd\u0dbf\u0dbf\u0dc2\u0dc8\u0e03\u0e32"
            + "\u0e34\u0e34\u0e42\u0e48\u0e83\u0e84\u0e86\u0e86\u0e89\u0e8a\u0e8c\u0e8c"
            + "\u0e8f\u0e8f\u0e96\u0e99\u0e9b\u0ea1\u0ea3\u0ea5\u0ea7\u0ea7\u0ea9\u0ea9"
            + "\u0eac\u0ead\u0eaf\u0eb2\u0eb4\u0eb4\u0ebf\u0ebf\u0ec2\u0ec6\u0ec8\u0ec8"
            + "\u0ede\u0edf\u0f02\u0f02\u0f42\u0f49\u0f4b\u0f6c\u0f8a\u0f8d\u1002\u1023"
            + "\u1025\u1029\u102b\u102c\u1052\u1057\u10a2\u10c7\u10d2\u10fa\u1102\u115b"
            + "\u1161\u11a4\u11aa\u11fb\u1202\u1208\u120a\u1248\u124a\u124a\u124c\u124f"
            + "\u1252\u1258\u125a\u125a\u125c\u125f\u1262\u1288\u128a\u128a\u128c\u128f"
            + "\u1292\u12b0\u12b2\u12b2\u12b4\u12b7\u12ba\u12c0\u12c2\u12c2\u12c4\u12c7"
            + "\u12ca\u12d0\u12d2\u12d8\u12da\u12f0\u12f2\u1310\u1312\u1312\u1314\u1317"
            + "\u131a\u1320\u1322\u1348\u134a\u135c\u13a2\u13f6\u1403\u166e\u1671\u1678"
            + "\u1683\u169c\u16a2\u16ec\u16f0\u16f2\u1702\u170e\u1710\u1713\u1722\u1733"
            + "\u1742\u1753\u1762\u176e\u1770\u1772\u1782\u17b5\u17d9\u17d9\u17de\u17de"
            + "\u1822\u1879\u1882\u18aa\u1902\u191e\u1952\u196f\u1972\u1976\u1d02\u1d6d"
            + "\u1e02\u1e9d\u1ea2\u1efb\u1f02\u1f17\u1f1a\u1f1f\u1f22\u1f47\u1f4a\u1f4f"
            + "\u1f52\u1f59\u1f5b\u1f5b\u1f5d\u1f5d\u1f5f\u1f5f\u1f61\u1f7f\u1f82\u1fb6"
            + "\u1fb8\u1fbe\u1fc0\u1fc0\u1fc4\u1fc6\u1fc8\u1fce\u1fd2\u1fd5\u1fd8\u1fdd"
            + "\u1fe2\u1fee\u1ff4\u1ff6\u1ff8\u1ffe\u2073\u2073\u2081\u2081\u2104\u2104"
            + "\u2109\u2109\u210c\u2115\u2117\u2117\u211a\u211f\u2126\u2126\u2128\u2128"
            + "\u212a\u212a\u212c\u2133\u2135\u213b\u213f\u2141\u2147\u214b\u2162\u2185"
            + "\u3007\u3009\u3023\u302b\u3033\u3037\u303a\u303e\u3043\u3098\u309f\u30a1"
            + "\u30a3\u30fc\u30fe\u3101\u3107\u312e\u3133\u3190\u31a2\u31b9\u31f2\u3201"
            + "\u3402\u4db7\u4e02\u9fa7\ua002\ua48e\uac02\ud7a5\uf902\ufa2f\ufa32\ufa6c"
            + "\ufb02\ufb08\ufb15\ufb19\ufb1f\ufb1f\ufb21\ufb2a\ufb2c\ufb38\ufb3a\ufb3e"
            + "\ufb40\ufb40\ufb42\ufb43\ufb45\ufb46\ufb48\ufbb3\ufbd5\ufc5f\ufc66\ufd3f"
            + "\ufd52\ufd91\ufd94\ufdc9\ufdf2\ufdfb\ufe73\ufe73\ufe75\ufe75\ufe79\ufe79"
            + "\ufe7b\ufe7b\ufe7d\ufe7d\ufe7f\ufe7f\ufe81\ufefe\uff23\uff3c\uff43\uff5c"
            + "\uff68\uff9f\uffa2\uffc0\uffc4\uffc9\uffcc\uffd1\uffd4\uffd9\uffdc\uffde"
            + "\u0114\3\u00ba\3\2\2\2\5\u00bb\t\2\2\2\6\7\7\ud802\2\2\7\u00bb\4\udc02"
            + "\udc0c\2\b\t\7\ud802\2\2\t\u00bb\4\udc0f\udc27\2\n\13\7\ud802\2\2\13\u00bb"
            + "\4\udc2a\udc3b\2\f\r\7\ud802\2\2\r\u00bb\4\udc3e\udc3e\2\16\17\7\ud802"
            + "\2\2\17\u00bb\4\udc41\udc4e\2\20\21\7\ud802\2\2\21\u00bb\4\udc52\udc5e"
            + "\2\22\23\7\ud802\2\2\23\u00bb\4\udc82\udcfb\2\24\25\7\ud802\2\2\25\u00bb"
            + "\4\udf02\udf1f\2\26\27\7\ud802\2\2\27\u00bb\4\udf32\udf4b\2\30\31\7\ud802"
            + "\2\2\31\u00bb\4\udf82\udf9e\2\32\33\7\ud803\2\2\33\u00bb\4\ue002\ue09e"
            + "\2\34\35\7\ud804\2\2\35\u00bb\4\ue402\ue406\2\36\37\7\ud804\2\2\37\u00bb"
            + "\7\u080a\2\2 !\7\ud804\2\2!\u00bb\4\ue40c\ue436\2\"#\7\ud804\2\2#\u00bb"
            + "\4\ue439\ue439\2$%\7\ud804\2\2%\u00bb\7\u083e\2\2&\'\7\ud804\2\2\'\u00bb"
            + "\7\u0841\2\2()\7\ud837\2\2)\u00bb\4\ub002\ub055\2*+\7\ud837\2\2+\u00bb"
            + "\4\ub058\ub09d\2,-\7\ud837\2\2-\u00bb\4\ub0a0\ub0a0\2./\7\ud837\2\2/\u00bb"
            + "\7\ud4a4\2\2\60\61\7\ud837\2\2\61\u00bb\4\ub0a7\ub0a7\2\62\63\7\ud837"
            + "\2\2\63\u00bb\4\ub0ab\ub0ad\2\64\65\7\ud837\2\2\65\u00bb\4\ub0b0\ub0ba"
            + "\2\66\67\7\ud837\2\2\67\u00bb\7\ud4bd\2\289\7\ud837\2\29\u00bb\4\ub0bf"
            + "\ub0c4\2:;\7\ud837\2\2;\u00bb\4\ub0c7\ub106\2<=\7\ud837\2\2=\u00bb\4\ub109"
            + "\ub10b\2>?\7\ud837\2\2?\u00bb\4\ub10f\ub115\2@A\7\ud837\2\2A\u00bb\4\ub118"
            + "\ub11d\2BC\7\ud837\2\2C\u00bb\4\ub120\ub13a\2DE\7\ud837\2\2E\u00bb\4\ub13d"
            + "\ub13f\2FG\7\ud837\2\2G\u00bb\4\ub142\ub145\2HI\7\ud837\2\2I\u00bb\7\ud548"
            + "\2\2JK\7\ud837\2\2K\u00bb\4\ub14c\ub151\2LM\7\ud837\2\2M\u00bb\4\ub154"
            + "\ub2a4\2NO\7\ud837\2\2O\u00bb\4\ub2aa\ub2c1\2PQ\7\ud837\2\2Q\u00bb\4\ub2c4"
            + "\ub2db\2RS\7\ud837\2\2S\u00bb\4\ub2de\ub2fb\2TU\7\ud837\2\2U\u00bb\4\ub2fe"
            + "\ub315\2VW\7\ud837\2\2W\u00bb\4\ub318\ub335\2XY\7\ud837\2\2Y\u00bb\4\ub338"
            + "\ub34f\2Z[\7\ud837\2\2[\u00bb\4\ub352\ub36f\2\\]\7\ud837\2\2]\u00bb\4"
            + "\ub372\ub389\2^_\7\ud837\2\2_\u00bb\4\ub38c\ub3a9\2`a\7\ud837\2\2a\u00bb"
            + "\4\ub3ac\ub3c3\2bc\7\ud837\2\2c\u00bb\4\ub3c6\ub3ca\2de\7\ud842\2\2e\u00bb"
            + "\4\udc02\ue000\2fg\7\ud843\2\2g\u00bb\4\ue002\ue400\2hi\7\ud844\2\2i\u00bb"
            + "\4\ue402\ue800\2jk\7\ud845\2\2k\u00bb\4\ue802\uec00\2lm\7\ud846\2\2m\u00bb"
            + "\4\uec02\uf000\2no\7\ud847\2\2o\u00bb\4\uf002\uf400\2pq\7\ud848\2\2q\u00bb"
            + "\4\uf402\uf800\2rs\7\ud849\2\2s\u00bb\4\uf802\ufc00\2tu\7\ud84a\2\2u\u00bb"
            + "\4\ufc02\0\2vw\7\ud84b\2\2w\u00bb\4\2\u0400\2xy\7\ud84c\2\2y\u00bb\4\u0402"
            + "\u0800\2z{\7\ud84d\2\2{\u00bb\4\u0802\u0c00\2|}\7\ud84e\2\2}\u00bb\4\u0c02"
            + "\u1000\2~\177\7\ud84f\2\2\177\u00bb\4\u1002\u1400\2\u0080\u0081\7\ud850"
            + "\2\2\u0081\u00bb\4\u1402\u1800\2\u0082\u0083\7\ud851\2\2\u0083\u00bb\4"
            + "\u1802\u1c00\2\u0084\u0085\7\ud852\2\2\u0085\u00bb\4\u1c02\u2000\2\u0086"
            + "\u0087\7\ud853\2\2\u0087\u00bb\4\u2002\u2400\2\u0088\u0089\7\ud854\2\2"
            + "\u0089\u00bb\4\u2402\u2800\2\u008a\u008b\7\ud855\2\2\u008b\u00bb\4\u2802"
            + "\u2c00\2\u008c\u008d\7\ud856\2\2\u008d\u00bb\4\u2c02\u3000\2\u008e\u008f"
            + "\7\ud857\2\2\u008f\u00bb\4\u3002\u3400\2\u0090\u0091\7\ud858\2\2\u0091"
            + "\u00bb\4\u3402\u3800\2\u0092\u0093\7\ud859\2\2\u0093\u00bb\4\u3802\u3c00"
            + "\2\u0094\u0095\7\ud85a\2\2\u0095\u00bb\4\u3c02\u4000\2\u0096\u0097\7\ud85b"
            + "\2\2\u0097\u00bb\4\u4002\u4400\2\u0098\u0099\7\ud85c\2\2\u0099\u00bb\4"
            + "\u4402\u4800\2\u009a\u009b\7\ud85d\2\2\u009b\u00bb\4\u4802\u4c00\2\u009c"
            + "\u009d\7\ud85e\2\2\u009d\u00bb\4\u4c02\u5000\2\u009e\u009f\7\ud85f\2\2"
            + "\u009f\u00bb\4\u5002\u5400\2\u00a0\u00a1\7\ud860\2\2\u00a1\u00bb\4\u5402"
            + "\u5800\2\u00a2\u00a3\7\ud861\2\2\u00a3\u00bb\4\u5802\u5c00\2\u00a4\u00a5"
            + "\7\ud862\2\2\u00a5\u00bb\4\u5c02\u6000\2\u00a6\u00a7\7\ud863\2\2\u00a7"
            + "\u00bb\4\u6002\u6400\2\u00a8\u00a9\7\ud864\2\2\u00a9\u00bb\4\u6402\u6800"
            + "\2\u00aa\u00ab\7\ud865\2\2\u00ab\u00bb\4\u6802\u6c00\2\u00ac\u00ad\7\ud866"
            + "\2\2\u00ad\u00bb\4\u6c02\u7000\2\u00ae\u00af\7\ud867\2\2\u00af\u00bb\4"
            + "\u7002\u7400\2\u00b0\u00b1\7\ud868\2\2\u00b1\u00bb\4\u7402\u7800\2\u00b2"
            + "\u00b3\7\ud869\2\2\u00b3\u00bb\4\u7802\u7c00\2\u00b4\u00b5\7\ud86a\2\2"
            + "\u00b5\u00bb\4\u7c02\u8000\2\u00b6\u00b7\7\ud86b\2\2\u00b7\u00bb\4\u8002"
            + "\u82d7\2\u00b8\u00b9\7\ud880\2\2\u00b9\u00bb\4\ud402\ud61e\2\u00ba\5\3"
            + "\2\2\2\u00ba\6\3\2\2\2\u00ba\b\3\2\2\2\u00ba\n\3\2\2\2\u00ba\f\3\2\2\2"
            + "\u00ba\16\3\2\2\2\u00ba\20\3\2\2\2\u00ba\22\3\2\2\2\u00ba\24\3\2\2\2\u00ba"
            + "\26\3\2\2\2\u00ba\30\3\2\2\2\u00ba\32\3\2\2\2\u00ba\34\3\2\2\2\u00ba\36"
            + "\3\2\2\2\u00ba \3\2\2\2\u00ba\"\3\2\2\2\u00ba$\3\2\2\2\u00ba&\3\2\2\2"
            + "\u00ba(\3\2\2\2\u00ba*\3\2\2\2\u00ba,\3\2\2\2\u00ba.\3\2\2\2\u00ba\60"
            + "\3\2\2\2\u00ba\62\3\2\2\2\u00ba\64\3\2\2\2\u00ba\66\3\2\2\2\u00ba8\3\2"
            + "\2\2\u00ba:\3\2\2\2\u00ba<\3\2\2\2\u00ba>\3\2\2\2\u00ba@\3\2\2\2\u00ba"
            + "B\3\2\2\2\u00baD\3\2\2\2\u00baF\3\2\2\2\u00baH\3\2\2\2\u00baJ\3\2\2\2"
            + "\u00baL\3\2\2\2\u00baN\3\2\2\2\u00baP\3\2\2\2\u00baR\3\2\2\2\u00baT\3"
            + "\2\2\2\u00baV\3\2\2\2\u00baX\3\2\2\2\u00baZ\3\2\2\2\u00ba\\\3\2\2\2\u00ba"
            + "^\3\2\2\2\u00ba`\3\2\2\2\u00bab\3\2\2\2\u00bad\3\2\2\2\u00baf\3\2\2\2"
            + "\u00bah\3\2\2\2\u00baj\3\2\2\2\u00bal\3\2\2\2\u00ban\3\2\2\2\u00bap\3"
            + "\2\2\2\u00bar\3\2\2\2\u00bat\3\2\2\2\u00bav\3\2\2\2\u00bax\3\2\2\2\u00ba"
            + "z\3\2\2\2\u00ba|\3\2\2\2\u00ba~\3\2\2\2\u00ba\u0080\3\2\2\2\u00ba\u0082"
            + "\3\2\2\2\u00ba\u0084\3\2\2\2\u00ba\u0086\3\2\2\2\u00ba\u0088\3\2\2\2\u00ba"
            + "\u008a\3\2\2\2\u00ba\u008c\3\2\2\2\u00ba\u008e\3\2\2\2\u00ba\u0090\3\2"
            + "\2\2\u00ba\u0092\3\2\2\2\u00ba\u0094\3\2\2\2\u00ba\u0096\3\2\2\2\u00ba"
            + "\u0098\3\2\2\2\u00ba\u009a\3\2\2\2\u00ba\u009c\3\2\2\2\u00ba\u009e\3\2"
            + "\2\2\u00ba\u00a0\3\2\2\2\u00ba\u00a2\3\2\2\2\u00ba\u00a4\3\2\2\2\u00ba"
            + "\u00a6\3\2\2\2\u00ba\u00a8\3\2\2\2\u00ba\u00aa\3\2\2\2\u00ba\u00ac\3\2"
            + "\2\2\u00ba\u00ae\3\2\2\2\u00ba\u00b0\3\2\2\2\u00ba\u00b2\3\2\2\2\u00ba"
            + "\u00b4\3\2\2\2\u00ba\u00b6\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\4\3\2\2\2"
            + "\4\2\u00ba\2";
    public static final ATN _ATN
            = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static
    {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++)
        {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}
