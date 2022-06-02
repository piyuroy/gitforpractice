package com.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(name ="user_name")
	private WebElement userNameTxt;
	@FindBy(name="user_password")
	private WebElement passwordTxt;
	@FindBy(id="submitButton")
	private WebElement loginBtn;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//Business library
	public void loginAction(String userName, String password)
	{
		userNameTxt.sendKeys(userName);
		passwordTxt.sendKeys(password);
		loginBtn.click();
	}

}
