package org.grouping;

import org.testng.annotations.Test;

public class Group1 {
	@Test(groups="smoke")
	private void tc1() {
		System.out.println("tc1");
	}
	@Test(groups="sanity")
private void tc2() {
	System.out.println("tc2");
}
	@Test(groups="regarssion")
private void tc3() {
	System.out.println("tc3");
}
}
