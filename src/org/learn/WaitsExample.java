package org.learn;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitsExample {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kumar\\eclipse-workspace\\DayOne\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.navigate().to("https://www.facebook.com/");
WebElement mailbox=driver.findElement(By.id("email"));
mailbox.sendKeys("kumaresh818@gmail.com");
WebElement password=driver.findElement(By.id("pass"));
password.sendKeys("Agamagizh18#");
WebElement login=driver.findElement(By.name("login"));
login.click();
Thread.sleep(3000);
WebElement profile=driver.findElement(By.xpath("//*[@id=\'mount_0_0_p5\']/div[1]/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]/div/svg/g/image"));
profile.click(); 


	}

}
