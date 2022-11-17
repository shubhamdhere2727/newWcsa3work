package MethodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSizeMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:www.facebook.com");
		WebElement loginbutton = driver.findElement(By.name("login"));
		Dimension size = loginbutton.getSize();
		int height1 = size.getHeight();
		int width1 = size.getWidth();
		System.out.println(height1); 
		System.out.println(width1);
		
	}

}
