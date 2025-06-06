package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",  // Путь к .feature файлам
        glue = "steps",                            // Пакет со step definitions
        plugin = {"pretty", "html:target/cucumber-report.html"}, // Отчёты
        monochrome = true                          // Читаемый вывод в консоли
)

public class TestRunner extends AbstractTestNGCucumberTests {
    // Наследуемся от AbstractTestNGCucumberTests — чтобы интегрироваться с TestNG
}
