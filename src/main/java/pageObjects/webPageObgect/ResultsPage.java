package pageObjects.webPageObgect;

import io.appium.java_client.AppiumDriver;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultsPage {

    @FindBy(xpath = "//div[@id='rso']//a/div[2]/div")
    protected List<WebElement> searchResultTitles;

    public ResultsPage(AppiumDriver appiumDriver) {
        PageFactory.initElements(appiumDriver, this);
    }
}
