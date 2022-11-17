package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwaitMethod {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get("https:www.amazon.com");
    driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).sendKeys("watches");
    driver.findElement(By.id("nav-search-submit-button")).click();
    driver.findElement(By.xpath("//span[.='Our Brands']")).click();
	}

}
