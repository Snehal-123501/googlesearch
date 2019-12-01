//As end user I should able to search any text from www.Google.com page.

package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;    //hover on WebDriver
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;   //hover on ChromeDriver

public class googleSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sagar\\OneDrive\\Desktop\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	//invoke chrome drivers
		driver.get("https://www.google.com");   //open google page
		Thread.sleep(5000);
		WebElement searchBox=driver.findElement(By.name("q"));   //find web element so return 
		searchBox.sendKeys("Selenium"); //to enter text to web element
		searchBox.sendKeys(Keys.TAB);
		WebElement cl=driver.findElement(By.name("btnk"));
		cl.click();
	}

}
