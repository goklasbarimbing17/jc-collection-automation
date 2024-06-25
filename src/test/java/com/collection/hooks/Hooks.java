package com.collection.hooks;

import com.collection.drivers.DriverSingleton;
import com.collection.utils.Constants;
import com.collection.utils.TestScenarios;
import com.collection.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;


public class Hooks {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static ExtentReports reports = new ExtentReports("target/extent-report.html");

    @Before
    public static void setUp() {
        DriverSingleton.getInstance(Constants.FIREFOX);
        driver = DriverSingleton.getDriver();
        TestScenarios[] test = TestScenarios.values();
        extentTest = reports.startTest(test[Utils.testCount].getTestCaseName());
        Utils.testCount++;
    }

    @After
    public void endTestClass() {
        reports.endTest(extentTest);
        reports.flush();
    }

    @AfterStep
    public void getResultStatus(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            String screenshootPath = Utils.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            extentTest.log(LogStatus.FAIL, scenario.getName() + "\n" +
                    extentTest.addScreenCapture(screenshootPath));
        }
    }

    @AfterAll
    public static void tearDown() {
        delay(2);
        DriverSingleton.closeObjectInstance();
    }

    public static void delay(long second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void waitUntilElement(String xpath){
        try {
            WebElement element = new WebDriverWait(driver, 30).until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))
            );
        } catch (Exception e) {
            System.out.println("Element not found or not visible within 10 seconds: " + e.getMessage());
        }
    }
    public static void Escape() {
      //  ((JavascriptExecutor) driver).executeScript("document.dispatchEvent(new KeyboardEvent('keydown', {key: 'Escape'}));");
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).build().perform();
//        try
//        {
//            Robot r = new Robot();
//            r.keyPress(KeyEvent.VK_ESCAPE);
//            r.keyRelease(KeyEvent.VK_ESCAPE);
//        }
//        catch (AWTException e)
//        {
//            e.printStackTrace();
//        }
    }
}
