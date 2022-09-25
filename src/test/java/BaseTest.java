import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
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
    protected SignInPage signInPage;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Constants.URL);
        basePage = new BasePage(driver);
        homePage = new HomePage(driver);
        logInPage = new LogInPage(driver);
        createAccountPage = new CreateAccountPage(driver);
        myAccountPage = new MyAccountPage(driver);
        signInPage = new SignInPage(driver);
    }

    @Test
    public void createNewAccountTest(){
        homePage.clickSignInButton();
        logInPage.clickCreateAccountButton();
        createAccountPage.inputValidDataInAllFields();
        createAccountPage.clickNewsletterCheckBox();
        createAccountPage.submitButton();
        Wait.waitForSeconds(3);
        String expectedMessage = Constants.EXPECTED_REGISTER_SUCCESS_MESSAGE;
        String actualMessage = myAccountPage.getRegisterSuccesMessage();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void LogInTest() {
        signInPage.clickSignInButton();
        logInPage.inputValidUserName();
        logInPage.inputPassword();
        logInPage.clickSignInButton();
    }
}

