package com.gramrco;

import com.gramrco.lexer.RustTokenId;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.openide.util.Exceptions;

/**
 *
 * @author jonathan.bergh
 */
public class AntlrTokenReader
{

    private final HashMap<String, String> tokenTypes = new HashMap<String, String>();
    private final ArrayList<RustTokenId> tokens = new ArrayList<RustTokenId>();

    public AntlrTokenReader()
    {
        init();
    }

    /**
     * Initializes the map to include any keywords in the Rust Programming
     * language.
     */
    private void init()
    {

        tokenTypes.put("Lifetime", Categories.CHARACTER.name());
        tokenTypes.put("Ident", Categories.WHITESPACE.name());
        tokenTypes.put("CharLit", Categories.CHARACTER.name());
        tokenTypes.put("StringLit", Categories.CHARACTER.name());
        tokenTypes.put("ByteLit", Categories.CHARACTER.name());
        tokenTypes.put("ByteStringLit", Categories.CHARACTER.name());
        tokenTypes.put("BareIntLit", Categories.CHARACTER.name());
        tokenTypes.put("FullIntLit", Categories.CHARACTER.name());
        tokenTypes.put("FloatLit", Categories.CHARACTER.name());
        tokenTypes.put("Whitespace", Categories.WHITESPACE.name());
        tokenTypes.put("LineComment", Categories.COMMENT.name());
        tokenTypes.put("BlockComment", Categories.COMMENT.name());
        tokenTypes.put("pub", Categories.KEYWORD.name());
        tokenTypes.put("(", Categories.CHARACTER.name());
        tokenTypes.put("crate", Categories.KEYWORD.name());
        tokenTypes.put(")", Categories.CHARACTER.name());
        tokenTypes.put("super", Categories.KEYWORD.name());
        tokenTypes.put("in", Categories.KEYWORD.name());
        tokenTypes.put("!", Categories.CHARACTER.name());
        tokenTypes.put("::", Categories.CHARACTER.name());
        tokenTypes.put("self", Categories.KEYWORD.name());
        tokenTypes.put(";", Categories.CHARACTER.name());
        tokenTypes.put("extern", Categories.KEYWORD.name());
        tokenTypes.put("user", Categories.KEYWORD.name());
        tokenTypes.put("{", Categories.CHARACTER.name());
        tokenTypes.put("}", Categories.CHARACTER.name());
        tokenTypes.put("*", Categories.CHARACTER.name());
        tokenTypes.put(",", Categories.CHARACTER.name());
        tokenTypes.put("as", Categories.KEYWORD.name());
        tokenTypes.put("%", Categories.KEYWORD.name());
        tokenTypes.put("static", Categories.KEYWORD.name());
        tokenTypes.put("mut", Categories.KEYWORD.name());
        tokenTypes.put(":", Categories.CHARACTER.name());
        tokenTypes.put("type", Categories.KEYWORD.name());
        tokenTypes.put("=", Categories.CHARACTER.name());
        tokenTypes.put("const", Categories.KEYWORD.name());
        tokenTypes.put("unsafe", Categories.KEYWORD.name());
        tokenTypes.put("fn", Categories.KEYWORD.name());
        tokenTypes.put("impl", Categories.KEYWORD.name());
        tokenTypes.put("...", Categories.CHARACTER.name());
        tokenTypes.put("&", Categories.CHARACTER.name());
        tokenTypes.put("&&", Categories.CHARACTER.name());
        tokenTypes.put("_", Categories.CHARACTER.name());
        tokenTypes.put("->", Categories.CHARACTER.name());
        tokenTypes.put("struct", Categories.KEYWORD.name());
        tokenTypes.put("enum", Categories.KEYWORD.name());
        tokenTypes.put("union", Categories.KEYWORD.name());
        tokenTypes.put("auto", Categories.KEYWORD.name());
        tokenTypes.put("trait", Categories.KEYWORD.name());
        tokenTypes.put("for", Categories.KEYWORD.name());
        tokenTypes.put("..", Categories.CHARACTER.name());
        tokenTypes.put("default", Categories.KEYWORD.name());
        tokenTypes.put("#", Categories.CHARACTER.name());
        tokenTypes.put("[", Categories.CHARACTER.name());
        tokenTypes.put("]", Categories.CHARACTER.name());
        tokenTypes.put("<", Categories.CHARACTER.name());
        tokenTypes.put(">", Categories.CHARACTER.name());
        tokenTypes.put("Self", Categories.KEYWORD.name());
        tokenTypes.put("+", Categories.CHARACTER.name());
        tokenTypes.put("where", Categories.KEYWORD.name());
        tokenTypes.put("?", Categories.CHARACTER.name());
        tokenTypes.put("@", Categories.CHARACTER.name());
        tokenTypes.put("ref", Categories.KEYWORD.name());
        tokenTypes.put("box", Categories.KEYWORD.name());
        tokenTypes.put("-", Categories.CHARACTER.name());
        tokenTypes.put("let", Categories.KEYWORD.name());
        tokenTypes.put("if", Categories.KEYWORD.name());
        tokenTypes.put("else", Categories.KEYWORD.name());
        tokenTypes.put("match", Categories.KEYWORD.name());
        tokenTypes.put("while", Categories.KEYWORD.name());
        tokenTypes.put("loop", Categories.KEYWORD.name());
        tokenTypes.put("=>", Categories.CHARACTER.name());
        tokenTypes.put("or", Categories.CHARACTER.name());
        tokenTypes.put("move", Categories.CHARACTER.name());
        tokenTypes.put("break", Categories.KEYWORD.name());
        tokenTypes.put("continue", Categories.KEYWORD.name());
        tokenTypes.put("return", Categories.KEYWORD.name());
        tokenTypes.put("true", Categories.KEYWORD.name());
        tokenTypes.put("false", Categories.KEYWORD.name());
        tokenTypes.put("||", Categories.CHARACTER.name());
        tokenTypes.put(".", Categories.CHARACTER.name());
        tokenTypes.put("/", Categories.CHARACTER.name());
        tokenTypes.put("%", Categories.CHARACTER.name());
        tokenTypes.put("^", Categories.CHARACTER.name());
        tokenTypes.put("=", Categories.CHARACTER.name());
        tokenTypes.put("!=", Categories.CHARACTER.name());
        tokenTypes.put("<=", Categories.CHARACTER.name());
        tokenTypes.put("*=", Categories.CHARACTER.name());
        tokenTypes.put("/=", Categories.CHARACTER.name());
        tokenTypes.put("%=", Categories.CHARACTER.name());
        tokenTypes.put("+=", Categories.CHARACTER.name());
        tokenTypes.put("-=", Categories.CHARACTER.name());
        tokenTypes.put("<<=", Categories.CHARACTER.name());
        tokenTypes.put("&=", Categories.CHARACTER.name());
        tokenTypes.put("^=", Categories.CHARACTER.name());
        tokenTypes.put("|=", Categories.CHARACTER.name());
        tokenTypes.put("$", Categories.CHARACTER.name());
    }

