package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testingdemo {

//@beforesuite
	//@beforeclass
	//@beforetest
	//@beforemethod
	//@test
	//@aftermetthod
	//@aftertest
	//@afterclass
	//@aftersuite
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver= new ChromeDriver();
	}


@BeforeMethod
public void urlloaading()
{
	driver.get("https;//www.facebook.com/");
}
@Test
public void test1() 
{
	String src=driver.getPageSource();
	if(src.contains("Facebook"))
	{
		System.out.println("Title is present");
	}
	else
	{
		System.out.println("Not present");
	}



}

@Test
public void test2()
{
System.out.println("test2");	
}
		
@Test
public void test3() 

{
	System.out.println("test3");
}
	@AfterTest
	
	public void tearDown()
	{
		System.out.println("aftertest");
	}






















}





