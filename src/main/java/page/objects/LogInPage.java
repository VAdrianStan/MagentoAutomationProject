package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage extends BasePage{
    public LogInPage(WebDriver driver) {
        super(driver);
    }

    public void clickCreateAccountButton() {
        click(By.cssSelector(".action.create.primary"));
    }

}
