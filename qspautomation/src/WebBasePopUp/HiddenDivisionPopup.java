package WebBasePopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!582822043916!p!!g!!flipkart%20login&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gclid=EAIaIQobChMIw-ffyoa_-QIVGamWCh2ogQA5EAAYASAAEgL9kPD_BwE");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
	
		
		
	}

}
