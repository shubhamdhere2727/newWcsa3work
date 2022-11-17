package MethodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTagnameMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:www.facebook.com");
		WebElement loginbutton = driver.findElement(By.name("login"));
		 String tagname = loginbutton.getTagName();
		 System.out.println(tagname);
	}

}
