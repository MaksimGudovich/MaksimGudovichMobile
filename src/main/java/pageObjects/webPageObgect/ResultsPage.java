package pageObjects.webPageObgect;

import io.appium.java_client.AppiumDriver;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultsPage {

    @FindBy(xpath = "//div[@id='rso']//a/div[2]/div")
    protected List<WebElement> searchResultTitles;

    public ResultsPage(AppiumDriver appiumDriver) {
        PageFactory.initElements(appiumDriver, this);
        new WebDriverWait(appiumDriver, 10).until(
            wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete")
        );
    }
}
