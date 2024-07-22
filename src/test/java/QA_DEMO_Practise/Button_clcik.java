package QA_DEMO_Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Button_clcik {
	@Test
	public void Button() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoqa.com/buttons");
	Boolean key=driver.findElement(By.xpath("//img[@src=\"/images/Toolsqa.jpg\"]")).isDisplayed();
	System.out.println(key);
	WebElement dblclick=driver.findElement(By.id("doubleClickBtn"));
	Actions action=new Actions(driver);
	action.doubleClick();
	
	
	
	
	}
}
