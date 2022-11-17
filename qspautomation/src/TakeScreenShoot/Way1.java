//Screenshot using explicit type casting
package TakeScreenShoot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Way1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/login/");
		RemoteWebDriver rwd=(RemoteWebDriver)driver;
	    File src = rwd.getScreenshotAs(OutputType.FILE);
	    File dest = new File("./ScreenShoots/123.jpg");
	    Files.copy(src, dest);
	    Thread.sleep(3000);
	    driver.close();
	
	
	
	
	
	}
}
