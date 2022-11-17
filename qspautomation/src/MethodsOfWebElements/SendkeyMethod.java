package MethodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeyMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/Selenium/usernametextbox.html");
		WebElement uname = driver.findElement(By.id("i1"));
		uname.sendKeys("akshayangre1111");
		
	}

}
