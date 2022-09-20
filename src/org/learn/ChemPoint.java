package org.learn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChemPoint {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.chempoint.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement closebutton = driver.findElement(By.xpath("//button[@data-role='closeBtn']"));
		closebutton.click();
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		
		
		WebElement askkey = driver.findElement(By.xpath("(//div[@class='contact-option text-link'])[6]"));
		executor.executeScript("arguments[0].scrollIntoView(true);", closebutton);
		askkey.click();
		
	}

}
