package org.learn;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotExamples {

	public static void main(String[] args)throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\eclipse-workspace\\DayOne\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://letcode.in/table");
/*TakesScreenshot screenshot=(TakesScreenshot) driver;
File soruce=screenshot.getScreenshotAs(OutputType.FILE);
File destfile=new File("D://sample.png");
FileHandler.copy(soruce, destfile);*/
Robot robot =new Robot();
java.awt.Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
Rectangle rectangle=new Rectangle(screensize);
BufferedImage soruce=robot.createScreenCapture(rectangle);
File destfile =new File("D://robotsnap.png");
ImageIO.write(soruce, "png", destfile);

	}

}
