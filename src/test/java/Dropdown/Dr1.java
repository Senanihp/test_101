package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Testcases.Webelement_TC1;

public class Dr1 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
	WebElement dr=driver.findElement(By.xpath("//select[@id=\"select1\"]"));
	Select sel=new Select(dr);
	sel.selectByIndex(2);
	WebElement gender=driver.findElement(By.xpath("//select[@id=\"select2\"]"));
	Select sel1=new Select(gender);
	sel1.selectByValue("male");
	
	Boolean key=driver.findElement(By.xpath("//option[contains(text(),\"male\")]")).isDisplayed();
	System.out.println(key);
	
	Assert.assertEquals(key, true);
	
	
	driver.close();
	
}
}
