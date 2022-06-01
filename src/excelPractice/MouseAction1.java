package excelPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction1
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver",
			  "C:\\Users\\LAXMI\\OneDrive\\Desktop\\Selenium 2\\chromedriver.exe");

				WebDriver driver =  new ChromeDriver();

				driver.get("https://demoqa.com/buttons");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
Actions act = new Actions(driver);
WebElement Clickme = driver.findElement(By.xpath("//button[text()='Click Me']"));
act.click(Clickme).perform();
Thread.sleep(3000);

String ClickmeText= Clickme.getText();
System.out.println("Clickme");

WebElement RightClick  = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
act.click(RightClick).perform();
Thread.sleep(3000);
String RightClickText= RightClick.getText();
System.out.println("RightClick");

WebElement DoubleClick  = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
act.click(DoubleClick).perform();
Thread.sleep(3000);
String DoubleClickText= DoubleClick.getText();
System.out.println("DoubleClick");
}
}
