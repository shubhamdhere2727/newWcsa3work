package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    driver.get("https:www.flipkart.com");
		    driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).click();;
		    WebElement target = driver.findElement(By.xpath("//div[contains(@class,'xtXmba') and (.='Fashion')]"));
			   Actions act = new Actions(driver);
			   act.doubleClick(target).perform();
}
}