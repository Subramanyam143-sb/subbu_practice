package WebDriver_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.chromeDriver;

public class Login_Examples {

	public static void main(String[] args) throws InterruptedException{
		//System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedge.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://apps17.sutisoft.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id=\"userpassword\"]")).sendKeys("test@1234");
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		//driver.close();

	}

}
