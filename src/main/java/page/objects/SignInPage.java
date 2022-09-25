package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends BasePage{


    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void clickSignInButton(){
        click(By.cssSelector(".panel.wrapper .authorization-link "));
    }



}
