package genericUtilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import pomUtilities.LoginPomPage;

public class BaseClass {
	
	public WebDriver driver;
	
	//object creation for webDriverUtils
	WebDriverUtilities wlib =new WebDriverUtilities();
	public SoftAssert sf;
	public LoginPomPage lp;
	
	@Parameters({ "browser" })
	@BeforeClass
	public void open_Browser(@Optional("Chrome") String browser ) 
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			wlib.implicitwait(driver);
		}
		else if (browser.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			wlib.implicitwait(driver);
		}
		else
		{
			driver=new EdgeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			wlib.implicitwait(driver);
		}
	}

	@BeforeMethod
	public void Login_url() throws InterruptedException {
		sf = new SoftAssert();
		lp=new LoginPomPage(driver);
		Thread.sleep(4000);
		lp.loginPageImpliment("Admin", "admin");
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		lp.loginPageImpliment("Admin", "admin123");
		Thread.sleep(4000);
		lp.getLogin_btn().click();
		
	}

	@AfterMethod
	public void login_url() {
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
	}

	@AfterClass
	public void colse_Browser() {
		driver.quit();
		sf.assertAll();
	}

}
