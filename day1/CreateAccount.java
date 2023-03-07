package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id=\"accountName\"]")).sendKeys("Debit Limited Account");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id=\"groupNameLocal\"]")).sendKeys("sam");
		driver.findElement(By.xpath("//input[@id=\"officeSiteName\"]")).sendKeys("Chennai");
		driver.findElement(By.xpath("(//input[@class=\"inputBox\"])[5]")).sendKeys("2000000");
		WebElement source = driver.findElement(By.name("industryEnumId"));
		Select drop=new Select(source);
		//Thread.sleep(2000);
		drop.selectByVisibleText("Computer Software");
		
		WebElement source1 = driver.findElement(By.name("ownershipEnumId"));
		Select drop2= new Select(source1);
		//Thread.sleep(2000);
		drop2.selectByVisibleText("S-Corporation");
		
		WebElement source2 = driver.findElement(By.id("dataSourceId"));
		Select drop3= new Select(source2);
		//Thread.sleep(2000);
		drop3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement source3 = driver.findElement(By.id("marketingCampaignId"));
		Select drop4= new Select(source3);
		//Thread.sleep(2000);
		drop4.selectByIndex(6);
		
		WebElement source4 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select drop5= new Select(source4);
		//Thread.sleep(2000);
		drop5.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@class=\"smallSubmit\"]")).click();
		//driver.findElement(By.linkText("Create Account Ignoring Duplicates")).click();

	}

	
}
