package fb1.services;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.ExchangeBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import fb1.model.*;
import fb1.services.*;


@Component
public class Camel{
		
	@Autowired
	private ProducerTemplate producer;

	@Autowired
	private CamelContext camelContext;	
	
	public <T> T run(String endpoint,Object requestBody,Class<T> type){
		final Exchange requestExchange = ExchangeBuilder.anExchange(camelContext).withBody(requestBody).build();
		final Exchange responseExchange = producer.send(endpoint, requestExchange);		
		return responseExchange.getIn().getBody(type);
	}

}
