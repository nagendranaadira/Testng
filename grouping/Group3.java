package org.grouping;

import org.testng.annotations.Test;

public class Group3 {
	@Test(groups="smoke")
	private void tc1000() {
		System.out.println("tc1000");
	}
@Test(groups="sanity")
private void tc2000() {
	System.out.println("tc2000");
}
@Test(groups="regarssion")
private void tc3000() {
	System.out.println("tc3000");
}
}
