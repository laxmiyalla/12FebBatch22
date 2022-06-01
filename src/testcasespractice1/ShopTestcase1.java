package testcasespractice1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopTestcase1 
{
  public static void main(String[] args)
{
	  System.setProperty("webdriver.chrome.driver",
			  "C:\\Users\\LAXMI\\OneDrive\\Desktop\\Selenium 2\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://practice.automationtesting.in");
	WebElement shopMenu = driver.findElement(By.xpath("//a[text()='Shop']"));
	shopMenu.click();
	
	WebElement homebutton = driver.findElement(By.xpath("//a[text()='Home']"));
	homebutton.click();
	
	
	
	
	
}
}
