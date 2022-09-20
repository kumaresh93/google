package org.learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\eclipse-workspace\\DayOne\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("http://www.leafground.com/pages/checkbox.html");
driver.manage().window().maximize();


WebElement java =driver.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/input[1]"));
java.click();

WebElement selenium=driver.findElement(By.xpath("//*[@id=\"'contentblock\']/section/div[2]/input"));
boolean status=selenium.isSelected();
System.out.println(status);

WebElement notselected= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/input[1]"));

	//notselected.click();

WebElement iamselected=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[2]"));

iamselected.click(); 
   
	


}
}
