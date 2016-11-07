package org.dilip.multiply;

import static org.junit.Assert.*;
import  org.junit.Test;

public class MultiplyTest {

	@Test
	public void test() {
		TestMultiply tm = new TestMultiply();
		tm.setA(10);
		tm.setB(20);
		int result=tm.Multiply();
		int expected=Math.multiplyExact(10, 20);
		assertEquals(expected,result);
	}

}
