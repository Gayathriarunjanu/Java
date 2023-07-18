package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
ChromeDriver driver;
@Before
public void setUp() 
{
	driver=new ChromeDriver();
	driver.get("file:///C:/Users/gayat/OneDrive/Desktop/GAYATHRI%20G/alert_example.html");
}
@Test
public  void alertverify()
{
	driver.findElement(By.xpath("//html/body/input[1]")).click();
	Alert a=driver.switchTo().alert();
	String text=a.getText();
	      System.out.println(text);
	      a.accept();
	      driver.findElement(By.xpath("//html/body/input[2]")).sendKeys("Gaya");
	      driver.findElement(By.xpath("//html/body/input[3]")).sendKeys("G");
	      driver.findElement(By.xpath("//html/body/input[4]")).click();
	
	      
















}








}
