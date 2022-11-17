package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag5 {
	@Test
	  public void ActiTimeLogin() {
		  int i=6/0;
		  System.out.println(i);
		  Reporter.log("sucessful login",true);
	  }
	  @Test(dependsOnMethods = "ActiTimeLogin")
	  public void ActiTimeCreateUser() {
		  Reporter.log("user created successfully",true);
	  }
	  @Test(dependsOnMethods = "ActiTimeCreateUser",alwaysRun = true)
	  public void ActiTimeLogOut() {
		  Reporter.log("logout Successful",true);
	  }
}
