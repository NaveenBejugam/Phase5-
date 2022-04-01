package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Test {
	

	public void register() {

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");

		driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:email\\:\\:content")).sendKeys("bejugamnaveen1999@gmail.com");
		driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:password\\:\\:content")).sendKeys("Naveen@1750");
		driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:retypePassword\\:\\:content")).sendKeys("Naveen@1750");

		Select country = new Select(driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:country\\:\\:content")));
		country.selectByVisibleText("India");
		driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:firstName\\:\\:content")).sendKeys("Naveen");
		driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:lastName\\:\\:content")).sendKeys("Kumar");
		driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:jobTitle\\:\\:content")).sendKeys("FullStack_developer");

		driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:workPhone\\:\\:content")).sendKeys("1234567890");
		driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:companyName\\:\\:content")).sendKeys("xyz");
		driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:address1\\:\\:content")).sendKeys("Manakondur");
		driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:city\\:\\:content")).sendKeys("Karimnagar");
		Select state = new Select(driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:state\\:\\:content")));
		state.selectByVisibleText("Telangana");
		driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:postalCode\\:\\:content")).sendKeys("505469");

		// click on submit button
		WebElement button = driver.findElement(By.cssSelector("#sView1\\:r1\\:0\\:b1"));
		button.click();
	}
	
	
	public void login() {

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.oracle.com/mysso/signon.jsp");
		
		driver.findElement(By.cssSelector("#sso_username")).sendKeys("bejugamnaveen1999@gmail.com");
		driver.findElement(By.cssSelector("#ssopassword")).sendKeys("Naveen@1750");
		
		WebElement button = driver.findElement(By.cssSelector("#signin_button"));
		button.click();
	}
	public static void main(String[] args) {
		Test obj=new Test();
		obj.register();
		//obj.login();
		
		}
		}
