package selenium_todoly.pages.todoly;

import selenium_todoly.controls.Button;
import selenium_todoly.controls.TextBox;
import org.openqa.selenium.By;


public class SignUpSection {
    public TextBox FullName = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName"));
    public TextBox Email = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail"));
    public TextBox Password = new TextBox(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword"));
    public Button SignUpAdd = new Button(By.id("ctl00_MainContent_SignupControl1_ButtonSignup"));


    public void createUser(String username, String email, String password ) {
        this.FullName.setText(username);
        this.Email.setText(email);
        this.Password.setText(password);
        this.SignUpAdd.click();
    }
}
