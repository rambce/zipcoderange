package com.nisum;

import java.util.Comparator;

/** The class ZipCodeComparator is resposible to short by lowerBound Zip Code.
 * @author RamP
 * @version 1.0
*/
public class ZipCodeComparator implements Comparator<ZipCode> {

	@Override
	public int compare(ZipCode  zc1, ZipCode  zc2) {

		if (zc1.getLowerBound() > zc2.getLowerBound())
			return 1;
		else
			return -1;
	}
}
