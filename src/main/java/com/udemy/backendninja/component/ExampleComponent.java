package com.udemy.backendninja.component;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;

@Controller
public class ExampleComponent {

	private static final Log LOG = LogFactory.getLog(ExampleComponent.class);
			
	public void sayHello(){
		LOG.info("PRUEBA DE LOG HELLO SAYHELLO");
	}
	
}
