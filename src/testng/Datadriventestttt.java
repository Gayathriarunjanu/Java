
package testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventestttt {

	ChromeDriver driver;
	
	
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}

@BeforeMethod
public void urlloading()
{
	driver.get("https://www.facebook.com/");
}
	



@Test
public void test() throws Exception 
{
	FileInputStream f=new FileInputStream("C:\\Users\\gayat\\OneDrive\\Desktop\\GAYATHRI G\\Bookdatadriventest.xlsx");

XSSFWorkbook wb=new XSSFWorkbook(f);
XSSFSheet sh=wb.getSheet("Sheet2");//sheet details

int row=sh.getLastRowNum();//rowdetails
for (int i=1;i<=row;i++)
{
	String username=sh.getRow(i).getCell(0).getStringCellValue();
	double pswd=sh.getRow(i).getCell(1).getNumericCellValue();
	int p=(int)pswd;
	
	String password= String.valueOf(p);
System.out.println("username="+username+"\n"+"password="+password);

driver.findElement(By.name("email")).clear();
driver.findElement(By.name("email")).sendKeys(username);
driver.findElement(By.name("pass")).clear();
driver.findElement(By.name("pass")).sendKeys(password);









}


















}



}