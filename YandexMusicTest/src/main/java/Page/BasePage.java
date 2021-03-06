package Page;

import Driver.DriverSingleton;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

import static org.testng.AssertJUnit.assertTrue;

public class BasePage {
    protected static WebDriver webDriver = DriverSingleton.getDriver();

    protected static WebDriverWait wait;
    private static ArrayList<String> tabs;

    protected static WebElement findElement(By by) {
        return webDriver.findElement(by);
    }


    protected static void clickJS(By element) {
        WebElement button = findElement(element);
        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("arguments[0].click();", button);
    }

    protected static void sendKeys(By element, String text) {
        findElement(element).sendKeys(text);
    }

    protected static void click(By element) {
        findElement(element).click();
    }

    protected static void isDisplayed(By element) {
        assertTrue(webDriver.findElement(element).isDisplayed());
    }

    protected static void open(String text) {
        webDriver.get(text);

    }

    protected static void windowHandle(int tab) {
        if (tabs == null) {
            tabs = new ArrayList<String> (webDriver.getWindowHandles());
        }
        webDriver.switchTo().window(tabs.get(tab));
    }

    protected static void enter(By element) {
        findElement(element).sendKeys(Keys.ENTER);
    }

    protected static void comparison(By element, String text) {
        WebElement comparisonText = findElement(element);
        assertTrue(comparisonText.getText().equals(text));
    }


}



