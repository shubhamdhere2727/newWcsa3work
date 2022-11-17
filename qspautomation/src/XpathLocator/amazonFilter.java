package XpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonFilter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).sendKeys("Watches for men");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base' and .='Fastrack']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base' and .='₹2,000 - ₹5,000']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='a-size-base a-color-base' and .='Top Brands']")).click();
}
}
