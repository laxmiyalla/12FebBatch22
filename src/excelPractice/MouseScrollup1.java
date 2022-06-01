package excelPractice;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseScrollup1
{
  public static void main(String[] args) throws InterruptedException 
{
	  System.setProperty("webdriver.chrome.driver",
			  "C:\\Users\\LAXMI\\OneDrive\\Desktop\\Selenium 2\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();

	  driver.get("https://vctcpune.com/selenium/practice.html");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  Thread.sleep(5000);

	 JavascriptExecutor js = (JavascriptExecutor)driver;
	  
	  js.executeScript("window.scrollBy(0,-2000)");
	  Thread.sleep(3000);
	  
	  js.executeScript("window.scrollBy(0,2000)");
	  Thread.sleep(5000);

	  
	  
	  
	  
}
}
