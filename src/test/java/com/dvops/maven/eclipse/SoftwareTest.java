package com.dvops.maven.eclipse;
import org.openqa.selenium.By;
import java.util.List;
//import necessary Selenium WebDriver classes
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class SoftwareTest {
  //declare Selenium WebDriver
  private WebDriver webDriver;		
  
  @Test
  public void checkWebpageTitle() {
	  webDriver.navigate().to("http://localhost:8080/HelloWorldJava/UserServlet/dashboard");
	  Assert.assertEquals(webDriver.getTitle(), "Change this to correct value");
  }
  
  @BeforeTest
  public void beforeTest() {
	  //Setting system properties of ChromeDriver
	  //to amend directory path base on your local file path
	  
	  String chromeDriverDir = "C:\\Users\\Steven Leow\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe";

	  System.setProperty("webdriver.chrome.driver", chromeDriverDir);

	  //initialize FirefoxDriver at the start of test
	  webDriver = new ChromeDriver();  
  }

  @AfterTest
  public void afterTest() {
	  //Quit the ChromeDriver and close all associated window at the end of test
	  webDriver.close();			
  }

}