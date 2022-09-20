package org.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndGetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\eclipse-workspace\\DayOne\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.leafground.com/pages/Edit.html");
WebElement webhead=driver.findElement(By.className("wp-heading"));
String text=webhead.getText();
System.out.println(text);
WebElement attribute=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
String att=attribute.getAttribute("value");
System.out.println(att);
	}

}
