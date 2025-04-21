package genericUtilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverUtilities 
{
	
	
	public void implicitwait(WebDriver driver)
	{
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	public WebDriverWait explitwait(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		
		return wait;
	}
	
	//Create an object for Dropdown so that you can we can optimize the code easily
		public Select selectDropDownOptionsObject(WebElement element)
		{
			Select sel=new Select(element);
			return sel;
		}
		public void selectDropDownOptions(String text_value,WebElement element)
		{
			selectDropDownOptionsObject(element).selectByValue(text_value);	
		}
		public void selectDropDownOptions(WebElement element,int index)
		{
			selectDropDownOptionsObject(element).selectByIndex(index);
		}
		public void selectDropDownOptions(WebElement element,String value)
		{
			selectDropDownOptionsObject(element).selectByVisibleText(value);
		}
		//end of Dropdown
}
