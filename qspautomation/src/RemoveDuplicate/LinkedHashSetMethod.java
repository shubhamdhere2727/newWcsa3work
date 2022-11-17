package RemoveDuplicate;

import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LinkedHashSetMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/admin/Desktop/Selenium/multiselectdropdown.html");
       WebElement multiselected = driver.findElement(By.name("menu"));
      Select sel = new  Select(multiselected);
      List<WebElement> ops = sel.getOptions();
      LinkedHashSet<String>s=new LinkedHashSet<String>();
      for (int i = 0; i < ops.size(); i++) {
		String TextToInsert = ops.get(i).getText();
		s.add(TextToInsert);
	}
      for (String text:s) {
    	  System.out.println(text);
		
	} 
 }

}
