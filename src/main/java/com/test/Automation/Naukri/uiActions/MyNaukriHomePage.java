package com.test.Automation.Naukri.uiActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyNaukriHomePage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id='compDetail']/div[4]/div[1]/button")
	WebElement ViewandUpdateProfile;
	
	@FindBy(xpath="//*[@id='uploadLink']")
	WebElement UploadResume;
	
	@FindBy(xpath="//*[@id='attachCV']")
	WebElement AttachCV;
	
	@FindBy(xpath="//*[@id='editForm']/div[7]/button")
	WebElement SaveButton;
	
	public MyNaukriHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void updateprofile(String resumepath) {
		ViewandUpdateProfile.click();
		UploadResume.click();
		AttachCV.sendKeys(resumepath);
		SaveButton.click();
	}
}
