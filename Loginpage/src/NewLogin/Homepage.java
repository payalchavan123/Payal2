package NewLogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Logintestng.Login;

public class Homepage {
           public static WebDriver driver;
           @BeforeSuite
           public void lauch() {
          System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32.exe");
             driver=new ChromeDriver();
             driver.get("//www.saucedemo.com");
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
           }
           @Test
           public void Launchpage() throws InterruptedException{
        	   Login l=new Login(driver);
        	   l.setUname();
        	   l.setPwd();
        	   l.setLoginPageBtn();
        	   
        	   Thread.sleep(5000);
        	   Homepage h=new Homepage();
        	   h.verifyHomepageLogo();
        	   
           }
		   public void verifyHomepageLogo() {
			// TODO Auto-generated method stub
			
		}      	   
           }

