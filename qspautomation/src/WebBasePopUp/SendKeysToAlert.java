package WebBasePopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysToAlert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("http:www.omayo.blogspot.com");
	    driver.findElement(By.id("prompt")).click();
	    Alert al = driver.switchTo().alert();
	    Thread.sleep(3000);
	    al.sendKeys("automation");
	    
	    
	    driver.quit();
	}
	
}
