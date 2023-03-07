package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Find Leads")).click();
	    driver.findElement(By.linkText("Phone")).click();
	    driver.findElement(By.xpath("//input[@id='ext-gen270']")).sendKeys("99");
	    driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
	   driver.findElement(By.linkText("14771")).click();
	   driver.findElement(By.className("subMenuButtonDangerous")).click();
	   driver.findElement(By.linkText("Find Leads")).click();
	   driver.findElement(By.xpath("//input[@id='ext-gen246']")).sendKeys("14771");
	   driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
	   String text = driver.findElement(By.className("x-paging-info")).getText();
	   String text1="No records to display";
	   if (text.equals(text1)) 
	   {
		System.out.println("Record not found");
	} else 
	{
    System.out.println("Record not deleted");
	}
	    
     driver.close();
	}

}
