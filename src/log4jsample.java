import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class log4jsample {
	/* Get the class name to be printed on */  
	  // static Logger log = Logger.getLogger(log4jsample.class.getName());  
	     static Logger log=LogManager.getLogger(log4jsample.class);
	   public static void main(String[] args)throws IOException,SQLException{ 
		   PropertyConfigurator.configure("C:\\Users\\admin\\eclipse-workspace\\Log4jsample\\src\\log4j2.properties");
			
		   //java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		   System.out.println("\n thara  \n");
//		   System.setProperty("webdriver.chrome.driver",
//			         "D:\\Q-Tree\\Notes\\Second_Syllabus\\Selenium\\Jars\\Driver\\chromedriver.exe");
//			
//			// configure options parameter to Chrome driver
//			WebDriver driver = new ChromeDriver();
//			WebDriverWait wait = new WebDriverWait(driver,30); 
//			      //URL launch
//			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//			      driver.get("https://www.amazon.in/");
	      log.info("Info thhara");  
	      log.error("Checking error");
      log.warn("warning msg");
	      log.fatal("fatal msg");
	      
	      System.out.println("done");
	   }  
}
