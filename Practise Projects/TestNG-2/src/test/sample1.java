package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sample1 {

	@Test
	public void test1() {
		System.out.println ("test1");
	}
	
	@Test(groups= {"Smoke"})
	public void test2() {
		System.out.println("test2");
	}
	
	@Test
	public void test3() {
		System.out.println("test3");
	}
	
	@BeforeTest
	public void setup() {
		System.out.println("This will be executed before all tests");
	}
	@AfterTest
	public void cleanup() {
		System.out.println("This will be execute after all tests");
	}
}
