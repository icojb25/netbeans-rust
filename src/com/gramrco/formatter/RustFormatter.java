package com.gramrco.formatter;

import static java.lang.Character.isWhitespace;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import org.netbeans.editor.BaseDocument;
import org.netbeans.modules.csl.api.Formatter;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.editor.indent.spi.Context;
import org.openide.util.Exceptions;

/**
 *
 */
public class RustFormatter implements Formatter
{

    @Override
    public void reformat(Context context, ParserResult compilationInfo)
    {
//        NetbeansRustParserResult parseResult = (NetbeansRustParser.NetbeansRustParserResult) compilationInfo;
//        final BaseDocument document = (BaseDocument) context.document();
//        final RustDocumentFormatter formatter = new RustDocumentFormatter(this, parseResult, document, context);
//        document.runAtomic(() ->
//        {
//            // Not sure why, but setActive(false)/(true) makes the formatting a lot faster
//            MutableTextInput mti = (MutableTextInput) document.getProperty(MutableTextInput.class);
//            try
//            {
//                mti.tokenHierarchyControl().setActive(false);
//                formatter.format();
//            } finally
//            {
//                mti.tokenHierarchyControl().setActive(true);
//            }
//        });
    }

    @Override
    public void reindent(Context context)
    {
        try
        {
            int lineStart = context.lineStartOffset(context.startOffset());
            int previousLineEnd = lineStart - 1;
            int previousLineStart = context.lineStartOffset(previousLineEnd);
            int previousLineIndent = context.lineIndent(previousLineStart);
            Document document = context.document();
            char lastCharOfPreviousLine = lastNonWhiteCharacter(previousLineStart, previousLineEnd, document);
            int targetIndent;
            if (lastCharOfPreviousLine == '{')
            {
                targetIndent = previousLineIndent + indentSize();
            } else
            {
                targetIndent = previousLineIndent;
            }
            context.modifyIndent(lineStart, targetIndent);
        } catch (BadLocationException ex)
        {
            Exceptions.printStackTrace(ex);
        }
    }

    private static char lastNonWhiteCharacter(int lineStart, int lineEnd, Document document) throws BadLocationException
    {
        for (int i = lineEnd; i > lineStart; i--)
        {
            char character = document.getText(i - 1, 1).charAt(0);
            if (!isWhitespace(character))
            {
                return character;
            }
        }
        return ' ';
    }

    @Override
    public boolean needsParserResult()
    {
        return true;
    }

    @Override
    public int indentSize()
    {
        return 4;
    }

    @Override
    public int hangingIndentSize()
    {
        return 8;
    }
}
