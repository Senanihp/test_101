package Testcases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Drag_drop {
	@Test
	public void dragndrop() {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://demoapps.qspiders.com/ui?scenario=1");

driver.findElement(By.xpath("//section[contains(text(),'Mouse Actions')]")).click();
driver.findElement(By.xpath("//section[contains(text(),'Drag & Drop')]")).click();
boolean key=driver.findElement(By.xpath("//span[@class=\"bg-gradient-to-r from-orange-400 to-orange-600 text-white rounded text-center relative py-1 font-bold text-[20px] w-[50%] \"]")).isDisplayed();
assertEquals(key,true);
System.out.println("passed");
WebElement dd=driver.findElement(By.xpath("//div[contains(text(),\"Drag Me\")]"));
Actions action =new Actions(driver);
//action.moveToElement(dd, 0,200).build().perform();
action.dragAndDropBy(dd, 0, 200).build().perform();

//click and hold
driver.findElement(By.xpath("//section[contains(text(),\"Click & Hold\")]")).click();
WebElement ch=driver.findElement(By.xpath("//div[@id=\"circle\"]"));
action.clickAndHold(ch);
driver.close();
	}


}