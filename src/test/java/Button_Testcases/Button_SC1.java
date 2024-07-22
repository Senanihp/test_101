package Button_Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


//to verify  if the button is selected
public class Button_SC1 {
	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoapps.qspiders.com/ui/button?sublist=0");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.xpath("//a[@href=\"/ui/button\"]//section[contains(text(),\"Button\")]")).click();
    driver.findElement(By.xpath("//button[@id=\"btn\"]")).click();
    String ExpectedText="You selected \"Yes\"";
    String ActualText=driver.findElement(By.xpath("//span[contains(text(),'You selected \"Yes\"')]")).getText();
    System.out.println(ActualText);
    
    Assert.assertEquals(ActualText, ExpectedText);
    driver.close();
    
}
}