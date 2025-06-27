package browserStack;

import org.testng.annotations.Test;

public class DemoTest {

    @Test(dataProvider = "jsonData1", dataProviderClass = DemoDataProvider.class)
    public void assertThatItWorks(String text, int num){
        System.out.println(text);
        System.out.println(num);
    }
}