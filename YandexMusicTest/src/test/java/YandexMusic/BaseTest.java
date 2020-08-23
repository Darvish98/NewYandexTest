package YandexMusic;

import Driver.TestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)

public class BaseTest {


    @AfterMethod
    public void end() {

        // DriverSingleton.closeDriver();
    }
}
