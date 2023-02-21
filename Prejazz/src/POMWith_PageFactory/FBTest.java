package POMWith_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBTest {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Desktop\\PPP");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		 
		//Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		FBLoginPage1 webpage = new FBLoginPage1(driver);
		webpage.EnterUN();
	}

}
