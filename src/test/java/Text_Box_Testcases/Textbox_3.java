package Text_Box_Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


//validate placeholder attribute is present 


public class Textbox_3 {
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoapps.qspiders.com/ui/login?scenario=3");
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//p[contains(text(),\"Write a script to validate placeholder is present in the textbox?\")]")).click();
	   WebElement placehl= driver.findElement(By.xpath("//input[@placeholder=\"Enter your email\"]"));
	   
	   String text=placehl.getAttribute("placeholder");
	   System.out.println(text);
	   String expected_Value="Enter your email";
	   Assert.assertEquals(expected_Value, text);
	   
	   driver.close();
}
}