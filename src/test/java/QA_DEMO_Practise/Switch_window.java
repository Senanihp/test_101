package QA_DEMO_Practise;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Switch_window {
	@Test
	public void Form_End_to_End() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/links");
		Boolean key=driver.findElement(By.xpath("//img[@src=\"/images/Toolsqa.jpg\"]")).isDisplayed();
		System.out.println(key);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,400)", " ");
		
		//driver.findElement(By.linkText("https://demoqa.com")).click();
		driver.findElement(By.id("dynamicLink")).click();
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		
		Set<String> t=driver.getWindowHandles();
		
		
		for(String childwindow: t) {
			
			System.out.println(childwindow);
			
			if(childwindow.equals(parentwindow)) {
				continue;
			}
			else {
				driver.switchTo().window(childwindow);
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//img[@class=\"banner-image\"]")).click();
		
		}
				
		
		}
		

		driver.quit();
}
	
	
}