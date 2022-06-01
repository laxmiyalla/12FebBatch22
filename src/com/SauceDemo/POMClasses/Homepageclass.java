package com.SauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepageclass
{
   private WebDriver driver;
   
   @FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
   private WebElement addtocart;

public void clickaddtocart()
   {
	   addtocart.click();
   }
   @FindBy(xpath="//a[@class='shopping_cart_link']")
   private WebElement cartlink;
   public void clickcartlink()
   {
	   cartlink.click();
   }
   @FindBy(xpath="//button[@id='checkout']")
   private WebElement checkout;
   public void clickcheckout()
   {
	   checkout.click();
   }
   @FindBy(xpath="//input[@id='first-name']")
   private WebElement Firstname;
   public void sendFirstname()
   {
	   Firstname.sendKeys("Laxmi");
   }
   @FindBy(xpath="//input[@id='last-name']")
   private WebElement LastName;
   public void sendLastName()
   {
	   LastName.sendKeys("Yalla");
   }
   @FindBy(xpath="//input[@id='postal-code']")
   private WebElement postalcode;
   public void sendpostalcode()
   {
	   postalcode.sendKeys("zipcode");
   }
   @FindBy(xpath="//input[@id='continue']")
   private WebElement continueButton;
   public void clickcontinueButton()
   {
	   continueButton.click();
   }
   @FindBy(xpath="//button[@id='finish']")
   private WebElement finish;
   public void clickfinish()
   {
   finish.click();
   }
   public Homepageclass(WebDriver driver)
   {
	   this.driver=driver;
	   PageFactory.initElements( driver,this);
			   
   }
}
