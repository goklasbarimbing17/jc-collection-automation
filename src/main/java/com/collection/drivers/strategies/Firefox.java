package com.collection.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Firefox implements DriverStrategy{

    @Override
    public WebDriver setStrategy() {
        System.setProperty("webdriver.gecko.driver", "D:\\Automation\\ChromeDriver\\geckodriver.exe");
        FirefoxOptions options = new FirefoxOptions();

        return new FirefoxDriver(options);
    }
}
