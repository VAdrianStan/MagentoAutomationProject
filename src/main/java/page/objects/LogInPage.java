package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Constants;

public class LogInPage extends BasePage{

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".action.create.primary")
    WebElement createAccountButton;

    @FindBy(css = "#email")
    WebElement validUserName;

    @FindBy(css = "#pass")
    WebElement inputPassword;

    @FindBy(css = ".fieldset.login .action.login.primary")
    WebElement signInPassword;

    public void clickCreateAccountButton() {click(createAccountButton);}

    public void inputValidUserName() {
        setText(validUserName, Constants.VALID_USER_NAME);
    }

    public void inputPassword() {
        setText(inputPassword, Constants.PASSWORD);
    }

    public void clickSignInButton() {
        click(signInPassword);
    }
}
