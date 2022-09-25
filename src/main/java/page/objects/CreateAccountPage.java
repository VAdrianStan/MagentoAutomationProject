package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Constants;

public class CreateAccountPage extends BasePage{

    @FindBy(css = "#firstname")
    WebElement firstNameField;

    @FindBy(css = "#lastname")
    WebElement lastnameField;

    @FindBy(css = "#email_address")
    WebElement emailField;

    @FindBy(css = ".control #password")
    WebElement passwordField;

    @FindBy(css = "#password-confirmation")
    WebElement passwordConfirmationField;

    @FindBy(css = ".checkbox")
    WebElement newsletterCheckBox;

    @FindBy(css = ".action.submit")
    WebElement submitButton;

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public void inputValidDataInAllFields() {
        setText(firstNameField, Constants.FIRST_NAME);
        setText(lastnameField, Constants.LAST_NAME);
        setText(emailField, Constants.EMAIL);
        setText(passwordField, Constants.PASSWORD);
        setText(passwordConfirmationField, Constants.PASSWORD);
    }

    public void clickNewsletterCheckBox() {
        click(newsletterCheckBox);
    }

    public void submitButton() {
        click(submitButton);
    }
}
