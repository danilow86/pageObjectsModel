package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(how=How.XPATH, using="//input[@type='email'][@name='email']") WebElement emailTextBox;
    @FindBy(how=How.XPATH, using="//input[@type='password'][@name='pass']") WebElement passwordTextBox;
    @FindBy(how=How.XPATH, using="//input[@type='submit'][@id='u_0_2']") WebElement signinButton;
    public void setEmail(String strEmail){
        emailTextBox.sendKeys(strEmail);
    }
    public void setPassword(String strPassword){
        passwordTextBox.sendKeys(strPassword);
    }
    
    public void clickOnLoginButton(){
        signinButton.click();
    }
}