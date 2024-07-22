package CheckBox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CB1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/checkbox");
		driver.findElement(By.xpath("//input[@id=\"domain1\"]")).click();
		Boolean key=driver.findElement(By.xpath("//input[@id=\"domain1\"]")).isSelected();
		System.out.println(key);
		driver.close();
}
}