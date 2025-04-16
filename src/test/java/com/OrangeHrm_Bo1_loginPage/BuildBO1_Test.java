package com.OrangeHrm_Bo1_loginPage;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BuildBO1_Test 
{

	@Test(priority=-100,invocationCount=1,groups= {"SmokeTesting","RegressionTesting"})
	public void signUp_Test()
	{
		System.out.println("SignUp_Test");
		Reporter.log("SignUp_Test");

	}
	
	@Test(priority=0,dependsOnMethods= {"signUp_Test"},groups= {"FunctionalTesting","Integreation"})
	public void login_Test()
	{
		System.out.println("Login_Test");
		//Assert.assertTrue(false);
	}
	@Test(priority=1,dependsOnMethods= {"signUp_Test","login_Test"},groups= {"RegressionTesting"})
	public void homePage_Test()
	{
		System.out.println("homePage_Test");
		//Assert.assertTrue(false);
	}
	@Test(priority=2,dependsOnMethods= {"homePage_Test"},groups= {"RegressionTesting"})
	public void logout_Test()
	{
		System.out.println("logout_Test");
	}
	
	
}
