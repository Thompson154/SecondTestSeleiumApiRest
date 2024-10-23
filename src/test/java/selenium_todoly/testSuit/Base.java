package selenium_todoly.testSuit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import selenium_todoly.session.Session;


public class Base {

    @BeforeEach
    public void openBrowser() {
        Session.getInstance().getBrowser().get("https://todo.ly");
    }

    @AfterEach
    public void closeBrowser() {
        Session.getInstance().closeSession();
    }
}
