package com.project.Automation;

import java.util.Date;

import org.testng.annotations.Test;

public class TC_006 
{
  @Test
  public void f() 
  {
	  Date dt=new Date();
	  System.out.println(dt);
	  String str = dt.toString();
	  
	  System.out.println(str.replace(':', '_'));
  }
}
