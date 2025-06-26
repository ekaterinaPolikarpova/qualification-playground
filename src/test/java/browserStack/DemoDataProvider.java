package browserStack;

import org.testng.annotations.DataProvider;

public class DemoDataProvider {

    @DataProvider(name = "jsonData1")
    public Object[][] provideDataFromJson() {
        return new Object[][]{
                {"test", 10},
                {"secondTest", 22}
        };
    }
}
