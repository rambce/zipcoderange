package com.nisum;

/** The class ZipCode is model class
 * @author RamP
 * @version 1.0
*/
public class ZipCode {

	private int lowerBound;
	private int upperBound;

	public ZipCode() {

	}

	public ZipCode(int lowerBound, int upperBound) {
		super();
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
	}

	public int getLowerBound() {
		return lowerBound;
	}

	public void setLowerBound(int lowerBound) {
		this.lowerBound = lowerBound;
	}

	public int getUpperBound() {
		return upperBound;
	}

	public void setUpperBound(int upperBound) {
		this.upperBound = upperBound;
	}

	@Override
	public String toString() {
		return "ZipCode [lowerBound=" + lowerBound + ", upperBound=" + upperBound + "]";
	}



}
