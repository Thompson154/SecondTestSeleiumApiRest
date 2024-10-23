package SELENIUM.testSuit;

import SELENIUM.pages.todoly.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class DeleteUser {
    protected MainPage mainPage = new MainPage();
    protected SignUpSection signUpSection = new SignUpSection();
    protected LoginSection loginSection = new LoginSection();
    protected HeaderSection headerSection = new HeaderSection();

    @Test
    @DisplayName("Delete User")
    public void testDeleteUser() throws InterruptedException {
        String FullName = "Thompson" +new Date().getTime();
        String Email = "thompson"+ new Date().getTime() + "@thompson.com";
        String Password = "123456";

        mainPage.SignUpFree.click();
        signUpSection.createUser(FullName, Email, Password);
        mainPage.loginButton.click();
        loginSection.login(Email, Password);
        headerSection.Setting.click();
        Thread.sleep(2000);
        headerSection.Account.click();
        headerSection.Delete.click();

        loginSection.login(Email, Password);

        Assertions.assertTrue();


    }
}
