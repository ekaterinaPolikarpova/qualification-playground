
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void firstTest() {
        new TestSteps().assertItWorks();
        new TestSteps().assertSomething();
        new TestSteps().assertSomething();
    }
}
