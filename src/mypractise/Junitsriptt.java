package mypractise;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitsriptt {
	ChromeDriver driver;


@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	
}

@Test
public void test1() {

	String title=driver.getTitle();
	System.out.println(title);
	
}


@After
public void teardown()
{
	driver.quit();
}























}
