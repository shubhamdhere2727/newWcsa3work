package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LInkTextLocator {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/admin/Desktop/Selenium/flipkartlink.html");
	driver.findElement(By.linkText("click here to launch flipkart")).click();
driver.findElement(By.xpath("//button[.='✕']")).click();
	driver.findElement(By.linkText("Cart")).click();
}
}
