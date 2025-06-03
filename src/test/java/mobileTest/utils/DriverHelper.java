package mobileTest.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.InputStream;
import java.net.URL;
import java.util.Map;

public class DriverHelper {

    private static DriverHelper instance;
    private AndroidDriver driver;

    // Приватный конструктор
    private DriverHelper() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream is = getClass().getClassLoader().getResourceAsStream("appiumCapabilities.json");
            if (is == null) {
                throw new RuntimeException("Файл appiumCapabilities.json не найден в ресурсах");
            }

            UiAutomator2Options options = new UiAutomator2Options();

            Map<String, Object> capsMap = mapper.readValue(is, Map.class);
//            DesiredCapabilities caps = new DesiredCapabilities();
            for (Map.Entry<String, Object> entry : capsMap.entrySet()) {
                options.setCapability(entry.getKey(), entry.getValue());
            }

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);

        } catch (Exception e) {
            throw new RuntimeException("Ошибка инициализации драйвера", e);
        }
    }

    // Синглтон: получить инстанс DriverHelper
    public static synchronized DriverHelper get() {
        if (instance == null) {
            instance = new DriverHelper();
        }
        return instance;
    }

    // Вернуть драйвер
    public AndroidDriver getDriver() {
        return driver;
    }

    // Завершить драйвер
    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
        instance = null;
    }
}
