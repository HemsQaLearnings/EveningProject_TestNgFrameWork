package com.OrangeHrm_Bo1_loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericUtilities.BaseClass;
import genericUtilities.WebDriverUtilities;

public class BuildBO1_Test extends BaseClass
{

	
	
	@Test()
	public void endToend_1_Test() throws InterruptedException
	{
			
			
		String heading = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		//Assert.assertEquals(heading, "Dash");
		
		//Assert.assertTrue(true);
		
		sf.assertEquals(heading, "Dash");
		
		
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
	
		
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
		
		
		
	}
	
}
