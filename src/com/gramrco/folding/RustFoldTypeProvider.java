package com.gramrco.folding;

import com.gramrco.RustLanguage;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import org.netbeans.api.editor.fold.FoldType;
import org.netbeans.api.editor.mimelookup.MimeRegistration;
import org.netbeans.spi.editor.fold.FoldTypeProvider;

/**
 *
 */
@MimeRegistration(mimeType = RustLanguage.MIME_TYPE, service = FoldTypeProvider.class)
public class RustFoldTypeProvider implements FoldTypeProvider
{

    @Override
    public Collection<FoldType> getValues(Class type)
    {
        if (type == FoldType.class)
        {
            return Arrays.asList(FoldType.CODE_BLOCK, FoldType.DOCUMENTATION);
        } else
        {
            return Collections.emptyList();
        }
    }

    @Override
    public boolean inheritable()
    {
        return false;
    }
}
