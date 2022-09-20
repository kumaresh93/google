package org.learn;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FlipkartPurchase {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\eclipse-workspace\\DayOne\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://www.flipkart.com/");
driver.manage().window().maximize();
String oldwindow=driver.getWindowHandle();
WebElement mail=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
mail.sendKeys("8940735455");
WebElement pass=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
pass.sendKeys("Agamagizh18#");
WebElement login=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button"));
login.click();
driver.navigate().refresh();
WebElement textbox=driver.findElement(By.xpath("//*[@id=\'container\']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
textbox.sendKeys("spine belt");
Robot robot=new Robot();
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);
JavascriptExecutor js=(JavascriptExecutor)driver;
//driver.manage().timeouts().implicitlyWait(20, TimeUnit.seconds);
//WebElement image=driver.findElement(By.
	///	xpath("//img['@class=_396cs4 _3exPp9']"));
//js.executeScript("arguments[0].scrollIntoView();",image);
driver.navigate().refresh();
WebElement a1=driver.findElement(By.xpath("//img[@class='_396cs4 _3exPp9'][@alt='Emporium lumbar spinal stimulate"
		+ " Corset Sacro belt Various Pain Relief for"
		+ " men & Women Back & Abdomen Support']"));
a1.click();
java.util.Set<String> handles=driver.getWindowHandles();
for (String newwindow : handles) {
	driver.switchTo().window(newwindow);}
WebElement a1size=driver.findElement(By.xpath("//li[@class='_3V2wfe'][@id='swatch-0-size']"));
a1size.click();
Thread.sleep(3000);
WebElement a1add=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
a1add.click();
//driver.switchTo().window(oldwindow);
WebElement searchbox2=driver.findElement(By.xpath("//input[@class='_3704LK']"));
Thread.sleep(3000);
searchbox2.sendKeys("fila tshirt");
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(3000);
WebElement a2=driver.findElement(By.xpath("//*[@class='_30jeq3'][text()='₹674']"));
a2.click();
java.util.Set<String> handle=driver.getWindowHandles();
for (String newwindows : handle) {
	if (newwindows.equals(newwindows)) {
	driver.switchTo().window(newwindows);	
	}}
WebElement a2size=driver.findElement(By.id("swatch-1-size"));
a2size.click();
Thread.sleep(4000);
WebElement adda2=driver.findElement(By.xpath("//*[text()='Add to Cart']"));
adda2.click();
WebElement searchbox=driver.findElement(By.name("q"));
searchbox.sendKeys("phone cases");
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);
Thread.sleep(3000);
WebElement a3=driver.findElement(By.xpath("//a[@class='s1Q9rs'][@title='VAKIBO Back Cover for Realme C3']"));
a3.click();


Set<String> handling=driver.getWindowHandles();
for (String phcasewdw : handling) {

	if (phcasewdw.equals(phcasewdw)) {
		driver.switchTo().window(phcasewdw);	
	}
}
Thread.sleep(4000);
WebElement adda3=driver.findElement(By.xpath("//*[text()='Add to Cart']"));
adda3.click();
WebElement gocart=driver.findElement(By.xpath("//*[text()='GO TO CART']"));
gocart.click();
Thread.sleep(3000);
WebElement placeorder=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL'][text()='Place Order']"));
placeorder.click();

	}}


