/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.rest;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class RestComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        RestComponent target = (RestComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apidoc":
        case "apiDoc": target.setApiDoc(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "componentname":
        case "componentName": target.setComponentName(property(camelContext, java.lang.String.class, value)); return true;
        case "consumercomponentname":
        case "consumerComponentName": target.setConsumerComponentName(property(camelContext, java.lang.String.class, value)); return true;
        case "host": target.setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "producercomponentname":
        case "producerComponentName": target.setProducerComponentName(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("apiDoc", java.lang.String.class);
        answer.put("basicPropertyBinding", boolean.class);
        answer.put("bridgeErrorHandler", boolean.class);
        answer.put("componentName", java.lang.String.class);
        answer.put("consumerComponentName", java.lang.String.class);
        answer.put("host", java.lang.String.class);
        answer.put("lazyStartProducer", boolean.class);
        answer.put("producerComponentName", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        RestComponent target = (RestComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apidoc":
        case "apiDoc": return target.getApiDoc();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "componentname":
        case "componentName": return target.getComponentName();
        case "consumercomponentname":
        case "consumerComponentName": return target.getConsumerComponentName();
        case "host": return target.getHost();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "producercomponentname":
        case "producerComponentName": return target.getProducerComponentName();
        default: return null;
        }
    }
}
