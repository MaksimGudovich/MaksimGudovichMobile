package scenarios;

import static org.testng.Assert.assertTrue;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageObjects.webPageObgect.BaseWebPage;
import setup.BaseTest;
import testData.WebTestDataProvider;

public class WebMobileTests extends BaseTest {

    @Test(groups = {"web"}, description = "Testing google searching",
          dataProviderClass = WebTestDataProvider.class, dataProvider = "Web tests data")
    public void simpleWebTest(){
        getDriver().get("https://google.com");

        BaseWebPage webPageObject = new BaseWebPage(getDriver());
        List<WebElement> resultList = webPageObject.search("EPAM");

        resultList.forEach(element -> {
            assertTrue(element.getText().contains("EPAM"));
        });

        System.out.println("Right results received");
    }
}
