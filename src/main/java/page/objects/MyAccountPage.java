package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

    @FindBy(css = ".message-success")
    WebElement getRegisterSuccesMessage;
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public String getRegisterSuccesMessage() {
        return getText(getRegisterSuccesMessage);
    }
}
