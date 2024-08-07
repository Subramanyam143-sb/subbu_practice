package WebDriver_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verify_title {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://apps17.sutisoft.com/");
		String title=driver.getTitle();
		System.out.println(title);

	}

}
