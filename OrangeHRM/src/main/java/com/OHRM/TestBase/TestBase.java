package com.OHRM.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.qa.lib.TakeScreenshot;
import com.qa.lib.WebElementListener; 

	public class TestBase {
	
		public static Properties prop;
		public static WebDriver driver;
		public static Logger logger;
		public static ExtentTest logger1;
		public static ExtentHtmlReporter htmlReporter;
		public static ExtentReports extent;
		public static EventFiringWebDriver e_driver;
		
		
	
		
		
		public TestBase() {
			try {
				FileInputStream fi = new FileInputStream("E:\\praveen\\OrangeHRM\\src\\main\\java\\com\\OHRM\\Config\\config.properties");
				prop = new Properties();
				prop.load(fi);
				
				logger=Logger.getLogger("First-Cry");
				PropertyConfigurator.configure(".\\src\\main\\java\\com\\qa\\Config\\log4j.properties");
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
		@BeforeSuite

		public void ReportSetup() throws IOException 
		{
			htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/STMExtentReport1.html");
			extent = new ExtentReports ();
			extent.attachReporter(htmlReporter);
			extent.setSystemInfo("Application Name", "First Cry");
			extent.setSystemInfo("User Name", "Ankur Jain");
			extent.setSystemInfo("Envirnoment", "Production");

			htmlReporter.config().setDocumentTitle("First-Cry Automation Testing Report");
			htmlReporter.config().setReportName("First Cry Automation Testing");
			htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
			htmlReporter.config().setTheme(Theme.STANDARD);	
		}
		
		
		public static WebDriver intialization() {
			String browser = prop.getProperty("brow");
	
			switch (browser) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "E:\\praveen\\OrangeHRM\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				break;
	
			case "firefox":
				System.setProperty("webdriver.chrome.driver", "");
				driver = new ChromeDriver();
				break;
	
			case "ie":
				System.setProperty("webdriver.chrome.driver", "");
				driver = new ChromeDriver();
				break;
	
			default:
				System.out.println("Invalid browser!!!!!!!!!!!");
			}
	
			e_driver = new EventFiringWebDriver(driver);
			// Now create object of EventListerHandler to register it with EventFiringWebDriver
			/*eventListener = new WebElementListener();
			e_driver.register(eventListener);*/
			driver = e_driver;
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
			driver.get(prop.getProperty("url"));
			return driver;
		}
	
		@AfterMethod
		public void getResult(ITestResult result) throws Exception
		{
			if(result.getStatus() == ITestResult.FAILURE)
			{
				//MarkupHelper is used to display the output in different colors
				logger1.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
				logger1.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));

				//To capture screenshot path and store the path of the screenshot in the string "screenshotPath"
				//We do pass the path captured by this mehtod in to the extent reports using "logger.addScreenCapture" method. 

				//	String Scrnshot=TakeScreenshot.captuerScreenshot(driver,"TestCaseFailed");
				String screenshotPath = TakeScreenshot.captuerScreenshot(driver, result.getName());
				//To add it in the extent report 

				logger1.fail("Test Case Failed Snapshot is below " + logger1.addScreenCaptureFromPath(screenshotPath));


			}
			else if(result.getStatus() == ITestResult.SKIP){
				//logger.log(Status.SKIP, "Test Case Skipped is "+result.getName());
				logger1.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE)); 
			} 
			else if(result.getStatus() == ITestResult.SUCCESS)
			{
				logger1.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
			}

		}
		@AfterTest

		public void Exit() {

			driver.quit();
		}


		@AfterSuite
		public void endReport()
		{
			extent.flush();
		}


	}
