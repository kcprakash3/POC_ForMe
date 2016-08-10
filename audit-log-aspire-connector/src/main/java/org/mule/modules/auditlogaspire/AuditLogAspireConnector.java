package org.mule.modules.auditlogaspire;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.api.annotations.Processor;

import org.mule.modules.auditlogaspire.config.ConnectorConfig;

@Connector(name="audit-log-aspire", friendlyName="AuditLogAspire")
public class AuditLogAspireConnector {

    @Config
    ConnectorConfig config;

    /**
     * Custom processor
     *
     * @param friend Name to be used to generate a greeting message.
     * @return A greeting message
     */
    @Processor
    public String greet(String friend) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
        return config.getGreeting() + " " + friend + ". " + config.getReply();
    }
    
    @Processor
    public String getCompany(String friend,String company) {
        /*
         * MESSAGE PROCESSOR CODE GOES HERE
         */
        return config.getCompany() + " " + company  +" and your Friend =" + friend;
    }

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }

}