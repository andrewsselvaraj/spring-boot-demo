/**
 * 
 */
package com.techstack.spring.annotations.autowired.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author KARTHIKEYAN N
 *
 */
@Component
public class ClientBean {

	private ServiceBean serviceBean;
	
	public ClientBean(ServiceBean serviceBean) {
		this.serviceBean = serviceBean;
	}

	@Autowired
	public void setServiceBean(ServiceBean serviceBean) {
		this.serviceBean = serviceBean;
	}

	public void work() {
		System.out.println("service bean instance: " + serviceBean);
	}
}
