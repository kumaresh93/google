package org.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {
     
	public static void main(String[] args) {
	
		 System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\kumar\\eclipse-workspace\\DayOne\\driver\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();

driver.get("http://www.leafground.com/pages/Edit.html");

WebElement emailBox=driver.findElement(By.id("email"));
emailBox.sendKeys("kumaresh818@gmail.com");

WebElement appendBox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
appendBox.sendKeys("kumaresh");

WebElement gettextbox=driver.findElement(By.name("username"));
String value  =      gettextbox.getAttribute("value");
	
System.out.println(value);
	
WebElement clearbox= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));	
clearbox.clear();

WebElement disabledbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
boolean enable =disabledbox.isEnabled();
System.out.println(enable);
	}
	
	
	
}
