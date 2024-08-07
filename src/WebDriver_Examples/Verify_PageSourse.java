package WebDriver_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_PageSourse {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("https://apps17.sutisoft.com/");
		String pagesource=driver.getPageSource();
		System.out.println(pagesource);
		Thread.sleep(2000);
		driver.close();

	}

}
