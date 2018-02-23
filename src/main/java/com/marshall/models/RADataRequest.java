/**
 * 
 */
package com.marshall.models;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Vis
 *
 */

public class RADataRequest {
	@NotEmpty
	private String hid;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RADataRequest [hid=").append(hid).append("]");
		return builder.toString();
	}

	public String getHid() {
		return hid;
	}

	public void setHid(String hid) {
		this.hid = hid;
	}
	
}
