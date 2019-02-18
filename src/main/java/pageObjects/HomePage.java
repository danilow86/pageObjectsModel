package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(how=How.XPATH, using="//div[text()='Account Settings']") WebElement profileDropdown;
    @FindBy(how=How.XPATH, using="//text()[.='Log Out']/ancestor::span[1]") WebElement logoutLink;
    @FindBy(how=How.XPATH, using="///div[text()='Good afternoon, SoftwareTesting!']") WebElement loggedInUserNameText;



    public void clickOnProfileDropdown(){
        profileDropdown.click();
    }
    public void clickOnLogoutLink(){
        logoutLink.click();
    }
    
    public String verifyLoggedInUserNameText(){
        String userName = loggedInUserNameText.getText();
        return userName;
    }

}