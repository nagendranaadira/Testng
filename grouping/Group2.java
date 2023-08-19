package org.grouping;

import org.testng.annotations.Test;

public class Group2 {
	@Test(groups="smoke")
	private void tc100() {
		System.out.println("tc100");
	}
@Test(groups="sanity")
private void tc200() {
	System.out.println("tc200");
}
@Test(groups="regarssion")
private void tc300() {
	System.out.println("tc300");
}
}
