package pkggggg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagee.Weatherpage;

public class Weatherpagetest {

WebDriver driver;
@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://openweathermap.org");
}

@Test
public void weathertest() {
	Weatherpage ob=new Weatherpage(driver);
ob.setvalues("vaikom");
ob.clickButton();



}




























}
