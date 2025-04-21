package genericUtilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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

public class BaseClass {
	
	public WebDriver driver;
	
	//object creation for webDriverUtils
	WebDriverUtilities wlib =new WebDriverUtilities();
	@Parameters({ "browser" })
	@BeforeClass
	public void open_Browser(@Optional("chrome") String browser ) 
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
		// userName
		
		//WebElement usn = driver.findElement(By.xpath("//input[@name='username']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		Thread.sleep(4000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='username']"))).sendKeys("Admin");
	//	wait.until(ExpectedConditions.elementToBeClickable(usn)).sendKeys("Admin");
		System.out.println("send userName");
		
		// password
		driver.findElement(By.name("password")).sendKeys("admin123");
		// login
		System.out.println("send password");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@AfterMethod
	public void login_url() {
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

	@AfterClass
	public void colse_Browser() {
		driver.quit();
	}

}
