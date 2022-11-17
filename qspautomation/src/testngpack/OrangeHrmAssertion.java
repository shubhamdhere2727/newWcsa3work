package testngpack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OrangeHrmAssertion {
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@Test
	public void OrangeHRMTest()
	{
		String loginPageTitle = driver.getTitle();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(loginPageTitle, "OrangeHRM");
		
		
		
	}
	
}

