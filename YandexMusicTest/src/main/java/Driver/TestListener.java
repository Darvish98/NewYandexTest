package Driver;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        ScreenShotService.saveScreenshot();
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ScreenShotService.saveScreenshot();
    }

}
