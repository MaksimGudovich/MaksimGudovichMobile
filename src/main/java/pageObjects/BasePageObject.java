package pageObjects;

import io.appium.java_client.AppiumDriver;

public class BasePageObject {

    AppiumDriver appiumDriver;

    public BasePageObject(AppiumDriver appiumDriver) {
        this.appiumDriver = appiumDriver;
    }

}
