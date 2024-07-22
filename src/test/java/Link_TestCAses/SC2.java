package Link_TestCAses;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SC2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/link/linkNew?sublist=1&scenario=2");
		
		Thread.sleep(2000);
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.linkText("Contact Us")).click();
	   Set<String> l=driver.getWindowHandles();
	   for(String Child: l) {
		   if(Child.equals(parent)) {
			   continue;
		   }
		   else {
			   driver.switchTo().window(Child);
		   }
	   }
	     
		
		Boolean val=driver.findElement(By.xpath("//div[contains(text(),'Contact Us')]")).isDisplayed();
		System.out.println(val);
		Assert.assertEquals(true, val);
		
		
		
		driver.quit();
}
}