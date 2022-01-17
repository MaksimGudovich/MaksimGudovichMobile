package pageObjects.webPageObgect;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    @FindBy(xpath = "//div[1]/input[1]")
    protected WebElement searchField;

    @FindBy(xpath = "//ul//li[1]/div[1]")
    protected WebElement searchBtn;

    public SearchPage(AppiumDriver appiumDriver) {
        PageFactory.initElements(appiumDriver, this);
    }
}
