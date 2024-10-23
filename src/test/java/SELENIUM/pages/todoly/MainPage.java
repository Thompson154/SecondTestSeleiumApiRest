package SELENIUM.pages.todoly;

import SELENIUM.controls.Button;
import org.openqa.selenium.By;

public class MainPage {
    public Button loginButton = new Button(By.xpath("//img[@src=\"/Images/design/pagelogin.png\"]"));
    public Button SignUpFree = new Button(By.xpath("//img[@src='/Images/design/pagesignup.png']"));

}
