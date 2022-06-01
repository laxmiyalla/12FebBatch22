package com.SauceDemo.TESTClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import com.SauceDemo.POMClasses.Homepageclass;
import com.SauceDemo.POMClasses.LoginPageClass;

public class Testclass2 
{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\LAXMI\\OneDrive\\Desktop\\Selenium 2\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println("browser open");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL open");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		LoginPageClass lp = new LoginPageClass(driver);
		lp.sendUserName();
		lp.sendpassword();
		lp.clickloginButton();
		
		Homepageclass hp = new Homepageclass(driver);
		hp.clickaddtocart();
		hp.clickcartlink();
		hp.clickcheckout();
		hp.sendFirstname();
		hp.sendLastName();
		hp.sendpostalcode();
		hp.clickcontinueButton();
		hp.clickfinish();
	}
//	String expectedUrl = "https://www.saucedemo.com/";
//	String actualUrl = driver.getCurrentUrl();
	
				
		
		
		
		
		
		
	}
	