package testNGINtegration;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestNGExm {

	
//		// TestNG : test new generation 
//		java based unit testing tool 
//		Advantages 
//		1. test cases and test suites 
//		2. grouping of test cases
//		priortize
//		parameterization
//		parallel testing 
//		reports
		
		
//		Annotation
	//TestNG execute test methods based on alphabetical order 
	//@test(priority=num) controls the order of execution 
	//if you dont provide priority then default value is 0.
	//if the priorities are same then again execute methods in alphabetical order
	
     	@Test(priority=1)
//	
	    void openapp() {
     		System.out.println("Open application");
	    	
	    	
	    }
	    @Test(priority=2)
	    
	    void login() {
	    	System.out.println("Login to application");
	    	
	    }
	    @Test(priority=3)
	    
	    void logout() {
	    	System.out.println("Logout from application");
	    	
	    }
	

}