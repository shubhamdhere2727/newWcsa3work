package AssignPack;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_assign05 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://www.flipkart.com/");
       driver.findElement(By.xpath("//button[.='✕']")).click();
       driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone14");
       driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
       driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
       String parentHandle = driver.getWindowHandle();
       Set<String> allHandles = driver.getWindowHandles();
       for(String handle:allHandles)
       {
    	   if(!parentHandle.equals(handle))
    	   {
    		   driver.switchTo().window(handle);
    	   }
       }
     driver.findElement(By.xpath("(//div[@class='_2C41yO'])[5]")).click();
     driver.findElement(By.xpath("//a[.='512 GB']")).click();
     driver.findElement(By.id("pincodeInputId")).sendKeys("411033");
       driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
       driver.findElement(By.xpath("(//span[.='Add 3 Items to Cart'])[2]")).click();
       Thread.sleep(3000);
      driver.findElement(By.xpath("(//div[.='Remove'])[1]")).click();
    
	}

}
