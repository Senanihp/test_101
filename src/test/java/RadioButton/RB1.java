package RadioButton;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RB1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/radio?sublist=0");
		driver.findElement(By.xpath("//input[@id=\"attended1\"]")).click();
		Boolean key=driver.findElement(By.xpath("//input[@id=\"attended1\"]")).isSelected();
		System.out.println(key);
		Assert.assertEquals(true, key);
		
		
		driver.close();
	}

}
