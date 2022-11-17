package WebBasePopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notificationpopup2 {
public static void main(String[] args) {
	ChromeOptions co = new ChromeOptions();
	co.addArguments("--start-maximized");
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver(co);
	driver.get("https://www.bluestone.com");
}
}
