package com.testing;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



/**
 * Unit test for simple App.
 */
public class GoogleTest {
	
	@Test
	public void testGoogle() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.ca");
		driver.close();
		driver.quit();
		
	}
	
	
}