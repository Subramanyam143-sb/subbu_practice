package WebDriver_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Example {

	public static void main(String[] args) throws Exception {
		String month="AUGUST 2022";
		WebDriver driver=new ChromeDriver();
		driver.get("https://apps17.sutisoft.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("rajeshv@sutisoft.in");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"userpassword\"]")).sendKeys("test@1234");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"content_container\"]/div/div[1]/div[3]/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"fromDate\"]")).click();
		while(true) {
			String text=driver.findElement(By.xpath("/html/body/div[8]/div[1]/table/thead/tr[1]/th[2]")).getText();
			if(text.matches(month)) {
				break;
			}
			else {
				driver.findElement(By.xpath("/html/body/div[8]/div[1]/table/thead/tr[1]/th[1]")).click();
				driver.findElement(By.xpath("/html/body/div[8]/div[1]/table/thead/tr[1]/th[2]")).getText();
				
				
			}
		}
		driver.findElement(By.xpath("/html/body/div[8]/div[1]/table/tbody/tr[3]/td[3]")).click();
		
	}

}
