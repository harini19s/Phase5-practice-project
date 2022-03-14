package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomeLoanApplicationTests {
	
	@Test
	public void HomeLoanLoginWeb() {
		System.out.println("Web Login for Home Loan application");
	}
	
	@Test(groups= {"Smoke"})	
	public void HomeLoanLoginMobile() {
		System.out.println("Mobile Login for Home Loan Application");
	}
	
	@Test
	public void HomeLoanLoginAPI() {
		System.out.println("API Login for Home Loan Application");
	}
	
	@BeforeSuite
	public void runVeryFirst() {
		System.out.println("This is executed as the very first");
	}
	
	@AfterSuite
	public void runVeryLast() {
		System.out.println("This is executed at the very last");
	}
	
	@BeforeMethod
	public void beforeEachMethod() {
		System.out.println("This is executed before each method");
	}
	@AfterMethod
	public void afterEachMethod() {
		System.out.println("This is executed after each method");
	}
}
