package Dropdown_MultiSelect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselectByIndexMethod {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/admin/Desktop/Selenium/multiselectdropdown.html");
	WebElement multiselected= driver.findElement(By.id("menu"));
	Select sel = new Select(multiselected);
	sel.selectByIndex(4);
	Thread.sleep(2000);
	sel.deselectByIndex(4);
	}

	
		

}
