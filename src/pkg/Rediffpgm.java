package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffpgm {

ChromeDriver driver;

@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://www.rediff.com");
}
@Test
public void test1()
{
	
}




}