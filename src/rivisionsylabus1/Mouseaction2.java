package rivisionsylabus1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction2
{
public static void main(String[] args) throws InterruptedException 
{
	 System.setProperty("webdriver.chrome.driver",
			  "C:\\Users\\LAXMI\\OneDrive\\Desktop\\Selenium 2\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.get("https://demoqa.com/buttons");
   
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   
   Actions act = new Actions(driver);
   
   WebElement clickmebutton = driver.findElement(By.xpath("//button[text()='Click Me']"));
   act.click(clickmebutton).perform();
   WebElement Doubleclickme = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
   act.doubleClick(Doubleclickme).perform();

   WebElement Rightclickme = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
act.contextClick(Rightclickme).perform();
String data = Rightclickme.getText();
System.out.println(data);



















}
}