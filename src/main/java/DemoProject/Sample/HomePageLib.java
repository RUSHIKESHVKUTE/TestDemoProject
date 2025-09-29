package DemoProject.Sample;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageLib {
  
	
  private String verifyHomeText = "HOME";  
  private String verifyPracticeText = "PRACTICE";  
  private String verifyBlogText = "BLOG"; 
  private String verifyCoursesText = "COURSES";
  private String verifyContactText = "CONTACT";
  
  @FindBy (xpath = "//li/a[contains(text(),'Home')]") private WebElement Home;
  @FindBy (xpath = "//li/a[contains(text(),'Practice')]") private WebElement Practice;
  @FindBy (xpath = "//li/a[contains(text(),'Courses')]") private WebElement Courses;
  @FindBy (xpath = "//li/a[contains(text(),'Blog')]") private WebElement Blog;
  @FindBy (xpath = "//li/a[contains(text(),'Contact')]") private WebElement Contact;

  
  HomePageLib(WebDriver driver) {
	  
	PageFactory.initElements(driver, this);
  }


  public void clickHomeBTN() {
		
		//enter user name in box
		Home.click();
	}
	  
   public void verifyHomePage() {
	   
	  String hometext = Home.getText();
   
	  assertEquals(hometext, verifyHomeText);
//   if(hometext.equals(verifyHomeText)) {
//	   System.out.println("home page is verify");
//   }
//   else {
//	  
//	   System.err.println("User not login verify. Actual test is : "+hometext+" , Expected text is : "+verifyHomeText);
//   }
   }
 
  // practice button 
   public void clickPracticeBTN() {
		
		//enter user name in box
		Practice.click();
	}
	  
  public void verifyPracticePage() {
	   
	  String Practicetext = Practice.getText();
      
	  assertEquals(Practicetext, verifyPracticeText);
//  if(Practicetext.equals(verifyPracticeText)) {
//	   System.out.println("practice page is verify");
//  }
//  else {	  
//	   System.err.println("practice page not login verify. Actual test is : "+Practicetext+" , Expected text is : "+verifyPracticeText);
//  }
  }


// button courses
  public void clickCoursesBTN() {
		
		//enter user name in box
		Courses.click();
	}
	  
 public void verifyCoursesPage() {
	   
	  String Coursestext = Courses.getText();
      
	  assertEquals(Coursestext, verifyCoursesText);
// if(Coursestext.equals(verifyCoursesText)) {
//	   System.out.println("course page is verify");
// }
// else {
//	  
//	   System.err.println("course not login verify. Actual test is : "+Coursestext+" , Expected text is : "+verifyCoursesText);
// }
 }


//button courses
public void clickBlogBTN() {
		
		//enter user name in box
		Blog.click();
	}
	  
public void verifyBlogPage() {
	   
	  String Blogtext = Blog.getText();

	  assertEquals(Blogtext, verifyBlogText);
//if(Blogtext.equals(verifyBlogText)) {
//	   System.out.println("Blog page is verify");
//}
//else {
//	  
//	   System.err.println("blog not login verify. Actual test is : "+Blogtext+" , Expected text is : "+verifyBlogText);
//}
}

public void clickContactBTN() {
	
	//enter user name in box
	Contact.click();
}
  
public void verifyContactPage() {
   
  String Contacttext = Contact.getText();
  assertEquals(Contacttext, verifyContactText);
//if(Contacttext.equals(verifyContactText)) {
//   System.out.println("Contact page is verify");
//}
//else {
//  
//   System.err.println("Contact not login verify. Actual test is : "+Contacttext+" , Expected text is : "+verifyContactText);
//}
}





}

