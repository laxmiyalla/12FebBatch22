package com.SauceDemo.POMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass
{
	private WebDriver driver;
	private Actions act;
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement userName;
	

	

	public void sendUserName()
	{
		userName.sendKeys("standard_user");
	}
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	public void sendpassword()
	{
		password.sendKeys("secret_sauce");
	}
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement loginButton;
	public void clickloginButton()
	{
	loginButton.click();
  act.click(loginButton).perform();
  
	}
	
public  LoginPageClass(WebDriver driver)
{
	this.driver=driver;	
	PageFactory.initElements(driver,this);
	act = new Actions(driver);
	
}
}
	


