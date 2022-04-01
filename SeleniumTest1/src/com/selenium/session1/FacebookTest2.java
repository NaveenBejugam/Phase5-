package com.selenium.session1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest2 {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.facebook.com/");
        
        WebElement email= driver.findElement(By.id("email"));
        WebElement pass= driver.findElement(By.id("pass"));
        
        email.sendKeys("naveenbejugam1999@gmail.com");
        pass.sendKeys("Naveen@1359");
        
        WebElement login= driver.findElement(By.name("login"));
        login.submit();
        //driver.close();
    }
}
