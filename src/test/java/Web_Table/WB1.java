package Web_Table;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//dynamic data capturing
public class WB1 {
public static void main(String[] args) {
	
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://demoapps.qspiders.com/ui/table/dynamicTable?scenario=2");


String text1=driver.findElement(By.xpath("//tbody//th[contains(text(),'HP Envy')]/following-sibling::td[@class='px-6 py-4 font-bold text-black']")).getText();
System.out.println(text1);
driver.close();

}
}
