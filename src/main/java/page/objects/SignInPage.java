package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage{

    @FindBy(css = ".panel.wrapper .authorization-link ")
    WebElement clickSignInButton;
    public SignInPage(WebDriver driver) {
        super(driver);
    }
    public void clickSignInButton(){
        click(clickSignInButton);
    }
}
