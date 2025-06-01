package utils;

import io.qameta.allure.Attachment;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyAllureListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        // Пример: прикрепить текстовую информацию при падении теста
        saveTextLog("Тест упал: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        saveTextLog("Тест прошел успешно: " + result.getName());
    }

    @Attachment(value = "{0}", type = "text/plain")
    public String saveTextLog(String message) {
        return message;
    }

    // Остальные методы можно переопределить при необходимости:
    // onTestStart, onTestSkipped, onFinish и т.д.
}
