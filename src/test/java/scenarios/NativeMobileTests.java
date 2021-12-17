package scenarios;

import entity.User;
import org.testng.annotations.Test;
import pageObjects.nativePageObject.BaseNativePage;
import setup.BaseTest;
import testData.NativeTestDataProvider;

public class NativeMobileTests extends BaseTest {

    @Test(groups = {"native"}, description = "This simple test just click on the Sign In button",
          dataProviderClass = NativeTestDataProvider.class, dataProvider = "User data from json")
    public void simpleNativeTest(User user) throws Exception {
        BaseNativePage baseNativePage = new BaseNativePage(getDriver());
        baseNativePage.registrationUser(user);
        baseNativePage.login(user);
        String actionBarText = baseNativePage.getExpensesInformationPage().getActionBarText().getText();

        assert (actionBarText).equals("BudgetActivity") : "This is not the Budget Activity page";

        System.out.println("Budget page is opened");
    }

}
