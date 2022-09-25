package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage{
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public String getRegisterSuccesMessage() {
        return getText(By.cssSelector(".message-success"));
    }


}
