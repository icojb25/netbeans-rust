package com.gramrco;

import com.gramrco.lexer.RustTokenId;
import org.netbeans.api.lexer.Language;
import org.netbeans.modules.csl.spi.DefaultLanguageConfig;
import org.netbeans.modules.csl.spi.LanguageRegistration;

@LanguageRegistration(mimeType = RustLanguage.MIME_TYPE, useMultiview=true)
public class RustLanguage extends DefaultLanguageConfig
{

    public static final String MIME_TYPE = "text/x-rs";
    public static final String BOOT_CLASSPATH_ID = "classpath/rust-boot"; //NOI18N
    public static final String SOURCE_CLASSPATH_ID = "classpath/rust-source"; //NOI18N

    @Override
    public String getDisplayName()
    {
        return "Rust";
    }

    @Override
    public String getPreferredExtension()
    {
        return "rs";
    }

    @Override
    public String getLineCommentPrefix()
    {
        return "//";
    }

//    @Override
//    public boolean isIdentifierChar(char c)
//    {
//        return isRustIdentifierChar(c);
//    }
//
    @Override
    public Language<RustTokenId> getLexerLanguage()
    {
        return RustLanguageHierarchy.getLanguage();
    }
//
//    @Override
//    public Parser getParser()
//    {
//        return new RustAntlrParser();
//    }

//    @Override
//    public boolean hasFormatter()
//    {
//        return true;
//    }
//
//    @Override
//    public Formatter getFormatter()
//    {
//        return new RustFormatter();
//    }

//    @Override
//    public SemanticAnalyzer getSemanticAnalyzer()
//    {
//        return new RustAntlrSemanticAnalyzer();
//    }
//
//    @Override
//    public StructureScanner getStructureScanner()
//    {
//        return new RustAntlrStructureScanner();
//    }
//
//    @Override
//    public EmbeddingIndexerFactory getIndexerFactory()
//    {
//        return new RustIndexer.Factory();
//    }
//
//    @Override
//    public IndexSearcher getIndexSearcher()
//    {
//        return new RustIndexSearcher();
//    }

//    @Override
//    public boolean hasStructureScanner()
//    {
//        return true;
//    }

    //TODO: are these required? Is the annotation enough?
//    @Override
//    public Set<String> getLibraryPathIds()
//    {
//        return Collections.singleton(RustLanguage.BOOT_CLASSPATH_ID);
//    }
//
//    @Override
//    public Set<String> getSourcePathIds()
//    {
//        return Collections.singleton(RustLanguage.SOURCE_CLASSPATH_ID);
//    }
}
