package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag2 {
  @Test(enabled = false)
  public void method1() {
	  Reporter.log("actitime login",true);
  }
  
  @Test
  public void method2()
  {
	  Reporter.log("create user",true);
  }
}
