package selenium_todoist.pages.todoist;


import org.openqa.selenium.By;
import selenium_todoist.controls.Button;
import selenium_todoist.controls.Label;
import selenium_todoist.controls.TextBox;

public class ProjectLeftSection {

    //    public Button enableButton = new Button(By.id())
    public Button addNewProjectButton = new Button(By.id(":r1:"));
    public Button addButton = new Button(By.xpath("//div[@class='a83bd4e0 e214ff2e fb8d74bb' and contains(text(),'Add project')]"));
//    public TextBox nameProjectTxtBox = new TextBox(By.xpath("//input[@id='element-1']"));
    public TextBox nameProjectTxtBox = new TextBox(By.xpath("//input[@data-autofocus='true']"));
    public Button addProject = new Button(By.xpath("//button[@type='submit']"));

    public SubMenuOptionSection subMenuOptions = new SubMenuOptionSection();

    public Label getProjectLabel(String name) {
        Label projectLabel = new Label(By.xpath("//div[@data-testid='virtuoso-item-list' and last()]//div//div//div/li//div//div//a//div//span[contains(text(),'" + name + "')]"));
        return projectLabel;
    }


    public void createProject(String name) {
        addNewProjectButton.click();
        addButton.click();
        nameProjectTxtBox.setText(name);
        addProject.click();
    }
}
