package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clicSignInButton(){
        click(By.cssSelector(".panel.header .authorization-link"));
    }

}
