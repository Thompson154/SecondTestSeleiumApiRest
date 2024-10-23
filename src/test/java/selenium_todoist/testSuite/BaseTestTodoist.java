package selenium_todoist.testSuite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import selenium_todoist.pages.todoist.LoginSection;
import selenium_todoist.pages.todoist.MainPage;
import selenium_todoist.pages.todoist.MenuSection;
import selenium_todoist.session.Session;


public class BaseTestTodoist {

    protected MainPage mainPage = new MainPage();
    protected LoginSection loginSection = new LoginSection();
    protected MenuSection menuSection = new MenuSection();

    @BeforeEach
    public void openBrowser() {
        Session.getInstance().getBrowser().get("https://todoist.com");
    }

    @AfterEach
    public void closeBrowser() {
        Session.getInstance().closeSession();
    }
}
