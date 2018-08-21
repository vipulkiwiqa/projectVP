package com.index;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.init.Common;
import com.init.SeleniumInit;
import com.verification.GeneralVerification;

public class GeneralIndex extends SeleniumInit {

	
    //To verify that all mandatory fields get the blank field validation message
	@Test(priority=0)
	
	public void blankfields() {
        
		int step=1;
		
		Common.logcase("To verify that all mandatory fields get the blank field validation message");

		Common.logcase("--------------------------------------------------------------------------");
		
		Common.logstep("Step "+ (step++) +". open : http://demoqa.com/registration/");
		
		boolean tf = generalVerification.verifyhomepage();
		
		if(tf){
			
			Common.logstep("Step "+ (step++) +". Click on Submit button");
			
			generalVerification = generalIndexpage.submit_click();
		}
		else
			Common.log("--->  Home page is not open  <---");
		
		if(generalVerification.blankfieldsvalidationmsg()){
			
			   Common.logStatus("Pass");
			   Assert.assertTrue(true);
		}
		else
		  {
		       Common.logStatus("Fail");
		       Assert.assertTrue(false);
		  } 
			  
	}
	
	
	
	//To verify phone field get minimum length validation message
	@Test(priority=0)
	
	public void phonefield_minimum_length() {
		
        int step=1;
		
		Common.logcase("To verify phone field get minimum length validation message");

		Common.logcase("--------------------------------------------------------------------------");
		
		Common.logstep("Step "+ (step++) +". open : http://demoqa.com/registration/");
		
		boolean tf = generalVerification.verifyhomepage();
		
		if(tf){
			
			Common.logstep("Step "+ (step++) +". Enter Invalid Phone number(Less than 10 digits)");
			
			generalVerification = generalIndexpage.enterinvalidphonenumber();
			
			Common.logstep("Step "+ (step++) +". Click on Submit button");
			
			generalVerification = generalIndexpage.submit_click();
		}
		else
			Common.log("--->  Home page is not open  <---");
		
		
		
		if(generalVerification.minimulengthvalidationmsg()){
			
			   Common.logStatus("Pass");
			   Assert.assertTrue(true);
		}
		else
		  {
		       Common.logStatus("Fail");
		       Assert.assertTrue(false);
		  } 
				
	}
	
	
    //To verify password field get minimum length validation message
	@Test(priority=0)
	
	public void password_minimum_length() {
		
        int step=1;
		
		Common.logcase("To verify password field get minimum length validation message");

		Common.logcase("--------------------------------------------------------------------------");
		
		Common.logstep("Step "+ (step++) +". open : http://demoqa.com/registration/");
		
		boolean tf = generalVerification.verifyhomepage();
		
		//generalVerification = generalIndexpage.miminum_length_validation();
		
		if(tf){
			
			Common.logstep("Step "+ (step++) +". Enter Invalid password(Less than 8 characters)");
			
			generalVerification = generalIndexpage.enterinvalidpassword();
			
			Common.logstep("Step "+ (step++) +". Click on Submit button");
			
			generalVerification = generalIndexpage.submit_click();
		}
		else
			Common.log("--->  Home page is not open  <---");
		
		
		
		if(generalVerification.passwordminimulengthvalidationmsg()){
			
			   Common.logStatus("Pass");
			   Assert.assertTrue(true);
		}
		else
		  {
		       Common.logStatus("Fail");
		       Assert.assertTrue(false);
		  } 
				
	}
	
	
	//To verify that user gets the validation message while confirm password and password fields do not match
	@Test(priority=0)
	
	public void passwordnotmatch(){
		
        int step=1;
		
		Common.logcase("To verify that user gets the validation message while confirm password and password fields do not match");

		Common.logcase("--------------------------------------------------------------------------");
		
		Common.logstep("Step "+ (step++) +". open : http://demoqa.com/registration/");
		
		boolean tf = generalVerification.verifyhomepage();
		
		//generalVerification = generalIndexpage.miminum_length_validation();
		
		if(tf){
			
		    Common.logstep("Step "+ (step++) +". Enter password(More than 7 characters)");
			
			generalVerification = generalIndexpage.enterpasswordnotmatch();
			
			Common.logstep("Step "+ (step++) +". Enter confirm password(not match with password)");
			
			generalVerification = generalIndexpage.enterconfirmpasswordnotmatch();
			
			Common.logstep("Step "+ (step++) +". Click on Submit button");
			
			generalVerification = generalIndexpage.submit_click();
		}
		else
			Common.log("--->  Home page is not open  <---");
		
		
		
		if(generalVerification.passwordonotmatch()){
			
			   Common.logStatus("Pass");
			   Assert.assertTrue(true);
		}
		else
		  {
		       Common.logStatus("Fail");
		       Assert.assertTrue(false);
		  } 
				
		
		
		//generalVerification = generalIndexpage.password_not_match();
	}
	
