package org.learn;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertexample {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\eclipse-workspace\\DayOne\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("http://www.leafground.com/pages/Alert.html");
WebElement alertbox =driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/button"));
alertbox.click();
//Alert alert=driver.switchTo().alert();
//alert.accept();
//WebElement confirmbox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div"));
//confirmbox.click();
//Alert confirmalert=driver.switchTo().alert();
//confirmalert.dismiss();
WebElement promptbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
promptbox.click();
Alert promptalert=driver.switchTo().alert();
promptalert.sendKeys("kumaresh");
Thread.sleep(3000);
promptalert.accept();

	}

}
