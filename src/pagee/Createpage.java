package pagee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Createpage {

WebDriver driver;

By searchfieldd= By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input");
By searchitem= By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input");
By bestseller= By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[4]/a/span");


public Createpage(WebDriver driver)
{
	this.driver=driver;
	
	
	
}

public void setvalues(String flashcrd)

{
	
	driver.findElement(searchitem).sendKeys(flashcrd);
}
public void click() {

	driver.findElement(searchfieldd).click();
driver.findElement(bestseller).click();

}


















}
