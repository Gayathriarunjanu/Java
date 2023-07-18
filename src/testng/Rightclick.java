package testng;



import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	
	public class Rightclick {
		
		ChromeDriver driver;
		
		
		
		
		@Before
		public void setUp()
		{
			driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	
		}

	@Test
	public void test1()
	{
	WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	Actions act=new Actions(driver);
	act.contextClick(right);
	act.perform();
	driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
	driver.switchTo().alert().accept();
	
	WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.doubleClick(doubleclick);
		act.perform();	
	Alert a=driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
	
	
	
	
	}










	








	}

