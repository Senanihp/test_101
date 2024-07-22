package Captcha_Demoscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Numeric_captcha {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://bookmyhsrp.com/plate/VahanBookingDetail.aspx?id=hsrp");
	
	WebElement vehregstate=driver.findElement(By.xpath("//select[@id=\"ddlVehicleRegState\"]"));

	Select sel=new Select(vehregstate);
     sel.selectByVisibleText("Karnataka")	;
     
     driver.findElement(By.xpath("//input[@id=\"txtRegNo\"]")).sendKeys("KA41P2999");
     driver.findElement(By.xpath("//input[@id=\"txtChasisNo\"]")).sendKeys("SGSDFGWAEFW4R233413441321");
     driver.findElement(By.xpath("//input[@id=\"txtEngineNo\"]")).sendKeys("WFAEFGWR12E48H12EUH12UHEU");
    // driver.findElement(By.id("[id='txtEngineNo']")).sendKeys("WFAEFGWR12E48H12EUH12UHEU");
     String attvalue= driver.findElement(By.xpath("//INPUT[@readonly='readonly']")).getAttribute("value");
     //String attvalue= driver.findElement(By.xpath("//input[@id=\"txtCaptcha\"]")).getAttribute("placeholder");
   // String attvalue= driver.findElement(By.id("[id='txtCaptcha']")).getAttribute("placeholder");
     
     driver.findElement(By.xpath("//input[@id=\"txtInput\"]")).sendKeys(attvalue);
     System.out.println(attvalue);
     
     driver.findElement(By.xpath("//a[@id=\"btnValidatVahan\"]")).click();
     driver.close();
}
}
