package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	
	//declaration
	@FindBy(name="usersSelector.selectedUser") private WebElement enterTimeTrackDopDown;
	@FindBy(xpath="//a[.='Create new tasks']") private WebElement CreateNewTaskLink;
	@FindBy(id="SubmitTTButton")private WebElement saveLeaveTimeButton;
	@FindBy(xpath="//a[.='Logout']")private WebElement logOutLink;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	//utilization
	public WebElement getEnterTimeTrackDopDown() {
		return enterTimeTrackDopDown;
	}
	public WebElement getCreateNewTaskLink() {
		return CreateNewTaskLink;
	}
	public WebElement getSaveLeaveTimeButton() {
		return saveLeaveTimeButton;
	}
	public WebElement getLogOutLink() {
		return logOutLink;
	}
	
	//operational method
	public void logoutActiTime()
	{
		logOutLink.click();
	}
}
