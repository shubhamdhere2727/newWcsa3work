package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaptopPrice {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//button[.='✕']")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("q")).sendKeys("Samsung f22");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
	Thread.sleep(3000);
	//String a = driver.findElement(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
	//System.out.println(a);
	
	}

}
