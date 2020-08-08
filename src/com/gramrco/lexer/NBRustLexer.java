package com.gramrco.lexer;

import com.gramrco.RustLanguageHierarchy;
import com.gramrco.antlrlexer.RustLexer;
import org.netbeans.api.lexer.Token;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

/**
 *
 * @author jonathan.bergh
 */
public class NBRustLexer implements Lexer<RustTokenId>
{

    private LexerRestartInfo<RustTokenId> info;
    private RustLexer lexer;

    public NBRustLexer(LexerRestartInfo<RustTokenId> info)
    {
        this.info = info;
        AntlrCharStream charStream = new AntlrCharStream(info.input(), "RustEditor", true);
        lexer = new RustLexer(charStream);
    }

    @Override
    public org.netbeans.api.lexer.Token<RustTokenId> nextToken()
    {
        org.antlr.v4.runtime.Token token = lexer.nextToken();

        Token<RustTokenId> createdToken = null;
        
        if (info.input().readLength() < 1) return null;
        
        if (token.getType() != -1)
        {
            RustTokenId tokenId = RustLanguageHierarchy.getToken(token.getType());
            createdToken = info.tokenFactory().createToken(tokenId);
        } else if (info.input().readLength() > 0)
        {
            RustTokenId tokenId = RustLanguageHierarchy.getToken(RustLexer.Whitespace);
            createdToken = info.tokenFactory().createToken(tokenId);
        }

        return createdToken;
    }

    @Override
    public Object state()
    {
        return null;
    }

    @Override
    public void release()
    {
        lexer = null;
        info = null;
    }
}
