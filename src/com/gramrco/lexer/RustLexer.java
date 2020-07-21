package com.gramrco.lexer;

import org.antlr.v4.runtime.Token;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author jonathan.bergh
 */
public class RustLexer implements Lexer<RustTokenId>
{
    private final LexerRestartInfo<RustTokenId> info;
    private final com.gramrco.antlrlexer.RustLexer rustAntrLexer;

    public RustLexer(LexerRestartInfo<RustTokenId> info)
    {
        this.info = info;

        AntlrCharStream charStream = new AntlrCharStream(info.input(), "RustEditor");
        rustAntrLexer = new com.gramrco.antlrlexer.RustLexer(charStream);
    }

    @Override
    public org.netbeans.api.lexer.Token<RustTokenId> nextToken()
    {
        Token token = rustAntrLexer.nextToken();
        if (token.getType() != com.gramrco.antlrlexer.RustLexer.EOF)
        {
            RustTokenId tokenId = RustLanguageHierarchy.getToken(token.getType());
            return info.tokenFactory().createToken(tokenId);
        }
        return null;
    }

    @Override
    public Object state()
    {
        return null;
    }

    @Override
    public void release()
    {
    }
}
