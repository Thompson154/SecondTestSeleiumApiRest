package selenium_todoist.pages.todoist;

import org.openqa.selenium.By;
import selenium_todoist.controls.Button;

public class MenuSection {
    public Button notificationButton = new Button(By.xpath("//a[contains(@aria-label,\"Notifications\")]"));
}
