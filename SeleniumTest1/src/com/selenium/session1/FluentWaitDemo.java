package com.selenium.session1;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitDemo {

	public static void main(String[] args) {
		// set the driver property
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		
		WebElement ele= driver.findElement(By.xpath("//*[@id=\"post-body-5280210221385817166\"]/div[1]/button"));
		ele.click();
		
		FluentWait<WebDriver> wait=  new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(30))
                .ignoring(NoSuchElementException.class);
		
		WebElement div=wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver t) {
				WebElement e=driver.findElement(By.xpath("//*[@id=\"demo\"]"));
				if(e.getText().equals("Software Testing Material - DEMO PAGE"))
				{
					System.out.println(e.getText());
					return e;
				}
				else
				{
					System.out.println("Not found");
					return null;
				}
			}
		});
	}
}
