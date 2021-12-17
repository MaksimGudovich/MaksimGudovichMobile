package testData;

import entity.User;
import org.testng.annotations.DataProvider;
import util.UserDataReader;

public class NativeTestDataProvider {

    @DataProvider(name = "User data from json")
    public Object[][] getUserData() {
        User user = UserDataReader.getUserFromJson("src/test/resources/testUser.json");
        return new Object[][] {{user}};
    }
}
