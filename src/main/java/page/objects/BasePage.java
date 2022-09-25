package page.objects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    // protected pt. ca o sa aibe copii
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void find(By element){
        driver.findElement(element);
    }

    public void click(By element) {
        driver.findElement(element).click();
    }

    public void setText(By element, String text){
        driver.findElement(element).sendKeys(text);
    }

    public String getText(By element){
        return driver.findElement(element).getText();
    }





}
