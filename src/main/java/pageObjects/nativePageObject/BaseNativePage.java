package pageObjects.nativePageObject;

import entity.User;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import pageObjects.BasePageObject;

public class BaseNativePage extends BasePageObject {

    protected RegistrationPage registrationPage;
    protected LoginPage loginPage;
    protected ExpensesInformationPage expensesInformationPage;

    public ExpensesInformationPage getExpensesInformationPage() {
        return expensesInformationPage;
    }

    public BaseNativePage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        this.registrationPage = new RegistrationPage(appiumDriver);
        this.loginPage = new LoginPage(appiumDriver);
        this.expensesInformationPage = new ExpensesInformationPage(appiumDriver);
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
    }

    public void registrationUser(User user) {
        loginPage.registerBtn.click();
        registrationPage.registrationEmailField.sendKeys(user.getEmail());
        registrationPage.registrationUsernameField.sendKeys(user.getName());
        registrationPage.registrationPasswordField.sendKeys(user.getPassword());
        registrationPage.registrationConfirmPasswordField.sendKeys(user.getPassword());
        registrationPage.regNewUserBtn.click();

        //In some cases need to double-click on button
        try {
            if (registrationPage.regNewUserBtn.isDisplayed()) {
                registrationPage.regNewUserBtn.click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("No need second click");
        }
    }

    public void login(User user) {
        loginPage.loginEmailField.sendKeys(user.getEmail());
        loginPage.loginPasswordField.sendKeys(user.getPassword());
        loginPage.signInBtn.click();
    }
}
