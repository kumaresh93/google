package org.learn;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\eclipse-workspace\\DayOne\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.leafground.com/pages/selectable.html");
List<WebElement> selectables=driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
int listsize =selectables.size();
System.out.println(listsize);
Actions actions =new Actions(driver);
//actions.keyDown(Keys.CONTROL)
//.click(selectables.get(0))
//.click(selectables.get(1))
//.click(selectables.get(2))
//.build().perform();
actions.clickAndHold(selectables.get(0));
actions.clickAndHold(selectables.get(1));
actions.clickAndHold(selectables.get(2)).build()
.perform();	}

}
