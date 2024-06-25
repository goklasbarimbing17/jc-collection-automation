package com.collection.stepdefinitions;

import com.collection.hooks.Hooks;
import com.collection.pages.MasterPersonPage;
import com.collection.pages.TaskOtherPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestTaskOther {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static TaskOtherPage taskOtherPage = new TaskOtherPage();
    public static MasterPersonPage masterPersonPage = new MasterPersonPage();
    private String getTextName;

    public TestTaskOther() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("klik navigation task - Other")
    public void klik_navigation_task_Other() {
        taskOtherPage.klikNavigationTask();
        extentTest.log(LogStatus.PASS, "klik Navigation Task");
    }

    @When("klik menu Other")
    public void klik_menu_Other() {
        taskOtherPage.klikMenuPtp();
        extentTest.log(LogStatus.PASS, "klik menu ptp");
    }

    @Then("Menampilkan view form Other")
    public void view_form_Other() {
        Assert.assertEquals(taskOtherPage.getResultPagePtp(), "PTP");
        extentTest.log(LogStatus.PASS, "Menampilkan view form ptp");
    }

    @When("input keyword search Other {string}")
    public void input_keyword_search_Other(String keyword) {
        taskOtherPage.setKeywordSearch(keyword);
        extentTest.log(LogStatus.PASS, "Input keyword search todo");
    }

    @When("klik button search Other")
    public void klik_button_search_Other() {
        taskOtherPage.klikBtnSearch();
        extentTest.log(LogStatus.PASS, "klik button search Ptp");
        Hooks.delay(3);
    }

    @Then("Menampilkan data Other berdasarkan keyword yang di cari {string} {string}")
    public void menampilkan_data_Other_berdasarkan_keyword_yang_di_cari(String result, String searchBy) {
        if (searchBy.contains("nipp")) {
            Assert.assertEquals(taskOtherPage.getResultSearchByNipp(), result);
            extentTest.log(LogStatus.PASS, "Menampilkan data berdasarkan nipp");
        } else if (searchBy.equals("name")) {
            Assert.assertEquals(taskOtherPage.getResultSearchByName(), result);
            extentTest.log(LogStatus.PASS, "Menampilkan data berdasarkan nama");
        } else if (searchBy.equals("class name")) {
            Assert.assertEquals(taskOtherPage.getResultSearchByClassName(), result);
            extentTest.log(LogStatus.PASS, "Menampilkan data berdasarkan Class name");
        } else if (searchBy.equals("channel name")) {
            Assert.assertEquals(taskOtherPage.getResultSearchByChannelPayment(), result);
            extentTest.log(LogStatus.PASS, "Menampilkan data berdasarkan Channel name");
        } else if (searchBy.contains("negatif test")) {
            Assert.assertTrue(taskOtherPage.getResultNoEntries().contains(result));
            extentTest.log(LogStatus.PASS, "Tidak menampilkan data yang dicari");
        } else {
            System.err.println();
        }
    }


    @When("pilih dropdown class name Other")
    public void pilih_dropdown_class_name_Other() {
        taskOtherPage.klikMenuPtp();
        Hooks.delay(1);
        taskOtherPage.setDropdownClassName(1);
        extentTest.log(LogStatus.PASS, "Pilih dropdown class name Other");
    }

    @Then("Menampilkan data Other berdasarkan class name")
    public void menampilkan_data_Other_berdasarkan_class_name() {
        Hooks.delay(1);
        Assert.assertTrue(taskOtherPage.getResultSearchByClassName().contains("MERN - PINTAR 17"));
        extentTest.log(LogStatus.PASS, "Menampilkan data Other berdasarkan class name");
    }

    @When("pilih dropdown channel name Other")
    public void pilih_dropdown_channel_name_Other() {
        Hooks.delay(1);
        taskOtherPage.setDropdowmChannelName("Cash");
        extentTest.log(LogStatus.PASS, "Pilih dropdown channel name Other");
    }

    @Then("Menampilkan data Other berdasarkan channel name")
    public void menampilkan_data_Other_berdasarkan_channel_name() {
        Hooks.delay(1);
        Assert.assertTrue(taskOtherPage.getResultSearchByChannelPayment().contains("CASH BERTAHAP"));
        extentTest.log(LogStatus.PASS, "Menampilkan data Other berdasarkan channel name");
    }

    //Detail Activity
    @When("klik row Other yang ingin di show detail activitynya")
    public void klik_row_Other_yang_ingin_di_show_detail_activitynya() {
        Hooks.delay(1);
        taskOtherPage.klikRow();
        extentTest.log(LogStatus.PASS, "Klik row Other yang ingin di show detail activitynya");
    }

    @Then("menampilkan form detail activity Other")
    public void menampilkan_form_detail_activity_Other() {
        Hooks.delay(1);
        Assert.assertTrue(taskOtherPage.getResultDetailActivity().contains("Data Detail"));
        extentTest.log(LogStatus.PASS, "Menampilkan form detail activity Other");
    }

    // Detail History
    @When("klik tombol history Other")
    public void klik_tombol_history_Other() {
        Hooks.delay(1);
        taskOtherPage.klikBtnHistory();
        extentTest.log(LogStatus.PASS, "klik tombol history");
    }

    @Then("Menampilkan form view history Other")
    public void menampilkan_form_view_history_Other() {
        Hooks.delay(1);
        Assert.assertEquals(taskOtherPage.getResultHistory(), "Data History");
        extentTest.log(LogStatus.PASS, "Menampilkan form view history");
    }

    //Detail Biodata
    @When("klik tombol biodata Other")
    public void klik_tombol_biodata() {
        Hooks.delay(2);
        Hooks.Escape();
        Hooks.delay(1);
        taskOtherPage.klikBtnBiodata();
        extentTest.log(LogStatus.PASS, "Klik tombol biodata");
    }

    @Then("Menampilkan form view biodata Other")
    public void menampilkan_form_view_biodata() {
        Hooks.delay(1);
        Assert.assertEquals(taskOtherPage.getResultBiodata(), "View biodata");
        taskOtherPage.klikBtnClose();
        extentTest.log(LogStatus.PASS, "Menampilkan form view biodata");
    }

    //UPDATE STATUS ACTIVITY
    @When("pilih status - Other {int}")
    public void pilih_status_Other(Integer index) {
        Hooks.delay(1);
        taskOtherPage.setDropdownStatus(index);
        extentTest.log(LogStatus.PASS, "Pilih status - Other");
    }

    @When("pilih status call - Other {int}")
    public void pilih_status_call_Other(Integer index) {
        Hooks.delay(1);
        taskOtherPage.setDropdownStatusCall(index);
        extentTest.log(LogStatus.PASS, "Pilih status call - Other");
    }

    @When("pilih status result - Other {int}")
    public void pilih_status_result_Other(Integer index) {
        Hooks.delay(1);
        taskOtherPage.setDropdownStatusResult(index);
        extentTest.log(LogStatus.PASS, "Pilih result - Other");
    }

    @When("pilih tanggal ptp - Other")
    public void pilih_tanggal_ptp_Other() {
        Hooks.delay(1);
        taskOtherPage.setTanggal();
        extentTest.log(LogStatus.PASS, "Pilih tanggal ptp");
    }

    @When("pilih tanggal follow up - Other")
    public void pilih_tanggal_follow_up_Other() {
        Hooks.delay(1);
        taskOtherPage.setTanggal();
        extentTest.log(LogStatus.PASS, "Pilih tanggal follow up");
    }

    @When("pilih payment status - Other {int}")
    public void pilih_paymnet_status_Other(int index) {
        Hooks.delay(1);
        taskOtherPage.setDropdownPaymentStatus(index);
        extentTest.log(LogStatus.PASS, "Pilih payment status - Other");
    }

    @When("input nominal payment - Other {int}")
    public void pilih_nominal_payment_Other(int nominal) {
        Hooks.delay(1);
        taskOtherPage.setNominal(nominal);
        extentTest.log(LogStatus.PASS, "Pilih payment status - Other");
    }

    @When("input remarks - Other {string}")
    public void input_remarks_Other(String remarks) {
        Hooks.delay(1);
        taskOtherPage.setRemarks(remarks);
        extentTest.log(LogStatus.PASS, "Input remarks - Other");
    }

    @When("klik button save - Other")
    public void klik_button_save_Other() {
        Hooks.delay(1);
        getTextName = taskOtherPage.getPersonName();
        Hooks.delay(1);
        taskOtherPage.klikBtnSave();
        extentTest.log(LogStatus.PASS, "Klik button save Other");
    }

    @When("klik button attachment - Other")
    public void klik_button_attachment_Other() {
        taskOtherPage.klikBtnAttachment();
        extentTest.log(LogStatus.PASS, "klik button attachment");
    }

    @When("upload file attachment - Other")
    public void upload_file_attachment_Other() {
        Hooks.delay(2);
        taskOtherPage.setPathFile("C:\\Users\\sqa_d\\Downloads\\invoice.jpeg");
        //Runtime.getRuntime().exec("");
        extentTest.log(LogStatus.PASS, "upload file attachment");
    }

    @When("input name file - Other")
    public void input_name_file_Other() {
        Hooks.delay(1);
        taskOtherPage.setNameFile("Bukti pembayaran");
        extentTest.log(LogStatus.PASS, "Input nama file");
    }

    @When("klik button upload - Other")
    public void klik_button_upload_Other() {
        taskOtherPage.klikBtnUpload();
        Hooks.delay(1);
        taskOtherPage.klikBtnSimpan();
        Hooks.delay(1);
        Hooks.Escape();
        extentTest.log(LogStatus.PASS, "Klik button upload");
    }

    @Then("berhasil update activity - Other")
    public void berhasil_update_activity_Other() {
        Hooks.delay(2);
        Assert.assertEquals(taskOtherPage.getResultUpdateActivity(), "Data Berhasil di Update !");
        taskOtherPage.klikBtnYes();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "Berhasil update activity");
    }

    @Then("validasi status pada menu data all - Other {string}")
    public void validasi_status_pada_menu_data_all(String status) {
        taskOtherPage.klikDataAll();
        Hooks.delay(1);
        taskOtherPage.setSearchDataAll(getTextName);
        Hooks.delay(2);
        if (status.contains("PTP")) {
            Assert.assertEquals(taskOtherPage.getStatusPtpDataAll(), "PTP");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - ptp");
        } else if (status.contains("Follow Up")) {
            Assert.assertEquals(taskOtherPage.getStatusFollowUpDataAll(), "Follow Up");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - Follow up");
        } else if (status.contains("Payment")) {
            Assert.assertEquals(taskOtherPage.getStatusPaymentDataAll(), "Payment");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - Payment");
        } else if (status.contains("Belum Bayar")) {
            Assert.assertEquals(taskOtherPage.getStatusBelumBayarDataAll(), "Belum Bayar");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - Belum Bayar");
        }else if (status.contains("Salah Sambung")) {
            Assert.assertEquals(taskOtherPage.getStatusSalahSambungDataAll(), "Salah Sambung");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - Salah Sambung");
        }else if (status.contains("Tidak Respon")) {
            Assert.assertEquals(taskOtherPage.getStatusTidakDiresponDataAll(), "Tidak Diangkat /Tidak Di Respon");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - Tidak Diangkat /Tidak Di Respon");
        }else if (status.contains("Nomor Salah")) {
            Assert.assertEquals(taskOtherPage.getStatusNomerSalahDataAll(), "Nomer Salah");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - Nomer Salah");
        }else if (status.contains("Mailbox")) {
            Assert.assertEquals(taskOtherPage.getStatusMailboxDataAll(), "Mailbox");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - Mailbox");
        }else if (status.contains("Invalid Number")) {
            Assert.assertEquals(taskOtherPage.getStatusInvalidNumberDataAll(), "Tidak Ada Nomor Telepon");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - Invalid Number");
        }else if (status.contains("Tidak Terdaftar")) {
            Assert.assertEquals(taskOtherPage.getStatusTidakTerdaftarDataAll(), "Tidak Terdaftar");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - Tidak Terdaftar");
        } else {
            System.err.println();
        }
    }

    @Then("tidak berhasil update activity - Other {string}")
    public void tidak_berhasil_update_activity(String result) {
        if (result.equals("[Status] tidak boleh kosong!")) {
            Assert.assertEquals(taskOtherPage.getStatusKosong(), result);
            Hooks.delay(2);
            Hooks.Escape();
            extentTest.log(LogStatus.PASS, "Tidak Berhasil update activity dengan Status kosong");
        } else if (result.contains("[Status Call] tidak boleh kosong!")) {
            Assert.assertEquals(taskOtherPage.getStatusCallKosong(), result);
            Hooks.delay(2);
            Hooks.Escape();
            extentTest.log(LogStatus.PASS, "Tidak Berhasil update activity dengan Status Call kosong");
        } else if (result.contains("[Status Result] tidak boleh kosong!")) {
            Assert.assertEquals(taskOtherPage.getStatusResultKosong(), result);
            Hooks.delay(2);
            Hooks.Escape();
            extentTest.log(LogStatus.PASS, "Tidak Berhasil update activity dengan Status Result kosong");
        } else if (result.contains("[Tanggal Follow Up] Tidak Boleh Kosong")) {
            Assert.assertEquals(taskOtherPage.getTglFollowUpKosong(), result);
            Hooks.delay(2);
            Hooks.Escape();
            extentTest.log(LogStatus.PASS, "Tidak Berhasil update activity dengan Tanggal Follow Up kosong");
        } else if (result.contains(" [Status Result] tidak boleh kosong!")) {
            Assert.assertEquals(taskOtherPage.getPaymentStatusKosong(), result);
            Hooks.delay(2);
            Hooks.Escape();
            extentTest.log(LogStatus.PASS, "Tidak Berhasil update activity dengan Status Result Up kosong");
        } else if (result.contains("[Tanggal PTP] Tidak Boleh Kosong")) {
            Assert.assertEquals(taskOtherPage.getTglPtpKosong(), result);
            Hooks.delay(2);
            Hooks.Escape();
            extentTest.log(LogStatus.PASS, "Tidak Berhasil update activity dengan Tanggal Ptp kosong");
        } else {
            System.err.println();
        }
    }
}