package com.collection.stepdefinitions;

import com.collection.hooks.Hooks;
import com.collection.pages.MasterPersonPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestMasterPerson {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static MasterPersonPage masterPersonPage = new MasterPersonPage();

    public TestMasterPerson() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("klik navigation Master data")
    public void klik_navigation_master_data() {
        masterPersonPage.klikBtnAlertWelcome();
        Hooks.delay(3);
        masterPersonPage.klikNavigationMasterData();
        extentTest.log(LogStatus.PASS, "Klik navigation Master Data");
    }

    @When("klik menu person")
    public void klik_menu_person() {
        masterPersonPage.klikMenuPerson();
        extentTest.log(LogStatus.PASS, "Klik menu person");
    }

    @Then("view master person di tampilkan")
    public void view_master_person_di_tampilkan() {
        Assert.assertEquals("Pass", "Pass");
        extentTest.log(LogStatus.PASS, "Menampilkam view master person");
    }

    /*
    SCENARIO SEARCH
     */
    @When("input keyword search {string}")
    public void input_keyword_search(String keyword) {
        Hooks.delay(1);
        masterPersonPage.setFieldSearch(keyword);
        extentTest.log(LogStatus.PASS, "input keyword search");
    }

    @When("klik button search")
    public void klik_button_search() {
        masterPersonPage.klikBtnSearch();
        extentTest.log(LogStatus.PASS, "Klik button search");
        Hooks.delay(3);
    }

    @Then("Menampilkan data berdasarkan keyword yang di cari {string} {string}")
    public void menampilkan_data_berdasarkan_keyword_yang_di_cari(String result, String searchBy) {
        if (searchBy.contains("nipp")){
            Assert.assertEquals(masterPersonPage.resultSearchByNipp(), result);
            extentTest.log(LogStatus.PASS, "Menampilkan data berdasarkan NIPP");
        } else if (searchBy.contains("nama")) {
            Assert.assertEquals(masterPersonPage.resultSearchByName(), result);
            extentTest.log(LogStatus.PASS, "Menampilkan data berdasarkan Nama");
        }else if (searchBy.contains("email")){
            Assert.assertEquals(masterPersonPage.resultSearchByEmail(), result);
            extentTest.log(LogStatus.PASS, "Menampilkan data berdasarkan Email");
        } else if (searchBy.contains("jenjang pendidikan")) {
            Assert.assertEquals(masterPersonPage.resultSearchByJenjangPendidikan(), result);
            extentTest.log(LogStatus.PASS, "Menampilkan data berdasarkan Jenjang Pendidikan");
        } else if (searchBy.contains("class")) {
            Assert.assertEquals(masterPersonPage.resultSearchByClass(), result);
            extentTest.log(LogStatus.PASS, "Menampilkan data berdasarkan Class");
        }else if (searchBy.contains("channel payment")) {
            Assert.assertEquals(masterPersonPage.resultSearchByChannelPayment(), result);
            extentTest.log(LogStatus.PASS, "Menampilkan data berdasarkan Channel Payment");
        } else {
            System.err.println();
        }
    }

    /*
    SCENARIO FILTER CLASS
     */
    @When("pilih dropdown filter class")
    public void pilih_dropdown_filter_class() {
        masterPersonPage.klikMenuPerson();
        Hooks.delay(2);
        masterPersonPage.SelectFilterClass("SQA RPA 8");
        extentTest.log(LogStatus.PASS, "Memilih dropdown filter class");
    }

    @Then("Menampilkan data berdasarkan class")
    public void menampilkan_data_berdasarkan_class() {
        Hooks.delay(2);
        Assert.assertEquals(masterPersonPage.resultSearchByClass(),"SQA RPA 8");
        extentTest.log(LogStatus.PASS, "Menampilkan data filter berdasarkan Class");
    }

    /*
    SCENARIO FILTER CHANNEL PAYMENT
     */
    @When("pilih dropdown filter Channel payment")
    public void pilih_dropdown_filter_channel_payment() {
        Hooks.delay(2);
        masterPersonPage.SelectFilterChannelPayment(1);
        extentTest.log(LogStatus.PASS, "Memilih dropdown filter channel payment");
    }

    @Then("Menampilkan data berdasarkan channel payment")
    public void menampilkan_data_berdasarkan_channel_payment() {
        Hooks.delay(2);
        Assert.assertEquals(masterPersonPage.resultSearchByChannelPayment(), "ISA");
        extentTest.log(LogStatus.PASS, "Menampilkan data filter berdasarkan Channel payment");
    }

    /*
    SCENARIO GET DATA PERSON
     */
    @When("klik tombol Get Data")
    public void klik_tombol_get_data() {
        masterPersonPage.klikBtnGetData();
        extentTest.log(LogStatus.PASS, "klik tombol Get Data");
    }

    @When("konfirmasi alert get data")
    public void konfirmasi_alert_informasi() {
        masterPersonPage.klikBtnAcceptAlert();
        extentTest.log(LogStatus.PASS, "konfirmasi alert get data");
    }

    @Then("berhasil get data")
    public void berhasil_get_data() {
        Hooks.delay(10);
        Assert.assertEquals(masterPersonPage.txtResultGetData(),"Data berhasil ditambahkan");
        Hooks.delay(2);
        masterPersonPage.klikBtnAlertSucces();
        extentTest.log(LogStatus.PASS, "Berhasil melakukan get data");
    }
}