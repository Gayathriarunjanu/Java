
package mypractise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Junitscript2 {
ChromeDriver driver;


@BeforeClass
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	
	
}


@Test
public void test()
{
	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("flashcard",Keys.ENTER);
	
	String actualtitle=driver.getTitle();
System.out.println(actualtitle);

}


@AfterClass
public void teardown()
{
	
}










}
