package buildBo2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_Test 
{

	@BeforeSuite
	public void open_DbConnection()
	{
		System.out.println("@BeforeSuite------ 1");
	}

	@BeforeTest
	public void open_DbConnection2()
	{
		System.out.println("@BeforeTest------- 2");
	}

	@BeforeClass
	public void open_Browser()
	{
		System.out.println("@BeforeClass------ 3");
	}
	@BeforeMethod
	public void Login_url()
	{
		System.out.println("@BeforeMethod------ 4");
	}
	@Test
	public void demoAnnotations()
	{
		System.out.println("	@Test------------------------------ 5");
	}
	
	@AfterMethod
	public void login_url()
	{
		System.out.println("@AfterMethod------ 6");
	}
	
	@AfterClass
	public void colse_Browser()
	{
		System.out.println("@AfterClass------ 7");
	}
	
	@AfterTest
	public void colse_DbConnection2()
	{
		System.out.println("@AfterTest------ 8");
	}
	
	@AfterSuite
	public void colse_DbConnection()
	{
		System.out.println("@AfterSuite------ 9");
	}
}
