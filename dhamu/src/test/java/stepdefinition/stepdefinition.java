package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dhamu.baseclass;
import dhamu.pomclass;

public class stepdefinition extends baseclass { 
	@Given("The user is on login page")
	public void the_user_is_on_login_page() { 
		launchbrowser(); 
		launchurl("https://www.saucedemo.com/");
	}
	    
	

//	@Given("user able to enter the valid username and password .")
//	public void user_able_to_enter_the_valid_username_and_password() {  
//		PageFactory.initElements(driver, pomclass.class);
//		username(pomclass.username, "standard_user"); 
//		password(pomclass.password, "secret_sauce");
//	   
//	}
//
//	@When("User able to click the login button .")
//	public void user_able_to_click_the_login_button() throws InterruptedException {  
//		click(pomclass.click); 
//		Thread.sleep(3000);
//	}
//	   
//	
//
//	@Then("The user should be generated to the nextpage.")
//	public void the_user_should_be_generated_to_the_nextpage() { 
//		String url = driver.getCurrentUrl();
//		Assert.assertTrue("check the url", url.contains("SearchHotel.php")); 
//	}
//	    
//	

	
	   
	

}
