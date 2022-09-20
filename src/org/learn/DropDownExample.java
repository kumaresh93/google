package org.learn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\eclipse-workspace\\DayOne\\driver\\chromedriver.exe");

WebDriver driver=new  ChromeDriver();
driver.get("http://www.leafground.com/pages/Dropdown.html");
WebElement drop1= driver.findElement(By.id("dropdown1"));
Select select1=new Select(drop1);

select1.selectByIndex(4);
//select1.selectByValue("2");
String value=drop1.getAttribute("value");
//System.out.println(value);
select1.selectByVisibleText("UFT/QTP");
List<WebElement> numofoptions=select1.getOptions();
int size =numofoptions.size();
System.out.println(size);
drop1.sendKeys("selenium");
WebElement multiselect=driver.findElement(By.
		xpath("//*[@id=\'contentblock\']/section/div[6]/select"));

Select dropbox2= new Select(multiselect);
dropbox2.selectByValue("1");
dropbox2.selectByValue("2");
dropbox2.selectByValue("3");




	}
	
	

}
