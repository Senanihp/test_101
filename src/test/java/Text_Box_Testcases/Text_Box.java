package Text_Box_Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Text_Box {
	@Test
	public void TC01() throws InterruptedException {
		
WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoapps.qspiders.com/ui?scenario=1");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("senani");
    driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("senani@gmail.com");
    driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("SenaniHPP");
    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
    String Actual_Text="Registered successfully";
    Thread.sleep(1000);
    String text=driver.findElement(By.xpath("//section[contains(@class,'textbox_contents bg')]//div[text()='Registered successfully']")).getText();
    System.out.println(text);
    String Expected_String=text;
  
    Assert.assertEquals(Actual_Text, Expected_String);
    driver.close();
    

	
		
	}
}
