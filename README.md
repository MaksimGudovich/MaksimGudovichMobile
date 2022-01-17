To run tests in EPAM cloud you should put your token and project name ('firstname_secondname') into cloudTests.properties file.

By default, for android tests use Samsung Galaxy S20 with udid - "RF8NB0B3TSL".
For iOS tests use iPhone 11 PRO MAX with udid - "00008030-001458E02178802E".
If you need to change device, you need install application to new device in cloud and change udid value in specific suit xml file.

To run native test on cloud devices you need:
1. Choose device in mobile cloud
2. Install EPAMTestApp application
3. Use command "mvn clean test -P androidCloudNative" -to run android native test, or "mvn clean test -P iosCloudNative" - to run iOS native test.

To run web test just use commands:
1. "mvn clean test -P androidCloudWeb" - to run android web test
2. "mvn clean test -P iosCloudWeb" - to run iOS web test