package com.nisum;

import java.util.ArrayList;
import java.util.List;

/** The  class LoadZipCode is responsible for loading the zipcode
 * @author RamP
 * @version 1.0
*/
public class LoadZipCode {

	/** the method loadZipCode is loading all the zipcode to the arraylist
	 * @param String
	 * @return List<ZipCode>
	*/
	public List<ZipCode> loadZipCode(String zipcodeRanges) {
		List<ZipCode> zipcodesList = new ArrayList<ZipCode>();
		String[] zipcodeIntervals = zipcodeRanges.split(" ");
		for (int i = 0; i < zipcodeIntervals.length; i++) {
			zipcodesList.add(splitIntoZip(zipcodeIntervals[i].replaceAll("\\[|\\]", "").split(",")));
		}
		return zipcodesList;
	}
	
	/** the method splitIntoZip is split and store in ZipCode model object
	 * @param String[]
	 * @return ZipCode
	*/
	protected ZipCode splitIntoZip(String[] splitZip) {
	    if (splitZip.length != 2)
	        throw new IllegalArgumentException("Zipcode should have lower and upper bounds");
		int lowerBound = Integer.parseInt(splitZip[0]);
		int upperBound = Integer.parseInt(splitZip[1]);
		return new ZipCode(lowerBound, upperBound);
	}
}

