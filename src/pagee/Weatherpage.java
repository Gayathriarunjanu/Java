package pagee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Weatherpage {


WebDriver driver;

By wthrmarketplace=By.xpath("//*[@id=\"desktop-menu\"]/ul/li[4]/a");
By wthrguide=By.xpath("//*[@id=\"desktop-menu\"]/ul/li[1]/a");
By wthrprice=By.xpath("//*[@id=\"desktop-menu\"]/ul/li[5]/a");
By wthrsupport=By.xpath("//*[@id=\"support-dropdown\"]");
By wthrmaps=By.xpath("//*[@id=\"desktop-menu\"]/ul/li[6]/a");
By wthrsearchfield=By.xpath("//*[@id=\"weather-widget\"]/div[1]/div/div/div[2]/div[1]/div/input");
By wthrsearch=By.xpath("//*[@id=\"weather-widget\"]/div[1]/div/div/div[2]/div[1]/button");


public Weatherpage(WebDriver driver)
{
	
	this.driver=driver;


}

public void setvalues(String searchfield)
{
	
	driver.findElement(wthrsearchfield).sendKeys(searchfield);
}

public void clickButton()
{
	driver.findElement(wthrmarketplace).click();
	driver.findElement(wthrguide).click();
	driver.findElement(wthrprice).click();
	
	driver.findElement(wthrsupport).click();
	
	driver.findElement(wthrmaps).click();
	
	driver.findElement(wthrsearch).click();
	
}






































































}
