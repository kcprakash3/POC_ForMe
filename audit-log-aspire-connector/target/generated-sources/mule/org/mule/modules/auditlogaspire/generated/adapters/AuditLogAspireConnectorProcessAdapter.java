
package org.mule.modules.auditlogaspire.generated.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.auditlogaspire.AuditLogAspireConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>AuditLogAspireConnectorProcessAdapter</code> is a wrapper around {@link AuditLogAspireConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.8.0", date = "2016-08-10T02:18:19+05:30", comments = "Build UNNAMED.2762.e3b1307")
public class AuditLogAspireConnectorProcessAdapter
    extends AuditLogAspireConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<AuditLogAspireConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, AuditLogAspireConnectorCapabilitiesAdapter> getProcessTemplate() {
        final AuditLogAspireConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,AuditLogAspireConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, AuditLogAspireConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, AuditLogAspireConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
