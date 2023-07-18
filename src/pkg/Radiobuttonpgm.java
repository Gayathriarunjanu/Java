package pkg;

import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Radiobuttonpgm {
	ChromeDriver driver;

		
		@Before
		public void setUp()
		{
			driver=new ChromeDriver();
			driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		}


	@Test
	public void test4()
	{


boolean radio= driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[1]")).isSelected();

if(radio)
{
System.out.println("selected");	
}
else
{
	System.out.println("not selected");
}

























	}














	}
