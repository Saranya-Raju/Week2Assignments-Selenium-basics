package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
    driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Saranya");
    driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
    driver.findElement(By.linkText("12652")).click();
    String title = driver.getTitle();
    String title1="View Lead | opentaps CRM";
    if (title.equalsIgnoreCase(title1))
    {
		System.out.println(title);
	} 
    else 
    {
		System.out.println("The title is not verified");
	}
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.id("updateLeadForm_companyName")).clear();
    driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Leaf Test");
    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
    String S1 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
    if (S1.equalsIgnoreCase("Leaf Test (12652)")) 
    {
		System.out.println("Lead is updated");
	} 
    else 
	{
     System.out.println("Lead is not updated");
	}
    driver.close();
	}

}
