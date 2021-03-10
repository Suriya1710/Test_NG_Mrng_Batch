package com.TestNg_Concepts;

import org.testng.annotations.Test;

public class Invocation_Count {

	@Test
	private void bookSearch() {

		System.out.println("book search");
	}

	@Test(invocationCount = 4)
	private void refresh() {

		System.out.println("refresh");
	}

	@Test
	private void termsAndConditions() {

		System.out.println("Terms And Conditions");
	}

}
