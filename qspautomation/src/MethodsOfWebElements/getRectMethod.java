package MethodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRectMethod {
           public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https:www.facebook.com");
			WebElement loginbutton = driver.findElement(By.name("login"));
			 Rectangle rect = loginbutton.getRect();
			 System.out.println("width"+ rect.getWidth());
			 System.out.println("height"+ rect.getHeight());
			 System.out.println("xaxis"+ rect.getX());
			 System.out.println("yaxis"+ rect.getY());
	}

}
