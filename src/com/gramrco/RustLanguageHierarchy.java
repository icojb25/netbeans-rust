package com.gramrco;

import com.gramrco.lexer.NBRustLexer;
import com.gramrco.lexer.RustTokenId;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.netbeans.api.lexer.Language;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;

public class RustLanguageHierarchy extends LanguageHierarchy<RustTokenId>
{

    private static List<RustTokenId> tokens;
    private static Map<Integer, RustTokenId> idToToken;
    private static final RustLanguageHierarchy INSTANCE = new RustLanguageHierarchy(); //.language();
    
    static
    {
        init();
    }
    
    public RustLanguageHierarchy()
    {
    }

    public static Language<RustTokenId> getLanguage()
    {
        return INSTANCE.language();
    }

    /**
     * Initializes the list of tokens with IDs generated from the ANTLR token
     * file.
     */
    private static void init()
    {
        AntlrTokenReader reader = new AntlrTokenReader();
        tokens = reader.readTokenFile();
        idToToken = new HashMap<>();
        for (RustTokenId token : tokens)
        {
            idToToken.put(token.ordinal(), token);
        }
    }

    /**
     * Returns an actual RustTokenId from an id. This essentially allows the
     * syntax highlighter to decide the color of specific words.
     *
     * @param id
     * @return
     */
    public static synchronized RustTokenId getToken(int id)
    {
        if (idToToken == null)
        {
            init();
        }
        return idToToken.get(id);
    }

    /**
     * Initializes the tokens in use.
     *
     * @return
     */
    @Override
    protected synchronized Collection<RustTokenId> createTokenIds()
    {
        if (tokens == null)
        {
            init();
        }
        return tokens;
    }

    @Override
    protected synchronized Lexer<RustTokenId> createLexer(LexerRestartInfo<RustTokenId> info)
    {
        return new NBRustLexer(info);
    }

    @Override
    protected String mimeType()
    {
        return RustLanguage.MIME_TYPE;
    }

}
