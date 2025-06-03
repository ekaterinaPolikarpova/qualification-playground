package mobileTest.tests;

import mobileTest.steps.CommonSteps;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import mobileTest.utils.MyAllureListener;


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
