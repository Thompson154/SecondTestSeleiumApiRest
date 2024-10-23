package selenium_todoly.pages.todoly;

import selenium_todoly.controls.Button;
import org.openqa.selenium.By;

public class HeaderSection {

    public Button Setting = new Button(By.xpath("//a[text()='Settings']"));
    public Button Account = new Button(By.xpath("//a[text()='Account']"));
    public Button Delete = new Button(By.xpath("//a[text()='DeleteAccountBtn']"));

    public void setDeleteAccount() throws InterruptedException {
        Setting.click();
        Thread.sleep(2000);
        Account.click();
        Delete.click();
    }
}
