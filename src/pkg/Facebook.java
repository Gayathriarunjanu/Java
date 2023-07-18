package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
      ChromeDriver driver;

@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
}



@Test
public  void test()
{
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gayathriammuss1996@gmail.com");
	
	
	
	
	
	//driver.findElement(By.id("email")).sendKeys("gayathriiiammu@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("chinkarutanku");
	driver.findElement(By.name("login")).click();
	String actualtitle=driver.getTitle();
	System.out.println(actualtitle);





}












}
