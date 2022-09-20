package org.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ImagesExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\kumar\\eclipse-workspace\\DayOne\\driver\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
//String oldwindow=driver.getWindowHandle();
driver.get("http://www.leafground.com/pages/Image.html");
//WebElement firstimage=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
//firstimage.click();
//driver.switchTo().window(oldwindow);
WebElement secondimage=driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
  
if(secondimage.getAttribute("naturalwidth").equals("0")) {
	System.out.println("the image is broken");
}else {
	System.out.println("the image is not broken"); 
}  

	}

}
