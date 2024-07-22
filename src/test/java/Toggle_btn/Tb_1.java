package Toggle_btn;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tb_1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/toggle?sublist=0");
	List<WebElement> a1=driver.findElements(By.xpath("//span[contains(@class,'relative bg-gray')]"));
	for(int i=0;i<a1.size();i++) {
		a1.get(i).click();
		System.out.println("Done Fu**er");
	}
	driver.close();
	}
}
