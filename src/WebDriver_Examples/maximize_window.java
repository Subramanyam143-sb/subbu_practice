package WebDriver_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maximize_window {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://apps17.sutisoft.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();

	}

}
