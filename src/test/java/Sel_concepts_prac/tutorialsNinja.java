package Sel_concepts_prac;

import java.time.Duration;
import java.util.List;

import org.apache.log4j.chainsaw.Main;
import org.checkerframework.common.reflection.qual.NewInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Testcases.Webelement_TC1;

public class tutorialsNinja {
@Test
public void apple() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.findElement(By.xpath("//div[@class=\"pull-left\"]")).click();
	driver.findElement(By.xpath("//button[contains(text(),'$US Dollar')]")).click();
	Thread.sleep(2000);
	
	/*WebElement dropdown=driver.findElement(By.xpath("//div[@class=\"pull-left\"]"));
	Select sel=new Select(dropdown);
	sel.selectByIndex(1);
	Thread.sleep(2000);
	System.out.println("passed");
	WebElement WB=driver.findElement(By.xpath("(//a[contains(text(),'Components')])[1]"));
	Actions action=new Actions(driver);
	action.moveToElement(WB).build().perform();
	 driver.findElement(By.xpath("(//a[contains(text(),'Show AllComponents')])[1]")).click();
		Thread.sleep(2000);*/
	
		
		driver.close();
	}
}
