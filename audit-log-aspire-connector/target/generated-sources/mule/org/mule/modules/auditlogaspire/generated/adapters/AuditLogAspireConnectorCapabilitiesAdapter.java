
package org.mule.modules.auditlogaspire.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.devkit.capability.Capabilities;
import org.mule.api.devkit.capability.ModuleCapability;
import org.mule.modules.auditlogaspire.AuditLogAspireConnector;


/**
 * A <code>AuditLogAspireConnectorCapabilitiesAdapter</code> is a wrapper around {@link AuditLogAspireConnector } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.8.0", date = "2016-08-10T02:18:19+05:30", comments = "Build UNNAMED.2762.e3b1307")
public class AuditLogAspireConnectorCapabilitiesAdapter
    extends AuditLogAspireConnector
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(ModuleCapability capability) {
        if (capability == ModuleCapability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