   @Test(priority=0)
	
	public void invalidemailid(){
		
	   
	    int step=1;
		
		Common.logcase("To verify that user gets the validation message for Invalid emailid");

		Common.logcase("--------------------------------------------------------------------------");
		
		Common.logstep("Step "+ (step++) +". open : http://demoqa.com/registration/");
		
		boolean tf = generalVerification.verifyhomepage();
		
		//generalVerification = generalIndexpage.miminum_length_validation();
		
		if(tf){
			
		    Common.logstep("Step "+ (step++) +". Enter Invalid EmailId");
			
			generalVerification = generalIndexpage.enterinvalidemailid();
			
			Common.logstep("Step "+ (step++) +". Click on Submit button");
			
			generalVerification = generalIndexpage.submit_click();
		}
		else
			Common.log("--->  Home page is not open  <---");
		
		
		
		if(generalVerification.invalidemailid()){
			
			   Common.logStatus("Pass");
			   Assert.assertTrue(true);
		}
		else
		  {
		       Common.logStatus("Fail");
		       Assert.assertTrue(false);
		  } 
					
	}
	
	
	
	
	@Test(priority=0)
	
	   public void allvaliddata(){
		
		
       int step=1;
		
		Common.logcase("To verify that user is able to register with all valid details");

		Common.logcase("--------------------------------------------------------------------------");
		
		Common.logstep("Step "+ (step++) +". open : http://demoqa.com/registration/");
		
		boolean tf = generalVerification.verifyhomepage();
		
		//generalVerification = generalIndexpage.miminum_length_validation();
		
		if(tf){
			
		    Common.logstep("Step "+ (step++) +". Enter Valid First Name");
			
			generalVerification = generalIndexpage.enterfirstname();
			
            Common.logstep("Step "+ (step++) +". Enter Valid Last Name");
			
			generalVerification = generalIndexpage.enterlastname();

			Common.logstep("Step "+ (step++) +". Select Marital Status");
			
			generalVerification = generalIndexpage.selectmaritalstatus();
			
            Common.logstep("Step "+ (step++) +". Select Hobby");
			
			generalVerification = generalIndexpage.selecthobby();
 
			Common.logstep("Step "+ (step++) +". Select Country");
			
			generalVerification = generalIndexpage.selectcountry();
			
            Common.logstep("Step "+ (step++) +". Select Date of Birth");
			
			generalVerification = generalIndexpage.selectdateofbirth();
			
            Common.logstep("Step "+ (step++) +". Enter Valid Phone Number");
			
			generalVerification = generalIndexpage.enterphonenumber();
			
            Common.logstep("Step "+ (step++) +". Enter Valid User Name");
			
			generalVerification = generalIndexpage.enterusername();
			
            Common.logstep("Step "+ (step++) +". Enter Valid Emailid");
			
			generalVerification = generalIndexpage.enteremailid();
			
            Common.logstep("Step "+ (step++) +". Select Your Profile Picture");
			
			generalVerification = generalIndexpage.selectyourprofilepic();
			
            Common.logstep("Step "+ (step++) +". Enter About YourSelf");
			
			generalVerification = generalIndexpage.enteraboutyourself();
			
            Common.logstep("Step "+ (step++) +". Enter Valid Password");
			
			generalVerification = generalIndexpage.enterpassword();
			
            Common.logstep("Step "+ (step++) +". Enter Valid Confirm Password");
			
			generalVerification = generalIndexpage.enterconfirmpassword();
			
			Common.logstep("Step "+ (step++) +". Click on Submit button");
			
			generalVerification = generalIndexpage.submit_click();
		}
		else
			Common.log("--->  Home page is not open  <---");
		
		
		
		if(generalVerification.successfullregistration()){
			
			   Common.logStatus("Pass");
			   Assert.assertTrue(true);
		}
		else
		  {
		       Common.logStatus("Fail");
		       Assert.assertTrue(false);
		  } 
			
	}
	
	
	
	@Test(priority=0)
	
