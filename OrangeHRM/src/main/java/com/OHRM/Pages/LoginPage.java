package com.OHRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.OHRM.TestBase.TestBase;

public class LoginPage extends TestBase {
	

	//@FindBy(xpath="//*[@class='loginText'][@name='txtUserName']")
	WebElement uname;
	
	//@FindBy(name="txtPassword")
	WebElement pass;
	
	//@FindBy(name="Submit")
	WebElement login;
	
	//@FindBy(name="clear")
	WebElement clear;
	
	/*public LoginPage(){
		PageFactory.initElements(driver,this);
	}*/
	
	
	public  void browserIntialization(){
		intialization();
	}

	public String getLogPageTitle(){
		return driver.getTitle();
	}
	
	public  boolean verifyelements() {
		uname=driver.findElement(By.name("txtUserName"));
		pass=driver.findElement(By.name("txtPassword"));
		login=driver.findElement(By.name("Submit"));
		clear=driver.findElement(By.name("clear"));
		Assert.assertTrue(uname.isDisplayed(),"not displayed");
		Assert.assertTrue(pass.isDisplayed());
		Assert.assertTrue(login.isDisplayed());
		Assert.assertTrue(clear.isDisplayed());
		return true;
	}
	
	public HomePage logInToPage(){
		String un=prop.getProperty("username");
		uname=driver.findElement(By.name("txtUserName"));
		uname.sendKeys(un);
		pass.sendKeys(prop.getProperty("password"));
		login.click();
		return new HomePage();
	}
	
	public void closBrow(){
		driver.quit();
	}
	
	
	
	

}
