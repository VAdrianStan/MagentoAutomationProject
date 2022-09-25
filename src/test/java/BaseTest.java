import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.objects.*;
import utils.Constants;
import utils.Wait;

public class BaseTest {
    protected WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    protected LogInPage logInPage;
    protected CreateAccountPage createAccountPage;
    protected MyAccountPage myAccountPage;

    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Constants.URL);
        basePage = new BasePage(driver);
        homePage = new HomePage(driver);
        logInPage = new LogInPage(driver);
        createAccountPage = new CreateAccountPage(driver);
        myAccountPage = new MyAccountPage(driver);


    }

    @Test
    public void createNewAccountTest(){
        homePage.clicSignInButton();
        logInPage.clickCreateAccountButton();
        createAccountPage.inputValidDataInAllFields();
        createAccountPage.clickNewsletterCheckBox();
        createAccountPage.submitButton();
        Wait.waitForSeconds(3);
        String expectedMessage = Constants.EXPECTED_REGISTER_SUCCESS_MESSAGE;
        String actualMessage = myAccountPage.getRegisterSuccesMessage();

        Assert.assertEquals(expectedMessage, actualMessage);

    }
}

