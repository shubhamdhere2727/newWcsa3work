package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginActiTime 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=169lhnx7o322h");
		driver.findElement(By.name("username")).sendKeys("manager");
		
		driver.findElement(By.name("pwd")).sendKeys("2727");
		driver.findElement(By.id("loginButton")).click();
	}

}
