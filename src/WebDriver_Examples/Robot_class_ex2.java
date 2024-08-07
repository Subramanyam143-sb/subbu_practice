package WebDriver_Examples;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.chromeDriver;

public class Robot_class_ex2 {

	public static void main(String[] args) throws  Exception{
		WebDriver driver=new ChromeDriver();
		driver.get("https://apps17.sutisoft.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("rajeshv@sutisoft.in");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[@id=\"userpassword\"]")).sendKeys("test@1234");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn login-btn']")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.close();
		
	}
}