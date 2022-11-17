package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    driver.get("https://demo.guru99.com/test/drag_drop.html");
		    WebElement source = driver.findElement(By.xpath("//a[@class='button button-orange' and .=' BANK ']"));
		    WebElement target = driver.findElement(By.id("bank"));
		    Actions act = new Actions(driver);
		    act.dragAndDrop(source, target).perform();
		    

	}

}
