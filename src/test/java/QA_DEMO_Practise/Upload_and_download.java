package QA_DEMO_Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Upload_and_download {
	@Test
	public void up_dw() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoqa.com/upload-download");
	Boolean key=driver.findElement(By.xpath("//img[@src=\"/images/Toolsqa.jpg\"]")).isDisplayed();
	System.out.println(key);
	WebElement Up_And_Download=driver.findElement(By.xpath("//span[contains(text(),'Upload and Download')]"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	//js.executeScript("window.scrollTo(0,300)");
	
	//scrolling till element visible
	js.executeScript("arguments[0].scrollIntoView(true)",Up_And_Download);
	driver.findElement(By.xpath("//span[contains(text(),'Upload and Download')]")).click();
	
	//upload file
	//use direct send keys
    driver.findElement(By.id("uploadFile")).sendKeys("C:\\Users\\User\\Desktop\\My Files\\rrrr.txt");
    
   Boolean successmsg= driver.findElement(By.xpath("//p[@id=\"uploadedFilePath\"]")).isDisplayed();
   System.out.println(successmsg);
   Assert.assertEquals(successmsg,true);
    
   //download file
    driver.findElement(By.xpath("//a[contains(text(),'Download')]")).click();
    Thread.sleep(2000);
    
    driver.get("chrome://downloads/");
    WebElement ele = (WebElement) js.executeScript("return document.querySelector(\"body > downloads-manager\").shadowRoot.querySelector(\"#frb0\").shadowRoot.querySelector(\"#file-link\")");
    System.out.println(ele.getText());
   String actualtext=ele.getText();
   String expectedtext="sampleFile";
   
  if( actualtext.contains(expectedtext)) {
	  System.out.println("The file has been successfully downloaded");
  }
  
  else{
	  System.out.println("failed");
  }
    driver.close();

    
	}
	
}
