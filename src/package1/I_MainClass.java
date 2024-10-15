package package1;

public class I_MainClass {
	
	public static void main(String[] args) throws InterruptedException {
		
	III_HomePage ref1=new III_HomePage();
		
		ref1.getPageTitle();
		ref1.logoDisplay();
		ref1.usernameTextfield();
		ref1.passwordTextfield();
		ref1.loginButton();
		ref1.allValidUsernames();
		
		System.out.println("  ");
	
        IV_LoginValidation ref2=new IV_LoginValidation();
        
        ref2.validCredential("standard_user", "secret_sauce");
        ref2.validCredential("locked_out_user", "secret_sauce");
        ref2.validCredential("problem_user", "secret_sauce");
        ref2.validCredential("performance_glitch_user", "secret_sauce");
        ref2.validCredential("error_user", "secret_sauce");
        ref2.validCredential("visual_user", "secret_sauce");
	 
        System.out.println("  ");
        
       ref2.invalidCredential(" ", " ");
        ref2.invalidCredential("Sandeep", " ");
        ref2.invalidCredential(" ", "1234567");
        ref2.invalidCredential("Sandeep", "1234567");
        ref2.invalidCredential("1254588","Sandeep");
	
        System.out.println("  ");
		
		V_ProductPage ref3=new V_ProductPage();
	
		ref3.productFilter("az");
		ref3.productFilter("za");
		ref3.productFilter("lohi");
		ref3.productFilter("hilo");
	
		
		VI_ValidateAddToCart ref4=new VI_ValidateAddToCart();
		ref4.addProduct();
		ref4.removeProduct();
		ref4.removeProductFromCart();
		ref4.validateCartBadgeCount();
	
		
		VII_CheckoutProduct ref5=new VII_CheckoutProduct();
		
		ref5.checkoutProduct(" ", " ", " ");
		ref5.checkoutProduct("Sandeep ", " ", " ");
		ref5.checkoutProduct("Sandeep ", "Saroj ", " ");
		ref5.checkoutProduct("Sandeep ", "Saroj ", "401209 ");
	
		ref5.productCheckout();
		
		
	}

}
