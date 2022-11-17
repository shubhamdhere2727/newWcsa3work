package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class flag6 {
	@Test(groups = "functional")
	public void Ft1() {
		Reporter.log("functional Test case1",true);
	}
	@Test(groups = "integration")
	public void It1() {
		Reporter.log("integration Test case1",true);
	}
	@Test(groups = "Smoke")
	public void St1()
	{
		Reporter.log("smoke Test case1",true);
	}
	//-------------------------------------------------------------------------------
	@Test(groups = "functional")
	public void Ft2() {
		Reporter.log("functional Test case2",true);
	}
	@Test(groups = "integration")
	public void It2() {
		Reporter.log("integration Test case2",true);
	}
	@Test(groups = "Smoke")
	public void St2()
	{
		Reporter.log("Smoke Test case2",true);
	}
	//---------------------------------------------------------------------------------	
	@Test(groups = "functional")
	public void Ft3() {
		Reporter.log("functional Test case3",true);
	}
	@Test(groups = "integration")
	public void It3() {
		Reporter.log("integration Test case3",true);
	}
	@Test(groups = "Smoke")
	public void St3()
	{
		Reporter.log("smoke Test case3",true);
	}
	//-------------------------------------------------------------------------------
	@Test(groups = "functional")
	public void Ft4() {
		Reporter.log("functional Test case4",true);
	}
	@Test(groups = "integration")
	public void It4() {
		Reporter.log("integration Test case4",true);
	}
	@Test(groups = "Smoke")
	public void St4()
	{
		Reporter.log("smoke Test case4",true);
	}
	//---------------------------------------------------------------------------------	
	@Test(groups = "functional")
	public void Ft5() {
		Reporter.log("functional Test case5",true);
	}
	@Test(groups = "integration")
	public void It5() {
		Reporter.log("integration Test case5",true);
	}
	@Test(groups = "Smoke")
	public void St5()
	{
		Reporter.log("smoke Test case5",true);
	}
	//-------------------------------------------------------------------------------
	@Test(groups = "functional")
	public void Ft6() {
		Reporter.log("functional Test case6",true);
	}
	@Test(groups = "integration")
	public void It6() {
		Reporter.log("integration Test case6",true);
	}
	@Test(groups = "Smoke")
	public void St6(){
		Reporter.log("smoke Test case6",true);
	}
}

