/**
 *
 */
package com.marshall.models;

import org.hibernate.validator.constraints.NotEmpty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author Vis
 *
 */
@ApiModel
public class RADataRequest {
	@NotEmpty
	@ApiModelProperty(notes = "hid that is required to fetch the corresponding data", required = true)
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
