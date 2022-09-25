package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Constants;
import utils.Wait;

public class CreateAccountPage extends BasePage{

    @FindBy(css = "#firstname")
    WebElement firstNameField;
    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    public void inputValidDataInAllFields() {
        setText(By.cssSelector("#firstname"), Constants.FIRST_NAME);
        setText(By.cssSelector("#lastname"), Constants.LAST_NAME);
        setText(By.cssSelector("#email_address"), Constants.EMAIL);
        setText(By.cssSelector(".control #password"), Constants.PASSWORD);
        setText(By.cssSelector("#password-confirmation"), Constants.PASSWORD);
    }

    public void clickNewsletterCheckBox() {
        click(By.cssSelector(".checkbox"));
    }

    public void submitButton() {
        click(By.cssSelector(".action.submit"));
    }

}
