package org.learn;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\eclipse-workspace\\DayOne\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://letcode.in/table");
driver.manage().window().maximize();
WebElement table=driver.findElement(By.id("simpletable"));
List<WebElement>allheaders=table.findElements(By.tagName("th"));
for (WebElement header : allheaders) {
	String text=header.getText();
	System.out.println(text);
}
List<WebElement>allrows=table.findElements(By.cssSelector("tbody tr"));
int size=allrows.size();
System.out.println(size);
/*for (WebElement rows : allrows) {
	List<WebElement>columns=rows.findElements(By.tagName("td"));
	WebElement firstcolumn=columns.get(0);
	String text=firstcolumn.getText();
	System.out.println(text);
}*/
for (int i = 0; i < size; i++) {
List <WebElement> rows=allrows.get(i).findElements(By.tagName("td"));
WebElement lastname=rows.get(1);
String data=lastname.getText();
if (data.equalsIgnoreCase("raj")) {
	WebElement input=rows.get(3).findElement(By.tagName("input"));
	input.click();
	break; 
	
	
}
	

}
}

	}
	


