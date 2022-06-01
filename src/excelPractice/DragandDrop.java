package excelPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver",
			  "C:\\Users\\LAXMI\\OneDrive\\Desktop\\Selenium 2\\chromedriver.exe");

				WebDriver driver =  new ChromeDriver();

				driver.get( "http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			Actions act = new Actions(driver);
	WebElement capital =driver.findElement(By.xpath("(//div[text()='Washington'])[2]"));
	Thread.sleep(2000);
	WebElement country = driver.findElement(By.xpath("//div[text()='Norway']"));
	Thread.sleep(2000);

	act.dragAndDrop(capital,country).perform();
	Thread.sleep(2000);

	System.out.println("capital and country printed");
}
}
