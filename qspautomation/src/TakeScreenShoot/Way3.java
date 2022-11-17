//Screenshot using RemoteWebDriver
package TakeScreenShoot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Way3 {

public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	RemoteWebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https:www.instagram.com");
	File src = driver.getScreenshotAs(OutputType.FILE);
	File dest = new File("./ScreenShoots/1234.png");
	Files.copy(src,dest);
	
}
}
