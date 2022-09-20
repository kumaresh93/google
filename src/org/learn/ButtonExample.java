package org.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\kumar\\eclipse-workspace\\DayOne\\driver\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("http://www.leafground.com/pages/Button.html");

//1.find position
WebElement buttonposition=driver.findElement(By.id("position"));

Point xypoint=buttonposition.getLocation();

int xvalue=xypoint.getX();
int yvalue=xypoint.getY();
System.out.println("x valueis:"+ xvalue+"y valueis:"+yvalue);
//2.find color
WebElement buttoncolor=driver.findElement(By.id("color"));
String color=buttoncolor.getCssValue("background-color");
System.out.println("button color is"+color);

//3.find size
WebElement buttonsize=driver.findElement(By.id("size"));
int height=buttonsize.getSize().getHeight();
int width=buttonsize.getSize().getWidth();
System.out.println("button heightis"+height+"button width is"+width);

//4.go to home button
WebElement homebutton=driver.findElement(By.id("home"));
homebutton.click();

	}

}
