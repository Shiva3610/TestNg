package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Loginpage;

public class Logintest extends BaseClass {
	
	@Test
	public void LoginTestFailure(){
		
		Loginpage login = new Loginpage(driver);
		login.LoginFunction("abc@xyz.com","Shibagjdjkd@1234");

	   WebElement errorMessage = driver.findElement(By.id("msg_box"));
		
		System.out.println("message " + errorMessage.getText());
		
		String Actualmsg = errorMessage.getText();
		String Expctdmsg = "The email or password you have entered is invalid.";
		
		Assert.assertEquals(Actualmsg, Expctdmsg);
		
		
	}
        @Test
	  public void LoginSucessTest(){
		  
		  Loginpage login = new Loginpage(driver);
		  login.LoginFunction("shivachaitanya1810@gmail.com", "Shiva@3610");
		  
		  
	  }

	 
		 
	 } 


