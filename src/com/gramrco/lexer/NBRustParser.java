package com.gramrco.lexer;

import javax.swing.event.ChangeListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Task;
import org.netbeans.modules.parsing.spi.ParseException;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.parsing.spi.SourceModificationEvent;

/**
 *
 * @author jonathan.bergh
 */
public class NBRustParser extends Parser
{

    private Snapshot snapshot;
    private com.gramrco.antlrlexer.RustParser rustParser;

    @Override
    public void parse(Snapshot snapshot, Task task, SourceModificationEvent event)
    {
        this.snapshot = snapshot;
        ANTLRInputStream input = new ANTLRInputStream(snapshot.getText().toString());
        Lexer lexer = new com.gramrco.antlrlexer.RustLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        rustParser = new com.gramrco.antlrlexer.RustParser(tokens);
        
        try
        {
//            rustParser.prog();
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    @Override
    public Result getResult(Task task)
    {
        return new RustEditorParserResult(snapshot, rustParser);
    }

    @Override
    public void cancel()
    {
    }

    @Override
    public void addChangeListener(ChangeListener changeListener)
    {
    }

    @Override
    public void removeChangeListener(ChangeListener changeListener)
    {
    }

    public static class RustEditorParserResult extends Result
    {

        private final com.gramrco.antlrlexer.RustParser rustParser;
        private boolean valid = true;

        RustEditorParserResult(Snapshot snapshot, com.gramrco.antlrlexer.RustParser rustParser)
        {
            super(snapshot);
            this.rustParser = rustParser;
        }

        public com.gramrco.antlrlexer.RustParser getRustParser()
                throws ParseException
        {
            if (!valid)
            {
                throw new ParseException();
            }
            return rustParser;
        }

        @Override
        protected void invalidate()
        {
            valid = false;
        }
    }
}
