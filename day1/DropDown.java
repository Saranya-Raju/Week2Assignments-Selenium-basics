package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		WebElement source = driver.findElement(By.className("ui-selectonemenu"));
		Select drop=new Select(source);
		drop.selectByVisibleText("Selenium");
		
	    driver.findElement(By.xpath("//span[@class=\'ui-icon ui-icon-triangle-1-s ui-c\']")).click();
	    driver.findElement(By.id("j_idt87:country_3")).click();
	    Thread.sleep(2000);
	    
		driver.findElement(By.xpath("(//span[contains(@class,'ui-icon ui-icon-triangle')])[2]")).click();
		driver.findElement(By.id("j_idt87:city_2")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='ui-button-icon-primary ui-icon ui-icon-triangle-1-s']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		driver.findElement(By.xpath("//li[text()='Playwright']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[contains(@class,'ui-icon ui-icon-triangle')])[4]")).click();
		driver.findElement(By.id("j_idt87:lang_1")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[contains(@class,'ui-icon ui-icon-triangle')])[5]")).click();
		driver.findElement(By.id("j_idt87:value_3")).click();
	}

}
