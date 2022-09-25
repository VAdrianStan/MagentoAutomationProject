package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(css = ".panel.header .authorization-link")
    WebElement signInButton;
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickSignInButton(){
        click(signInButton);
    }
}
