package DemoProject.Sample;

import javax.xml.xpath.XPath;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class LoginPageLib {
   
    
	
	private String LogionVerifyText = "Logged In Successfully";
	@FindBy (xpath = "//div/input[@id='username']") private WebElement UserNM;
	@FindBy (xpath = "//div/input[@id='password']") private WebElement PassWD;
	@FindBy (xpath = "//div/button[@id='submit']") private WebElement SubmitBTN;
	@FindBy (xpath = "//div/h1[@class='post-title']") private WebElement LoginSText;
	@FindBy (xpath = "//div[@id='error']") private WebElement LoginError;
	
	
	LoginPageLib(WebDriver driver){
		
		PageFactory.initElements( driver, this);
	}
	
	public void enterUserName(String UN) {
		
		//enter user name in box
		UserNM.sendKeys(UN);
	}
	
	public void enterPassWD(String PW) {
		
		//enter user name in box
		PassWD.sendKeys(PW);
	}
	
	public void clickSubmitBTN() {
		
		//enter user name in box
		SubmitBTN.click();
	}
	
	public void verifyLogin() {
		//get text from element
		String LoginText = LoginSText.getText();
//		System.out.println("Actual text is: "+LoginText);
//		System.out.println("Expected text is:"+LogionVerifyText);
//		SOftA.assertEquals(LoginText, LogionVerifyText);
		if(LoginText.equals(LogionVerifyText)) {
			System.out.println("User login succssesfuly");
		} else {
			System.err.println("User not login succssesfuly. Actual test is : "+LoginText+" , Expected text is : "+LogionVerifyText);
		}
		
	}
	
	public void verifyLoginError(String ErrorMSG) {
		//get error text from element
		String ErrorText = LoginError.getText();
		
		if(ErrorText.equals(ErrorMSG)) {
			System.out.println("User not login succssesfuly with invalid USERNAME/PASSWORD and display error msg : "+ErrorMSG);
		} else {
			System.err.println("With invalid USERNAME/PASSWORD error msg NOT display.");
		}
	}
}
