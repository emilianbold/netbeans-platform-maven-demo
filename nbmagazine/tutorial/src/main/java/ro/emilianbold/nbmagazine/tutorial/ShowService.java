package ro.emilianbold.nbmagazine.tutorial;

import java.util.Collection;
import javax.swing.JOptionPane;
import org.openide.util.HelpCtx;
import org.openide.util.Lookup;
import org.openide.util.NbBundle;
import org.openide.util.actions.CallableSystemAction;
import ro.emilianbold.nbmagazine.tutorial.spi.Service;

public final class ShowService extends CallableSystemAction {

    public void performAction() {
        Collection<? extends Service> services = Lookup.getDefault().lookup(new Lookup.Template<Service>(Service.class)).allInstances();
        String s = "Services";
        for(Service report: services){
            s += report.getDisplayName();
            s += " ";
        }
        JOptionPane.showMessageDialog(null, s);        
    }

    public String getName() {
        return NbBundle.getMessage(ShowService.class, "CTL_ShowReport");
    }
    
    protected @Override void initialize() {
        super.initialize();
        // see org.openide.util.actions.SystemAction.iconResource() javadoc for more details
        putValue("noIconInMenu", Boolean.TRUE);
    }

    public HelpCtx getHelpCtx() {
        return HelpCtx.DEFAULT_HELP;
    }

    protected @Override boolean asynchronous() {
        return false;
    }

}
