package selenium_todoly.pages.todoly;

import selenium_todoly.controls.Button;
import org.openqa.selenium.By;

public class MainPage {
    public Button loginButton = new Button(By.xpath("//img[@src=\"/Images/design/pagelogin.png\"]"));
    public Button SignUpFree = new Button(By.xpath("//img[@src='/Images/design/pagesignup.png']"));

}