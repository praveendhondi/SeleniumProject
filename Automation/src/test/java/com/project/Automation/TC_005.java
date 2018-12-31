package com.project.Automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class TC_005 extends BasePage
{
	public static final Logger log=Logger.getLogger(TC_005.class.getName());
	
  @Test
  public void f() throws Exception 
  {
	  OpenBrowser("chromebrowser");
	  log.info("Opened the Browser -" + prop.getProperty("chromebrowser"));
	  Reporter.log("Opened the Browser -" + prop.getProperty("chromebrowser"));
	  
	  navigate("amazonurl");
	  log.info("Opened the URl - :" + prop.getProperty("amazonurl") );
	  Reporter.log("Opened the URl - :" + prop.getProperty("amazonurl"));
	  
	  type("amazonsearchtext_id","sony");
	  log.info("Entered the text :- " + " sony " + "with using locator :- " + prop.getProperty("amazonsearchtext_id"));
	  Reporter.log("Entered the text :- " + " sony " + "with using locator :- " + prop.getProperty("amazonsearchtext_id"));
	  
	  click("amazonsearchbutton_xpath");
	  log.info("CLicked on Amazon Search Button  with using locator :-" + prop.getProperty("amazonsearchbutton_xpath") );
	  Reporter.log("CLicked on Amazon Search Button  with using locator :-" + prop.getProperty("amazonsearchbutton_xpath"));
  }
 

}
