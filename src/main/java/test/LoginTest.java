package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginTest extends TestPage{

    @Test
    public void init() throws Exception{

        //driver.get("https://www.facebook.com");
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        loginpage.setEmail("danilow86@yahoo.com.br");
        loginpage.setPassword("achouErradoOtarios");
        loginpage.clickOnLoginButton();

        HomePage homepage = PageFactory.initElements(driver, HomePage.class);
        homepage.clickOnProfileDropdown();
        homepage.verifyLoggedInUserNameText();
        homepage.clickOnLogoutLink();
    }

}