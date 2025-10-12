package AppiumDemo;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class AppiumDemoTest {
    public static AndroidDriver driver;

    // =====INIT THE DRIVER======
    public static void main(String[] args) throws InterruptedException {
        driver = AndroidDriverHelper.getDriver();
        openApp();
    }

    // =====CONNECT TO APPLICATION ======
    public static void openApp() {
        driver.activateApp("com.productmadness.hovmobile");
        System.out.println("Приложение открыто");
    }


    // =====SEARCHING THE ITEMS======
    public void searchElement() {
        //  WebElement el = driver.findElement(By.id());
    }
}
