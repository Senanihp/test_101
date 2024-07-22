package RadioButton;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RB2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/radio?sublist=0");
		List<WebElement> l1=driver.findElements(By.xpath("//input[@type='radio' and contains(@id,'attended')]"));
		//l1.size();
		for(Object o:l1) {
			System.out.println(l1.size());
		System.out.println(o);
		driver.close();
		
}}
}