package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametristion {


ChromeDriver driver;
@BeforeTest

	public void setUp()
	{
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
	}
@Parameters("search")
@Test
public void test1(String s)
{

	driver.findElement(By.name("q")).sendKeys(s);
	
	
	
	
	
	
	
	
}






























}
