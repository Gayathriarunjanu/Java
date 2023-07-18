package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	String src=driver.getPageSource();
	if(src.contains("Gmail"))
	{
		System.out.print("text is present");
	}
	else
	{
		System.out.println("text is not present");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
