/**
 * 
 */
package com.techstack.spring.annotations.qualifier.multiplequalifierparams;

import org.springframework.stereotype.Component;

/**
 * @author KARTHIKEYAN N
 *
 */
@Component
public class MovieCatalog {
	
	private String catalogname;
	
	public String getCatalogname() {
		return catalogname;
	}
	
	public void setCatalogname(String catalogname) {
		this.catalogname = catalogname;
	}
	
	@Override
	public String toString() {
		return catalogname;
	}

}
