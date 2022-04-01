package com.simplilearn.Project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTest {
	// test case is pass without any assert-by checking the flow
	@Test(priority = 1)
	public void register() {

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.findElement(By.id("ap_customer_name")).sendKeys("Naveen");
		driver.findElement(By.id("ap_phone_number")).sendKeys("9876543210");
		driver.findElement(By.id("ap_email")).sendKeys("NK123@gmail.com");
		driver.findElement(By.id("ap_password")).sendKeys("12345678");
		

//		click on submit button
		WebElement button = driver.findElement(By.id("continue"));
		button.click();

	}

	@Test(priority = 2)
	public void login() {

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.id("ap_email")).sendKeys("BNK@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("12345678");

	}

	@Test(priority = 3)
	public void addToCart() {

		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Wifi Router");
		
		driver.findElement(By.id("nav-search-submit-button")).submit();
		driver.findElement(By.xpath(
				"//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"))
				.click();

//				click on submit button
//				WebElement button = driver.findElement((By.cssSelector("#add-to-cart-button")));
//				button.click();
	}

}