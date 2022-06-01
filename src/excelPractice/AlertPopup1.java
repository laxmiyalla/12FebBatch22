package excelPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup1
{
public static void main(String[] args) throws InterruptedException 
{
	 System.setProperty("webdriver.chrome.driver",
			  "C:\\Users\\LAXMI\\OneDrive\\Desktop\\Selenium 2\\chromedriver.exe");
   WebDriver driver= new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://demoqa.com/alerts");
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   
   WebElement clickbutton = driver.findElement(By.xpath("//button[@id='alertButton']"));
   clickbutton.click();
   Thread.sleep(3000);
   
   Alert alt = driver.switchTo().alert();
   System.out.println(alt.getText());
   alt.accept();
   Thread.sleep(3000);

   WebElement confirmbutton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
   confirmbutton.click();
   Thread.sleep(3000);

   alt.dismiss();   
}
}
