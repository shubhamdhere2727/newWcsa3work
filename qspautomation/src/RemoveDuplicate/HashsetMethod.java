package RemoveDuplicate;

import java.util.HashSet;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HashsetMethod {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/admin/Desktop/Selenium/multiselectdropdown.html");
	WebElement multiselectdd = driver.findElement(By.id("menu"));
	Select sel = new Select(multiselectdd);
	List<WebElement> ops = sel.getOptions();
    HashSet<String>s=new HashSet<String>();
    for(int i=0;i<ops.size();i++)
    {
    	String text = ops.get(i).getText();
    	s.add(text);
    }
    	System.out.println(s);
    }

	
} 


