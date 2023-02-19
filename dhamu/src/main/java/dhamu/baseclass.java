package dhamu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass { 
	public static WebDriver driver ;
	public static void  launchbrowser () {  
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver ();  
		
		
		
		
	} 
	public static void launchurl(String Url) { 
		driver.get(Url);
	} 
	public static void  username (WebElement  element , String text) { 
		element.sendKeys(text);
	}  
	public static void  password (WebElement  element , String text) { 
		element.sendKeys(text); 
	} 
	public static  void click (WebElement element) { 
		element.click();
	} 
	public static void  pricerange (WebElement element , int n) {
		Select sc=  new Select (element); 
		sc.selectByIndex(n);
	} 
	public static void  product (WebElement element) {
		element.click();
	} 
	public static void  addtocart (WebElement element) {
		element.click();
	}
	
	
	

}