	public void usernamealreadyexist(){
		
		
        int step=1;
		
		Common.logcase("To verify that user get the validation message for exist username");

		Common.logcase("--------------------------------------------------------------------------");
		
		Common.logstep("Step "+ (step++) +". open : http://demoqa.com/registration/");
		
		boolean tf = generalVerification.verifyhomepage();
		
		//generalVerification = generalIndexpage.miminum_length_validation();
		
		if(tf){
			
		    Common.logstep("Step "+ (step++) +". Enter Valid First Name");
			
			generalVerification = generalIndexpage.enterfirstname();
			
            Common.logstep("Step "+ (step++) +". Enter Valid Last Name");
			
			generalVerification = generalIndexpage.enterlastname();

			Common.logstep("Step "+ (step++) +". Select Marital Status");
			
			generalVerification = generalIndexpage.selectmaritalstatus();
			
            Common.logstep("Step "+ (step++) +". Select Hobby");
			
			generalVerification = generalIndexpage.selecthobby();
 
			Common.logstep("Step "+ (step++) +". Select Country");
			
			generalVerification = generalIndexpage.selectcountry();
			
            Common.logstep("Step "+ (step++) +". Select Date of Birth");
			
			generalVerification = generalIndexpage.selectdateofbirth();
			
            Common.logstep("Step "+ (step++) +". Enter Valid Phone Number");
			
			generalVerification = generalIndexpage.enterphonenumber();
			
            Common.logstep("Step "+ (step++) +". Enter Valid User Name");
			
			generalVerification = generalIndexpage.enterexistusername();
			
            Common.logstep("Step "+ (step++) +". Enter Valid Emailid");
			
			generalVerification = generalIndexpage.enternotregisteremailid();
			
            Common.logstep("Step "+ (step++) +". Select Your Profile Picture");
			
			generalVerification = generalIndexpage.selectyourprofilepic();
			
            Common.logstep("Step "+ (step++) +". Enter About YourSelf");
			
			generalVerification = generalIndexpage.enteraboutyourself();
			
            Common.logstep("Step "+ (step++) +". Enter Valid Password");
			
			generalVerification = generalIndexpage.enterpassword();
			
            Common.logstep("Step "+ (step++) +". Enter Valid Confirm Password");
			
			generalVerification = generalIndexpage.enterconfirmpassword();
			
			Common.logstep("Step "+ (step++) +". Click on Submit button");
			
			generalVerification = generalIndexpage.submit_click();
		}
		else
			Common.log("--->  Home page is not open  <---");
		
		
		
		if(generalVerification.usernamealreadyexist()){
			
			   Common.logStatus("Pass");
			   Assert.assertTrue(true);
		}
		else
		  {
		       Common.logStatus("Fail");
		       Assert.assertTrue(false);
		  } 
			
		
		
	}
	
   @Test(priority=0)
	
	public void emailidalreadyexist(){
		
	   int step=1;
		
		Common.logcase("To verify that user get the validation message for already registered emailid");

		Common.logcase("--------------------------------------------------------------------------");
		
		Common.logstep("Step "+ (step++) +". open : http://demoqa.com/registration/");
		
		boolean tf = generalVerification.verifyhomepage();
		
		//generalVerification = generalIndexpage.miminum_length_validation();
		
		if(tf){
			
		    Common.logstep("Step "+ (step++) +". Enter Valid First Name");
			
			generalVerification = generalIndexpage.enterfirstname();
			
           Common.logstep("Step "+ (step++) +". Enter Valid Last Name");
			
			generalVerification = generalIndexpage.enterlastname();

			Common.logstep("Step "+ (step++) +". Select Marital Status");
			
			generalVerification = generalIndexpage.selectmaritalstatus();
			
           Common.logstep("Step "+ (step++) +". Select Hobby");
			
			generalVerification = generalIndexpage.selecthobby();

			Common.logstep("Step "+ (step++) +". Select Country");
			
			generalVerification = generalIndexpage.selectcountry();
			
           Common.logstep("Step "+ (step++) +". Select Date of Birth");
			
			generalVerification = generalIndexpage.selectdateofbirth();
			
           Common.logstep("Step "+ (step++) +". Enter Valid Phone Number");
			
			generalVerification = generalIndexpage.enterphonenumber();
			
           Common.logstep("Step "+ (step++) +". Enter Valid User Name");
			
			generalVerification = generalIndexpage.enternotexistusername();
			
           Common.logstep("Step "+ (step++) +". Enter Valid Emailid");
			
			generalVerification = generalIndexpage.enterregisteremailid();
			
           Common.logstep("Step "+ (step++) +". Select Your Profile Picture");
			
			generalVerification = generalIndexpage.selectyourprofilepic();
			
           Common.logstep("Step "+ (step++) +". Enter About YourSelf");
			
			generalVerification = generalIndexpage.enteraboutyourself();
			
           Common.logstep("Step "+ (step++) +". Enter Valid Password");
			
			generalVerification = generalIndexpage.enterpassword();
			
           Common.logstep("Step "+ (step++) +". Enter Valid Confirm Password");
			
			generalVerification = generalIndexpage.enterconfirmpassword();
			
			Common.logstep("Step "+ (step++) +". Click on Submit button");
			
			generalVerification = generalIndexpage.submit_click();
		}
		else
			Common.log("--->  Home page is not open  <---");
		
		
		
		if(generalVerification.emailidalreadyregistered()){
			
			   Common.logStatus("Pass");
			   Assert.assertTrue(true);
		}
		else
		  {
		       Common.logStatus("Fail");
		       Assert.assertTrue(false);
		  } 
			
	}
	

