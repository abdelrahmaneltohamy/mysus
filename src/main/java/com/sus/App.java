package com.sus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ResourceBundle;

/**
 * Hello world!
 *
 */
public class App 
{
    static Logger logger = LogManager.getLogger(App.class);
    //LogManager.getLogger()
    public static void main( String[] args )
    {
        ResourceBundle resourceBundle=ResourceBundle.getBundle("Profile");
        String user=resourceBundle.getString("profileNameRes");
        System.out.println( "Hello World!");
 //       BasicConfigurator.configure();
        logger.info("This is info "+user );
        logger.error("this is error "+ user);
        logger.warn("this is warning "+ user);
        logger.fatal("this is fatal "+ user);
        System.out.println( "completed" );
    }

}
