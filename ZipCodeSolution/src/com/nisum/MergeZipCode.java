package com.nisum;

import java.util.ArrayList;
import java.util.List;

/** The  class MergeZipCode is responsible to merge the zipcode
 * @author RamP
 * @version 1.0
*/
public class MergeZipCode {

	/** the method mergeZipcodes is merging to the new arraylist
	 * @param List<ZipCode>
	 * @return List<ZipCode>
	*/
	public List<ZipCode> mergeZipcodes(List<ZipCode> sortedZipCodeList) {
		List<ZipCode> mergedZipcodeList = new ArrayList<ZipCode>();
		ZipCode zipCode = null;
		for (ZipCode newZipCode : sortedZipCodeList) {
		
			if (zipCode == null)
				zipCode = newZipCode;
			else {
				if (zipCode.getUpperBound() >= newZipCode.getLowerBound()) {
					zipCode.setUpperBound(Math.max(zipCode.getUpperBound(), newZipCode.getUpperBound()));
				} else {
					mergedZipcodeList.add(zipCode);
					zipCode = newZipCode;
				}
				mergedZipcodeList.add(zipCode);
			}
		}
		return sortedZipCodeList;
		
		
	}
}
