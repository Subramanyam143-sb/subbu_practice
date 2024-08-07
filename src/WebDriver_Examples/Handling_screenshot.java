package WebDriver_Examples;

//import java.io.File;
//import java.nio.file.Files;

import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_screenshot {

	
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://apps17.sutisoft.com/");
		Thread.sleep(3000);
		TakesScreenshot tss=(TakesScreenshot)driver;
		
		//File src=tss.getScreenshotAs(OutputType.FILE);
		//File dest=new File("C:\\Users\\HP\\Desktop\\my love.pdf");
		//Files.co(src, dest);
	    driver.close();
	}

}
