import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;






public class Extentreportt {
	 static ExtentTest test;
		static ExtentReports report;
		public static ExtentReports extent;
	   public static void main(String[] args)throws Exception{ 
		   
		   //java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		   System.out.println("\n Extent report sample  \n");
		   System.setProperty("webdriver.chrome.driver",
			         "D:\\Q-Tree\\Notes\\Second_Syllabus\\Selenium\\Jars\\Driver\\chromedriver.exe");
			
			// configure options parameter to Chrome driver
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.co.in");
			extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/STMExtentReport.html", true);
			//report = new ExtentReports (System.getProperty("user.dir") +"/STMExtentReport.html", true);
			   test = report.startTest("Extentreportt");

			
			if(driver.getTitle().equals("Google"))
			{
			test.log(LogStatus.PASS, "Navigated to the specified URL");
			}
			else
			{
			test.log(LogStatus.FAIL, "Test Failed");
			}
			
			String screenshotPath = Extentreportt.getScreenshot(driver, "Thara");
			//To add it in the extent report 
			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
			
			report.endTest(test);
			report.flush();

	   } 
	   public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
			String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
		            //after execution, you could see a folder "FailedTestsScreenshots" under src folder
			String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/"+screenshotName+dateName+".png";
			File finalDestination = new File(destination);
			FileUtils.copyFile(source, finalDestination);
			return destination;
		}
}
