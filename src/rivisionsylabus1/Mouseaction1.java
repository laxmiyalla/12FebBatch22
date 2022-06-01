package rivisionsylabus1;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction1 
{
  public static void main(String[] args) throws InterruptedException
{
	  System.setProperty("webdriver.chrome.driver",
			  "C:\\Users\\LAXMI\\OneDrive\\Desktop\\Selenium 2\\chromedriver.exe");

	 WebDriver  driver = new ChromeDriver();
	 driver.get("https://www.saucedemo.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
	 username.sendKeys("standard_user");
WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
password.sendKeys("secret_sauce");
   WebElement loginbutton = driver.findElement(By.xpath("//input[@id ='login-button']"));
  // loginbutton.click();
   
   Actions act= new Actions(driver);
   act.click(loginbutton).perform();
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}
