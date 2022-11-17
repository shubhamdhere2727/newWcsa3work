package MethodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributeMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:www.google.com");
       WebElement searchBox = driver.findElement(By.name("q"));
     String attvalue = searchBox.getAttribute("title");
       System.out.println(attvalue);
	}

}
