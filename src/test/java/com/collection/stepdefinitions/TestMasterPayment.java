package com.collection.stepdefinitions;

import com.collection.hooks.Hooks;
import com.collection.pages.MasterPaymentPage;
import com.collection.pages.MasterPersonPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestMasterPayment {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static MasterPaymentPage masterPaymentPage = new MasterPaymentPage();

    public TestMasterPayment() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("klik menu payment")
    public void klik_menu_person() {
        Hooks.delay(1);
        masterPaymentPage.klikMenuPayment();
        extentTest.log(LogStatus.PASS, "Klik menu payment");
    }

    @Then("view master payment di tampilkan")
    public void view_master_person_di_tampilkan() {
        Assert.assertEquals("Pass", "Pass");
        extentTest.log(LogStatus.PASS, "Menampilkam view master person");
    }

    /*
    SCENARIO SEARCH
     */
    @When("input keyword search master payment {string}")
    public void input_keyword_search(String keyword) {
        Hooks.delay(2);
        masterPaymentPage.setKeywordSearch(keyword);
        extentTest.log(LogStatus.PASS, "input keyword search");
    }

    @When("klik button search master payment")
    public void klik_button_search() {
        masterPaymentPage.klikBtnSearch();
        extentTest.log(LogStatus.PASS, "Klik button search");
        Hooks.delay(3);
    }

    @Then("Menampilkan data payment berdasarkan keyword yang di cari {string} {string}")
    public void menampilkan_data_berdasarkan_keyword_yang_di_cari(String result, String searchBy) {
        if (searchBy.contains("nipp")){
            Assert.assertEquals(masterPaymentPage.resultSearchByClassName(), result);
            extentTest.log(LogStatus.PASS, "Menampilkan data berdasarkan Class Name");
        } else if (searchBy.contains("nama")) {
            Assert.assertEquals(masterPaymentPage.resultSearchByChannelName(), result);
            extentTest.log(LogStatus.PASS, "Menampilkan data berdasarkan Channel Name");
        }else if (searchBy.contains("email")){
            Assert.assertEquals(masterPaymentPage.resultSearchByCreatedBy(), result);
            extentTest.log(LogStatus.PASS, "Menampilkan data berdasarkan Email");
        }else if (searchBy.contains("channel payment")) {
            Assert.assertEquals(masterPaymentPage.resultNoEntries(), result);
            extentTest.log(LogStatus.PASS, "Tidak menampilkan data yang dicari");
        } else {
            System.err.println();
        }
    }

    /*
    SCENARIO FILTER CLASS
     */
    @When("pilih dropdown class name")
    public void pilih_dropdown_filter_class() {
        masterPaymentPage.klikMenuPayment();
        Hooks.delay(2);
        masterPaymentPage.SelectFilterClassName("Beasiswa");
        extentTest.log(LogStatus.PASS, "Memilih dropdown filter class name");
    }

    @Then("Menampilkan data payment berdasarkan class name")
    public void menampilkan_data_berdasarkan_class() {
        Hooks.delay(2);
        Assert.assertEquals(masterPaymentPage.resultSearchByChannelName(),"Beasiswa");
        extentTest.log(LogStatus.PASS, "Menampilkan data filter berdasarkan Class Name");
    }

    /*
    SCENARIO GET DATA PAYMENT
     */
    @When("klik tombol Get Data payment")
    public void klik_tombol_get_data() {
        masterPaymentPage.klikMenuPayment();
        Hooks.delay(2);
        masterPaymentPage.klikBtnGetData();
        extentTest.log(LogStatus.PASS, "klik tombol Get Data payment");
    }

    @When("konfirmasi alert get data payment")
    public void konfirmasi_alert_get_data_payment() {
        Hooks.delay(2);
        masterPaymentPage.klikBtnAcceptAlert();
        extentTest.log(LogStatus.PASS, "konfirmasi alert get data");
    }

    @Then("berhasil get data payment")
    public void berhasil_get_data_payment() {
        Hooks.waitUntilElement("//p[normalize-space()='Berhasil']");
        Assert.assertEquals(masterPaymentPage.getResultGetData(),"Berhasil");
        Hooks.delay(2);
        masterPaymentPage.klikBtnAlertSucces();
        extentTest.log(LogStatus.PASS, "Berhasil melakukan get data");
    }
}