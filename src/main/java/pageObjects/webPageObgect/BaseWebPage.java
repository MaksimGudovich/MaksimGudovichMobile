package pageObjects.webPageObgect;

import io.appium.java_client.AppiumDriver;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pageObjects.BasePageObject;

public class BaseWebPage extends BasePageObject {

    private SearchPage searchPage;
    private ResultsPage resultsPage;

    public BaseWebPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
        searchPage = new SearchPage(appiumDriver);
        resultsPage = new ResultsPage(appiumDriver);
        PageFactory.initElements(appiumDriver, this);
    }

    public List<WebElement> search(String searchString) {
        searchPage.searchField.sendKeys(searchString);
        searchPage.searchBtn.click();
        return resultsPage.searchResultTitles;
    }
}