    /**
     * Reads the token file from the ANTLR parser and generates appropriate
     * tokens.
     *
     * @return
     */
    public List<RustTokenId> readTokenFile()
    {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inp = classLoader.getResourceAsStream("com/gramrco/antlrlexer/Rust.tokens");
        BufferedReader input = new BufferedReader(new InputStreamReader(inp));
        readTokenFile(input);
        return tokens;
    }

    /**
     * Reads in the token file.
     *
     * @param buff
     */
    private void readTokenFile(BufferedReader buff)
    {
        String line = null;
        try
        {
            while ((line = buff.readLine()) != null)
            {
                String[] splLine = line.split("=(?!.*=)"); // Split on last '=' occurence
                String name = removeQuotes(splLine[0]);
                int tok = Integer.parseInt(splLine[1].trim());
                RustTokenId id;
                String tokenCategory = tokenTypes.get(name);
                if (tokenCategory != null)
                {
                    //if the value exists, put it in the correct category
                    id = new RustTokenId(name, tokenCategory, tok);
                } else
                {
                    //if we don't recognize the token, consider it to a separator
                    id = new RustTokenId(name, "separator", tok);
                }
                //add it into the vector of tokens
                tokens.add(id);
            }
        } catch (IOException ex)
        {
            Exceptions.printStackTrace(ex);
        }
    }

    private String removeQuotes(String inString)
    {
        if (inString.contains("'"))
        {
            return inString.replaceAll("'", "");
        }
        
        return inString;
    }
    
    private enum Categories
    {
        KEYWORD("keyword"),
        WHITESPACE("whitespace"),
        COMMENT("comment"),
        CHARACTER("character");

        public String category;

        private Categories(String category)
        {
            this.category = category;
        }
    }
}
