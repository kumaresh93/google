package org.learn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\eclipse-workspace\\DayOne\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.leafground.com/pages/autoComplete.html");
WebElement textbox=driver.findElement(By.id("tags"));
textbox.sendKeys("s");
Thread.sleep(4000);
List<WebElement>alltext=driver.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
System.out.println(alltext.size());
for (WebElement webElement : alltext) {
	if (webElement.getText().equals("Web Services")) {
	webElement.click();
	System.out.println("if part");
	break;
	
	}else
		System.out.println("else part");
	
}

	
	
	}

}
