package testng;
import org.junit.Before;
		import org.junit.Test;
		import org.openqa.selenium.By;
		import org.openqa.selenium.chrome.ChromeDriver;
		
		public class Loginpage {

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
			driver.findElement(By.id("email")).sendKeys("gayathriiiiammu@gmail.com");
			driver.findElement(By.name("pass")).sendKeys("chinkarutanku");
			driver.findElement(By.name("login")).click();
			String exp="https://www.facebook.com/login.php/";
			String actual=driver.getCurrentUrl();
			if(actual.equals(exp))
			{
				System.out.println("login sucessfull");
			}
			else
			{
				System.out.println("login failed");
			}












		}




}
