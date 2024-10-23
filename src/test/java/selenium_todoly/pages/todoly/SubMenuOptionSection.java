package selenium_todoly.pages.todoly;

import selenium_todoly.controls.Button;
import org.openqa.selenium.By;

public class SubMenuOptionSection {
    public Button editButton = new Button(By.xpath("//ul[contains(@style,\"block;\")]//a[text()='Edit']"));
    public Button deleteButton = new Button(By.xpath(""));

}
