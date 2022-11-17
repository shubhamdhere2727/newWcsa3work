package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag3 {
	@Test(priority = 0)
	public void actitimeLogin()
	{
		Reporter.log("login",true);
	}
	@Test(priority = 3)
	public void actitimelogout()
	{
		Reporter.log("logout",true);
	}
	@Test(priority = 1)
	public void createuser()
	{
		Reporter.log("usercreated",true);
	}

}

