/**
 *
 */
package com.marshall.models;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Vis
 *
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RADataResponse {

	private CSVData csvData;

	private String error;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RADataResponse [csvData=").append(getCsvData()).append(", error=").append(error).append("]");
		return builder.toString();
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public CSVData getCsvData() {
		return csvData;
	}

	public void setCsvData(CSVData csvData) {
		this.csvData = csvData;
	}

}
