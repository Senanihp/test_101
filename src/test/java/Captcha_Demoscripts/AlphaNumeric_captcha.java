package Captcha_Demoscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlphaNumeric_captcha {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://register.eshram.gov.in/#/user/self");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	driver.findElement(By.xpath("//input[@formcontrolname='mobNumber']")).click();
	driver.findElement(By.xpath("//input[@formcontrolname='mobNumber']")).sendKeys("8618231973");

	
	String captcha_text=driver.findElement(By.xpath("//span[@translate=\"no\"]")).getText();
	System.out.println(captcha_text);
	
	driver.findElement(By.xpath("//input[@id='inputCaptcha']")).click();
	driver.findElement(By.xpath("//input[@id='inputCaptcha']")).sendKeys(captcha_text);
	driver.findElement(By.xpath("//input[@id=\"epfo_no\"]")).click();
	driver.findElement(By.xpath("//input[@id=\"esic_no\"]")).click();
	driver.findElement(By.xpath("//input[@value='Send OTP']")).click();
	driver.close();
	System.out.println("passed");
	
	
}
}
