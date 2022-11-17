package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test(description = "this test is used to perform a valid login")
  public void validActitime() {
	  Reporter.log("valid login perform",true);
  }
  
  @Test(description = "this test is used to perform a invalid login ")
  public void invalidActitime()
  {
	  Reporter.log("invalid login perform",true);
  }
}
