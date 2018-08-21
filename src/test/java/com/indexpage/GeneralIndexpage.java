package com.indexpage;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.init.AbstractPage;
import com.init.Common;
import com.utility.TestData;
import com.verification.GeneralVerification;

public class GeneralIndexpage extends AbstractPage {

	public GeneralIndexpage(WebDriver driver) {
		super(driver);
	}

	//Variables
	
	String root=null;
	
	//profile picture path
	
	
	
    //XPATH for all Registration Form Fields
	
	@FindBy (xpath = "//input[@name='first_name']") private WebElement first_name_txt;
	
	@FindBy (xpath ="//input[@name='last_name']") private WebElement last_name_txt;
	
	@FindBy (xpath="//ul/li[2]/div/div[@class='radio_wrap']/input" ) private List<WebElement> marital_status;
	
	@FindBy (xpath = "//ul/li[3]/div/div[@class='radio_wrap']/input") private List<WebElement> hobby;
	
	@FindBy (xpath="//select[@id='dropdown_7']") private WebElement country;
	
	@FindBy (xpath="//select[@id='dropdown_7']/option") private List<WebElement> option_country;
	
	@FindBy (xpath = "//select[@id='dd_date_8']") private WebElement birth_day;
	
	@FindBy (xpath = "//select[@id='dd_date_8']/option") private List<WebElement> option_birth_day;
	
	@FindBy (xpath="//select[@id='mm_date_8']") private WebElement birth_month;
	
	@FindBy (xpath="//select[@id='mm_date_8']/option") private List<WebElement> option_birth_month;
	
	@FindBy (xpath="//select[@id='yy_date_8']") private WebElement birth_year;
	
	@FindBy (xpath="//select[@id='yy_date_8']/option") private List<WebElement> option_birth_year;
	
	@FindBy(xpath=".//input[@id='phone_9']") private WebElement phone_no;
	
	@FindBy (xpath="//input[@id='username']") private WebElement username;
	
	@FindBy (xpath="//input[@id='email_1']")private WebElement email;
	
	@FindBy (xpath="//input[@id='profile_pic_10']") private WebElement yourprofile_picture;
	
	@FindBy(xpath = "//textarea[@name='description']") private WebElement aboutyourself;
	
	@FindBy  (xpath=".//input[@id='password_2']") private WebElement password_txt;
	
	@FindBy (xpath=".//input[@id='confirm_password_password_2']") private WebElement confirm_password_txt;
	
	@FindBy(xpath = ".//input[@name='pie_submit']")	private WebElement submit_btn;
	
	
	 
	//Demo sites
	
	@FindBy (xpath="//span/span/span[contains(text(),'DEMO SITES')]") private WebElement demosites;
	
	@FindBy(xpath="//span/span/span[contains(text(),'E-Commerce Demo Site')]") private WebElement e_commerce_demo_site;
	
	@FindBy (xpath="//a[contains(text(),'Product Category')]") private WebElement mousehoveron_product_category;
	
	@FindBy (xpath="//a[contains(text(),'iPads')]") private WebElement ipads;
	
	@FindBy (xpath="//a[contains(text(),'Apple iPad 2 16GB, Wi-Fi, 9.7in � Black')]") private WebElement clickon_apple_product;
	
	@FindBy (xpath="//input[@value='Add To Cart']") private WebElement addproducttocart;
	
	@FindBy (xpath="//em[contains(text(),'item')]") private WebElement opencart;
	
	@FindBy (xpath="//*[@id='checkout_page_container']/div[1]/table/tbody/tr[2]/td[3]/form/input[1]") private WebElement updatequantity;
	
	@FindBy (xpath="//span[contains(text(),'Continue')]") private WebElement clickoncontinue;
	
	@FindBy(xpath="//input[@title='billingemail']") private WebElement emailaddress;
	
	@FindBy (xpath="//input[@title='billingfirstname']") private WebElement demo_firstname;
	
	@FindBy(xpath="//input[@title='billinglastname']")private WebElement demo_lastname;
	
	@FindBy (xpath="//textarea[@title='billingaddress']")private WebElement demo_address;
	
