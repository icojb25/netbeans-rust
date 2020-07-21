package com.gramrco.optionscontroller;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import org.netbeans.spi.options.OptionsPanelController;
import org.openide.util.HelpCtx;
import org.openide.util.Lookup;

@OptionsPanelController.SubRegistration(
        displayName = "#AdvancedOption_DisplayName_Rust",
        keywords = "#AdvancedOption_Keywords_Rust",
        keywordsCategory = "Advanced/Rust"
)
@org.openide.util.NbBundle.Messages(
{
    "AdvancedOption_DisplayName_Rust=RustLang", "AdvancedOption_Keywords_Rust=rust language"
})
//@OptionsPanelController.TopLevelRegistration(
//        categoryName = "#OptionsCategory_Name_Rust",
//        iconBase = "com/gramrco/rust-icon-16x16.gif",
//        keywords = "#OptionsCategory_Keywords_Rust",
//        keywordsCategory = "Rust")
//@org.openide.util.NbBundle.Messages({"OptionsCategory_Name_Rust=Rust", "OptionsCategory_Keywords_Rust=rust"})
public final class RustOptionsPanelController extends OptionsPanelController
{

    private RustPanel panel;
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);
    private boolean changed;

    @Override
    public void update()
    {
        getPanel().load();
        changed = false;
    }

    @Override
    public void applyChanges()
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                getPanel().store();
                changed = false;
            }
        });
    }

    @Override
    public void cancel()
    {
        // need not do anything special, if no changes have been persisted yet
    }

    @Override
    public boolean isValid()
    {
        return getPanel().valid();
    }

    @Override
    public boolean isChanged()
    {
        return changed;
    }

    @Override
    public HelpCtx getHelpCtx()
    {
        return null; // new HelpCtx("...ID") if you have a help set
    }

    @Override
    public JComponent getComponent(Lookup masterLookup)
    {
        return getPanel();
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener l)
    {
        pcs.addPropertyChangeListener(l);
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener l)
    {
        pcs.removePropertyChangeListener(l);
    }

    private RustPanel getPanel()
    {
        if (panel == null)
        {
            panel = new RustPanel(this);
        }
        return panel;
    }

    void changed()
    {
        if (!changed)
        {
            changed = true;
            pcs.firePropertyChange(OptionsPanelController.PROP_CHANGED, false, true);
        }
        pcs.firePropertyChange(OptionsPanelController.PROP_VALID, null, null);
    }

}
