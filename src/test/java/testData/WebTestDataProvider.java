package testData;

import org.testng.annotations.DataProvider;

public class WebTestDataProvider {
    @DataProvider(name = "Web tests data")
    public Object[][] setSearchData() {
        return new Object[][] {{"EPAM"}};
    }
}
