package Text_Box_Testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox_2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
}
}