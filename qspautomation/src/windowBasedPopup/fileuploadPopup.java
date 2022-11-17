package windowBasedPopup;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fileuploadPopup {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("http://127.0.0.1/login.do");
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='content administration']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
	driver.findElement(By.id("uploadNewLogoOption")).click();
	WebElement target = driver.findElement(By.xpath("//input[@name='formCustomInterfaceLogo.logo']"));
	Thread.sleep(2000);
	 Actions act = new Actions(driver);
     act.doubleClick(target).perform();
     
     File file = new File("./autoscript/Upload1.exe");
     String abspath = file.getAbsolutePath();
     Runtime.getRuntime().exec(abspath);
     Thread.sleep(2000);
     
}
}
