package com.collection.stepdefinitions;

import com.collection.hooks.Hooks;
import com.collection.pages.MasterPersonPage;
import com.collection.pages.TaskReminderPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestTaskReminder {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static TaskReminderPage taskReminderPage = new TaskReminderPage();
    public static MasterPersonPage masterPersonPage = new MasterPersonPage();
    private String getTextName;

    public TestTaskReminder() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("klik navigation task - reminder")
    public void klik_navigation_task_reminder() {
        taskReminderPage.klikNavigationTask();
        extentTest.log(LogStatus.PASS, "klik Navigation Task");
    }

    @When("klik menu reminder")
    public void klik_menu_reminder() {
        taskReminderPage.klikMenuReminder();
        extentTest.log(LogStatus.PASS, "klik menu Reminder");
    }

    @Then("Menampilkan view form reminder")
    public void view_form_reminder() {
        Assert.assertEquals(taskReminderPage.getResultPagePtp(), "REMINDER");
        extentTest.log(LogStatus.PASS, "Menampilkan view form Reminder");
    }

    @When("input keyword search reminder {string}")
    public void input_keyword_search_reminder(String keyword) {
        taskReminderPage.setKeywordSearch(keyword);
        extentTest.log(LogStatus.PASS, "Input keyword search todo");
    }

    @When("klik button search reminder")
    public void klik_button_search_reminder() {
        taskReminderPage.klikBtnSearch();
        extentTest.log(LogStatus.PASS, "klik button search Reminder");
        Hooks.delay(3);
    }

    @Then("Menampilkan data reminder berdasarkan keyword yang di cari {string} {string}")
    public void menampilkan_data_reminder_berdasarkan_keyword_yang_di_cari(String result, String searchBy) {
        if (searchBy.contains("nipp")) {
            Assert.assertEquals(taskReminderPage.getResultSearchByNipp(), result);
            extentTest.log(LogStatus.PASS, "Menampilkan data berdasarkan nipp");
        } else if (searchBy.equals("name")) {
            Assert.assertEquals(taskReminderPage.getResultSearchByName(), result);
            extentTest.log(LogStatus.PASS, "Menampilkan data berdasarkan nama");
        } else if (searchBy.equals("class name")) {
            Assert.assertEquals(taskReminderPage.getResultSearchByClassName(), result);
            extentTest.log(LogStatus.PASS, "Menampilkan data berdasarkan Class name");
        } else if (searchBy.equals("channel name")) {
            Assert.assertEquals(taskReminderPage.getResultSearchByChannelPayment(), result);
            extentTest.log(LogStatus.PASS, "Menampilkan data berdasarkan Channel name");
        } else if (searchBy.contains("negatif test")) {
            Assert.assertTrue(taskReminderPage.getResultNoEntries().contains(result));
            extentTest.log(LogStatus.PASS, "Tidak menampilkan data yang dicari");
        } else {
            System.err.println();
        }
    }


    @When("pilih dropdown class name reminder")
    public void pilih_dropdown_class_name_reminder() {
        taskReminderPage.klikMenuReminder();
        Hooks.delay(1);
        taskReminderPage.setDropdownClassName(1);
        extentTest.log(LogStatus.PASS, "Pilih dropdown class name reminder");
    }

    @Then("Menampilkan data reminder berdasarkan class name")
    public void menampilkan_data_reminder_berdasarkan_class_name() {
        Hooks.delay(1);
        Assert.assertTrue(taskReminderPage.getResultSearchByClassName().contains("MERN - PINTAR 17"));
        extentTest.log(LogStatus.PASS, "Menampilkan data reminder berdasarkan class name");
    }

    @When("pilih dropdown channel name reminder")
    public void pilih_dropdown_channel_name_reminder() {
        Hooks.delay(1);
        taskReminderPage.setDropdowmChannelName("CASH BERTAHAP");
        extentTest.log(LogStatus.PASS, "Pilih dropdown channel name reminder");
    }

    @Then("Menampilkan data reminder berdasarkan channel name")
    public void menampilkan_data_reminder_berdasarkan_channel_name() {
        Hooks.delay(1);
        Assert.assertTrue(taskReminderPage.getResultSearchByChannelPayment().contains("CASH BERTAHAP"));
        extentTest.log(LogStatus.PASS, "Menampilkan data reminder berdasarkan channel name");
    }

    //Detail Activity
    @When("klik row reminder yang ingin di show detail activitynya")
    public void klik_row_reminder_yang_ingin_di_show_detail_activitynya() {
        Hooks.delay(1);
        taskReminderPage.klikRow();
        extentTest.log(LogStatus.PASS, "Klik row reminder yang ingin di show detail activitynya");
    }

    @Then("menampilkan form detail activity reminder")
    public void menampilkan_form_detail_activity_reminder() {
        Hooks.delay(1);
        Assert.assertTrue(taskReminderPage.getResultDetailActivity().contains("Data Detail"));
        extentTest.log(LogStatus.PASS, "Menampilkan form detail activity reminder");
    }

    // Detail History
    @When("klik tombol history reminder")
    public void klik_tombol_history_reminder() {
        Hooks.delay(1);
        taskReminderPage.klikBtnHistory();
        extentTest.log(LogStatus.PASS, "klik tombol history");
    }

    @Then("Menampilkan form view history reminder")
    public void menampilkan_form_view_history_reminder() {
        Hooks.delay(1);
        Assert.assertEquals(taskReminderPage.getResultHistory(), "Data History");
        extentTest.log(LogStatus.PASS, "Menampilkan form view history");
    }

    //Detail Biodata
    @When("klik tombol biodata reminder")
    public void klik_tombol_biodata() {
        Hooks.delay(2);
        Hooks.Escape();
        Hooks.delay(1);
        taskReminderPage.klikBtnBiodata();
        extentTest.log(LogStatus.PASS, "Klik tombol biodata");
    }

    @Then("Menampilkan form view biodata reminder")
    public void menampilkan_form_view_biodata() {
        Hooks.delay(1);
        Assert.assertEquals(taskReminderPage.getResultBiodata(), "View biodata");
        taskReminderPage.klikBtnClose();
        extentTest.log(LogStatus.PASS, "Menampilkan form view biodata");
    }

    //UPDATE STATUS ACTIVITY
    @When("pilih status - reminder {int}")
    public void pilih_status_reminder(Integer index) {
        Hooks.delay(1);
        taskReminderPage.setDropdownStatus(index);
        extentTest.log(LogStatus.PASS, "Pilih status - reminder");
    }

    @When("pilih status call - reminder {int}")
    public void pilih_status_call_reminder(Integer index) {
        Hooks.delay(1);
        taskReminderPage.setDropdownStatusCall(index);
        extentTest.log(LogStatus.PASS, "Pilih status call - reminder");
    }

    @When("pilih status result - reminder {int}")
    public void pilih_status_result_reminder(Integer index) {
        Hooks.delay(1);
        taskReminderPage.setDropdownStatusResult(index);
        extentTest.log(LogStatus.PASS, "Pilih result - reminder");
    }

    @When("pilih tanggal ptp - reminder")
    public void pilih_tanggal_ptp_reminder() {
        Hooks.delay(1);
        taskReminderPage.setTanggal();
        extentTest.log(LogStatus.PASS, "Pilih tanggal ptp");
    }

    @When("pilih tanggal follow up - reminder")
    public void pilih_tanggal_follow_up_reminder() {
        Hooks.delay(1);
        taskReminderPage.setTanggal();
        extentTest.log(LogStatus.PASS, "Pilih tanggal follow up");
    }

    @When("pilih payment status - reminder {int}")
    public void pilih_paymnet_status_reminder(int index) {
        Hooks.delay(1);
        taskReminderPage.setDropdownPaymentStatus(index);
        extentTest.log(LogStatus.PASS, "Pilih payment status - reminder");
    }

    @When("input nominal payment - reminder {int}")
    public void pilih_nominal_payment_reminder(int nominal) {
        Hooks.delay(1);
        taskReminderPage.setNominal(nominal);
        extentTest.log(LogStatus.PASS, "Pilih payment status - reminder");
    }

    @When("input remarks - reminder {string}")
    public void input_remarks_reminder(String remarks) {
        Hooks.delay(1);
        taskReminderPage.setRemarks(remarks);
        extentTest.log(LogStatus.PASS, "Input remarks - reminder");
    }

    @When("klik button save - reminder")
    public void klik_button_save_reminder() {
        Hooks.delay(1);
        getTextName = taskReminderPage.getPersonName();
        Hooks.delay(1);
        taskReminderPage.klikBtnSave();
        extentTest.log(LogStatus.PASS, "Klik button save reminder");
    }

    @When("klik button attachment - reminder")
    public void klik_button_attachment_reminder() {
        taskReminderPage.klikBtnAttachment();
        extentTest.log(LogStatus.PASS, "klik button attachment");
    }

    @When("upload file attachment - reminder")
    public void upload_file_attachment_reminder() {
        Hooks.delay(2);
        taskReminderPage.setPathFile("C:\\Users\\sqa_d\\Downloads\\invoice.jpeg");
        //Runtime.getRuntime().exec("");
        extentTest.log(LogStatus.PASS, "upload file attachment");
    }

    @When("input name file - reminder")
    public void input_name_file_reminder() {
        Hooks.delay(1);
        taskReminderPage.setNameFile("Bukti pembayaran");
        extentTest.log(LogStatus.PASS, "Input nama file");
    }

    @When("klik button upload - reminder")
    public void klik_button_upload_reminder() {
        taskReminderPage.klikBtnUpload();
        Hooks.delay(1);
        taskReminderPage.klikBtnSimpan();
        Hooks.delay(1);
        Hooks.Escape();
        extentTest.log(LogStatus.PASS, "Klik button upload");
    }

    @Then("berhasil update activity - reminder")
    public void berhasil_update_activity_reminder() {
        Hooks.delay(2);
        Assert.assertEquals(taskReminderPage.getResultUpdateActivity(), "Data Berhasil di Update !");
        taskReminderPage.klikBtnYes();
        Hooks.delay(1);
        extentTest.log(LogStatus.PASS, "Berhasil update activity");
    }

    @Then("validasi status pada menu data all - reminder {string}")
    public void validasi_status_pada_menu_data_all(String status) {
        taskReminderPage.klikDataAll();
        Hooks.delay(1);
        taskReminderPage.setSearchDataAll(getTextName);
        Hooks.delay(2);
        if (status.contains("PTP")) {
            Assert.assertEquals(taskReminderPage.getStatusPtpDataAll(), "PTP");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - ptp");
        } else if (status.contains("Follow Up")) {
            Assert.assertEquals(taskReminderPage.getStatusFollowUpDataAll(), "Follow Up");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - Follow up");
        } else if (status.contains("Payment")) {
            Assert.assertEquals(taskReminderPage.getStatusPaymentDataAll(), "Payment");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - Payment");
        } else if (status.contains("Belum Bayar")) {
            Assert.assertEquals(taskReminderPage.getStatusBelumBayarDataAll(), "Belum Bayar");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - Belum Bayar");
        }else if (status.contains("Salah Sambung")) {
            Assert.assertEquals(taskReminderPage.getStatusSalahSambungDataAll(), "Salah Sambung");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - Salah Sambung");
        }else if (status.contains("Tidak Respon")) {
            Assert.assertEquals(taskReminderPage.getStatusTidakDiresponDataAll(), "Tidak Diangkat /Tidak Di Respon");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - Tidak Diangkat /Tidak Di Respon");
        }else if (status.contains("Nomor Salah")) {
            Assert.assertEquals(taskReminderPage.getStatusNomerSalahDataAll(), "Nomer Salah");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - Nomer Salah");
        }else if (status.contains("Mailbox")) {
            Assert.assertEquals(taskReminderPage.getStatusMailboxDataAll(), "Mailbox");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - Mailbox");
        }else if (status.contains("Invalid Number")) {
            Assert.assertEquals(taskReminderPage.getStatusInvalidNumberDataAll(), "Tidak Ada Nomor Telepon");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - Invalid Number");
        }else if (status.contains("Tidak Terdaftar")) {
            Assert.assertEquals(taskReminderPage.getStatusTidakTerdaftarDataAll(), "Tidak Terdaftar");
            extentTest.log(LogStatus.PASS, "Validasi status pada menu data all - Tidak Terdaftar");
        } else {
            System.err.println();
        }
    }

    @Then("tidak berhasil update activity - reminder {string}")
    public void tidak_berhasil_update_activity(String result) {
        if (result.equals("[Status] tidak boleh kosong!")) {
            Assert.assertEquals(taskReminderPage.getStatusKosong(), result);
            Hooks.delay(2);
            Hooks.Escape();
            extentTest.log(LogStatus.PASS, "Tidak Berhasil update activity dengan Status kosong");
        } else if (result.contains("[Status Call] tidak boleh kosong!")) {
            Assert.assertEquals(taskReminderPage.getStatusCallKosong(), result);
            Hooks.delay(2);
            Hooks.Escape();
            extentTest.log(LogStatus.PASS, "Tidak Berhasil update activity dengan Status Call kosong");
        } else if (result.contains("[Status Result] tidak boleh kosong!")) {
            Assert.assertEquals(taskReminderPage.getStatusResultKosong(), result);
            Hooks.delay(2);
            Hooks.Escape();
            extentTest.log(LogStatus.PASS, "Tidak Berhasil update activity dengan Status Result kosong");
        } else if (result.contains("[Tanggal Follow Up] Tidak Boleh Kosong")) {
            Assert.assertEquals(taskReminderPage.getTglFollowUpKosong(), result);
            Hooks.delay(2);
            Hooks.Escape();
            extentTest.log(LogStatus.PASS, "Tidak Berhasil update activity dengan Tanggal Follow Up kosong");
        } else if (result.contains(" [Status Result] tidak boleh kosong!")) {
            Assert.assertEquals(taskReminderPage.getPaymentStatusKosong(), result);
            Hooks.delay(2);
            Hooks.Escape();
            extentTest.log(LogStatus.PASS, "Tidak Berhasil update activity dengan Status Result Up kosong");
        } else if (result.contains("[Tanggal PTP] Tidak Boleh Kosong")) {
            Assert.assertEquals(taskReminderPage.getTglPtpKosong(), result);
            Hooks.delay(2);
            Hooks.Escape();
            extentTest.log(LogStatus.PASS, "Tidak Berhasil update activity dengan Tanggal Ptp kosong");
        } else {
            System.err.println();
        }
    }
}