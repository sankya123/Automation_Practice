package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomoPackage.LoginInPage;

public class TestClass 
{
     public static void main (String[]args) 
     {
    	 System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
    	 WebDriver driver=new ChromeDriver();
		  
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  
		 driver.manage().window().maximize();
		 
		 // (verify login functionality)
		 
		 LoginInPage login=new LoginInPage(driver);
		 
		 login.sendUserName();
		 login.sendPassword();
		 login.ClickOnLogin();
     }
	
	
}
