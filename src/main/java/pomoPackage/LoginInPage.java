package pomoPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginInPage
{ 
    WebDriver driver;
	WebDriverWait Wait;
	   
    @FindBy(xpath="//input[@name='username']")
    private WebElement username;
	
    @FindBy(xpath="//input[@name='password']")
    private WebElement password;
    
    @FindBy(xpath="//button[text()=' Login ']")
	private WebElement login;
    
    public LoginInPage(WebDriver driver)
	{   Wait =new WebDriverWait(driver, Duration.ofSeconds(20));
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
	}
     
    public void sendUserName()
    {  Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("*//[@name='username']")));
    	username.sendKeys("Admin");
    }
    
    public void sendPassword()
    {  Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("*//[@name='password']")));
    	password.sendKeys("admin123");
    }
    
    public void ClickOnLogin()
    {
    	login.click();
    }
    
}
