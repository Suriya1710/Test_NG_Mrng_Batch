package com.TestNg_Concepts;

import org.testng.annotations.Test;

public class Grouping_Test {

	@Test(groups = "Books")
	private void bookSearch() {

		System.out.println("book search");
	}

	@Test(groups = "Books")
	private void novelSearch() {

		System.out.println("novel search");
	}

	@Test(groups = "Electronics")
	private void laptopSearch() {

		System.out.println("Laptop Search");
	}

	@Test(groups = "Electronics")
	private void earphonesSearch() {

		System.out.println("Ear phones Search");
	}

	@Test(groups = "Electronics")
	private void mobileSearch() {

		System.out.println("Mobile Search");
	}


	@Test(groups = "Social Media")
	private void facebook() {

		System.out.println("Facebook");
	}
	
	@Test(groups = "Social Media")
	private void instagram() {

		System.out.println("Instagram");
	}
	
	
	
}
