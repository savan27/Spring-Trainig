package com.savan.config;

import java.math.BigDecimal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.savan.model.ClientBean;
import com.savan.model.Order;

/**
 * @author SAVAN
 *
 */
@Configuration
@ComponentScan(basePackages = "com.savan")
public class ClientConfig {
	
	@Bean
	public ClientBean clientBean() {
		return new ClientBean();
	}
	
	@Bean
	public Order order() {
		Order order = new Order();
		order.setPrice(BigDecimal.ZERO);
		return order;
	}
}
