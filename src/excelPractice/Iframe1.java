package excelPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe1
{
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			  "C:\\Users\\LAXMI\\OneDrive\\Desktop\\Selenium 2\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	
	WebElement FrameElement = driver.findElement(By.xpath("//iframe[@id='frame2']"));
	driver.switchTo().frame(FrameElement);
	WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));
	dropDown.click();
	
driver.switchTo().defaultContent();
WebElement textBox = driver.findElement(By.xpath("//iframe[@id='frame1']"));
	textBox.sendKeys("India");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}