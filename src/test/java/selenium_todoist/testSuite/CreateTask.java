package selenium_todoist.testSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import selenium_todoist.pages.todoist.RightSection;

import java.util.Date;

public class CreateTask extends BaseTestTodoist {

    RightSection rightSection  = new RightSection();

    @Test
    public void createTask() {
        String taskName = "Thompson" + new Date().getTime();
        mainPage.loginButton.click();
        loginSection.login("thompson@thompson.com", "root1234");
        rightSection.AddTask.click();
        rightSection.TaskName.setText(taskName);
        rightSection.AddTaskFinal.click();
        rightSection.Cancel.click();

        Assertions.assertEquals(taskName,rightSection.getProjectLabel(taskName).getText(),
                "ERROR the project was not created");
    }
}
