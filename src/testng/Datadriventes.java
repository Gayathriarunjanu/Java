package testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Datadriventes {


@Test
public void test() throws Exception 
{
	FileInputStream f=new FileInputStream("C:\\Users\\gayat\\OneDrive\\Desktop\\GAYATHRI G\\Bookdatadriventest.xlsx");

XSSFWorkbook wb=new XSSFWorkbook(f);
XSSFSheet sh=wb.getSheet("Sheet1");//sheet details

int row=sh.getLastRowNum();//rowdetails
for (int i=1;i<=row;i++)
{
	String username=sh.getRow(i).getCell(0).getStringCellValue();
String pswd=sh.getRow(i).getCell(1).getStringCellValue();
System.out.println("username="+username+"\n"+"password="+pswd);











}


















}



}