package SELENIUM.testSuit;

import SELENIUM.pages.todoly.LoginSection;
import SELENIUM.pages.todoly.MainPage;
import SELENIUM.pages.todoly.MenuSection;
import SELENIUM.pages.todoly.SignUpSection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CreateUser {

    protected MainPage mainPage = new MainPage();
    protected SignUpSection signUpSection = new SignUpSection();
    protected LoginSection loginSection = new LoginSection();
    protected MenuSection menuSection = new MenuSection();

    @Test
    @DisplayName("Create User Test")
    public void createUser() {

        String FullName = "Thompson";
        String Email = "thompson@thompson.com";
        String Password = "123456";

        mainPage.SignUpFree.click();
        signUpSection.FullName.setText(FullName);
        signUpSection.Email.setText(Email);
        signUpSection.Password.setText(Password);
        signUpSection.SignUpAdd.click();

        mainPage.loginButton.click();
        loginSection.emailTxtBox.setText(Email);
        loginSection.pwdTxtBox.setText(Password);
        loginSection.loginButton.click();

        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR! the login was failed");


    }
}
