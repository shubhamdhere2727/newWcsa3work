package pageObjectModel;

import java.io.IOException;

public class TestActiTimeLogout  extends BaseTest{

	
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openbrowser();
		Loginpage lp = new Loginpage(driver);
		Flib flib = new Flib();
		
		lp.validLoginActiTime(flib.readpropertfile(PROP_PATH, "username"), flib.readpropertfile(PROP_PATH, "password"));
		Thread.sleep(3000);
		HomePage hp = new HomePage(driver);
		hp.logoutActiTime();
		
	}
}