/**
 * 
 */
package com.savan.main;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * @author SAVAN
 *
 */
public class CustomEventPublishr implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher applicationEventPublisher;

	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {

		this.applicationEventPublisher = applicationEventPublisher;
	}

	public void publishEvent() {
		CutomEvent customEvent = new CutomEvent(this);
		applicationEventPublisher.publishEvent(customEvent);
	}

}
