package com.test.Automation.Naukri.uiActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver Driver;
	
	@FindBy(xpath="//*[@id='login_Layer']")
	WebElement login;
	
	@FindBy(xpath="//*[@id='eLogin']")
	WebElement EmailId;
	
	@FindBy(xpath="//*[@id='pLogin']")
	WebElement Password;
	
	@FindBy(xpath = "//*[@id='lgnFrm']/div[8]/button")
	WebElement loginbutton;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

public void login(String Email,String password) {
	login.click();
	EmailId.sendKeys(Email);
	Password.sendKeys(password);
	loginbutton.click();
	
}

}
