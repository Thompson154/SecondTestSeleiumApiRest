package selenium_todoist.pages.todoist;

import org.openqa.selenium.By;
import selenium_todoist.controls.Label;
import selenium_todoist.controls.TextBox;
import selenium_todoist.controls.Button;

public class RightSection {

    public Button AddTask = new Button(By.xpath("//span[@class='icon_add']"));
    public TextBox TaskName = new TextBox(By.xpath("//p[@data-placeholder='Task name']"));
    public Button AddTaskFinal = new Button(By.xpath("//button[@data-testid=\"task-editor-submit-button\"]"));
    public Button Cancel = new Button(By.xpath("//button[@aria-label=\"Cancel\"]"));

    public Label getProjectLabel(String name) {
        Label projectLabel = new Label(By.xpath("//div[@data-testid='virtuoso-item-list']//div[text()='"+name+"']"));
        return projectLabel;
    }

    public void AddTask(String taskName) {
        AddTask.click();
        TaskName.setText(taskName);
        AddTaskFinal.click();
    }
}
