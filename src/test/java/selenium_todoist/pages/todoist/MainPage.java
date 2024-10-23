package selenium_todoist.pages.todoist;


import org.openqa.selenium.By;
import selenium_todoist.controls.Button;

public class MainPage {
    public Button loginButton = new Button(By.xpath(
            "//ul[@class='_navbarItemGroup_ue8ah_1']//li//a[contains(@href, \"https://app.todoist.com/auth/login\")]"));
}
