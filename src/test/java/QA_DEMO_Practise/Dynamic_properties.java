package QA_DEMO_Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dynamic_properties {
	@Test
	public void Button() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoqa.com/dynamic-properties");
	Boolean key=driver.findElement(By.xpath("//img[@src=\"/images/Toolsqa.jpg\"]")).isDisplayed();
	System.out.println(key);
	
	//getting text from a element who's id is changing
	String dynamic_id=driver.findElement(By.xpath("//div[@class=\"col-12 mt-4 col-md-6\"]//div//p")).getText();
	System.out.println(dynamic_id);
	
	
}
}