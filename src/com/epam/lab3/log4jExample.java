package com.epam.lab3;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger; //!!
import org.apache.log4j.PropertyConfigurator;

public class log4jExample {

	 static Logger logger = Logger.getLogger(log4jExample.class.getName());
	   
	   public static void main(String[] args)throws IOException,SQLException{
	        logger.debug("Sample debug message");
			logger.info("Sample info message");
			logger.warn("Sample warn message");
			logger.error("Sample error message");
			logger.fatal("Sample fatal message");
			
//			  try {
//		            // Generate exception
//		            throw new Exception("Generating exception to test Log4j mail notification...");
//		        } catch (Exception ex) {
//		            logger.error("Test Result : ", ex);
//		        }
	      
	   }

}
