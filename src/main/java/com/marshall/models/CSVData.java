/**
 *
 */
package com.marshall.models;

/**
 * @author Vis
 *
 */
public class CSVData {

	private String hid;

	private String chunk;

	private String hasSpace;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CSVData [hid=").append(hid).append(", chunk=").append(chunk).append(", hasSpace=")
		.append(hasSpace).append("]");
		return builder.toString();
	}

	public String getHid() {
		return hid;
	}

	public void setHid(String hid) {
		this.hid = hid;
	}

	public String getChunk() {
		return chunk;
	}

	public void setChunk(String chunk) {
		this.chunk = chunk;
	}

	public String getHasSpace() {
		return hasSpace;
	}

	public void setHasSpace(String hasSpace) {
		this.hasSpace = hasSpace;
	}
}
