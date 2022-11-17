package RemoveDuplicate;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Treesetmethod {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/admin/Desktop/Selenium/multiselectdropdown.html");
	WebElement multiselectdd = driver.findElement(By.id("menu"));
	Select sel = new Select(multiselectdd);
	List<WebElement> ops = sel.getOptions();
    TreeSet<String>s=new TreeSet<String>();
    for(int i=0;i<ops.size();i++)
    {
    	String text = ops.get(i).getText();
    	s.add(text);
    }
    for(String text:s)
    {
    	System.out.println(text);
    }

	
} 
}

