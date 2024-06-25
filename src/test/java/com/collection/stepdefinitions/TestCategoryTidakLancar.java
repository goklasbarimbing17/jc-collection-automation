package com.collection.stepdefinitions;

import com.collection.hooks.Hooks;
import com.collection.pages.CategoryLancarPage;
import com.collection.pages.CategoryTidakLancarPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestCategoryTidakLancar {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static CategoryTidakLancarPage categoryTidakLancarPage = new CategoryTidakLancarPage();
    private String getNipp, getName, getClassName, getChannelName, getTotalBiayaPelatihan, getPayment, getTotalOutstanding, getStatus;

    public TestCategoryTidakLancar() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("klik menu tidak lancar")
    public void klik_menu_tidak_lancar() {
        Hooks.delay(1);
        categoryTidakLancarPage.klikMenuTidakLancar();
        extentTest.log(LogStatus.PASS, "Klik menu tidak lancar");
    }

    @Then("Menampilkan view form tidak lancar")
    public void menampilkan_view_form_tidak_lancar() {
        Hooks.delay(1);
        Assert.assertTrue(categoryTidakLancarPage.txtResultTidakLancarPage().contains("PEMBAYARAN TIDAK LANCAR"));
        extentTest.log(LogStatus.PASS, "Menampilkan view form tidak lancar");
    }

    @When("input keyword search tidak lancar {string}")
    public void input_keyword_search_tidak_lancar(String keyword) {
        Hooks.delay(1);
        categoryTidakLancarPage.inputKeywordSearch(keyword);
        extentTest.log(LogStatus.PASS, "Input keyword search tidak lancar");
    }

    @When("klik button search tidak lancar")
    public void klik_button_search_tidak_lancar() {
        Hooks.delay(1);
        categoryTidakLancarPage.klikBtnSearch();
        extentTest.log(LogStatus.PASS, "Klik button search tidak lancar");
    }

    @Then("Menampilkan data tidak lancar berdasarkan keyword yang di cari {string} {string}")
    public void menampilkan_data_tidak_lancar_berdasarkan_keyword_yang_di_cari(String result, String searchBy) {
        Hooks.delay(1);
        if (searchBy.contains("nipp")) {
            Assert.assertTrue(categoryTidakLancarPage.getResultNipp().contains(result));
            extentTest.log(LogStatus.PASS, "Menampilkan data category lancar berdasarkan nipp");
        } else if (searchBy.equals("name")) {
            Assert.assertTrue(categoryTidakLancarPage.getResultName().contains(result));
            extentTest.log(LogStatus.PASS, "Menampilkan data category lancar berdasarkan Name");
        } else if (searchBy.equals("class name")) {
            Assert.assertTrue(categoryTidakLancarPage.getResultClassName().contains(result));
            extentTest.log(LogStatus.PASS, "Menampilkan data category lancar berdasarkan Class Name");
        } else if (searchBy.contains("channel payment")) {
            Assert.assertTrue(categoryTidakLancarPage.getResultChannelName().contains(result));
            extentTest.log(LogStatus.PASS, "Menampilkan data category lancar berdasarkan Channel payment");
        } else if (searchBy.contains("negatif test")) {
            Assert.assertTrue(categoryTidakLancarPage.getResultNoEntries().contains(result));
            extentTest.log(LogStatus.PASS, "Tidak menampilkan data Pembayaran");
        } else {
            System.err.println("Status tidak diketahui");
        }
    }

}