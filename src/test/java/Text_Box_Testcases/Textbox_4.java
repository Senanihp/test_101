package Text_Box_Testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox_4 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoapps.qspiders.com/ui/login?scenario=3");
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,2500)", "");
    driver.findElement(By.xpath("//p[@class='text-[15px] font-bold px-4 w-full p-1 hover:cursor-pointer']")).click();
    WebElement input=driver.findElement(By.xpath("//input[@id=\"name\"]"));
   
    String name2=input.getAttribute("value");
    System.out.println(name2);
    driver.close();
    
   
}
}
