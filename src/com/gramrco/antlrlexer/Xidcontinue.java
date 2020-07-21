// Generated from xidcontinue.g4 by ANTLR 4.5.3
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
public class Xidcontinue extends Lexer
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
        "XID_Continue"
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

    public Xidcontinue(CharStream input)
    {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName()
    {
        return "xidcontinue.g4";
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
            = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\2\u00cc\b\1\4\2\t"
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
            + "\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"
            + "\3\2\3\2\3\2\3\2\3\2\5\2\u00cb\n\2\2\2\3\3\2\3\2\3\u0175\2\62;C\\aac|"
            + "\u00ac\u00ac\u00b7\u00b7\u00b9\u00b9\u00bc\u00bc\u00c2\u00d8\u00da\u00f8"
            + "\u00fa\u0238\u0252\u02c3\u02c8\u02d3\u02e2\u02e6\u02f0\u02f0\u0302\u0359"
            + "\u035f\u0371\u0388\u0388\u038a\u038c\u038e\u038e\u0390\u03a3\u03a5\u03d0"
            + "\u03d2\u03f7\u03f9\u03fd\u0402\u0483\u0485\u0488\u048c\u04d0\u04d2\u04f7"
            + "\u04fa\u04fb\u0502\u0511\u0533\u0558\u055b\u055b\u0563\u0589\u0593\u05a3"
            + "\u05a5\u05bb\u05bd\u05bf\u05c1\u05c1\u05c3\u05c4\u05c6\u05c6\u05d2\u05ec"
            + "\u05f2\u05f4\u0612\u0617\u0623\u063c\u0642\u065a\u0662\u066b\u0670\u06d5"
            + "\u06d7\u06de\u06e1\u06ea\u06ec\u06fe\u0701\u0701\u0712\u074c\u074f\u0751"
            + "\u0782\u07b3\u0903\u093b\u093e\u094f\u0952\u0956\u095a\u0965\u0968\u0971"
            + "\u0983\u0985\u0987\u098e\u0991\u0992\u0995\u09aa\u09ac\u09b2\u09b4\u09b4"
            + "\u09b8\u09bb\u09be\u09c6\u09c9\u09ca\u09cd\u09cf\u09d9\u09d9\u09de\u09df"
            + "\u09e1\u09e5\u09e8\u09f3\u0a03\u0a05\u0a07\u0a0c\u0a11\u0a12\u0a15\u0a2a"
            + "\u0a2c\u0a32\u0a34\u0a35\u0a37\u0a38\u0a3a\u0a3b\u0a3e\u0a3e\u0a40\u0a44"
            + "\u0a49\u0a4a\u0a4d\u0a4f\u0a5b\u0a5e\u0a60\u0a60\u0a68\u0a76\u0a83\u0a85"
            + "\u0a87\u0a8f\u0a91\u0a93\u0a95\u0aaa\u0aac\u0ab2\u0ab4\u0ab5\u0ab7\u0abb"
            + "\u0abe\u0ac7\u0ac9\u0acb\u0acd\u0acf\u0ad2\u0ad2\u0ae2\u0ae5\u0ae8\u0af1"
            + "\u0b03\u0b05\u0b07\u0b0e\u0b11\u0b12\u0b15\u0b2a\u0b2c\u0b32\u0b34\u0b35"
            + "\u0b37\u0b3b\u0b3e\u0b45\u0b49\u0b4a\u0b4d\u0b4f\u0b58\u0b59\u0b5e\u0b5f"
            + "\u0b61\u0b63\u0b68\u0b71\u0b73\u0b73\u0b84\u0b85\u0b87\u0b8c\u0b90\u0b92"
            + "\u0b94\u0b97\u0b9b\u0b9c\u0b9e\u0b9e\u0ba0\u0ba1\u0ba5\u0ba6\u0baa\u0bac"
            + "\u0bb0\u0bb7\u0bb9\u0bbb\u0bc0\u0bc4\u0bc8\u0bca\u0bcc\u0bcf\u0bd9\u0bd9"
            + "\u0be9\u0bf1\u0c03\u0c05\u0c07\u0c0e\u0c10\u0c12\u0c14\u0c2a\u0c2c\u0c35"
            + "\u0c37\u0c3b\u0c40\u0c46\u0c48\u0c4a\u0c4c\u0c4f\u0c57\u0c58\u0c62\u0c63"
            + "\u0c68\u0c71\u0c84\u0c85\u0c87\u0c8e\u0c90\u0c92\u0c94\u0caa\u0cac\u0cb5"
            + "\u0cb7\u0cbb\u0cbe\u0cc6\u0cc8\u0cca\u0ccc\u0ccf\u0cd7\u0cd8\u0ce0\u0ce0"
            + "\u0ce2\u0ce3\u0ce8\u0cf1\u0d04\u0d05\u0d07\u0d0e\u0d10\u0d12\u0d14\u0d2a"
            + "\u0d2c\u0d3b\u0d40\u0d45\u0d48\u0d4a\u0d4c\u0d4f\u0d59\u0d59\u0d62\u0d63"
            + "\u0d68\u0d71\u0d84\u0d85\u0d87\u0d98\u0d9c\u0db3\u0db5\u0dbd\u0dbf\u0dbf"
            + "\u0dc2\u0dc8\u0dcc\u0dcc\u0dd1\u0dd6\u0dd8\u0dd8\u0dda\u0de1\u0df4\u0df5"
            + "\u0e03\u0e3c\u0e42\u0e50\u0e52\u0e5b\u0e83\u0e84\u0e86\u0e86\u0e89\u0e8a"
            + "\u0e8c\u0e8c\u0e8f\u0e8f\u0e96\u0e99\u0e9b\u0ea1\u0ea3\u0ea5\u0ea7\u0ea7"
            + "\u0ea9\u0ea9\u0eac\u0ead\u0eaf\u0ebb\u0ebd\u0ebf\u0ec2\u0ec6\u0ec8\u0ec8"
            + "\u0eca\u0ecf\u0ed2\u0edb\u0ede\u0edf\u0f02\u0f02\u0f1a\u0f1b\u0f22\u0f2b"
            + "\u0f37\u0f37\u0f39\u0f39\u0f3b\u0f3b\u0f40\u0f49\u0f4b\u0f6c\u0f73\u0f86"
            + "\u0f88\u0f8d\u0f92\u0f99\u0f9b\u0fbe\u0fc8\u0fc8\u1002\u1023\u1025\u1029"
            + "\u102b\u102c\u102e\u1034\u1038\u103b\u1042\u104b\u1052\u105b\u10a2\u10c7"
            + "\u10d2\u10fa\u1102\u115b\u1161\u11a4\u11aa\u11fb\u1202\u1208\u120a\u1248"
            + "\u124a\u124a\u124c\u124f\u1252\u1258\u125a\u125a\u125c\u125f\u1262\u1288"
            + "\u128a\u128a\u128c\u128f\u1292\u12b0\u12b2\u12b2\u12b4\u12b7\u12ba\u12c0"
            + "\u12c2\u12c2\u12c4\u12c7\u12ca\u12d0\u12d2\u12d8\u12da\u12f0\u12f2\u1310"
            + "\u1312\u1312\u1314\u1317\u131a\u1320\u1322\u1348\u134a\u135c\u136b\u1373"
            + "\u13a2\u13f6\u1403\u166e\u1671\u1678\u1683\u169c\u16a2\u16ec\u16f0\u16f2"
            + "\u1702\u170e\u1710\u1716\u1722\u1736\u1742\u1755\u1762\u176e\u1770\u1772"
            + "\u1774\u1775\u1782\u17b5\u17b8\u17d5\u17d9\u17d9\u17de\u17df\u17e2\u17eb"
            + "\u180d\u180f\u1812\u181b\u1822\u1879\u1882\u18ab\u1902\u191e\u1922\u192d"
            + "\u1932\u193d\u1948\u196f\u1972\u1976\u1d02\u1d6d\u1e02\u1e9d\u1ea2\u1efb"
            + "\u1f02\u1f17\u1f1a\u1f1f\u1f22\u1f47\u1f4a\u1f4f\u1f52\u1f59\u1f5b\u1f5b"
            + "\u1f5d\u1f5d\u1f5f\u1f5f\u1f61\u1f7f\u1f82\u1fb6\u1fb8\u1fbe\u1fc0\u1fc0"
            + "\u1fc4\u1fc6\u1fc8\u1fce\u1fd2\u1fd5\u1fd8\u1fdd\u1fe2\u1fee\u1ff4\u1ff6"
            + "\u1ff8\u1ffe\u2041\u2042\u2056\u2056\u2073\u2073\u2081\u2081\u20d2\u20de"
            + "\u20e3\u20e3\u20e7\u20ec\u2104\u2104\u2109\u2109\u210c\u2115\u2117\u2117"
            + "\u211a\u211f\u2126\u2126\u2128\u2128\u212a\u212a\u212c\u2133\u2135\u213b"
            + "\u213f\u2141\u2147\u214b\u2162\u2185\u3007\u3009\u3023\u3031\u3033\u3037"
            + "\u303a\u303e\u3043\u3098\u309b\u309c\u309f\u30a1\u30a3\u3101\u3107\u312e"
            + "\u3133\u3190\u31a2\u31b9\u31f2\u3201\u3402\u4db7\u4e02\u9fa7\ua002\ua48e"
            + "\uac02\ud7a5\uf902\ufa2f\ufa32\ufa6c\ufb02\ufb08\ufb15\ufb19\ufb1f\ufb2a"
            + "\ufb2c\ufb38\ufb3a\ufb3e\ufb40\ufb40\ufb42\ufb43\ufb45\ufb46\ufb48\ufbb3"
            + "\ufbd5\ufc5f\ufc66\ufd3f\ufd52\ufd91\ufd94\ufdc9\ufdf2\ufdfb\ufe02\ufe11"
            + "\ufe22\ufe25\ufe35\ufe36\ufe4f\ufe51\ufe73\ufe73\ufe75\ufe75\ufe79\ufe79"
            + "\ufe7b\ufe7b\ufe7d\ufe7d\ufe7f\ufe7f\ufe81\ufefe\uff12\uff1b\uff23\uff3c"
            + "\uff41\uff41\uff43\uff5c\uff67\uffc0\uffc4\uffc9\uffcc\uffd1\uffd4\uffd9"
            + "\uffdc\uffde\u012c\3\u00ca\3\2\2\2\5\u00cb\t\2\2\2\6\7\7\ud802\2\2\7\u00cb"
            + "\4\udc02\udc0c\2\b\t\7\ud802\2\2\t\u00cb\4\udc0f\udc27\2\n\13\7\ud802"
            + "\2\2\13\u00cb\4\udc2a\udc3b\2\f\r\7\ud802\2\2\r\u00cb\4\udc3e\udc3e\2"
            + "\16\17\7\ud802\2\2\17\u00cb\4\udc41\udc4e\2\20\21\7\ud802\2\2\21\u00cb"
            + "\4\udc52\udc5e\2\22\23\7\ud802\2\2\23\u00cb\4\udc82\udcfb\2\24\25\7\ud802"
            + "\2\2\25\u00cb\4\udf02\udf1f\2\26\27\7\ud802\2\2\27\u00cb\4\udf32\udf4b"
            + "\2\30\31\7\ud802\2\2\31\u00cb\4\udf82\udf9e\2\32\33\7\ud803\2\2\33\u00cb"
            + "\4\ue002\ue09e\2\34\35\7\ud803\2\2\35\u00cb\4\ue0a2\ue0aa\2\36\37\7\ud804"
            + "\2\2\37\u00cb\4\ue402\ue406\2 !\7\ud804\2\2!\u00cb\7\u080a\2\2\"#\7\ud804"
            + "\2\2#\u00cb\4\ue40c\ue436\2$%\7\ud804\2\2%\u00cb\4\ue439\ue439\2&\'\7"
            + "\ud804\2\2\'\u00cb\7\u083e\2\2()\7\ud804\2\2)\u00cb\7\u0841\2\2*+\7\ud836"
            + "\2\2+\u00cb\4\uad67\uad6a\2,-\7\ud836\2\2-\u00cb\4\uad6f\uad73\2./\7\ud836"
            + "\2\2/\u00cb\4\uad7d\uad83\2\60\61\7\ud836\2\2\61\u00cb\4\uad87\uad8c\2"
            + "\62\63\7\ud836\2\2\63\u00cb\4\uadac\uadae\2\64\65\7\ud837\2\2\65\u00cb"
            + "\4\ub002\ub055\2\66\67\7\ud837\2\2\67\u00cb\4\ub058\ub09d\289\7\ud837"
            + "\2\29\u00cb\4\ub0a0\ub0a0\2:;\7\ud837\2\2;\u00cb\7\ud4a4\2\2<=\7\ud837"
            + "\2\2=\u00cb\4\ub0a7\ub0a7\2>?\7\ud837\2\2?\u00cb\4\ub0ab\ub0ad\2@A\7\ud837"
            + "\2\2A\u00cb\4\ub0b0\ub0ba\2BC\7\ud837\2\2C\u00cb\7\ud4bd\2\2DE\7\ud837"
            + "\2\2E\u00cb\4\ub0bf\ub0c4\2FG\7\ud837\2\2G\u00cb\4\ub0c7\ub106\2HI\7\ud837"
            + "\2\2I\u00cb\4\ub109\ub10b\2JK\7\ud837\2\2K\u00cb\4\ub10f\ub115\2LM\7\ud837"
            + "\2\2M\u00cb\4\ub118\ub11d\2NO\7\ud837\2\2O\u00cb\4\ub120\ub13a\2PQ\7\ud837"
            + "\2\2Q\u00cb\4\ub13d\ub13f\2RS\7\ud837\2\2S\u00cb\4\ub142\ub145\2TU\7\ud837"
            + "\2\2U\u00cb\7\ud548\2\2VW\7\ud837\2\2W\u00cb\4\ub14c\ub151\2XY\7\ud837"
            + "\2\2Y\u00cb\4\ub154\ub2a4\2Z[\7\ud837\2\2[\u00cb\4\ub2aa\ub2c1\2\\]\7"
            + "\ud837\2\2]\u00cb\4\ub2c4\ub2db\2^_\7\ud837\2\2_\u00cb\4\ub2de\ub2fb\2"
            + "`a\7\ud837\2\2a\u00cb\4\ub2fe\ub315\2bc\7\ud837\2\2c\u00cb\4\ub318\ub335"
            + "\2de\7\ud837\2\2e\u00cb\4\ub338\ub34f\2fg\7\ud837\2\2g\u00cb\4\ub352\ub36f"
            + "\2hi\7\ud837\2\2i\u00cb\4\ub372\ub389\2jk\7\ud837\2\2k\u00cb\4\ub38c\ub3a9"
            + "\2lm\7\ud837\2\2m\u00cb\4\ub3ac\ub3c3\2no\7\ud837\2\2o\u00cb\4\ub3c6\ub3ca"
            + "\2pq\7\ud837\2\2q\u00cb\4\ub3d0\ub400\2rs\7\ud842\2\2s\u00cb\4\udc02\ue000"
            + "\2tu\7\ud843\2\2u\u00cb\4\ue002\ue400\2vw\7\ud844\2\2w\u00cb\4\ue402\ue800"
            + "\2xy\7\ud845\2\2y\u00cb\4\ue802\uec00\2z{\7\ud846\2\2{\u00cb\4\uec02\uf000"
            + "\2|}\7\ud847\2\2}\u00cb\4\uf002\uf400\2~\177\7\ud848\2\2\177\u00cb\4\uf402"
            + "\uf800\2\u0080\u0081\7\ud849\2\2\u0081\u00cb\4\uf802\ufc00\2\u0082\u0083"
            + "\7\ud84a\2\2\u0083\u00cb\4\ufc02\0\2\u0084\u0085\7\ud84b\2\2\u0085\u00cb"
            + "\4\2\u0400\2\u0086\u0087\7\ud84c\2\2\u0087\u00cb\4\u0402\u0800\2\u0088"
            + "\u0089\7\ud84d\2\2\u0089\u00cb\4\u0802\u0c00\2\u008a\u008b\7\ud84e\2\2"
            + "\u008b\u00cb\4\u0c02\u1000\2\u008c\u008d\7\ud84f\2\2\u008d\u00cb\4\u1002"
            + "\u1400\2\u008e\u008f\7\ud850\2\2\u008f\u00cb\4\u1402\u1800\2\u0090\u0091"
            + "\7\ud851\2\2\u0091\u00cb\4\u1802\u1c00\2\u0092\u0093\7\ud852\2\2\u0093"
            + "\u00cb\4\u1c02\u2000\2\u0094\u0095\7\ud853\2\2\u0095\u00cb\4\u2002\u2400"
            + "\2\u0096\u0097\7\ud854\2\2\u0097\u00cb\4\u2402\u2800\2\u0098\u0099\7\ud855"
            + "\2\2\u0099\u00cb\4\u2802\u2c00\2\u009a\u009b\7\ud856\2\2\u009b\u00cb\4"
            + "\u2c02\u3000\2\u009c\u009d\7\ud857\2\2\u009d\u00cb\4\u3002\u3400\2\u009e"
            + "\u009f\7\ud858\2\2\u009f\u00cb\4\u3402\u3800\2\u00a0\u00a1\7\ud859\2\2"
            + "\u00a1\u00cb\4\u3802\u3c00\2\u00a2\u00a3\7\ud85a\2\2\u00a3\u00cb\4\u3c02"
            + "\u4000\2\u00a4\u00a5\7\ud85b\2\2\u00a5\u00cb\4\u4002\u4400\2\u00a6\u00a7"
            + "\7\ud85c\2\2\u00a7\u00cb\4\u4402\u4800\2\u00a8\u00a9\7\ud85d\2\2\u00a9"
            + "\u00cb\4\u4802\u4c00\2\u00aa\u00ab\7\ud85e\2\2\u00ab\u00cb\4\u4c02\u5000"
            + "\2\u00ac\u00ad\7\ud85f\2\2\u00ad\u00cb\4\u5002\u5400\2\u00ae\u00af\7\ud860"
            + "\2\2\u00af\u00cb\4\u5402\u5800\2\u00b0\u00b1\7\ud861\2\2\u00b1\u00cb\4"
            + "\u5802\u5c00\2\u00b2\u00b3\7\ud862\2\2\u00b3\u00cb\4\u5c02\u6000\2\u00b4"
            + "\u00b5\7\ud863\2\2\u00b5\u00cb\4\u6002\u6400\2\u00b6\u00b7\7\ud864\2\2"
            + "\u00b7\u00cb\4\u6402\u6800\2\u00b8\u00b9\7\ud865\2\2\u00b9\u00cb\4\u6802"
            + "\u6c00\2\u00ba\u00bb\7\ud866\2\2\u00bb\u00cb\4\u6c02\u7000\2\u00bc\u00bd"
            + "\7\ud867\2\2\u00bd\u00cb\4\u7002\u7400\2\u00be\u00bf\7\ud868\2\2\u00bf"
            + "\u00cb\4\u7402\u7800\2\u00c0\u00c1\7\ud869\2\2\u00c1\u00cb\4\u7802\u7c00"
            + "\2\u00c2\u00c3\7\ud86a\2\2\u00c3\u00cb\4\u7c02\u8000\2\u00c4\u00c5\7\ud86b"
            + "\2\2\u00c5\u00cb\4\u8002\u82d7\2\u00c6\u00c7\7\ud880\2\2\u00c7\u00cb\4"
            + "\ud402\ud61e\2\u00c8\u00c9\7\udb42\2\2\u00c9\u00cb\4\udd02\uddf0\2\u00ca"
            + "\5\3\2\2\2\u00ca\6\3\2\2\2\u00ca\b\3\2\2\2\u00ca\n\3\2\2\2\u00ca\f\3\2"
            + "\2\2\u00ca\16\3\2\2\2\u00ca\20\3\2\2\2\u00ca\22\3\2\2\2\u00ca\24\3\2\2"
            + "\2\u00ca\26\3\2\2\2\u00ca\30\3\2\2\2\u00ca\32\3\2\2\2\u00ca\34\3\2\2\2"
            + "\u00ca\36\3\2\2\2\u00ca \3\2\2\2\u00ca\"\3\2\2\2\u00ca$\3\2\2\2\u00ca"
            + "&\3\2\2\2\u00ca(\3\2\2\2\u00ca*\3\2\2\2\u00ca,\3\2\2\2\u00ca.\3\2\2\2"
            + "\u00ca\60\3\2\2\2\u00ca\62\3\2\2\2\u00ca\64\3\2\2\2\u00ca\66\3\2\2\2\u00ca"
            + "8\3\2\2\2\u00ca:\3\2\2\2\u00ca<\3\2\2\2\u00ca>\3\2\2\2\u00ca@\3\2\2\2"
            + "\u00caB\3\2\2\2\u00caD\3\2\2\2\u00caF\3\2\2\2\u00caH\3\2\2\2\u00caJ\3"
            + "\2\2\2\u00caL\3\2\2\2\u00caN\3\2\2\2\u00caP\3\2\2\2\u00caR\3\2\2\2\u00ca"
            + "T\3\2\2\2\u00caV\3\2\2\2\u00caX\3\2\2\2\u00caZ\3\2\2\2\u00ca\\\3\2\2\2"
            + "\u00ca^\3\2\2\2\u00ca`\3\2\2\2\u00cab\3\2\2\2\u00cad\3\2\2\2\u00caf\3"
            + "\2\2\2\u00cah\3\2\2\2\u00caj\3\2\2\2\u00cal\3\2\2\2\u00can\3\2\2\2\u00ca"
            + "p\3\2\2\2\u00car\3\2\2\2\u00cat\3\2\2\2\u00cav\3\2\2\2\u00cax\3\2\2\2"
            + "\u00caz\3\2\2\2\u00ca|\3\2\2\2\u00ca~\3\2\2\2\u00ca\u0080\3\2\2\2\u00ca"
            + "\u0082\3\2\2\2\u00ca\u0084\3\2\2\2\u00ca\u0086\3\2\2\2\u00ca\u0088\3\2"
            + "\2\2\u00ca\u008a\3\2\2\2\u00ca\u008c\3\2\2\2\u00ca\u008e\3\2\2\2\u00ca"
            + "\u0090\3\2\2\2\u00ca\u0092\3\2\2\2\u00ca\u0094\3\2\2\2\u00ca\u0096\3\2"
            + "\2\2\u00ca\u0098\3\2\2\2\u00ca\u009a\3\2\2\2\u00ca\u009c\3\2\2\2\u00ca"
            + "\u009e\3\2\2\2\u00ca\u00a0\3\2\2\2\u00ca\u00a2\3\2\2\2\u00ca\u00a4\3\2"
            + "\2\2\u00ca\u00a6\3\2\2\2\u00ca\u00a8\3\2\2\2\u00ca\u00aa\3\2\2\2\u00ca"
            + "\u00ac\3\2\2\2\u00ca\u00ae\3\2\2\2\u00ca\u00b0\3\2\2\2\u00ca\u00b2\3\2"
            + "\2\2\u00ca\u00b4\3\2\2\2\u00ca\u00b6\3\2\2\2\u00ca\u00b8\3\2\2\2\u00ca"
            + "\u00ba\3\2\2\2\u00ca\u00bc\3\2\2\2\u00ca\u00be\3\2\2\2\u00ca\u00c0\3\2"
            + "\2\2\u00ca\u00c2\3\2\2\2\u00ca\u00c4\3\2\2\2\u00ca\u00c6\3\2\2\2\u00ca"
            + "\u00c8\3\2\2\2\u00cb\4\3\2\2\2\4\2\u00ca\2";
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
