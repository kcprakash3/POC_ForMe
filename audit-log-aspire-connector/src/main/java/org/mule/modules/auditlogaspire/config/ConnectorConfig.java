package org.mule.modules.auditlogaspire.config;

import org.mule.api.annotations.components.Configuration;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.param.Default;

@Configuration(friendlyName = "Configuration")
public class ConnectorConfig {

    /**
     * Greeting message
     */
    @Configurable
    @Default("Hello")
    private String greeting;
    
    /**
     * Company message
     */
    @Configurable
    @Default("Aspire")
    private String company;

    public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	/**
     * Reply message
     */
    @Configurable
    @Default("How are you?")
    private String reply;

    /**
     * Set greeting message
     *
     * @param greeting the greeting message
     */
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    /**
     * Get greeting message
     */
    public String getGreeting() {
        return this.greeting;
    }

    /**
     * Set reply
     *
     * @param reply the reply
     */
    public void setReply(String reply) {
        this.reply = reply;
    }

    /**
     * Get reply
     */
    public String getReply() {
        return this.reply;
    }

}