package com.OHRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.OHRM.TestBase.TestBase;
import com.OHRM.TestUtils.TestUtils;

public class HomePage extends TestBase {
	
	TestUtils uti;
	
	//@FindBy(xpath="//ul[@id='option-menu']/li[1]")
	WebElement user;
	
	//@FindBy(xpath="//ul[@id='option-menu']/li[2]/a")
	WebElement cp;
	
	//@FindBy(xpath="//ul[@id='option-menu']/li[3]/a")
	WebElement lout;
	
	//@FindBy(linkText="PIM")
	WebElement pim;
	
	//@FindBy(linkText="Add Employee")
	WebElement addemp;
	
	/*public HomePage(){
		PageFactory.initElements(driver, this);
	}*/
	
	public String getHomePageTitle(){
		uti=new TestUtils();
		return driver.getTitle();
	}
	
	public String getUser(){
		user=driver.findElement(By.xpath("//ul[@id='option-menu']/li[1]"));
		cp=driver.findElement(By.xpath("//ul[@id='option-menu']/li[2]/a"));
		lout=driver.findElement(By.xpath("//ul[@id='option-menu']/li[3]/a"));		
		return user.getText();
	}
	
	public boolean verifyElePresent(){
		Assert.assertTrue(user.isDisplayed());
		Assert.assertTrue(cp.isDisplayed());
		Assert.assertTrue(lout.isDisplayed());
		return true;
	}
	
	public AddEmpPage clickOnAddEmp(){
		pim=driver.findElement(By.linkText("PIM"));
		addemp=driver.findElement(By.linkText("Add Employee"));
		uti.moveToElement(pim);
		addemp.click();
		return new AddEmpPage();
	}
	
	
	public LoginPage logOutOfPage(){
		lout.click();
		return new LoginPage();
	}
	

}
