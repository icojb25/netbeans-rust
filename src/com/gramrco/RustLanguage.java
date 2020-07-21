package com.gramrco;

import com.gramrco.lexer.RustTokenId;
import org.netbeans.api.lexer.Language;
import org.netbeans.modules.csl.spi.DefaultLanguageConfig;
import org.netbeans.modules.csl.spi.LanguageRegistration;

/**
 *
 * @author jonathan.bergh
 */
@LanguageRegistration(mimeType = "text/x-rs")
public class RustLanguage extends DefaultLanguageConfig
{

    @Override
    public String getLineCommentPrefix()
    {
        return "//";
    }

    @Override
    public Language getLexerLanguage()
    {
        return RustTokenId.getLanguage();
    }

    @Override
    public String getPreferredExtension()
    {
        return "rs";
    }

    @Override
    public String getDisplayName()
    {
        return "Rust";
    }

//    @Override
//    public Parser getParser()
//    {
//        return new RustParser();
//    }
//    @Override
//    public CodeCompletionHandler getCompletionHandler() { return new TSCodeCompletion(); }
//
//    @Override
//    public InstantRenamer getInstantRenamer() { return new TSInstantRenamer(); }
//
//    @Override
//    public boolean hasStructureScanner() { return true; }
//    @Override
//    public StructureScanner getStructureScanner() { return new TSStructureScanner(); }
//    
//    @Override
//    public DeclarationFinder getDeclarationFinder() { return new TSDeclarationFinder(); }
//
//    @Override
//    public boolean hasOccurrencesFinder() { return true; }
//    @Override
//    public OccurrencesFinder getOccurrencesFinder() { return new TSOccurrencesFinder(); }
//
//    @Override
//    public SemanticAnalyzer getSemanticAnalyzer() { return new TSSemanticAnalyzer(); }
//
//    @Override
//    public boolean hasFormatter() { return true; }
//    @Override
//    public Formatter getFormatter() { return new TSFormatter(); }
//
//    @Override
//    public OverridingMethods getOverridingMethods() { return new TSOverridingMethods(); }
//
//    @Override
//    public boolean hasHintsProvider() { return true; }
//    @Override
//    public HintsProvider getHintsProvider() { return new TSHintsProvider(); }
}
