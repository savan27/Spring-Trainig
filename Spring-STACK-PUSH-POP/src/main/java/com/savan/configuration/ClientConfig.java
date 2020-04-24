package com.savan.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.savan.opertion.ClientOperation;
import com.savan.utility.ClientUtility;

/**
 * @author SAVAN
 *
 */
@Configuration
@ComponentScan(basePackages = "com.savan")
public class ClientConfig {
	
	@Bean
	public ClientOperation opration() {
		ClientOperation operation = new ClientOperation();
		operation.setCliUtility(cliUtility());		//setter Injection
		return null;
	}

	@Bean
	public ClientUtility cliUtility() {
		return new ClientUtility();
	}

}
