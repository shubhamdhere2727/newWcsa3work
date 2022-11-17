package pageObjectModel;

import java.io.IOException;

public class TestActiTimeValidLogin extends BaseTest {
	
	public static void main(String[] args) throws IOException {
	
		BaseTest bt = new BaseTest();
		bt.openbrowser();
		Loginpage lp = new Loginpage(driver);
		Flib flib = new Flib();
		
		lp.validLoginActiTime(flib.readpropertfile(PROP_PATH, "username"), flib.readpropertfile(PROP_PATH, "password"));
		
	}

}