package org.testng;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertex{
	@Test
	private void tc1() {
		System.out.println("tc1");
	}
	
@Test
private void tc2() {
	System.out.println("tc2");
SoftAssert soft =new SoftAssert();
soft.assertTrue(false);

System.out.println(1);
	System.out.println(2);
	System.out.println(3);
//soft.assertAll();
	System.out.println(4);
	System.out.println(5);
}
	
@Test
private void tc3() {
	System.out.println("tc3");
}
	
}

