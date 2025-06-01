package mobileTest;

import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.internal.shadowed.jackson.databind.ObjectMapper;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.URL;
import java.util.Map;

public class BaseTest {
    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws Exception {
        // Читаем JSON в Map
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> capsMap = mapper.readValue(
                new File("src/test/resources/appiumCapabilities.json"),
                Map.class);

        DesiredCapabilities caps = new DesiredCapabilities();

        // Добавляем все пары ключ-значение из JSON в capabilities
        for (Map.Entry<String, Object> entry : capsMap.entrySet()) {
            caps.setCapability(entry.getKey(), entry.getValue());
        }

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
