package Unit_Testing_Tool;

import org.junit.AfterClass;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Configuration_Annotation {
	
	@AfterSuite
	public void aftersuite() {
		Reporter.log("From after suite",true);
	}
	
	@AfterTest
	public void aftertest() {
		Reporter.log("From after test",true);	
	}
	
	@AfterClass
	public void afterclass() {
		Reporter.log("From after class",true);
	}
	
	@Test
	public void Wednesday() {
		Reporter.log("main method",true);
	}
	@BeforeSuite
	public void beforesuite() {
		Reporter.log("From before suite",true);
	}
	
	@BeforeTest
	public void beforetest() {
		Reporter.log("From before test",true);	
	}
	
	@BeforeClass
	public void beforeclass() {
		Reporter.log("From before class",true);
	}
	

}
