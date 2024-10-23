package selenium_todoist.pages.todoist;


import org.openqa.selenium.By;
import selenium_todoist.controls.Button;

public class SubMenuOptionSection {
    public Button editButton = new Button(By.xpath("//ul[contains(@style,\"block;\")]//a[text()='Edit']"));
    public Button deleteButton = new Button(By.xpath(""));

}
