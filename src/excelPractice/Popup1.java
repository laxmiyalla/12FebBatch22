package excelPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup1
{
public static void main(String[] args) throws InterruptedException
{
	 System.setProperty("webdriver.chrome.driver",
			  "C:\\Users\\LAXMI\\OneDrive\\Desktop\\Selenium 2\\chromedriver.exe");

	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();

	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://demoqa.com/alerts");
	  WebElement clickMeButton = driver.findElement(By.xpath("(//button[@id ='alertButton'])"));
	  clickMeButton.click();
	  Thread.sleep(5000);
	 
	  Alert alt = driver.switchTo().alert();
	  alt.accept();
	  Thread.sleep(5000);

	  WebElement confirmButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
	  confirmButton.click();
	  Thread.sleep(5000);

	  
	  
	  
	  
	  
	  
	  
	  
}
}
