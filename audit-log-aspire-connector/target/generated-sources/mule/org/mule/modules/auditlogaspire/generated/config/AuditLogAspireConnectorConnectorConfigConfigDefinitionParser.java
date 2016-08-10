
package org.mule.modules.auditlogaspire.generated.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.auditlogaspire.config.ConnectorConfig;
import org.mule.modules.auditlogaspire.generated.adapters.AuditLogAspireConnectorConnectorConfigBasicAdapter;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.parsing.BeanDefinitionParsingException;
import org.springframework.beans.factory.parsing.Location;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.8.0", date = "2016-08-10T02:18:19+05:30", comments = "Build UNNAMED.2762.e3b1307")
public class AuditLogAspireConnectorConnectorConfigConfigDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(AuditLogAspireConnectorConnectorConfigConfigDefinitionParser.class);

    public String moduleName() {
        return "AuditLogAspire";
    }

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        parseConfigName(element);
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.setScope(BeanDefinition.SCOPE_SINGLETON);
        setInitMethodIfNeeded(builder, AuditLogAspireConnectorConnectorConfigBasicAdapter.class);
        setDestroyMethodIfNeeded(builder, AuditLogAspireConnectorConnectorConfigBasicAdapter.class);
        BeanDefinitionBuilder basicConfigBuilder = BeanDefinitionBuilder.rootBeanDefinition(ConnectorConfig.class.getName());
        parseProperty(basicConfigBuilder, element, "greeting", "greeting");
        parseProperty(basicConfigBuilder, element, "company", "company");
        parseProperty(basicConfigBuilder, element, "reply", "reply");
        builder.addPropertyValue("config", basicConfigBuilder.getBeanDefinition());
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        return definition;
    }

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(AuditLogAspireConnectorConnectorConfigBasicAdapter.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the configuration [config] within the connector [audit-log-aspire] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the configuration [config] within the connector [audit-log-aspire] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

}
