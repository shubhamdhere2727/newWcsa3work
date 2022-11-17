package Dropdown_OperationalMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("file:///C:/Users/admin/Desktop/Selenium/multiselectdropdown.html");
   WebElement multiselected = driver.findElement(By.id("menu"));
   Select sel = new Select(multiselected);
   boolean status = sel.isMultiple();
   System.out.println(status);
}
}
