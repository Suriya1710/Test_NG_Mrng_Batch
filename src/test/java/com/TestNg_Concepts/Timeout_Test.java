package com.TestNg_Concepts;

import org.testng.annotations.Test;

public class Timeout_Test {

	@Test(timeOut = 2000)
	private void navigateToPage() throws Throwable {

		System.out.println("Button Click");

		Thread.sleep(3000);

		System.out.println("navigate");

	}

}
