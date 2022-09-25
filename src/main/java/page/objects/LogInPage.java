package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Constants;

public class LogInPage extends BasePage{
    public LogInPage(WebDriver driver) {
        super(driver);
    }

    public void clickCreateAccountButton() {
        click(By.cssSelector(".action.create.primary"));
    }

    public void inputValidUserName() {
        setText(By.cssSelector("#email"), Constants.VALID_UESR_NAME);
    }

    public void inputPassword() {
        setText(By.cssSelector("#pass"), Constants.PASSWORD);
    }

    public void clickSignInButton() {
        click(By.cssSelector(".fieldset.login .action.login.primary"));
    }
}
