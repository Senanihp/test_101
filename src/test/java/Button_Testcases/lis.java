package Button_Testcases;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class lis {
	@Test
     public void t1() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		//List<WebElement> l1=driver.findElements(By.xpath("//div[@class=\"w-[100%] transition-h duration-500 max-h-[400px] overflow-hidden ease-in\"]"));
		driver.close();
	}
}
