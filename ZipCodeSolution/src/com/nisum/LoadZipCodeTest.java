package com.nisum;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class LoadZipCodeTest {

	@Test
	public void testLoadZipCode() {

		String str = "[94133,94133] [94200,94299] [94600,94699]";

		LoadZipCode code = new LoadZipCode();
		List<ZipCode> loadZipCode = code.loadZipCode(str);
		assertTrue(loadZipCode.size() > 0);
		assertEquals(3, loadZipCode.size());
	}

	@Test
	public void testSplitIntoZip() {
		String[] strList = new String[] {"94133","94137"};
		LoadZipCode code = new LoadZipCode();;
		ZipCode splitIntoZip = code.splitIntoZip(strList);
		assertEquals(94133, splitIntoZip.getLowerBound());

	}

	@Test
	public void testSplitIntoZipWithOneString() {
		try {
			String[] strList = new String[] {"94133"};
			LoadZipCode code = new LoadZipCode();;
			code.splitIntoZip(strList);
		} catch (IllegalArgumentException e) {
			String msg ="Zipcode should have lower and upper bounds";
			assertEquals(msg, e.getMessage());
		}

	}
}
