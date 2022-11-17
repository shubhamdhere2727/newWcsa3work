package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWaitMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("laptop");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[.='Core i5' and @class='_3879cV']/ancestor::div[@class='_1Y4Vhm _4FO7b6']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and .='Brand']")).click();
		Thread.sleep(8000);
	    driver.findElement(By.xpath("//div[@class='_3879cV' and .='HP']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='_2gmUFU _3V8rao' and .='Operating System']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='_3879cV' and .='Windows 10']")).click();
		Thread.sleep(2000);
		String ans = driver.findElement(By.xpath("//div[@class='_4rR01T' and .='HP 14s Core i5 10th Gen - (8 GB/512 GB SSD/Windows 10 Home) 14s- ER0503TU Thin and Light Laptop']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		System.out.println("Price of 1st laptop::" +ans);
	}

}
