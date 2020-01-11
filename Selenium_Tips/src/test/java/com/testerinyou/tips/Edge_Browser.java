package com.testerinyou.tips;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class Edge_Browser {
	public WebDriver driver;
  @Test
  public void testEdge_Browser() {
	 driver.get("https://selenium.dev/");
	 driver.findElement(By.linkText("Downloads")).click();
  }
  
  @BeforeClass
  public void beforeClass() {
	  //this is for edge versions less than 18
//	  System.setProperty("webdriver.edge.driver", "Path of your exe file");
	  driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
	  
  }

}
