package QA_DEMO_Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Form_Automation {
@Test
public void Form_End_to_End() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoqa.com/automation-practice-form");
	Boolean key=driver.findElement(By.xpath("//img[@src=\"/images/Toolsqa.jpg\"]")).isDisplayed();
	System.out.println(key);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,550)", "");
	
	//driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("senani");
	
	driver.findElement(By.id("firstName")).sendKeys("senani");
	driver.findElement(By.id("lastName")).sendKeys("HP");
	driver.findElement(By.id("userEmail")).sendKeys("senani@gmail.com");
	
	String gender="Male";
	driver.findElement(By.xpath("//label[contains(text(),"+gender+")]"));
	
	driver.findElement(By.id("userNumber")).sendKeys("7892116521");
	
	driver.findElement(By.xpath("//input[@id=\"dateOfBirthInput\"]")).click();
	WebElement dropdown_month=driver.findElement(By.xpath("//select[@class=\"react-datepicker__month-select\"]"));
	Select sel=new Select(dropdown_month);
	sel.selectByIndex(6);
	
	WebElement dropdown_year=driver.findElement(By.xpath("//select[@class=\"react-datepicker__year-select\"]"));
	Select sel1=new Select(dropdown_year);
	sel1.selectByValue("2024");
	
	String day = "10";
	/*String date = "//div[contains(@class,'react-datepicker__day react-datepicker__day--0'"+day+")]";
	driver.findElement(By.xpath(date)).click();*/
	
	driver.findElement(By.xpath("//div[contains(text(),'12')]")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//div[@class=\"subjects-auto-complete__placeholder css-1wa3eu0-placeholder\"]")).sendKeys("maths");
	
	String Hobbie_radiobtn="Music";
	driver.findElement(By.xpath("//label[contains(text(),"+Hobbie_radiobtn+")]")).click();
	Boolean key1=driver.findElement(By.xpath("//label[contains(text(),"+Hobbie_radiobtn+")]")).isEnabled();
	System.out.println(key1);
	Assert.assertEquals(key1, true);
	
	
	
	driver.findElement(By.xpath("//textarea[@placeholder=\"Current Address\"]")).sendKeys("rrnagar,bengaluru");
	
	
	js.executeScript("window.scrollBy(0,350)", "");

	/*WebElement State=driver.findElement(By.xpath("//div[contains(text(),'Select State')]"));
	Select sel2=new Select(State);
	sel2.selectByIndex(2);
	
	
	WebElement City=driver.findElement(By.xpath("//div[contains(text(),'Select City')]"));
	Select sel3=new Select(City);
	sel3.selectByIndex(1); */
	
	
	
	driver.findElement(By.id("submit"));
	
	driver.close();
}
}
