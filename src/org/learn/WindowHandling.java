package org.learn;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\eclipse-workspace\\DayOne\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.leafground.com/pages/Window.html");
WebElement firstbutton=driver.findElement(By.id("home"));
String oldwindow=driver.getWindowHandle();
firstbutton.click();

Set<String> newwindow=driver.getWindowHandles();
for (String string : newwindow) {
	driver.switchTo().window(string);
}
WebElement editbutton =driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/img"));
editbutton.click();
driver.close();
driver.switchTo().window(oldwindow);
WebElement secondbutton=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
secondbutton.click();
int nofwindows=driver.getWindowHandles().size();
System.out.println(nofwindows);
WebElement thirdbutton=driver.findElement(By.id("color"));
thirdbutton.click();
Set<String> newwindowhandles=driver.getWindowHandles();
for (String allwindows : newwindowhandles) {
	if (!allwindows.equals(oldwindow)) {
		driver.switchTo().window(allwindows);
		driver.close();
		//driver.quit();
	}
}







}}
