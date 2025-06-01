package mobileTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.MyAllureListener;


@Listeners(MyAllureListener.class)
public class FirstTest {
    @Test
    public void firstTest() {
        new CommonSteps().assertItWorks();
        new CommonSteps().assertSomething();
        new CommonSteps().assertSomething();
        new CommonSteps().assertSomething();
        new CommonSteps().assertSomething();
    }
}
