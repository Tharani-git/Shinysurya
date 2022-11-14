package Demo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class Extentreportexample {
	
	static ExtentTest test;
	static ExtentReports report;
		@BeforeClass
		public void startTest()
		{
			System.out.println("tara");
		report = new ExtentReports("D:\\Q-Tree\\Notes\\Automation\\Driver\\ExtentReportResults.html",true);
		test = report.startTest("ExtentDemo");
		System.out.println("tara2");
		}
		@Test
		public void extentReportsDemo()
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Q-Tree\\Notes\\Automation\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		if(driver.getTitle().equals("Google"))
		{
		test.log(LogStatus.PASS, "Navigated to the specified URL");
		}
		else
		{
		test.log(LogStatus.FAIL, "Test Failed");
		}
		}
		@AfterClass
		public void endTest()
		{
		report.endTest(test);
		report.flush();
		}
		}
