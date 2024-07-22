package Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_Box {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
	
	driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("senani");
	driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("senanigowda11@gmail.com");
	driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("senani");
	driver.findElement(By.xpath("//button[contains(text(),\"Register\")]")).click();
	driver.close();
	
}	
}

