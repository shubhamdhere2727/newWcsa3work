package MethodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/Selenium/flipkartlink.html");
		WebElement flip = driver.findElement(By.id("flipkartLink"));
		flip.click();
	}
}
