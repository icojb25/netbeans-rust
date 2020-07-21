package com.gramrco.lexer;

/**
 *
 * @author jonathan.bergh
 */
public enum TokenType
{
    WHERE(6, "keyword"),
    LETTER(21, "character"),
    NULL(18, "keyword"),
    NUMBER(22, "character"),
    ON(13, "keyword"),
    NAME_ASTERISK(11, "character"),
    AND(16, "keyword"),
    JOIN(12, "keyword"),
    ASTERISK(10, "character"),
    LPAREN(14, "character"),
    ML_COMMENT(25, "comment"),
    RPAREN(15, "character"),
    NAME(9, "character"),
    WS(23, "whitespace"),
    IN(20, "keyword"),
    COMMA(8, "character"),
    SL_COMMENT(24, "comment"),
    QUOTED_STATEMENT(19, "character"),
    OPERATORS(17, "character"),
    FROM(5, "keyword"),
    SELECT(4, "keyword"),
    ORDER_BY(7, "keyword");

    public int id;
    public String category;
    public String text;

    private TokenType(int id, String category)
    {
        this.id = id;
        this.category = category;
    }

    public static TokenType valueOf(int id)
    {
        TokenType[] values = values();
        for (TokenType value : values)
        {
            if (value.id == id)
            {
                return value;
            }
        }
        throw new IllegalArgumentException("The id " + id + " is not recognized");
    }
}
