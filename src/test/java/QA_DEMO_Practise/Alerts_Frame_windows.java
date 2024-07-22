package QA_DEMO_Practise;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Alerts_Frame_windows {
	@Test (priority=2)
	public void Swith_tab() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoqa.com/browser-windows");
	Boolean key=driver.findElement(By.xpath("//img[@src=\"/images/Toolsqa.jpg\"]")).isDisplayed();
	System.out.println(key);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0,300)"," ");
	driver.findElement(By.id("tabButton")).click();
	
	String Parentwindow=driver.getWindowHandle();
	System.out.println(Parentwindow);
	Set<String> windows=driver.getWindowHandles();
	System.out.println(windows);
	
	for(String Childwindow:windows) {
		System.out.println(Childwindow);
		if(Childwindow.contains(Parentwindow)) {
			continue;
		}
		else{
			driver.switchTo().window(Childwindow);
		}
	}
    String cur_URL=driver.getCurrentUrl();	
    System.out.println(cur_URL);
	String new_text=driver.findElement(By.xpath("//h1[contains(text(),\"This is a sample page\")]")).getText();
    System.out.println(new_text);
	String expected="This is a sample page";
    Assert.assertEquals(new_text, expected); 
	
    driver.quit();
	
}
	
	@Test (priority=1)
	public void Switch_window() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.close();
		
}
	
}