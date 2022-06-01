package com.SauceDemo.TESTClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.SauceDemo.POMClasses.LoginPageClass;

public class Testclass1
{
	
  
@Test
public void LoginPageClassTest()
{
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
	System.out.println("enter username");
	lp.sendpassword();
	System.out.println("enter password");
	lp.clickloginButton();
	System.out.println("click login button");
	
	String expectedTitle = "Swag Labs";
	String actualTitle = driver.getTitle();
	System.out.println("verify the test cases");
	
	if(expectedTitle.equals(actualTitle))
	{
		System.out.println("Test case is passed");
	}
		else
		{
			System.out.println("Test case is Failed");
		}
//	driver.quit();
	
	}
	
	}

  