   @Test
   
   public void purchaseorcheckout(){
	   
	   int step=1;
		
		Common.logcase("To verify that user is able to checkout with all valid fields ");

		Common.logcase("--------------------------------------------------------------------------");
		
		Common.logstep("Step "+ (step++) +". open : http://toolsqa.com");
		
		Common.logstep("Step "+ (step++) +". click on Demo Sites Menu");
		
		generalVerification = generalIndexpage.click_on_demosites();
		
		Common.logstep("Step "+ (step++) +". click on E Commerce Demo site link");
		
		generalVerification = generalIndexpage.click_on_e_commerce_demosite();
		
        boolean tf = generalVerification.verifyhomepage_purchase();
		
        if(tf){
			
        	Common.log("--->  E Commerce Demo site Home page is opened  <---");
		}
		else
			Common.log("--->  E Commerce Demo site Home page is NOT opened  <---");
		
		
		Common.logstep("Step "+ (step++) +". Mouse Hover on Product Category");
		
		generalVerification = generalIndexpage.mousehoveron_product_category();
		
		Common.logstep("Step "+ (step++) +". Click on ipads link");
		
		generalVerification = generalIndexpage.clickonipads();
		
		Common.logstep("Step "+ (step++) +". Click on any product and open the product detail page");
		
		generalVerification = generalIndexpage.productdetails();
		
        Common.logstep("Step "+ (step++) +". Add product to the CART");
		
		generalVerification = generalIndexpage.addproducttocart();
		
		Common.logstep("Step "+ (step++) +". Open the Cart");
			
		generalVerification = generalIndexpage.openthecart();
		
		//Common.logstep("Step "+ (step++) +". Open the Cart to check the product added to the cart");
		
		Common.logverification("Verify that product added to the cart");
		
		boolean tf1 = generalVerification.checkproductinthecart();
		
        if(tf1)			
    	   Common.log("---> Product is added to the cart <---");
		
		else
			Common.log("---> Product is not added to the cart <---");
       
        Common.logstep("Step "+ (step++) +". Update the quantity of the product from 1 to 2");
		
		generalVerification = generalIndexpage.updateproductquantity();
		
        Common.logstep("Step "+ (step++) +". Click on Update Button");
		
		generalVerification = generalIndexpage.clickonupdatebutton();
       
		//Common.logstep("Step "+ (step++) +". Verify that the product quality has been updated in the cart");
		
		Common.logverification("Verify that the product quality has been updated in the cart");
		
		boolean tf11 = generalVerification.checkproductquanity();
		
        if(tf11)			
    	   Common.log("---> Product quantity is upadted into the cart <---");
		
		else
			Common.log("---> Product quantity is NOT upadted into the cart <---");
        
        Common.logstep("Step "+ (step++) +". Click on Continue Button");
		
		generalVerification = generalIndexpage.clickoncomtinuebutton();
		
        Common.logstep("Step "+ (step++) +". Enter Email Address in Billing Information");
		
		generalVerification = generalIndexpage.enteremailaddress();
        
		Common.logstep("Step "+ (step++) +". Enter Your billing/contact details");
		
		generalVerification = generalIndexpage.demo_enterfirstname();
		generalVerification = generalIndexpage.demo_enterelastname();
		generalVerification = generalIndexpage.demo_enteraddress();
		generalVerification = generalIndexpage.demo_enterecity();
		generalVerification = generalIndexpage.demo_enterestate_province();
		generalVerification = generalIndexpage.demo_entercountry();
		generalVerification = generalIndexpage.demo_enterpostalcode();
		generalVerification = generalIndexpage.demo_enterphonenumber();
		
	    Common.logstep("Step "+ (step++) +". Enter Shipping Address Information/Details");
			
		generalVerification = generalIndexpage.entershippingaddress();
		
		Common.logstep("Step "+ (step++) +". Click on Purchase Button");
		
		generalVerification = generalIndexpage.clickonpurchasebutton();
		
		
		if(generalVerification.purchaseverification()){
			   Common.logstep("Order placed successfully");
			   Common.logStatus("Pass");
			   Assert.assertTrue(true);
		}
		else{
			   Common.logstep("Order is NOT placed successfully");
			   Common.logStatus("Fail");
			   Assert.assertTrue(false);
			
		}
		
		
	}
	   
	@Test(priority=0)
	public void addproducttocartandcheckout(){
		
	}
   
}





