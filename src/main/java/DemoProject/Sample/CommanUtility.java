package DemoProject.Sample;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommanUtility {

	static String  ProjectPath = System.getProperty("user.dir");
	static String  DriverPath = ProjectPath+"\\Driver";
	static String  ScreenshotPath = ProjectPath+"\\Screenshot";
	static String  TestDataPath = ProjectPath+"\\TestData";
	
	public static WebDriver BrowserLanunchWD(String URL){
		
		//give driver exe path
		System.setProperty("webdriver.driver.chrome", DriverPath);
		
		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setAcceptInsecureCerts(true);
        
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.get(URL);
		
		driver.manage().window().maximize();
		
		return driver;
		
	}
	
	public static WebDriver BrowserLaunchWDManmager(String URL) {
		
		WebDriverManager.edgedriver().setup();
		
//		ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.setAcceptInsecureCerts(true);
//        
//		WebDriver driver = new ChromeDriver(chromeOptions);
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public static void captureScreenshpt(WebDriver driver,String PicName) throws IOException {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\kuter\\eclipse-workspace\\SampleProject\\Sample\\Screenshots\\"+PicName+".jpg");
		
		FileHandler.copy(src, dest);
	}
	
}
