package pomUtilities;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPomPage 
{

	 public LoginPomPage(WebDriver driver) {
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(xpath = "//input[@name='username' or @placeholder='Username']")
	    private WebElement usn_login;

	    @FindBy(xpath = "//input[@name='password' or @placeholder='Password']")
	    private WebElement pass;

	    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	    private WebElement login_btn;

	    public WebElement getUsn_login() {
	        return usn_login;
	    }

	    public WebElement getPass() {
	        return pass;
	    }

	    public WebElement getLogin_btn() {
	        return login_btn;
	    }

	    // Business Library
	    public void loginPageImpliment(String usn, String password) {
	        usn_login.sendKeys(usn);
	        pass.sendKeys(password);
	      //  login_btn.click();
	    }
	
}
