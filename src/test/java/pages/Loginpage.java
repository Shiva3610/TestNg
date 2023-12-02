package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;
	//=====================Locators============================
	@FindBy(className ="login")
	 WebElement loginLink;
	@FindBy(name ="user_login")
	WebElement userName;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="remember-me")
	WebElement rememberMe;
	@FindBy(name="btn_login")
	WebElement loginButton;
	
	
	
	
	public Loginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
		
	}
 
	public void LoginFunction(String UserNamVal , String ValidPass) {
		
		
		 
			loginLink.click();
			userName.sendKeys(UserNamVal);
			password.sendKeys(ValidPass);	
			rememberMe.click();
			loginButton.click();
  }
	
}
