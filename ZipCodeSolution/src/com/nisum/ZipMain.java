package com.nisum;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/** The class ZipMain is main class for zip code solution.
 * @author RamP
 * @version 1.0
*/
public class ZipMain {

	private static Scanner scan;
	
	/** This entry point for the application
	 * @param String[]
	 * @return none
	*/
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Please enter your zip code range : ");
		String zipcodeRanges = scan.nextLine();
		
		LoadZipCode loadZipCode = new LoadZipCode();
		List<ZipCode> zipcodesList = loadZipCode.loadZipCode(zipcodeRanges);

		Collections.sort(zipcodesList, new ZipCodeComparator());
		
		MergeZipCode mergeZipCode = new MergeZipCode();
		
		List<ZipCode> mergedZipcodeList = mergeZipCode.mergeZipcodes(zipcodesList);

		for (ZipCode zipcode : mergedZipcodeList) {
			System.out.println("[" + zipcode.getLowerBound() + "," + zipcode.getUpperBound() + "]");
		}
	}


	

}
