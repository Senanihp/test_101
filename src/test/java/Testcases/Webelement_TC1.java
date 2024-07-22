package Testcases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Webelement_TC1 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/");
	
//verifying title
	String ExpectedTitle="DemoApps | Qspiders";
	String actualTitle=driver.getTitle();
	System.out.println("THE TITLE OF THE APPLICATIONS IS:"+actualTitle);
	
	assertEquals(actualTitle,ExpectedTitle);
	
	
	driver.findElement(By.xpath("//p[contains(text(),'UI Testing Concepts')]")).click();
	String Webelementpage=driver.findElement(By.xpath("//section[contains(text(),'Web Elements')]")).getText();
	System.out.println(Webelementpage);
	assertEquals(Webelementpage,"Web Elements");
	driver.findElement(By.xpath("//section[contains(text(),\"Web Table\")]")).click();
	driver.findElement(By.xpath("//a[contains(text(),\"Dynamic Web Table\")]")).click();
	//String price = driver.findElement(By.xpath("//div[@class='relative top-4 pb-5 pt-3']//tr[@class='bg-white border-b  hover:bg-orange-100'][3]//td[@class='px-6 py-4'][4]")).getText();
	String price1=driver.findElement(By.xpath("//tbody/tr/th[text()=\"Apple iPhone\"]/../td[contains(@class,\"font-bold text-black\")]")).getText();
	System.out.println(price1);
	driver.findElement(By.xpath("//section[contains(text(),\"Dropdown\")]")).click();
	WebElement drop= driver.findElement(By.xpath("//select[@id=\"select1\"]"));
	Select sel=new Select(drop);
	sel.selectByIndex(2);
	//String phnum=driver.findElement(By.xpath("//select[@id=\"select1\"]")).get
	//System.out.println(phnum);
	System.out.println("test passed");
	// //div[@class="relative top-4 pb-5 pt-3"]//tr[@class="bg-white border-b  hover:bg-orange-100"][3]//td[@class="px-6 py-4"][4]
	
	driver.findElement(By.xpath("//section[contains(text(),'Mouse Actions')]")).click();
	driver.findElement(By.xpath("//section[contains(text(),'Drag & Drop')]")).click();
	
	driver.quit();
}
}
