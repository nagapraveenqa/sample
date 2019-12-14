package com.OHRM.Bd1.TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.OHRM.Pages.HomePage;
import com.OHRM.Pages.LoginPage;
import com.OHRM.TestBase.TestBase;
import com.OHRM.TestUtils.XLUtils;

public class TC1_Login extends TestBase {

	public TC1_Login() {
		super();
	}

	LoginPage log;
	HomePage home;
	TestBase test;
	XLUtils xl;

	@BeforeClass
	public void launchBrowser() {
		log = new LoginPage();
		home = new HomePage();
		xl=new XLUtils();

		log.browserIntialization();
		Assert.assertEquals(log.getLogPageTitle(), "OrangeHRM - New Level of HR Management");
		log.verifyelements();
		log.logInToPage();
	}

	@Test(priority = 1)
	public void validateLogin() {
		Assert.assertEquals(home.getHomePageTitle(), "OrangeHRM");
	}

	@Test(priority = 2)
	public void validateUserLogin() {
		Assert.assertEquals(home.getUser(), "Welcome " + prop.getProperty("username"), "User Validated");
	}

	@Test(priority = 3)
	public void verifyHomeElements() {
		Assert.assertTrue(home.verifyElePresent());
		System.out.println("Col count : "+XLUtils.colCountFromExcel(prop.getProperty("empxl"), "cred"));
		System.out.println("Row count : "+XLUtils.rowCountFromExcel(prop.getProperty("empxl"), "cred"));
		
		driver.switchTo().frame("rightMenu");
		String[] l1 = null;
		String[] l2 = null;
		for(int i=1;i<driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr/td[2]")).size();i++){
			xl.writeDataInToExcel(prop.getProperty("empxl"), "Sheet3", i,driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[2]")).getText() );
			System.out.println(driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[2]")).getText());
			/*l1[i]=driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[2]")).getText();
		l2[i]=(driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[3]")).getText());*/
		}
		System.out.println(l1);
		
		
	}

	/*@AfterClass
	public void tearDown() {
		home.logOutOfPage();
		Assert.assertEquals(log.getLogPageTitle(), "OrangeHRM - New Level of HR Management", "Succesfully LogedOut");
		log.closBrow();
	}*/
}
