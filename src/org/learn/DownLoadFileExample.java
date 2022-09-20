package org.learn;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownLoadFileExample {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\eclipse-workspace\\DayOne\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.leafground.com/pages/download.html");
WebElement link =driver.findElement(By.linkText("Download Text"));
link.click();

//File files=new File("C:\\Users\\kumar\\Downloads");   

//File[] totalfiles=files.listFiles();
//for (File file : totalfiles) {
	//if(file.getName().equals(""));
	//System.out.println("the file is downloaded");
	//break;
}
	}


