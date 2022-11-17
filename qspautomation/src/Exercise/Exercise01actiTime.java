package Exercise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exercise01actiTime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do;jsessionid=2ekaf1o9sibh6.");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
        WebElement target = driver.findElement(By.xpath("//div[.='Tasks']"));
        Actions act = new Actions(driver);
        act.doubleClick(target).perform();
       driver.findElement(By.xpath("//a[.='Projects & Customers']")).click();
        driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
        driver.findElement(By.name("name")).sendKeys("HDFC_BANK");
        driver.findElement(By.name("createCustomerSubmit")).click();
        driver.findElement(By.xpath("//input[@value='Create New Project']")).click();
        
        
        
        
        
        Thread.sleep(6000);
        driver.close();
	}
}