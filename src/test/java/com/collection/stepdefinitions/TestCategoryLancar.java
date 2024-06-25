package com.collection.stepdefinitions;

import com.collection.hooks.Hooks;
import com.collection.pages.CategoryLancarPage;
import com.collection.pages.PaymentUnpaidPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestCategoryLancar {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static CategoryLancarPage categoryLancarPage = new CategoryLancarPage();
    private String getNipp, getName, getClassName, getChannelName, getTotalBiayaPelatihan, getPayment, getTotalOutstanding, getStatus;

    public TestCategoryLancar() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("klik navigation Category")
    public void klik_navigation_category() {
        Hooks.delay(1);
        categoryLancarPage.klikNavCategory();
        extentTest.log(LogStatus.PASS, "Klik navigation category");
    }

    @When("klik menu lancar")
    public void klik_menu_lancar() {
        Hooks.delay(1);
        categoryLancarPage.klikMenuLancar();
        extentTest.log(LogStatus.PASS, "Klik menu lancar");
    }

    @Then("Menampilkan view form lancar")
    public void menampilkan_view_form_lancar() {
        Hooks.delay(1);
        Assert.assertTrue(categoryLancarPage.txtResultLancarPage().contains("PEMBAYARAN LANCAR"));
        extentTest.log(LogStatus.PASS, "Menampilkan view form lancar");
    }

    @When("input keyword search lancar {string}")
    public void input_keyword_search_lancar(String keyword) {
        Hooks.delay(1);
        categoryLancarPage.inputKeywordSearch(keyword);
        extentTest.log(LogStatus.PASS, "Input keyword search lancar");
    }

    @When("klik button search lancar")
    public void klik_button_search_lancar() {
        Hooks.delay(1);
        categoryLancarPage.klikBtnSearch();
        extentTest.log(LogStatus.PASS, "Klik button search lancar");
    }

    @Then("Menampilkan data lancar berdasarkan keyword yang di cari {string} {string}")
    public void menampilkan_data_lancar_berdasarkan_keyword_yang_di_cari(String result, String searchBy) {
        Hooks.delay(1);
        if (searchBy.contains("nipp")) {
            Assert.assertTrue(categoryLancarPage.getResultNipp().contains(result));
            extentTest.log(LogStatus.PASS, "Menampilkan data category lancar berdasarkan nipp");
        } else if (searchBy.equals("name")) {
            Assert.assertTrue(categoryLancarPage.getResultName().contains(result));
            extentTest.log(LogStatus.PASS, "Menampilkan data category lancar berdasarkan Name");
        } else if (searchBy.equals("class name")) {
            Assert.assertTrue(categoryLancarPage.getResultClassName().contains(result));
            extentTest.log(LogStatus.PASS, "Menampilkan data category lancar berdasarkan Class Name");
        } else if (searchBy.contains("channel payment")) {
            Assert.assertTrue(categoryLancarPage.getResultChannelName().contains(result));
            extentTest.log(LogStatus.PASS, "Menampilkan data category lancar berdasarkan Channel payment");
        } else if (searchBy.contains("status")) {
            Assert.assertTrue(categoryLancarPage.getResultStatus().contains(result));
            extentTest.log(LogStatus.PASS, "Menampilkan data category lancar berdasarkan status");
        }else if (searchBy.contains("negatif test")) {
            Assert.assertTrue(categoryLancarPage.getResultNoEntries().contains(result));
            extentTest.log(LogStatus.PASS, "Tidak menampilkan data Pembayaran");
        } else {
            System.err.println("Status tidak diketahui");
        }
    }

}