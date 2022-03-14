package test;

import org.testng.annotations.Test;

public class CarLoanApplicationTests {

	@Test
	public void CarLoanLoginWeb() {
		System.out.println("Web Login for Car Loan application");
	}
	
	@Test
	public void CarLoanLoginMobile() {
		System.out.println("Mobile Login for Car Loan Application");
	}
	
	@Test(groups= {"Smoke"})	
	public void CarLoanLoginAPI() {
		System.out.println("API Login for Car Loan Application");
	}
	
}
