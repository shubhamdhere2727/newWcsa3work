package KeywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class TestInvalidActitime extends BaseTest {

	public static void main(String[] args) throws IOException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flip = new Flib();
		int rc = flip. getRowCount(EXCEL_PATH,"invalidcreds");
		
		for(int i=1;i<=rc;i++) {
			
		String username = flip.readExcelData(EXCEL_PATH, "invalidcreds",i,0);
		String password = flip.readExcelData(EXCEL_PATH, "invalidcreds",i,1);
		
		System.out.println(i); 
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);

		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.name("username")).clear();
		
		
	}
		bt.closeBrowser();

 }
}
