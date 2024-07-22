package Sel_concepts_prac;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List_ofWebElements {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
	
	//driver.findElement(By.xpath("//select[@id=\"select1\"]")).click();
	List<WebElement> Options=driver.findElements(By.xpath("//select[@class=\"border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150\"]//option"));
	for(int i=0;i<=Options.size()-1;i++) {
		Options.get(i).click();
		System.out.println(Options.get(i).getAttribute("value"));
		//driver.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]")).click();
     
      }
	String currenthandle=driver.getWindowHandle();
	System.out.println(currenthandle);
	Thread.sleep(2000);
	
	driver.close();

	
}
}
