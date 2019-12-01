package com.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmailSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sagar\\OneDrive\\Desktop\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	//invoke chrome drivers
		driver.get("https://www.gmail.com");   //open google page
		
		WebElement searchValue=driver.findElement(By.id("identifierId"));  //userid
		searchValue.sendKeys("katte.snehal32@gmail.com");
		
		WebElement sv=driver.findElement(By.id("identifierNext"));      //next uid
		sv.click();
		Thread.sleep(3000);
		
		WebElement sv2=driver.findElement(By.name("password"));    //pwd
		sv2.sendKeys("snehal123");
		
		WebElement sv3=driver.findElement(By.id("passwordNext"));   //next pwd
		sv3.click();
		Thread.sleep(3000);
		
		Thread.sleep(6000);
		driver.close();
		driver.quit();
		

	}

}
