package com.test.Automation.Naukri.testCase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.Automation.Naukri.testBase.TestBase;
import com.test.Automation.Naukri.uiActions.HomePage;
import com.test.Automation.Naukri.uiActions.MyNaukriHomePage;


public class UpdateResume extends TestBase {
	
HomePage homepage;
MyNaukriHomePage mynaukrihomepage;
	
	@BeforeTest
	public void setUp(){
		init();
	}
	
	@Test
	public void verifyLoginWithInvalidCredintials() {
		homepage = new HomePage(driver);
		homepage.login("muneendravipparthi@hotmail.com" , "munnabhai");
		mynaukrihomepage = new MyNaukriHomePage(driver);
		mynaukrihomepage.updateprofile("H:\\Docs\\Muneendra Vipparthi Resume.docx");
	}
	
	@AfterClass
	public void endTest() {
		driver.navigate().to("https://login.naukri.com/nLogin/Logout.php");
		driver.close();
	}
}
	


