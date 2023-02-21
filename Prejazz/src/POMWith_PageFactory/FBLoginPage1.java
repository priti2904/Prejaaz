package POMWith_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM Class
public class FBLoginPage1 
{

	@FindBy(xpath= "//input[@type='text']") private WebElement UN;
			
	public FBLoginPage1(WebDriver driver)
	 {
	 PageFactory.initElements(driver, this);
	 }
		
	public void EnterUN()
	{
		UN.sendKeys("pritikale2802@gmail.com"); ///POM CLass
	}

			
}
