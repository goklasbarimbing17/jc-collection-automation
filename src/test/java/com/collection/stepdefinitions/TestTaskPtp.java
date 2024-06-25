package com.collection.stepdefinitions;

import com.collection.hooks.Hooks;
import com.collection.pages.MasterPersonPage;
import com.collection.pages.TaskPtpPage;
import com.collection.pages.TaskTodoPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestTaskPtp {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static TaskPtpPage taskPtpPage = new TaskPtpPage();
    public static MasterPersonPage masterPersonPage = new MasterPersonPage();
    private String getTextName;

    public TestTaskPtp() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("klik navigation task - ptp")
    public void klik_navigation_task_ptp() {
        taskPtpPage.klikNavigationTask();
        extentTest.log(LogStatus.PASS, "klik Navigation Task");
    }

    @When("klik menu ptp")
    public void klik_menu_ptp() {
        taskPtpPage.klikMenuPtp();
        extentTest.log(LogStatus.PASS, "klik menu ptp");
    }

    @Then("Menampilkan view form ptp")
    public void view_form_todo() {
        Assert.assertEquals(taskPtpPage.getResultPagePtp(), "PTP");
        extentTest.log(LogStatus.PASS, "Menampilkan view form ptp");
    }

    @When("input keyword search ptp {string}")
    public void input_keyword_search_todo(String keyword) {
        taskPtpPage.setKeywordSearch(keyword);
        extentTest.log(LogStatus.PASS, "Input keyword search todo");
    }

    @When("klik button search ptp")
    public void klik_button_search_todo() {
        taskPtpPage.klikBtnSearch();
        extentTest.log(LogStatus.PASS, "klik button search Ptp");
        Hooks.delay(3);
    }

    @Then("Menampilkan data ptp berdasarkan keyword yang di cari {string} {string}")
    public void menampilkan_data_todo_berdasarkan_keyword_yang_di_cari(String result, String searchBy) {
        if (searchBy.contains("nipp")) {
            Assert.assertEquals(taskPtpPage.getResultSearchByNipp(), result);
            extentTest.log(LogStatus.PASS, "Menampilkan data berdasarkan nipp");
        } else if (searchBy.equals("name")) {
            Assert.assertEquals(taskPtpPage.getResultSearchByName(), result);
            extentTest.log(LogStatus.PASS, "Menampilkan data berdasarkan nama");
        } else if (searchBy.equals("class name")) {
            Assert.assertEquals(taskPtpPage.getResultSearchByClassName(), result);
            extentTest.log(LogStatus.PASS, "Menampilkan data berdasarkan Class name");
        } else if (searchBy.equals("channel name")) {
            Assert.assertEquals(taskPtpPage.getResultSearchByChannelPayment(), result);
            extentTest.log(LogStatus.PASS, "Menampilkan data berdasarkan Channel name");
        } else if (searchBy.contains("negatif test")) {
            Assert.assertTrue(taskPtpPage.getResultNoEntries().contains(result));
            extentTest.log(LogStatus.PASS, "Tidak menampilkan data yang dicari");
        } else {
            System.err.println();
        }
    }


    @When("pilih dropdown class name ptp")
    public void pilih_dropdown_class_name_ptp() {
        taskPtpPage.klikMenuPtp();
        Hooks.delay(1);
        taskPtpPage.setDropdownClassName(1);
        extentTest.log(LogStatus.PASS, "Pilih dropdown class name ptp");
    }

    @Then("Menampilkan data ptp berdasarkan class name")
    public void menampilkan_data_ptp_berdasarkan_class_name() {
        Hooks.delay(1);
        Assert.assertTrue(taskPtpPage.getResultSearchByClassName().contains("MERN - PINTAR 17"));
        extentTest.log(LogStatus.PASS, "Menampilkan data ptp berdasarkan class name");
    }

    @When("pilih dropdown channel name ptp")
    public void pilih_dropdown_channel_name_ptp() {
        Hooks.delay(1);
        taskPtpPage.setDropdowmChannelName("CASH BERTAHAP");
        extentTest.log(LogStatus.PASS, "Pilih dropdown channel name ptp");
    }

    @Then("Menampilkan data ptp berdasarkan channel name")
    public void menampilkan_data_ptp_berdasarkan_channel_name() {
        Hooks.delay(1);
        Assert.assertTrue(taskPtpPage.getResultSearchByChannelPayment().contains("CASH BERTAHAP"));
        extentTest.log(LogStatus.PASS, "Menampilkan data ptp berdasarkan channel name");
    }

    //Detail Activity
    @When("klik row ptp yang ingin di show detail activitynya")
    public void klik_row_ptp_yang_ingin_di_show_detail_activitynya() {
        Hooks.delay(1);
        taskPtpPage.klikRow();
        extentTest.log(LogStatus.PASS, "Klik row ptp yang ingin di show detail activitynya");
    }

    @Then("menampilkan form detail activity ptp")
    public void menampilkan_form_detail_activity_ptp() {
        Hooks.delay(1);
        Assert.assertTrue(taskPtpPage.getResultDetailActivity().contains("Data Detail"));
        extentTest.log(LogStatus.PASS, "Menampilkan form detail activity ptp");
    }

    // Detail History
    @When("klik tombol history ptp")
    public void klik_tombol_history_ptp() {
        Hooks.delay(1);
        taskPtpPage.klikBtnHistory();
        extentTest.log(LogStatus.PASS, "klik tombol history");
    }

    @Then("Menampilkan form view history ptp")
    public void menampilkan_form_view_history_ptp() {
        Hooks.delay(1);
        Assert.assertEquals(taskPtpPage.getResultHistory(), "Data History");
        extentTest.log(LogStatus.PASS, "Menampilkan form view history");
    }

    //Detail Biodata
    @When("klik tombol biodata ptp")
    public void klik_tombol_biodata() {
        Hooks.delay(2);
        Hooks.Escape();
        Hooks.delay(1);
        taskPtpPage.klikBtnBiodata();
        extentTest.log(LogStatus.PASS, "Klik tombol biodata");
    }

    @Then("Menampilkan form view biodata ptp")
    public void menampilkan_form_view_biodata() {
        Hooks.delay(1);
        Assert.assertEquals(taskPtpPage.getResultBiodata(), "View biodata");
        taskPtpPage.klikBtnClose();
        extentTest.log(LogStatus.PASS, "Menampilkan form view biodata");
    }

    //UPDATE STATUS ACTIVITY
    @When("pilih status - ptp {int}")
    public void pilih_status_ptp(Integer index) {
        Hooks.delay(1);
        taskPtpPage.setDropdownStatus(index);
        extentTest.log(LogStatus.PASS, "Pilih status - ptp");
    }

    @When("pilih status call - ptp {int}")
    public void pilih_status_call_ptp(Integer index) {
        Hooks.delay(1);
        taskPtpPage.setDropdownStatusCall(index);
        extentTest.log(LogStatus.PASS, "Pilih status call - ptp");
    }

    @When("pilih status result - ptp {int}")
    public void pilih_status_result_ptp(Integer index) {
        Hooks.delay(1);
        taskPtpPage.setDropdownStatusResult(index);
        extentTest.log(LogStatus.PASS, "Pilih result - ptp");
    }

    @When("pilih tanggal ptp - ptp")
    public void pilih_tanggal_ptp_ptp() {
        Hooks.delay(1);
        taskPtpPage.setTanggal();
        extentTest.log(LogStatus.PASS, "Pilih tanggal ptp");
    }

    @When("pilih tanggal follow up - ptp")
    public void pilih_tanggal_follow_up_ptp() {
        Hooks.delay(1);
        taskPtpPage.setTanggal();
        extentTest.log(LogStatus.PASS, "Pilih tanggal follow up");
    }

    @When("pilih payment status - ptp {int}")
    public void pilih_paymnet_status_ptp(int index) {
        Hooks.delay(1);
        taskPtpPage.setDropdownPaymentStatus(index);
        extentTest.log(LogStatus.PASS, "Pilih payment status - ptp");
    }

    @When("input nominal payment - ptp {int}")
    public void pilih_nominal_payment_ptp(int nominal) {
        Hooks.delay(1);
        taskPtpPage.setNominal(nominal);
        extentTest.log(LogStatus.PASS, "Pilih payment status - ptp");
    }

    @When("input remarks - ptp {string}")
    public void input_remarks_ptp(String remarks) {
        Hooks.delay(1);
        taskPtpPage.setRemarks(remarks);
        extentTest.log(LogStatus.PASS, "Input remarks - ptp");
    }

    @When("klik button save - ptp")
    public void klik_button_save_ptp() {
        Hooks.delay(1);
        getTextName = taskPtpPage.getPersonName();
        Hooks.delay(1);
        taskPtpPage.klikBtnSave();
        extentTest.log(LogStatus.PASS, "Klik button save ptp");
    }

    @When("klik button attachment - ptp")
    public void klik_button_attachment_ptp() {
        taskPtpPage.klikBtnAttachment();
        extentTest.log(LogStatus.PASS, "klik button attachment");
    }

    @When("upload file attachment - ptp")
    public void upload_file_attachment_ptp() {
        Hooks.delay(2);
        taskPtpPage.setPathFile("C:\\Users\\sqa_d\\Downloads\\invoice.jpeg");
        //Runtime.getRuntime().exec("");
        extentTest.log(LogStatus.PASS, "upload file attachment");
    }

    @When("input name file - ptp")
    public void input_name_file_ptp() {
        Hooks.delay(1);
        taskPtpPage.setNameFile("Bukti pembayaran");
        extentTest.log(LogStatus.PASS, "Input nama file");
    }

    @When("klik button upload - ptp")
    public void klik_button_upload_ptp() {
        taskPtpPage.klikBtnUpload();
        Hooks.delay(1);
        taskPtpPage.klikBtnSimpan();
        Hooks.delay(1);
        Hooks.Escape();
        extentTest.log(LogStatus.PASS, "Klik button upload");
    }

    @Then("berhasil update activity - ptp")
    public void berhasil_update_activity_ptp() {
        Hooks.delay(2);
        Assert.assertEquals(taskPtpPage.getResultUpdateActivity(), "Data Berhasil di Update !");
        taskPtpPage.klikBtnYes();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "Berhasil update activity");
    }

    @Then("validasi status pada menu data all - ptp {string}")
    public void validasi_status_pada_menu_data_all(String status) {
        Hooks.delay(3);
        taskPtpPage.klikDataAll();
        Hooks.delay(1);
        taskPtpPage.setSearchDataAll(getTextName);
        Hooks.delay(2);
        if (status.contains("PTP")) {
            Assert.assertEquals(taskPtpPage.getStatusPtpDataAll(), "PTP");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - ptp");
        } else if (status.contains("Follow Up")) {
            Assert.assertEquals(taskPtpPage.getStatusFollowUpDataAll(), "Follow Up");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - Follow up");
        } else if (status.contains("Payment")) {
            Assert.assertEquals(taskPtpPage.getStatusPaymentDataAll(), "Payment");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - Payment");
        } else if (status.contains("Belum Bayar")) {
            Assert.assertEquals(taskPtpPage.getStatusBelumBayarDataAll(), "Belum Bayar");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - Belum Bayar");
        }else if (status.contains("Salah Sambung")) {
            Assert.assertEquals(taskPtpPage.getStatusSalahSambungDataAll(), "Salah Sambung");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - Salah Sambung");
        }else if (status.contains("Tidak Respon")) {
            Assert.assertEquals(taskPtpPage.getStatusTidakDiresponDataAll(), "Tidak Diangkat /Tidak Di Respon");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - Tidak Diangkat /Tidak Di Respon");
        }else if (status.contains("Nomor Salah")) {
            Assert.assertEquals(taskPtpPage.getStatusNomerSalahDataAll(), "Nomer Salah");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - Nomer Salah");
        }else if (status.contains("Mailbox")) {
            Assert.assertEquals(taskPtpPage.getStatusMailboxDataAll(), "Mailbox");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - Mailbox");
        }else if (status.contains("Invalid Number")) {
            Assert.assertEquals(taskPtpPage.getStatusInvalidNumberDataAll(), "Tidak Ada Nomor Telepon");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - Invalid Number");
        }else if (status.contains("Tidak Terdaftar")) {
            Assert.assertEquals(taskPtpPage.getStatusTidakTerdaftarDataAll(), "Tidak Terdaftar");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - Tidak Terdaftar");
        } else {
            System.err.println();
        }
    }

    @Then("tidak berhasil update activity - ptp {string}")
    public void tidak_berhasil_update_activity(String result) {
        if (result.equals("[Status] tidak boleh kosong!")) {
            Assert.assertEquals(taskPtpPage.getStatusKosong(), result);
            Hooks.delay(2);
            Hooks.Escape();
            extentTest.log(LogStatus.PASS, "Tidak Berhasil update activity dengan Status kosong");
        } else if (result.contains("[Status Call] tidak boleh kosong!")) {
            Assert.assertEquals(taskPtpPage.getStatusCallKosong(), result);
            Hooks.delay(2);
            Hooks.Escape();
            extentTest.log(LogStatus.PASS, "Tidak Berhasil update activity dengan Status Call kosong");
        } else if (result.contains("[Status Result] tidak boleh kosong!")) {
            Assert.assertEquals(taskPtpPage.getStatusResultKosong(), result);
            Hooks.delay(2);
            Hooks.Escape();
            extentTest.log(LogStatus.PASS, "Tidak Berhasil update activity dengan Status Result kosong");
        } else if (result.contains("[Tanggal Follow Up] Tidak Boleh Kosong")) {
            Assert.assertEquals(taskPtpPage.getTglFollowUpKosong(), result);
            Hooks.delay(2);
            Hooks.Escape();
            extentTest.log(LogStatus.PASS, "Tidak Berhasil update activity dengan Tanggal Follow Up kosong");
        } else if (result.contains(" [Status Result] tidak boleh kosong!")) {
            Assert.assertEquals(taskPtpPage.getPaymentStatusKosong(), result);
            Hooks.delay(2);
            Hooks.Escape();
            extentTest.log(LogStatus.PASS, "Tidak Berhasil update activity dengan Status Result Up kosong");
        } else if (result.contains("[Tanggal PTP] Tidak Boleh Kosong")) {
            Assert.assertEquals(taskPtpPage.getTglPtpKosong(), result);
            Hooks.delay(2);
            Hooks.Escape();
            extentTest.log(LogStatus.PASS, "Tidak Berhasil update activity dengan Tanggal Ptp kosong");
        } else {
            System.err.println();
        }
    }
}