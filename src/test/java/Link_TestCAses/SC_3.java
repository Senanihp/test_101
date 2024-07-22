package Link_TestCAses;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//get list all the webelements
public class SC_3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/link?sublist=0");
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		for(WebElement WB:allLinks) {
			
		System.out.println(WB);
			
		}
		
		System.out.println(allLinks);
		driver.close();
}
	
}
