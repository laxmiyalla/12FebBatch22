package excelPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver",
			  "C:\\Users\\LAXMI\\OneDrive\\Desktop\\Selenium 2\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://vctcpune.com/selenium/practice.html");

	WebElement columns = driver.findElement(By.xpath("//th[text()='Instructor']"));
	  System.out.println(columns.getText());
	  
	  List<WebElement>columns1 = driver.findElements(By.xpath("//table//tbody//tr//th"));
	  System.out.println(columns1.size());
	  
	  
	  
}

}
