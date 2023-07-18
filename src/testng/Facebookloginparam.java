package testng;
            import org.junit.Before;
			import org.junit.Test;
			import org.openqa.selenium.By;
			import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
			
			public class Facebookloginparam {
			  ChromeDriver driver;

			@Before
			public void setUp()
			{
				driver=new ChromeDriver();
				driver.get("https://www.facebook.com");
			}


@Parameters({"username","password"})
			@Test
			public  void test(String un,String pswd)
			{
				driver.findElement(By.id("email")).sendKeys(un);
				driver.findElement(By.name("pass")).sendKeys(pswd);
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

	
	
	
	
	
	
	
	
			
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	