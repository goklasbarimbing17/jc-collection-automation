package com.collection.stepdefinitions;

import com.collection.hooks.Hooks;
import com.collection.pages.MasterPersonPage;
import com.collection.pages.SpecialCasePage;
import com.collection.pages.TaskOtherPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestSpecialCase {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static SpecialCasePage specialCasePage = new SpecialCasePage();
    public static MasterPersonPage masterPersonPage = new MasterPersonPage();
    private String getTextName;

    public TestSpecialCase() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("klik navigation special case")
    public void klik_navigation_special_case() {
        Hooks.delay(1);
        specialCasePage.klikNavSpecialCase();
        extentTest.log(LogStatus.PASS, "Klik navigation special case");
    }

    @When("klik menu special case")
    public void klik_menu_special_case() {
        Hooks.delay(1);
        specialCasePage.klikMenuSpecialCase();
        extentTest.log(LogStatus.PASS, "Klik menu special case");
    }

    @Then("Menampilkan view form special case")
    public void menampilkan_view_form_special_case() {
        Hooks.delay(1);
        Assert.assertTrue(specialCasePage.txtResultSpecialCasePage().contains("SPECIAL CASE"));
        extentTest.log(LogStatus.PASS, "Menampilkan view form special case");
    }

    @When("input keyword search special case {string}")
    public void input_keyword_search_special_case(String keyword) {
        Hooks.delay(1);
        specialCasePage.inputKeywordSearch(keyword);
        extentTest.log(LogStatus.PASS, "Input keyword search case");
    }

    @When("klik button search special case")
    public void klik_button_search_special_case() {
        Hooks.delay(1);
        specialCasePage.klikBtnSearch();
        extentTest.log(LogStatus.PASS, "Klik nutton search special case");
    }

    @Then("Menampilkan data special case berdasarkan keyword yang di cari {string} {string}")
    public void menampilkan_data_special_case_berdasarkan_keyword_yang_di_cari(String result, String searchBy) {
        Hooks.delay(1);
        if (searchBy.contains("nipp")) {
            Assert.assertTrue(specialCasePage.getResultNipp().contains(result));
            extentTest.log(LogStatus.PASS, "Menampilkan data special case berdasarkan nipp");
        } else if (searchBy.equals("name")) {
            Assert.assertTrue(specialCasePage.getResultName().contains(result));
            extentTest.log(LogStatus.PASS, "Menampilkan data special case bedasarkan Name");
        } else if (searchBy.contains("email")) {
            Assert.assertTrue(specialCasePage.getResultEmail().contains(result));
            extentTest.log(LogStatus.PASS, "Menampilkan data special case berdasarkan Email");
        } else if (searchBy.contains("jenjang pendidikan")) {
            Assert.assertTrue(specialCasePage.getResultJenjangPendidikan().contains(result));
            extentTest.log(LogStatus.PASS, "Menampilkan data special case berdasarkan Jenjang Pendidikan");
        } else if (searchBy.equals("class name")) {
            Assert.assertTrue(specialCasePage.getResultClassName().contains(result));
            extentTest.log(LogStatus.PASS, "Menampilkan data special case berdasarkan Class Name");
        } else if (searchBy.contains("channel payment")) {
            Assert.assertTrue(specialCasePage.getResultChannelPayment().contains(result));
            extentTest.log(LogStatus.PASS, "Menampilkan data special case berdasarkan channel payment");
        } else if (searchBy.contains("negatif test")) {
            Assert.assertTrue(specialCasePage.getResultNoEntries().contains(result));
            extentTest.log(LogStatus.PASS, "Tidak menampilkan data special case");
        } else {
            System.err.println("Status tidak diketahui");
        }
    }

    @When("pilih dropdown class name special case")
    public void pilih_dropdown_class_name_special_case() {
        Hooks.delay(1);
        specialCasePage.klikMenuSpecialCase();
        Hooks.delay(1);
        specialCasePage.setDropdownClass(6);
        extentTest.log(LogStatus.PASS, "Pilih dropdown class name special case");
    }

    @Then("Menampilkan data special case berdasarkan class name")
    public void menampilkan_data_special_case_berdasarkan_class_name() {
        Hooks.delay(1);
        Assert.assertEquals(specialCasePage.getResultClassName(), "JAVA BACKEND 16");
        extentTest.log(LogStatus.PASS, "Menampilkan data special case berdasarkan class name");
    }

    @When("pilih dropdown status special case")
    public void pilih_dropdown_status_special_case() {
        Hooks.delay(1);
        specialCasePage.setDropdownStatus(1);
        extentTest.log(LogStatus.PASS, "Pilih dropdown status special case");
    }

    @Then("Menampilkan data special case berdasarkan status")
    public void menampilkan_data_special_case_berdasarkan_status() {
        Hooks.delay(1);
        Assert.assertEquals(specialCasePage.getResultChannelPayment(), "CASH FULL");
        extentTest.log(LogStatus.PASS, "Menampilkan data special case berdasarkan status");
    }

    @When("klik button detail special case")
    public void klik_button_detail_special_case() {
        Hooks.delay(1);
        specialCasePage.klikBtnViewDetail();
        extentTest.log(LogStatus.PASS, "Klik button detail special case");
    }

    @Then("menampilkan form detail special case")
    public void menampilkan_form_detail_special_case() {
        Hooks.delay(1);
        Assert.assertTrue(specialCasePage.getResultViewDetailPage().contains("Person Data"));
        extentTest.log(LogStatus.PASS, "Menampilkan form detail special case");
    }

    @When("klik button edit special case")
    public void klik_button_edit_special_case() {
        Hooks.delay(1);
        specialCasePage.klikBtnClose();
        Hooks.delay(2);
        specialCasePage.klikBtnEdit();
        extentTest.log(LogStatus.PASS, "Klik button edit special case");
    }

    @When("pilih status special case {int}")
    public void pilih_status_special_case(Integer int1) {
        Hooks.delay(1);
        specialCasePage.setDropdownStatusSpecialCase(1);
        extentTest.log(LogStatus.PASS, "Pilih status special case");
    }

    @When("klik button save - special case")
    public void klik_button_save_special_case() {
        Hooks.delay(1);
        specialCasePage.klikBtnSave();
        extentTest.log(LogStatus.PASS, "Klik button save");
    }

    @When("klik button ya pada popup")
    public void klik_button_ya_pada_popup() {
        Hooks.delay(1);
        specialCasePage.klikBtnYa();
        extentTest.log(LogStatus.PASS, "Klik button ya pada popup");
    }

    @Then("validasi status special case {string}")
    public void validasi_status_special_case(String result) {
        Hooks.delay(1);
        specialCasePage.inputKeywordSearch("RIZKA AGUSTIN");
        Assert.assertEquals(specialCasePage.getResultChannelPayment(), result);
        extentTest.log(LogStatus.PASS, "Validasi status special case");
    }
}