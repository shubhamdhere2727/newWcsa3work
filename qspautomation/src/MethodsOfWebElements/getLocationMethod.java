package MethodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocationMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:www.facebook.com");
		WebElement loginbutton = driver.findElement(By.name("login"));
		Point point = loginbutton.getLocation();
		int Xaxis = point.getX();
		int Yaxis = point.getY();
		System.out.println("the placement of login button is as follow");
		System.out.println("x axis distance: "+Xaxis);
		System.out.println("y axis distance: "+Yaxis);
	}
}

