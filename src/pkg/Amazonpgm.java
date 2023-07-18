package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpgm {
	ChromeDriver driver;





@Before
public void setUp()
{
	driver= new ChromeDriver();
	driver.get("https://www.amazon.in");
	
}


@Test
public void test1()
{
	
	driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("phones" ,Keys.ENTER);
	driver.findElement(By.xpath("//*[@id='nav-cart']")).click();	

	
	driver.findElement(By.xpath("//div[@class='nav-line-1-container']")).click();
	
	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("bbdhhbfbh@gmail.com");
	
	driver.findElement(By.xpath("//input[@id='continue']")).click();
	

      driver.navigate().back();
      driver.navigate().back();


                                 
          
      

      driver.findElement(By.xpath("//div[@id='nav-xshop']/a[8]")).click();

      

      driver.findElement(By.xpath("//*[@class='hm-icon nav-sprite']")).click();




}




















}
