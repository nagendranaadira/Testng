package org.test;

import org.testng.annotations.Test;

public class HardAssert {
	@Test
	private void tc1() {
		System.out.println("tc1");
	}
@Test
private void tc2() {
	System.out.println("tc2");
	//assertion fail
	//Hard Assert
	System.out.println(1);
	System.out.println(2);
	System.out.println(3);
	//Assert.assertTrue(false);
	System.out.println(4);
	System.out.println(5);
	
}
@Test
private void tc3() {
	System.out.println("tc3");
}
}
