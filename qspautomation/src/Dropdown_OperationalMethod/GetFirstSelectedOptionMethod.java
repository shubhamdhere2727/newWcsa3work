package Dropdown_OperationalMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("file:///C:/Users/admin/Desktop/Selenium/multiselectdropdown.html");
	   WebElement multiselected = driver.findElement(By.id("menu"));
	   Select sel = new Select(multiselected);
	   
	   for(int i=2;i<=6;i++)
	   {
		sel.selectByIndex(i);   
       }
	   WebElement op = sel.getFirstSelectedOption();
	   String textoffirstselected = op.getText();
	   System.out.println(textoffirstselected);
	   }
}
