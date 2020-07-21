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
public class RustParser extends Parser
{

    private Snapshot snapshot;
    private com.gramrco.antlrlexer.RustParser oracleParser;

    @Override
    public void parse(Snapshot snapshot, Task task, SourceModificationEvent event)
    {
        this.snapshot = snapshot;
        ANTLRInputStream input = new ANTLRInputStream(snapshot.getText().toString());
        Lexer lexer = new com.gramrco.antlrlexer.RustLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        oracleParser = new com.gramrco.antlrlexer.RustParser(tokens);
        try
        {
//            oracleParser.prog();
        } catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    @Override
    public Result getResult(Task task)
    {
        return new SqlEditorParserResult(snapshot, oracleParser);
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

    public static class SqlEditorParserResult extends Result
    {

        private final com.gramrco.antlrlexer.RustParser sqlParser;
        private boolean valid = true;

        SqlEditorParserResult(Snapshot snapshot, com.gramrco.antlrlexer.RustParser oracleParser)
        {
            super(snapshot);
            this.sqlParser = oracleParser;
        }

        public com.gramrco.antlrlexer.RustParser getSqlParser()
                throws ParseException
        {
            if (!valid)
            {
                throw new ParseException();
            }
            return sqlParser;
        }

        @Override
        protected void invalidate()
        {
            valid = false;
        }
    }
}
