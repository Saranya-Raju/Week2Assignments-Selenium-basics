package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		//System.out.println(driver.getTitle());
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("saranya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raj");
		WebElement source =driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop1=new Select(source);
		Thread.sleep(2000);
		drop1.selectByVisibleText("Website");
		WebElement source1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drop2= new Select(source1);
		Thread.sleep(2000);
		drop2.selectByValue("9001");
		
		WebElement source2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drop3= new Select(source2);
		Thread.sleep(2000);
		drop3.selectByIndex(5);
		
		WebElement source3 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drop4= new Select(source3);
		Thread.sleep(2000);
		drop4.selectByVisibleText("India");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);
		if (text.contains("Testleaf")) {
		System.out.println("Lead is created");			 	
	     } 
		 else {
		System.out.println("Lead is not created");

	}
	 //driver.close();
			
		}
		
	}


