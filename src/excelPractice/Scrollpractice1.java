package excelPractice;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollpractice1
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver",
			  "C:\\Users\\LAXMI\\OneDrive\\Desktop\\Selenium 2\\chromedriver.exe");

				WebDriver driver =  new ChromeDriver();
				  driver.manage().window().maximize();


				driver.get( "https://www.amazon.in");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(1000,2000)");
			Thread.sleep(2000);
			jse.executeScript("window.scrollBy(0,-2000)");
			Thread.sleep(2000);
}
}
