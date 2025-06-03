package mobileTest.screens;

import mobileTest.utils.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.lang.reflect.InvocationTargetException;

public class MainScreen {

    private static MainScreen instance;

    private MainScreen() {

    }

    public static synchronized MainScreen get() {
        if (instance == null) {
            instance = new MainScreen();
        }
        return instance;
    }


    private final String BTN_SEARCH_ID = "org.joinmastodon.android:id/tab_search";
    private final String SEARCH_BAR_ID = "org.joinmastodon.android:id/search_text";


    //click
    public void clickSearchButton() {
        WebElement inputFieldElement = DriverHelper.get().getDriver().findElement(By.id(BTN_SEARCH_ID));
        inputFieldElement.click();
    }

    //sendKeys
    public void inputTextToSearchingLine() {
        WebElement searchBar = DriverHelper.get().getDriver().findElement(By.id(SEARCH_BAR_ID));
        searchBar.sendKeys("memes");
    }
}
