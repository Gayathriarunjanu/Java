package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listpgm {
ChromeDriver driver;

@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.com");
}
@Test
public void test1()
{
	List<WebElement> links=driver.findElements(By.tagName("a"));
	
	System.out.println("total no of links="+links.size());
 
for(WebElement u:links)
{
	String link=u.getAttribute("href");
	String linktext=u.getText();
	System.out.println(link+"--"+linktext);

}

}

}
						






















