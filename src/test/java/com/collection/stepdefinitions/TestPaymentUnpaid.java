package com.collection.stepdefinitions;

import com.collection.hooks.Hooks;
import com.collection.pages.PaymentPaidPage;
import com.collection.pages.PaymentUnpaidPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestPaymentUnpaid {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static PaymentUnpaidPage paymentUnpaidPage = new PaymentUnpaidPage();
    private String getNipp, getName, getClassName, getChannelName, getTotalBiayaPelatihan, getPayment, getTotalOutstanding, getStatus;

    public TestPaymentUnpaid() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("klik menu Unpaid")
    public void klik_menu_unpaid() {
        Hooks.delay(1);
        paymentUnpaidPage.klikNavPayment();
        paymentUnpaidPage.klikMenuUnpaid();
        extentTest.log(LogStatus.PASS, "Klik menu Unpaid");
    }

    @Then("Menampilkan view form Unpaid")
    public void menampilkan_view_form_unpaid() {
        Hooks.delay(1);
        Assert.assertEquals(paymentUnpaidPage.txtResultUnpaidPage(),"DATA  UNPAID");
        extentTest.log(LogStatus.PASS, "Menampilkan view form unpaid");
    }

    @When("input keyword search unpaid {string}")
    public void input_keyword_search_unpaid(String keyword) {
        Hooks.delay(1);
        paymentUnpaidPage.inputKeywordSearch(keyword);
        extentTest.log(LogStatus.PASS, "Input keyword search unpaid");
    }

    @When("klik button search unpaid")
    public void klik_button_search_unpaid() {
        Hooks.delay(1);
        paymentUnpaidPage.klikBtnSearch();
        extentTest.log(LogStatus.PASS, "Klik button search unpaid");
    }

    @Then("Menampilkan data unpaid berdasarkan keyword yang di cari {string} {string}")
    public void menampilkan_data_unpaid_berdasarkan_keyword_yang_di_cari(String result, String searchBy) {
        Hooks.delay(1);
        if (searchBy.contains("nipp")) {
            Assert.assertTrue(paymentUnpaidPage.getResultNipp().contains(result));
            extentTest.log(LogStatus.PASS, "Menampilkan data special case berdasarkan nipp");
        } else if (searchBy.equals("name")) {
            Assert.assertTrue(paymentUnpaidPage.getResultName().contains(result));
            extentTest.log(LogStatus.PASS, "Menampilkan data special case bedasarkan Name");
        } else if (searchBy.equals("class name")) {
            Assert.assertTrue(paymentUnpaidPage.getResultClassName().contains(result));
            extentTest.log(LogStatus.PASS, "Menampilkan data special case berdasarkan Class Name");
        } else if (searchBy.contains("channel payment")) {
            Assert.assertTrue(paymentUnpaidPage.getResultChannelName().contains(result));
            extentTest.log(LogStatus.PASS, "Menampilkan data special case berdasarkan Channel payment");
        } else if (searchBy.contains("negatif test")) {
            Assert.assertTrue(paymentUnpaidPage.getResultNoEntries().contains(result));
            extentTest.log(LogStatus.PASS, "Tidak menampilkan data Pembayaran");
        } else {
            System.err.println("Status tidak diketahui");
        }
    }

    @When("pilih dropdown class name unpaid")
    public void pilih_dropdown_class_name_unpaid() {
        Hooks.delay(2);
        paymentUnpaidPage.klikMenuUnpaid();
        Hooks.delay(1);
        paymentUnpaidPage.setDropdownClassName(4);
        extentTest.log(LogStatus.PASS, "Pilih dropdown class name unpaid");
    }

    @Then("Menampilkan data unpaid berdasarkan class name")
    public void menampilkan_data_paid_berdasarkan_class_name() {
        Hooks.delay(1);
        Assert.assertEquals(paymentUnpaidPage.getResultClassName(),"MERN - PINTAR 17");
        extentTest.log(LogStatus.PASS, "Menampilkan data unpaid berdasarkan class name");
    }

    @When("pilih dropdown status unpaid")
    public void pilih_dropdown_status_unpaid() {
        Hooks.delay(1);
        paymentUnpaidPage.setDropdownChannelName(2);
        extentTest.log(LogStatus.PASS, "Pilih dropdown status unpaid");
    }

    @Then("Menampilkan data unpaid berdasarkan channel name")
    public void menampilkan_data_unpaid_berdasarkan_channel_name() {
        Hooks.delay(1);
        Assert.assertTrue(paymentUnpaidPage.getResultChannelName().contains("CASH BERTAHAP"));
        extentTest.log(LogStatus.PASS, "Menampilkan data unpaid berdasarkan channel name");
    }

}