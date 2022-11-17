package testngpack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterise {
  WebDriver driver;
  
	@Test
	@Parameters("browser")
  public void youtube(String browservalue)
	{
		if (browservalue.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get("https://www.youtube.com");
			driver.switchTo().activeElement().sendKeys("abpmaza");
		}
		else if (browservalue.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.get("https://www.youtube.com");
			driver.switchTo().activeElement().sendKeys("sp boys kolhapur");
		}
  }
}
