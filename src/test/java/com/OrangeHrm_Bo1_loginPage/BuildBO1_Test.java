package com.OrangeHrm_Bo1_loginPage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.WebDriverUtilities;

public class BuildBO1_Test extends BaseClass
{

	
	
	@Test()
	public void endToend_1_Test() throws InterruptedException
	{
		
		
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
	
		
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
		
	}
	
}
