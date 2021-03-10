package com.TestNg_Concepts;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Test {
	
	@Test
	@Parameters({"username","password"})
	private void credential(@Optional("Starc")String username,
			int password) {

		System.out.println("Username : "+username);
		
		System.out.println("Password : "+password);
		
	}

}