	@FindBy (xpath="//input[@title='billingcity']")private WebElement demo_city;
	
	@FindBy (xpath="//input[@title='billingstate']")private WebElement demo_state_province;
	
	@FindBy(xpath="//select[@title='billingcountry']")private WebElement demo_country;
	
	@FindBy (xpath="//input[@title='billingpostcode']")private WebElement demo_postalcode;
	
	@FindBy (xpath="//input[@title='billingphone']")private WebElement demo_phonenumber;
	
	@FindBy (xpath="//input[@id='shippingSameBilling']")private WebElement demo_shipping_address;
	
	@FindBy(xpath="//input[@class='make_purchase wpsc_buy_button']")private WebElement demo_clickonpurchase_button;
	
	@FindBy(xpath="//input[@value='Update']")private WebElement click_on_update;
	
	
	
	
	
public GeneralVerification submit_click() {
	// TODO Auto-generated method stub
	
	submit_btn.click();
	return new GeneralVerification(driver);
}




public GeneralVerification enterinvalidphonenumber() {
	// TODO Auto-generated method stub
	
	phone_no.click();
	
	String invalidphonenumber = TestData.invalidphonenumber();
	
	Common.log("--->Enter Invalid Phone Number = "+invalidphonenumber+ " <---");
	
	phone_no.sendKeys(invalidphonenumber);
	
	return new GeneralVerification(driver);
}



public GeneralVerification enterinvalidpassword() {
	// TODO Auto-generated method stub
	password_txt.click();
	
    String invalidpassword = TestData.invalidpassword();
	
	Common.log("--->Enter Invalid Password = "+invalidpassword+ " <---");
	
	password_txt.sendKeys(invalidpassword);
	
	return new GeneralVerification(driver);
}



public GeneralVerification enterpasswordnotmatch() {
	// TODO Auto-generated method stub
    password_txt.click();
	
    String password = TestData.donotmatchpassword();
	
	Common.log("--->Enter Password = "+password+ " <---");
	
	password_txt.sendKeys(password);
	
	return new GeneralVerification(driver);
}



public GeneralVerification enterconfirmpasswordnotmatch() {
	// TODO Auto-generated method stub
	
	confirm_password_txt.click();
	
    String password = TestData.donotmatchconfirmpassword();
	
	Common.log("--->Enter Confrim Password(do not match with password) = "+password+ " <---");
	
	confirm_password_txt.sendKeys(password);
	
	return new GeneralVerification(driver);
}

public GeneralVerification enterinvalidemailid() {
	// TODO Auto-generated method stub
	
	 email.click();
	 
	 String invalidemailid = TestData.invalidemailid();
	 
	 Common.log("--->Enter Invalid Emailid = "+invalidemailid+" <---");
	 
	 email.sendKeys(invalidemailid);
	
	return new GeneralVerification(driver);
}

public GeneralVerification enterfirstname() {
	// TODO Auto-generated method stub
	   
	   first_name_txt.click();
	   
	   String firstname = TestData.firstname();
	   
	   Common.log("--->Enter Invalid Emailid = "+firstname+" <---");
	   
	   first_name_txt.sendKeys(firstname);
	   
	   return new GeneralVerification(driver);
}

public GeneralVerification enterlastname() {
	// TODO Auto-generated method stub
	
	   last_name_txt.click();
	   
	   String lastname = TestData.lastname();
	   
	   last_name_txt.sendKeys(lastname);
	   
	   Common.log("--->Enter Invalid Emailid = "+lastname+" <---");
	   
	   return new GeneralVerification(driver);
}

public GeneralVerification selectmaritalstatus() {
	// TODO Auto-generated method stub
	
	   String value="value";
	   
	   for(WebElement status : marital_status){
		   
		   if(status.getAttribute(value).trim().equals("married"))
			   
		   status.click();
		   
		   Common.log("--->Selected Maritalstatus = "+status.getAttribute(value).trim()+" <---");
		   
		   Common.pause(2);
	   }
	
	 return new GeneralVerification(driver);
}

public GeneralVerification selecthobby() {
	// TODO Auto-generated method stub
	
	 String value="value";
	 
	for(WebElement hobby_status : hobby){
		   
		    hobby_status.click();
			
			Common.log("--->Selected Hobby = "+hobby_status.getAttribute(value).trim()+" <---");
			
			Common.pause(2);
	 }
	
	return new GeneralVerification(driver);
}





public GeneralVerification selectcountry() {
	// TODO Auto-generated method stub
	

    Select country_dropdown= new Select(country);
    
    for(int i=0;i<option_country.size();i++)
    {
  	 if(i<3){
  		 
  		 country_dropdown.selectByIndex(i);
  	      
  	      Common.pause(2);
  	 }
    
  	 else
  		 break;
    
    }
    
   country_dropdown.selectByVisibleText("India");   
   
   
   Common.log("---> Selected Country = Indian <---");
	
   return new GeneralVerification(driver);
}





public GeneralVerification selectdateofbirth() {
	// TODO Auto-generated method stub
	
	
	Select day_dropdown= new Select(birth_day);
    
    for(int i=0;i<option_birth_day.size();i++)
    {
  	 if(i<3){
  		 
  		 day_dropdown.selectByIndex(i);
  	      
  	     Common.pause(2);
  	 }
    
  	 else
		 break;
    
    }
    
   day_dropdown.selectByVisibleText("30");      
   
   
  Select month_dropdown= new Select(birth_month);
   
   for(int i=0;i<option_birth_month.size();i++)
   {
 	 if(i<3){
 		 
 		 month_dropdown.selectByIndex(i);
 	      
 	      Common.pause(2);
 	 }
 	 else
		 break;
   
   }
   
  month_dropdown.selectByVisibleText("12");      
  
  
  Select year_dropdown= new Select(birth_year);
  
  for(int i=0;i<option_birth_year.size();i++)
  {
	 if(i<3){
		 
		 year_dropdown.selectByIndex(i);
	      
	     Common.pause(2);
	 }
	else
		 break;
  
  }
  
  year_dropdown.selectByVisibleText("1982");      
 
  Common.log("--->Selected Date Of Birth = 12/30/1982 <---");
  
	 return new GeneralVerification(driver);
}





public GeneralVerification enterphonenumber() {
	// TODO Auto-generated method stub
    
	phone_no.click();
	
	String validphonenumber = TestData.phonenumber();
	
	Common.log("--->Enter Valid Phone Number = "+validphonenumber+ " <---");
	
	phone_no.sendKeys(validphonenumber);
	
	return new GeneralVerification(driver);
}





public GeneralVerification enterusername() {
	// TODO Auto-generated method stub
	
	username.click();
	
    String validusername = TestData.username();
	
	Common.log("--->Enter Valid User Name = "+validusername+ " <---");
	
	username.sendKeys(validusername);
	
	return new GeneralVerification(driver);
}





public GeneralVerification enteremailid() {
	// TODO Auto-generated method stub
	
	email.click();
	
    String validemailid = TestData.emailid();
	
	Common.log("--->Enter Valid Emailid = "+validemailid+ " <---");
	
	email.sendKeys(validemailid);
	
	return new GeneralVerification(driver);
}





public GeneralVerification selectyourprofilepic() {
	// TODO Auto-generated method stub
	
	String profile_picture_path = "C:/Users/Public/Pictures/Sample Pictures/Tulips.jpg";
	
	yourprofile_picture.sendKeys(profile_picture_path);
	
	Common.log("--->Selected Profile Picture From  = "+profile_picture_path+ " <---");
	
	return new GeneralVerification(driver);
}




public GeneralVerification enteraboutyourself() {
	// TODO Auto-generated method stub
	
	aboutyourself.click();
	
	aboutyourself.sendKeys(TestData.aboutyourself());
	
	Common.log("--->About YourSelf  = "+TestData.aboutyourself()+ " <---");
	
	return new GeneralVerification(driver);
}




public GeneralVerification enterpassword() {
	// TODO Auto-generated method stub
	
    password_txt.click();
	
    String validpassword = TestData.password();
	
	Common.log("--->Enter Invalid Password = "+validpassword+ " <---");
	
	password_txt.sendKeys(validpassword);
	
	return new GeneralVerification(driver);
}




public GeneralVerification enterconfirmpassword() {
	
	// TODO Auto-generated method stub
    confirm_password_txt.click();
	
    String password = TestData.confirmpassword();
	
	Common.log("--->Enter Confrim Password = "+password+ " <---");
	
	confirm_password_txt.sendKeys(password);
	
	return new GeneralVerification(driver);
}




public GeneralVerification enterexistusername() {
	// TODO Auto-generated method stub
    username.click();
	
    String existvalidusername = TestData.existusername();
	
	Common.log("--->Enter Valid User Name = "+existvalidusername+ " <---");
	
	username.sendKeys(existvalidusername);
	
	return new GeneralVerification(driver);
}




public GeneralVerification enternotregisteremailid() {
	// TODO Auto-generated method stub
    
	email.click();
	
    String validemailid = TestData.notregisteremailid();
	
	Common.log("--->Enter Valid Emailid = "+validemailid+ " <---");
	
	email.sendKeys(validemailid);
	
	return new GeneralVerification(driver);
}




public GeneralVerification enternotexistusername() {
	// TODO Auto-generated method stub
	
    username.click();
	
    String notexistvalidusername = TestData.notexistusername();
	
	Common.log("--->Enter Valid User Name = "+notexistvalidusername+ " <---");
	
	username.sendKeys(notexistvalidusername);
	
	return new GeneralVerification(driver);
}


public GeneralVerification enterregisteremailid() {
	// TODO Auto-generated method stub
email.click();
	
    String validemailid = TestData.registeremailid();
	
	Common.log("--->Enter Valid Emailid = "+validemailid+ " <---");
	
	email.sendKeys(validemailid);
	
	return new GeneralVerification(driver);
}




public GeneralVerification click_on_demosites() {
	// TODO Auto-generated method stub
	
	Common.pause(8);
	
	root = driver.getWindowHandle();

	demosites.click();
	
	return new GeneralVerification(driver);
}




public GeneralVerification click_on_e_commerce_demosite() {
	// TODO Auto-generated method stub
	
	Common.pause(2);
	
	e_commerce_demo_site.click();
	
	Common.pause(8);
	
	Set<String> handles = driver.getWindowHandles();
	
	System.out.println(handles);
	
	System.out.println(root);
	
	for(String handle : handles){
		
		if(!root.equals(handle))
			driver.switchTo().window(handle);
		
	}
	
	return new GeneralVerification(driver);
}




public GeneralVerification mousehoveron_product_category() {
	// TODO Auto-generated method stub
	
	Common.pause(10);
	
	Actions hover = new Actions(driver);
	
	hover.moveToElement(mousehoveron_product_category).build().perform();
	
	return new GeneralVerification(driver);
}




public GeneralVerification clickonipads() {
	// TODO Auto-generated method stub
	
	Common.pause(8);
	
	ipads.click();
	
	return new GeneralVerification(driver);
}




public GeneralVerification productdetails() {
	// TODO Auto-generated method stub
	
	Common.pause(3);
	
	clickon_apple_product.click();
	
	return new GeneralVerification(driver);
}




public GeneralVerification addproducttocart() {
	// TODO Auto-generated method stub
	
	Common.pause(3);
	
	addproducttocart.click();
	
	return new GeneralVerification(driver);
}




public GeneralVerification openthecart() {
	// TODO Auto-generated method stub
	Common.pause(8);
	
	opencart.click();
	
	return new GeneralVerification(driver);
}




public GeneralVerification updateproductquantity() {
	// TODO Auto-generated method stub
	
	Common.pause(8);
	
	updatequantity.click();
	
	updatequantity.clear();
	
	updatequantity.sendKeys("2");
	
	
	
	Common.pause(5);
	
	return new GeneralVerification(driver);
}




public GeneralVerification clickoncomtinuebutton() {
	// TODO Auto-generated method stub
	Common.pause(3);
	
	clickoncontinue.click();
	
	return new GeneralVerification(driver);
}




public GeneralVerification enteremailaddress() {
	// TODO Auto-generated method stub
	
	Common.pause(10);
	
	emailaddress.click();
	
    String validemailid = TestData.emailid();
	
	Common.log("--->Enter Valid Emailid = "+validemailid+ " <---");
	
	emailaddress.sendKeys(validemailid);
	
	return new GeneralVerification(driver);
}




public GeneralVerification demo_enterfirstname() {
	// TODO Auto-generated method stub
	Common.pause(2);
	
	demo_firstname.click();
	
	Common.pause(1);
	
	demo_firstname.sendKeys(TestData.demo_firstname());
	
	Common.log("--->Enter Valid FirstName = "+TestData.demo_firstname()+ " <---");
	
	return new GeneralVerification(driver);
}




public GeneralVerification demo_enterelastname() {
	// TODO Auto-generated method stub
	Common.pause(2);
	
	demo_lastname.click();
	
	Common.pause(1);
	
	demo_lastname.sendKeys(TestData.demo_lastname());
	
	Common.log("--->Enter Valid LastName = "+TestData.demo_lastname()+ " <---");
	
	return new GeneralVerification(driver);
}




public GeneralVerification demo_enteraddress() {
	// TODO Auto-generated method stub
	
    Common.pause(2);
	
    demo_address.click();
	
	Common.pause(1);
	
	demo_address.sendKeys(TestData.demo_address());
	
	Common.log("--->Enter Valid Address = "+TestData.demo_address()+ " <---");
	
	return new GeneralVerification(driver);
}




public GeneralVerification demo_enterecity() {
	// TODO Auto-generated method stub
   Common.pause(2);
	
   demo_city.click();
	
	Common.pause(1);
	
	demo_city.sendKeys(TestData.demo_city());
	
	Common.log("--->Enter Valid City = "+TestData.demo_city()+ " <---");
	
	return new GeneralVerification(driver);
}




public GeneralVerification demo_enterestate_province() {
	// TODO Auto-generated method stub
	   Common.pause(2);
	
	   demo_state_province.click();
		
		Common.pause(1);
		
		demo_state_province.sendKeys(TestData.demo_state_province());
		
		Common.log("--->Enter Valid state/Province = "+TestData.demo_state_province()+ " <---");
		
		return new GeneralVerification(driver);
}




public GeneralVerification demo_entercountry() {
	// TODO Auto-generated method stub
	  Common.pause(2);
	 
	  Select country = new Select(demo_country);
	  
	  Common.pause(1);
	  
	  country.selectByVisibleText(TestData.demo_country());
	   
	  Common.log("--->Enter Valid state/Province = "+TestData.demo_country()+ " <---");
		
      return new GeneralVerification(driver);
}




public GeneralVerification demo_enterpostalcode() {
	// TODO Auto-generated method stub
	  Common.pause(2);
		
      demo_postalcode.click();
		
		Common.pause(1);
		
		demo_postalcode.sendKeys(TestData.demo_postalcode());
		
		Common.log("--->Enter Valid state/Province = "+TestData.demo_postalcode()+ " <---");
		
		return new GeneralVerification(driver);
}




public GeneralVerification demo_enterphonenumber() {
	// TODO Auto-generated method stub
	Common.pause(2);
	
	demo_phonenumber.click();
		
		Common.pause(1);
		
		demo_phonenumber.sendKeys(TestData.demo_phonenumber());
		
		Common.log("--->Enter Valid state/Province = "+TestData.demo_phonenumber()+ " <---");
		
		return new GeneralVerification(driver);
}




public GeneralVerification entershippingaddress() {
	// TODO Auto-generated method stub
	Common.pause(3);
	
	demo_shipping_address.click();
	
	Common.log("---> Chose Shipping Address same as Billing Address <---");
	
	return new GeneralVerification(driver);
}




public GeneralVerification clickonpurchasebutton() {
	// TODO Auto-generated method stub
	Common.pause(3);
	
	demo_clickonpurchase_button.click();
	
	Common.log("---> Click on purchase button  <---");
	
	Common.pause(8);
	return new GeneralVerification(driver);
}




public GeneralVerification clickonupdatebutton() {
	// TODO Auto-generated method stub
	Common.pause(3);
	
	click_on_update.click();
	
	Common.log("---> Click on Update button  <---");
	
	return new GeneralVerification(driver);
}



}


