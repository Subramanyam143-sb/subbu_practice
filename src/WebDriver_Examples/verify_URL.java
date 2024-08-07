package WebDriver_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verify_URL {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://apps17.sutisoft.com/");
		String Url=driver.getCurrentUrl();
		System.out.println(Url);

	}

}
