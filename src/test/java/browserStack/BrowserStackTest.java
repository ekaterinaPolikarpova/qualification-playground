package browserStack;

import Utils.BaseHelper;
import Utils.TestCaseData;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import mobileTest.steps.AllureStepsCheckTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.InputStream;
import java.util.List;

public class BrowserStackTest extends BaseHelper {

    @DataProvider(name = "jsonData")
    public Object[][] provideTestDataFromJson() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        InputStream is = getClass().getClassLoader().getResourceAsStream("testdata.json");

        List<TestCaseData> dataList = mapper.readValue(is, new TypeReference<List<TestCaseData>>() {
        });

        Object[][] dataArray = new Object[dataList.size()][2];
        for (int i = 0; i < dataList.size(); i++) {
            dataArray[i][0] = dataList.get(i).url;
            dataArray[i][1] = dataList.get(i).title;
        }
        return dataArray;
    }

    @Test(dataProvider = "jsonData")
    public void testWikipediaTitle(String url, String title) {
        driver.get(url);
        String actualTitle = driver.getTitle();
        System.out.println("Title is: " + actualTitle);
        String titleSecond = System.getenv("TITLE");
        Assert.assertTrue(actualTitle.contains(titleSecond), "Title does not match expected value.");
    }

    @Test
    public void allureStepsCheckTest() {
        new AllureStepsCheckTest().allureStepsCheckTest();
    }
}