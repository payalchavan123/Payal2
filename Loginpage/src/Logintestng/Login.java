package Logintestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
//declaration
	@FindBy(xpath="//input[@id'username']") private WebElement Uname;
	@FindBy(xpath="//input[@id'password']") private WebElement Pwd;
	@FindBy(xpath="//input[@id'button']") private WebElement Btn;
	
	//initialization
	public Login(WebDriver driver) {
	  PageFactory.initElements(driver,this);
	}
		//Usege
		public void setUname() {
		  Uname.sendKeys("Standard_user");
		}
		public void setPwd() {
			  Pwd.sendKeys("Secret_sauce");
			}
		//login method
		public void setLoginPageBtn() {
			 Btn.sendKeys("Standard_user");
			 System.out.println("Login Successfully");
			}
		{
	}
}
