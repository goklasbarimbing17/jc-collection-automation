package com.collection.stepdefinitions;

import com.collection.hooks.Hooks;
import com.collection.pages.PaymentPaidPage;
import com.collection.pages.PaymentVerifikasiPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestPaymentPaid {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static PaymentPaidPage paymentPaidPage = new PaymentPaidPage();
    private String getNipp, getName, getClassName, getChannelName, getTotalBiayaPelatihan, getPayment, getTotalOutstanding, getStatus;

    public TestPaymentPaid() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("klik menu Paid")
    public void klik_menu_paid() {
        Hooks.delay(1);
        paymentPaidPage.klikNavPayment();
        paymentPaidPage.klikMenuPaid();
        extentTest.log(LogStatus.PASS, "Klik menu Paid");
    }

    @Then("Menampilkan view form Paid")
    public void menampilkan_view_form_paid() {
        Hooks.delay(1);
        Assert.assertTrue(paymentPaidPage.txtResultPaidPage().contains("DATA PAID"));
        extentTest.log(LogStatus.PASS, "Menampilkan view form paid");
    }

    @When("input keyword search Paid {string}")
    public void input_keyword_search_paid(String keyword) {
        Hooks.delay(1);
        paymentPaidPage.inputKeywordSearch(keyword);
        extentTest.log(LogStatus.PASS, "Input keyword search paid");
    }

    @When("klik button search Paid")
    public void klik_button_search_paid() {
        Hooks.delay(1);
        paymentPaidPage.klikBtnSearch();
        extentTest.log(LogStatus.PASS, "Klik button search paid");
    }

    @Then("Menampilkan data Paid berdasarkan keyword yang di cari {string} {string}")
    public void menampilkan_data_paid_berdasarkan_keyword_yang_di_cari(String result, String searchBy) {
        Hooks.delay(1);
        if (searchBy.contains("nipp")) {
            Assert.assertTrue(paymentPaidPage.getResultNipp().contains(result));
            extentTest.log(LogStatus.PASS, "Menampilkan data special case berdasarkan nipp");
        } else if (searchBy.equals("name")) {
            Assert.assertTrue(paymentPaidPage.getResultName().contains(result));
            extentTest.log(LogStatus.PASS, "Menampilkan data special case bedasarkan Name");
        } else if (searchBy.equals("class name")) {
            Assert.assertTrue(paymentPaidPage.getResultClassName().contains(result));
            extentTest.log(LogStatus.PASS, "Menampilkan data special case berdasarkan Class Name");
        } else if (searchBy.contains("channel payment")) {
            Assert.assertTrue(paymentPaidPage.getResultChannelName().contains(result));
            extentTest.log(LogStatus.PASS, "Menampilkan data special case berdasarkan Channel payment");
        } else if (searchBy.contains("negatif test")) {
            Assert.assertTrue(paymentPaidPage.getResultNoEntries().contains(result));
            extentTest.log(LogStatus.PASS, "Tidak menampilkan data Pembayaran");
        } else {
            System.err.println("Status tidak diketahui");
        }
    }

    @When("pilih dropdown class name Paid")
    public void pilih_dropdown_class_name_paid() {
        Hooks.delay(1);
        paymentPaidPage.klikMenuPaid();
        paymentPaidPage.setDropdownClassName(19);
        extentTest.log(LogStatus.PASS, "Pilih dropdown class name paid");
    }

    @Then("Menampilkan data paid berdasarkan class name")
    public void menampilkan_data_paid_berdasarkan_class_name() {
        Hooks.delay(1);
        Assert.assertTrue(paymentPaidPage.getResultClassName().contains("SQA RPA 10"));
        extentTest.log(LogStatus.PASS, "Menampilkan data paid berdasarkan class name");
    }

    @When("pilih dropdown status paid")
    public void pilih_dropdown_status_paid() {
        Hooks.delay(1);
        paymentPaidPage.setDropdownChannelName(3);
        extentTest.log(LogStatus.PASS, "Pilih dropdown status paid");
    }

    @Then("Menampilkan data paid berdasarkan channel name")
    public void menampilkan_data_paid_berdasarkan_channel_name() {
        Hooks.delay(1);
        Assert.assertTrue(paymentPaidPage.getResultChannelName().contains("CASH BERTAHAP"));
        extentTest.log(LogStatus.PASS, "Menampilkan data paid berdasarkan channel name");
    }

    @When("klik row yang ini di show detail informasi data payment")
    public void klik_row_yang_ini_di_show_detail_informasi_data_payment() {
        Hooks.delay(1);
        paymentPaidPage.klikMenuPaid();
        Hooks.delay(1);
        getNipp = paymentPaidPage.getResultNipp();
        getName = paymentPaidPage.getResultName();
        getClassName = paymentPaidPage.getResultClassName();
        getChannelName = paymentPaidPage.getResultChannelName();
        getTotalBiayaPelatihan = paymentPaidPage.getResultTotalBiayaPelatihan();
        getTotalOutstanding = paymentPaidPage.getResultTotalOutstanding();
        getPayment = paymentPaidPage.getResultPayment();
        getStatus = paymentPaidPage.getResultStatus();
        Hooks.delay(1);
        paymentPaidPage.klikRowData();
        extentTest.log(LogStatus.PASS, "Klik row yang ini di show detail informasi data payment");
    }

    @Then("menampilkan form detail informasi data payment")
    public void menampilkan_form_detail_informasi_data_payment() {
        Hooks.delay(1);
        Assert.assertTrue(paymentPaidPage.getViewDetailPaid().contains("Data Pembayaran Tagihan"));
        extentTest.log(LogStatus.PASS, "Menampilkan form detail informasi data payment");
    }

    @Then("mencocokkan data pada grid dengan data detail")
    public void mencocokkan_data_pada_grid_dengan_data_detail() {
        Hooks.delay(1);
        Assert.assertTrue(paymentPaidPage.getDetailNipp().contains(getNipp));
        System.out.println("NIPP SESUAI");
        Assert.assertTrue(paymentPaidPage.getDetailNama().contains(getName));
        System.out.println("NAMA SESUAI");
        Assert.assertTrue(paymentPaidPage.getDetailClassName().contains(getClassName));
        System.out.println("CLASS NAME SESUAI");
        Assert.assertTrue(paymentPaidPage.getDetailChannelName().contains(getChannelName));
        System.out.println("CHANNEL NAME SESUAI");
        Assert.assertTrue(paymentPaidPage.getDetailStatus().contains(getStatus));
        System.out.println("STATUS SESUAI");
        Assert.assertTrue(paymentPaidPage.getDetailTotalBiayaPelatihan().contains(getTotalBiayaPelatihan));
        System.out.println("TOTAL BIAYA PELATIHAN SESUAI");
        Assert.assertTrue(paymentPaidPage.getDetailTotalOutstanding().contains(getTotalOutstanding));
        System.out.println("TOTAL OUTSTANDING SESUAI");
        Assert.assertTrue(paymentPaidPage.getDetailPayment().contains(getPayment));
        System.out.println("PAYMENT SESUAI");
        extentTest.log(LogStatus.PASS, "Mencocokkan data pada grid table dengan data detail");
    }
}