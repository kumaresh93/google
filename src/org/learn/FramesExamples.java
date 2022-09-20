package org.learn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\eclipse-workspace\\DayOne\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.leafground.com/pages/frame.html");
driver.switchTo().frame(0);
WebElement frame0=driver.findElement(By.xpath("/html/body"));
WebElement firstbutton=driver.findElement(By.id("Click"));
firstbutton.click();

String text=driver.findElement(By.id("Click")).getText();
System.out.println(text);
String attribute=driver.findElement(By.id("Click")).getAttribute("change)");
System.out.println(attribute);
driver.switchTo().defaultContent();
driver.switchTo().frame(1);
driver.switchTo().frame("frame2");
WebElement secondbutton=driver.findElement(By.id("Click1"));
secondbutton.click();
driver.switchTo().defaultContent();
List<WebElement>size=driver.findElements(By.tagName("iframe"));
int sizes=size.size();
System.out.println(sizes);



	}

} 
