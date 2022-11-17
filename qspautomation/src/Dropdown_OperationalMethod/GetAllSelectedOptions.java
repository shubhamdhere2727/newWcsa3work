package Dropdown_OperationalMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("file:///C:/Users/admin/Desktop/Selenium/multiselectdropdown.html");
   WebElement multiselected = driver.findElement(By.id("menu"));
   
  Select sal = new Select(multiselected);
   for(int i=2;i<=6;i++)
   {
	   sal.selectByIndex(i);
   }
   
  List<WebElement> allselectedOps = sal.getAllSelectedOptions();
  
  for(WebElement op:allselectedOps)
  {
	  String text = op.getText();
	  System.out.println(text);
  }
}
}
