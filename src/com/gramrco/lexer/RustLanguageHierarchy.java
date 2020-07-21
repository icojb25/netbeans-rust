package com.gramrco.lexer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author jonathan.bergh
 */
public class RustLanguageHierarchy extends LanguageHierarchy<RustTokenId>
{

    private static final List<RustTokenId> tokens = new ArrayList<RustTokenId>();
    private static final Map<Integer, RustTokenId> idToToken = new HashMap<Integer, RustTokenId>();

    static
    {
        TokenType[] tokenTypes = TokenType.values();
        for (TokenType tokenType : tokenTypes)
        {
            tokens.add(new RustTokenId(tokenType.name(), tokenType.category, tokenType.id));
        }
        for (RustTokenId token : tokens)
        {
            idToToken.put(token.ordinal(), token);
        }
    }

    static synchronized RustTokenId getToken(int id)
    {
        return idToToken.get(id);
    }

    @Override
    protected synchronized Collection<RustTokenId> createTokenIds()
    {
        return tokens;
    }

    @Override
    protected synchronized Lexer<RustTokenId> createLexer(LexerRestartInfo<RustTokenId> info)
    {
        return new RustLexer(info);
    }

    @Override
    protected String mimeType()
    {
        return "text/x-rs";
    }
}
