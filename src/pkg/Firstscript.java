package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		
		String expectedtitle = "google";
	ChromeDriver  driver = new ChromeDriver();
	driver.get("Https://www.google.com");
	String actualtitle=driver.getTitle();
	
	System.out.println("actualtitle="+actualtitle);
	if(expectedtitle==actualtitle)
	{
		System.out.println("pass");
	}
	
	
	else
	{
		System.out.println("fail");
	}
	
	
	
	
	
	
	
	
	
	
	
	}

}

---------------------SSSS