package com.simplilearn.testngselenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FacebookTest {
	

	WebDriver driver=null;
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");

		driver= new ChromeDriver();
	}

	@AfterMethod
	public void afterMethod() {
		driver=null;
	}
	
	@Test(groups = "FB")
	public void launchFb() {
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void login() {
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("naveenbejugam1999@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Naveen@123");
		driver.findElement(By.name("login")).submit();
		//driver.close();
		
	}
	
}