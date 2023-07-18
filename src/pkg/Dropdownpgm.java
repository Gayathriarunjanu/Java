package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownpgm {


ChromeDriver driver;


@Before
public void setUp()
{
	driver=new ChromeDriver();

driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
public void test1()
{
	WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
Select daydetails=new Select(day);
daydetails.selectByValue("04");








}





























}
