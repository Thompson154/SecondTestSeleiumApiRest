package selenium_todoist.testSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import selenium_todoist.pages.todoist.ProjectLeftSection;


import java.util.Date;

public class CreateProjectTest extends BaseTestTodoist {

    ProjectLeftSection projectLeftSection = new ProjectLeftSection();

    @Test
    public void testCreateProject () throws InterruptedException{
        String name = "Thompson"+new Date().getTime();
        mainPage.loginButton.click();
        loginSection.login("thompson@thompson.com","root1234");
        projectLeftSection.addNewProjectButton.click();
        projectLeftSection.addButton.click();
        Thread.sleep(5000);
        projectLeftSection.nameProjectTxtBox.setText(name);
        projectLeftSection.addProject.click();
        Assertions.assertEquals(name,projectLeftSection.getProjectLabel(name).getText(),
                "ERROR the project was not created");
    }
}
