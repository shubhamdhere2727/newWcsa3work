//Screenshot Using EventFiringWebDriver
package TakeScreenShoot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class Way4 {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	EventFiringWebDriver efw=new EventFiringWebDriver(driver);
	driver.manage().window().maximize();
	driver.get("https:www.instagram.com");
	File src = efw.getScreenshotAs(OutputType.FILE);
	File dest = new File("./ScreenShoots/12345.png");
	Files.copy(src,dest);
}
}
