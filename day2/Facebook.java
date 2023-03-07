package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get(" https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	driver.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg _')])[1]")).sendKeys("Saran");
	driver.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg _')])[2]")).sendKeys("Aravinth");
	driver.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg _')])[3]")).sendKeys("9994107393");
	driver.findElement(By.id("password_step_input")).sendKeys("123456");
	WebElement wb = driver.findElement(By.id("day"));
	Select se=new Select(wb);
	se.selectByValue("9");
	
	WebElement wb1 = driver.findElement(By.id("month"));
	Select se1=new Select(wb1);
	se1.selectByValue("1");
	
	WebElement wb2 = driver.findElement(By.id("year"));
	Select se2=new Select(wb2);
	se2.selectByValue("1988");
	driver.findElement(By.xpath("(//input[@class='_8esa'])[1]")).click();
	
	}
}