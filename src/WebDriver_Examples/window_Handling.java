package WebDriver_Examples;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_Handling {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://apps17.sutisoft.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("rajeshv@sutisoft.in");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"userpassword\"]")).sendKeys("test@1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"_helpid\"]/li[7]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"_helpid\"]/li[7]/ul/li[1]/a")).click();
		Set<String> window=driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//*[@id=\"_menu_creports.reports\"]/a")).click();
		driver.close();

	}

}
