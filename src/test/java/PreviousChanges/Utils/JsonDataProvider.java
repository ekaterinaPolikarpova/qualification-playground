package PreviousChanges.Utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.DataProvider;

import java.io.InputStream;
import java.util.List;

public class JsonDataProvider {

    @DataProvider(name = "jsonData")
    public Object[][] provideTestDataFromJson() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        InputStream is = getClass().getClassLoader().getResourceAsStream("testdata.json");

        List<TestCaseData> dataList = mapper.readValue(is, new TypeReference<List<TestCaseData>>() {
        });
        Object[][] dataArray = new Object[dataList.size()][1];

        for (int i = 0; i < dataList.size(); i++) {
            dataArray[i][0] = dataList.get(i);
        }
        return dataArray;
    }
}
