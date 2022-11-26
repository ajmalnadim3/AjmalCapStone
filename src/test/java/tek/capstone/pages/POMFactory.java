package tek.capstone.pages;

import tek.capstone.base.BaseSetup;

public class POMFactory extends BaseSetup  {
	private RetailHomePage homePage;
	private SignInRetail signIn;
	private SignUp signUp;
	private RetailAccountPage accountPage;
	private RetailOrderPage orderPage;
	
	public POMFactory() {
		  this.homePage = new RetailHomePage();
		  this.signIn = new SignInRetail();
		  this.signUp = new SignUp();
		  this.accountPage = new RetailAccountPage();
		  this.orderPage = new RetailOrderPage();
		
		
	}
	
	 public RetailHomePage homePage() {
	        return this.homePage;
	    }
     public SignInRetail SignInRetail() {
    	 return this.signIn;
     }
     
     public SignUp signUpRetail() {
    	 return this.signUp;
     }
     
     public RetailAccountPage accountPage() {
    	 return this.accountPage;
    	 
     }
     public RetailOrderPage orderPage() {
    	 return this.orderPage;
     }

}
