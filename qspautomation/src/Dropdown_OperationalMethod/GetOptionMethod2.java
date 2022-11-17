package Dropdown_OperationalMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionMethod2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("file:///C:/Users/admin/Desktop/Selenium/multiselectdropdown.html");
	   WebElement multiselected = driver.findElement(By.id("menu"));
	   Select sel = new Select(multiselected);
	  List<WebElement> allopts = sel.getOptions();
	  for(WebElement op:allopts)
	  {
		 String text = op.getText();
		 System.out.println(text);
	  }
	   
	}
}
