package mvnPomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Neostoxsighnin {

	
	
	@FindBy(xpath="(//a[text()='Sign In'])[1]") private WebElement sighninbutton;
	
	//i am editing this project
	public Neostoxsighnin(WebDriver driver)
	
	{
		PageFactory.initElements(driver,this);
	}
	
	public void sighnbutton()
	{
		sighninbutton.click();
	}
	 
	
	
	
	
	
	
	
	
	
}
