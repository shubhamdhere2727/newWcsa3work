package pageObjectModel;

import java.io.IOException;

public class TestActiTimeInvalideLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openbrowser();
		
           Loginpage lp = new Loginpage(driver);
           
           Flib flip = new Flib();
           int rc = flip.getRowCount(EXCEL_PATH,"invalidcreds");
           
           for(int i=1;i<=rc;i++)
           {
        	   String invalidusername = flip.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
        	   String invalidPassword = flip.readExcelData(EXCEL_PATH, "invalidcreds", i, 1);
        	      
        	   lp.invalidLoginActiTime(invalidusername, invalidPassword);        	   
           }
           
	}

}
