package ro.emilianbold.nbmagazine.tutorial.impl;

import org.openide.util.NbBundle;
import ro.emilianbold.nbmagazine.tutorial.spi.Service;

/**
 *
 * @author emilian
 */
public class SampleService implements Service {
    public String getDisplayName() {
        return NbBundle.getMessage(SampleService.class, "SampleReport");
    }
}