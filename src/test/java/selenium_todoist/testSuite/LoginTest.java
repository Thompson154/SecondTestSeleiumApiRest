package selenium_todoist.testSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTestTodoist {

    @Test
    public void verifyLoginSuccessfully(){
        mainPage.loginButton.click();
        loginSection.emailTxtBox.setText("thompson@thompson.com");
        loginSection.pwdTxtBox.setText("root1234");
        loginSection.loginButton.click();
        Assertions.assertTrue(menuSection.notificationButton.isControlDisplayed(),
                "ERROR! the login was failed");
    }
}
