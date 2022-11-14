package Demo;
import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class log4jsample {
	/* Get the class name to be printed on */  
	  // static Logger log = Logger.getLogger(log4jsample.class.getName());  
	     static Logger log=LogManager.getLogger(log4jsample.class);
	   public static void main(String[] args)throws IOException,SQLException{  
		   System.out.println("\n thara  \n");
	      log.debug("Hello this is a debug message");  
	      log.info("Hello this is an info message");  
	      log.error("Checking error");
	      log.warn("warning msg");
	      log.fatal("fatal msg");
	      
	      System.out.println("done");
	   }  
}
