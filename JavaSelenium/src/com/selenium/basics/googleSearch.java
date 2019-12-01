//As end user I should able to search any text from www.Google.com page.

package com.selenium.basics;

import org.openqa.selenium.WebDriver;    //hover on WebDriver
import org.openqa.selenium.chrome.ChromeDriver;   //hover on ChromeDriver

public class googleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sagar\\OneDrive\\Desktop\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	//invoke chrome drivers
		driver.get("https://www.google.com");   //open google page
	}

}
