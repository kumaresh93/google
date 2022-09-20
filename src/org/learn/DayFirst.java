package org.learn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayFirst {

 public static void main(String[] args) {
	
	 System.setProperty("webdriver.chrome.driver",
			 "C:\\Users\\kumar\\eclipse-workspace\\DayOne\\driver\\chromedriver.exe");
	 WebDriver d = new ChromeDriver();
	 d.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	 d.get("https://www.facebook.com/");
	 d.manage().window().maximize();
	 d.findElement(By.id("email")).sendKeys("kumaresh818@gmail.com");
	 d.findElement(By.id("pass")).sendKeys("Agamagizh18#");
	 d.findElement(By.name("login")).click();
     d.findElement(By.xpath("//*[@id=\'mount_0_0_M7\']/div/div[1]/div/div[2]/div[4]/div[1]/span/div")).click();
     
	 
		 
	 //System.out.println("done");
	 
}
}
