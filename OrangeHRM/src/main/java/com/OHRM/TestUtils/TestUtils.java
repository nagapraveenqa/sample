package com.OHRM.TestUtils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.OHRM.TestBase.TestBase;

public class TestUtils extends TestBase {
	
	
	Actions act;
	
	public void moveToElement(WebElement e){
		act=new Actions(driver);
		act.moveToElement(e).build().perform();
	}

}
