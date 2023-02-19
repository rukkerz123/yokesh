package dhamu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pomclass {   
	@FindBy(xpath ="//input[@class='input_error form_input']")
	public static WebElement username ;
  
@FindBy(xpath = "//input[@id='password']")
public static WebElement password ; 
  
@FindBy (xpath = "//input[@type='submit']")
private WebElement  click ;  
@FindBy(xpath = "//select[@class ='product_sort_container']")
private WebElement pricerange ;
@FindBy(xpath = "//div[contains(text() , 'Sauce Labs Fleece Jacket')]")
private WebElement selectproduct ;
@FindBy(xpath = "//button[@class ='btn btn_primary btn_small btn_inventory']")
private  WebElement addtocart ;
public WebElement getUsername() {
	return username;
}
public void setUsername(WebElement username) {
	this.username = username;
}
public WebElement getPassword() {
	return password;
}
public void setPassword(WebElement password) {
	this.password = password;
}
public WebElement getClick() {
	return click;
}
public void setClick(WebElement click) {
	this.click = click;
}
public WebElement getPricerange() {
	return pricerange;
}
public void setPricerange(WebElement pricerange) {
	this.pricerange = pricerange;
}
public WebElement getSelectproduct() {
	return selectproduct;
}
public void setSelectproduct(WebElement selectproduct) {
	this.selectproduct = selectproduct;
}
public WebElement getAddtocart() {
	return addtocart;
}
public void setAddtocart(WebElement addtocart) {
	this.addtocart = addtocart;
} 
}



