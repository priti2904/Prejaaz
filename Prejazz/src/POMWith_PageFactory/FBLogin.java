package POMWith_PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FBLogin {

		@Test  
public void TC0()
{
			System.out.println("Running 0");
}

		@Test  
		public void TC1()
		{
					Reporter.log("Running TC1",true);
		}

		public void TC2()
		{
					Reporter.log("Running TC2",false);
		}


		public void TC3()
		{
					Reporter.log("Running TC3");
		}





}

