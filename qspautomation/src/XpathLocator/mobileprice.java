package XpathLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mobileprice {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http:www.amazon.in");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watch");
	driver.findElement(By.id("nav-search-submit-button")).click();
	driver.findElement(By.xpath("//li[@id='p_89/Casio']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Over ₹20,000']")).click();
	WebElement price = driver.findElement(By.xpath("//span[@id='productTitle']/ancestor::div[@id='centerCol']/descendant::span[@class='a-price-whole']"));
	System.out.println(price);
	
	
	
	

	
	driver.close();
}
}
