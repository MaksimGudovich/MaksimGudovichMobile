package scenarios;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageObjects.webPageObgect.BaseWebPage;
import setup.BaseTest;

public class WebMobileTests extends BaseTest {

    @Test(groups = {"web"}, description = "Make sure that we've opened IANA homepage")
    public void simpleWebTest() throws Exception {
        getDriver().get("https://google.com");

        BaseWebPage webPageObject = new BaseWebPage(getDriver());
        List<WebElement> resultList = webPageObject.search("EPAM");

        assert (resultList.stream().allMatch(element -> element.getText().contains("EPAM")));

        System.out.println("Right results received");
    }
}
