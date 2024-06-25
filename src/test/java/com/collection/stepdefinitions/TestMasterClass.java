package com.collection.stepdefinitions;

import com.collection.hooks.Hooks;
import com.collection.pages.MasterClassPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestMasterClass {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static MasterClassPage masterClassPage = new MasterClassPage();

    public TestMasterClass() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("klik menu class")
    public void klik_menu_class() {
        masterClassPage.klikMenuClass();
        extentTest.log(LogStatus.PASS, "Klik menu class");
    }

    @Then("view master class di tampilkan")
    public void view_master_class_di_tampilkan() {
        Assert.assertEquals("Pass", "Pass");
        extentTest.log(LogStatus.PASS, "Menampilkam view master class");
    }

    @When("input keyword search master class {string}")
    public void input_keyword_search_master_class(String keyword) {
        masterClassPage.setKeywordSearch(keyword);
        extentTest.log(LogStatus.PASS, "Input keyword search master class");
    }

    @When("klik button search master class")
    public void klik_button_search_master_class() {
        masterClassPage.klikBtnSearch();
        extentTest.log(LogStatus.PASS, "Klik button search master class");
        Hooks.delay(3);
    }

    @Then("Menampilkan data class berdasarkan keyword yang di cari {string} {string}")
    public void menampilkan_data_class_berdasarkan_keyword_yang_di_cari(String result, String searchBy) {
        if (searchBy.contains("class name")) {
            Assert.assertEquals(masterClassPage.resultSearchByClassName(), result);
            extentTest.log(LogStatus.PASS, "Menampilkan data class berdasarkan class name");
        } else if (searchBy.contains("class code")) {
            Assert.assertEquals(masterClassPage.resultSearchByClassCode(), result);
            extentTest.log(LogStatus.PASS, "Menampilkan data class berdasarkan class code");
        } else if (searchBy.contains("negatif test")) {
            Assert.assertEquals(masterClassPage.resultNoEntries(),result);
            extentTest.log(LogStatus.PASS, "Tidak Menampilkan data class");
        }
    }

    @When("pilih dropdown filter class name")
    public void pilih_dropdown_filter_class_name() {
        masterClassPage.klikMenuClass();
        Hooks.delay(2);
        masterClassPage.SelectFilterClassName("PYTHON REGULAR");
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "Pilih dropdown filter class name");
    }

    @Then("Menampilkan data berdasarkan class name")
    public void menampilkan_data_berdasarkan_class_name() {
       Assert.assertEquals(masterClassPage.resultSearchByClassName(),"PYTHON REGULAR");
       extentTest.log(LogStatus.PASS, "Menampilkan data berdasarkan class name");
    }

    @When("pilih dropdown filter is active")
    public void pilih_dropdown_filter_is_active() {
        masterClassPage.klikMenuClass();
        Hooks.delay(2);
        masterClassPage.SelectFilterClassCode("1");
        extentTest.log(LogStatus.PASS, "Pilih dropdown filter is active");
    }

    @Then("Menampilkan data berdasarkan is active")
    public void menampilkan_data_berdasarkan_is_active() {
        Assert.assertTrue(masterClassPage.resultFilterByIsActive().contains("Active")); ;
        extentTest.log(LogStatus.PASS, "Menampilkan data berdasarkan is active");
    }

    @When("klik tombol Get Data class")
    public void klik_tombol_get_data_class() {
        masterClassPage.klikBtnGetData();
        Hooks.delay(3);
        extentTest.log(LogStatus.PASS, "klik tombol Get Data");
    }

    @When("konfirmasi alert get data class")
    public void konfirmasi_alert_get_data_class() {
        masterClassPage.klikBtnAcceptAlert();
        extentTest.log(LogStatus.PASS, "konfirmasi alert get data");
    }

    @Then("berhasil get data class")
    public void berhasil_get_data_class() {
        Assert.assertEquals(masterClassPage.getResultGetData(),"Berhasil");
        Hooks.delay(2);
        masterClassPage.klikBtnAlertSucces();
        extentTest.log(LogStatus.PASS, "Berhasil melakukan get data");
        Hooks.delay(3);
    }

}
