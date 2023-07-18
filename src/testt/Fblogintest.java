package testt;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

import pagee.Fbloginpage;

	

	public class Fblogintest {
	WebDriver driver;



	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	driver.get("https://www.facebook.com");

	}

	@Test
	public void fbtest()
	{	
		
		
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setvalues("abc@gmail.com","abc123");
		ob.login();
	}





















































}
