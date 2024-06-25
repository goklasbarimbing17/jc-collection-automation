package com.collection.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

public class Chrome implements DriverStrategy {
    @Override
    public WebDriver setStrategy() {
        System.setProperty("webdriver.chrome.driver", "D:\\Automation\\ChromeDriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        // untuk download data
        HashMap<String, Object> hmap = new HashMap<String , Object>();
        hmap.put("download.default_directory", "C:\\Users\\User\\Downloads");
        hmap.put("download.prompt_for_download", false);
        hmap.put("plugins.plugins_disabled", new String[]{
                "Chrome PDF Viewer"
        });
        hmap.put("plugins.always_open_pdf_externally", true);

        options.setExperimentalOption("prefs", hmap);
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--no-sandbox");


        return new ChromeDriver(options);
    }
}
