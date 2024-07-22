package Button_Testcases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

//right click and verify and double click and verify, button disabled
import Testcases.Webelement_TC1;

public class Button_SC2 {
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    //right click
	    driver.findElement(By.xpath("//a[@href=\"/ui/button\"]//section[contains(text(),\"Button\")]")).click();
	    driver.findElement(By.xpath("//p[contains(text(),\"Write a script to right click on button?\")]")).click();
	    driver.findElement(By.xpath("//a[contains(text(),\"Right Click\")]")).click();
	    WebElement rightcl=driver.findElement(By.xpath("//button[@id=\"btn30\"]"));
	    Actions action=new Actions(driver);
	    action.moveToElement(rightcl).contextClick().build().perform();
	    driver.findElement(By.xpath("//div[@class=\"origin-top-right absolute left-[103%] top-[-20%] mt-2 w-32 z-20 rounded-md shadow-lg bg-white ring-1 ring-black ring-opacity-5 text-left font-normal\"]//div[contains(text(),\"Yes\")]")).click();
	    String ExpectedText="You selected \"Yes\"";
	    String ActualText=driver.findElement(By.xpath("//span[contains(text(),'You selected \"Yes\"')]")).getText();
	    System.out.println(ActualText);
	    
	    Assert.assertEquals(ActualText, ExpectedText);
	    
	    
	    //double click
	    driver.get("https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2&scenario=1");
	   WebElement doublecl=driver.findElement(By.xpath("//button[@id=\"btn20\"]"));
	    Actions action1=new Actions(driver);
	    action1.moveToElement(doublecl).doubleClick().build().perform();
	    String ExpectedText1="You selected \"Yes\"";
	    String ActualText1=driver.findElement(By.xpath("//span[contains(text(),'You selected \"Yes\"')]")).getText();
	    System.out.println(ActualText);
	    
	    Assert.assertEquals(ActualText1, ExpectedText1);
	    
	    
	    
	    //Button disabled
	    
	    driver.get("https://demoapps.qspiders.com/ui/button/buttonDisabled?sublist=4&scenario=1");
	    Boolean key=driver.findElement(By.xpath("//button[@id=\"submitButton\"]")).isEnabled();
	    System.out.println(key);
	    
	    Boolean Actualval=false;
	   
	    
	    assertEquals(Actualval,key );
	    	
	    
	    
	    driver.close();
}
}