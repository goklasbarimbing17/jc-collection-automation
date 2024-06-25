package com.collection.stepdefinitions;

import com.collection.hooks.Hooks;
import com.collection.pages.MasterPersonPage;
import com.collection.pages.TaskTodoPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestTaskTodo {
    public static WebDriver driver;

    public static ExtentTest extentTest;
    public static TaskTodoPage taskTodoPage = new TaskTodoPage();
    public static MasterPersonPage masterPersonPage = new MasterPersonPage();

    public TestTaskTodo() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("klik navigation task")
    public void klik_navigation_task() {
        //masterPersonPage.klikBtnAlertWelcome();
        Hooks.delay(3);
        taskTodoPage.klikNavigationTask();
        extentTest.log(LogStatus.PASS, "Klik navigation test");
    }

    @When("klik menu todo")
    public void klik_menu_todo() {
        taskTodoPage.klikMenuTodo();
        extentTest.log(LogStatus.PASS, "klik menu todo");
    }

    @Then("Menampilkan view form todo")
    public void view_form_todo() {
        Assert.assertEquals(taskTodoPage.getResultPageTodo(), "TODO");
        extentTest.log(LogStatus.PASS, "Menampilkan view form todo");
    }

    @When("input keyword search todo {string}")
    public void input_keyword_search_todo(String keyword) {
        taskTodoPage.setKeywordSearch(keyword);
        extentTest.log(LogStatus.PASS, "Input keyword search todo");
    }

    @When("klik button search todo")
    public void klik_button_search_todo() {
        taskTodoPage.klikBtnSearch();
        extentTest.log(LogStatus.PASS, "klik button search todo");
        Hooks.delay(3);
    }

    @Then("Menampilkan data todo berdasarkan keyword yang di cari {string} {string}")
    public void menampilkan_data_todo_berdasarkan_keyword_yang_di_cari(String result, String searchBy) {
        if (searchBy.contains("nipp")) {
            Assert.assertEquals(taskTodoPage.getResultSearchByNipp(), result);
            extentTest.log(LogStatus.PASS, "Menampilkan data berdasarkan nipp");
        } else if (searchBy.equals("name")) {
            Assert.assertEquals(taskTodoPage.getResultSearchByName(), result);
            extentTest.log(LogStatus.PASS, "Menampilkan data berdasarkan nama");
        } else if (searchBy.equals("class name")) {
            Assert.assertEquals(taskTodoPage.getResultSearchByClassName(), result);
            extentTest.log(LogStatus.PASS, "Menampilkan data berdasarkan Class name");
        } else if (searchBy.equals("channel name")) {
            Assert.assertEquals(taskTodoPage.getResultSearchByChannelName(), result);
            extentTest.log(LogStatus.PASS, "Menampilkan data berdasarkan Channel name");
        } else if (searchBy.contains("negatif test")) {
            Assert.assertTrue(taskTodoPage.getResultNoEntries().contains(result));
            extentTest.log(LogStatus.PASS, "Tidak menampilkan data yang dicari");
        } else {
            System.err.println();
        }
    }

    @When("pilih dropdown class name todo")
    public void pilih_dropdown_class_name_todo() {
        taskTodoPage.klikMenuTodo();
        Hooks.delay(3);
        taskTodoPage.SelectFilterClassName("JAVA BACKEND 14");
        extentTest.log(LogStatus.PASS, "Pilih dropdown class name todo");
    }

    @Then("Menampilkan data todo berdasarkan class name")
    public void menampilkan_data_todo_berdasarkan_class_name() {
        Hooks.delay(2);
        Assert.assertTrue(taskTodoPage.getResultSearchByClassName().contains("JAVA BACKEND 14"));
        extentTest.log(LogStatus.PASS, "Menampilkan data todo berdasarkan class name");
    }

    @When("pilih dropdown channel name todo")
    public void pilih_dropdown_channel_name_todo() {
        Hooks.delay(2);
        taskTodoPage.SelectFilterChannelName("ISA");
        extentTest.log(LogStatus.PASS, "Pilih dropdown channel name todo");
    }

    @Then("Menampilkan data todo berdasarkan channel name")
    public void menampilkan_data_todo_berdasarkan_channel_name() {
        Hooks.delay(2);
        Assert.assertTrue(taskTodoPage.getResultSearchByChannelName().contains("ISA"));
        extentTest.log(LogStatus.PASS, "Menampilkan data todo berdasarkan channel name");
    }

    //Detail Activity
    @When("klik row yang ingin di show detail activitynya")
    public void klik_row_yang_ingin_di_show_detail_activitynya() {
        taskTodoPage.klikDataRow();
        extentTest.log(LogStatus.PASS, "klik row yang ingin di show detail activitynya");
    }

    @Then("menampilkan form detail activity")
    public void menampilkan_form_detail_activity() {
        Hooks.delay(2);
        Assert.assertEquals(taskTodoPage.getResultShowDetailActivity(), "Data Detail");
        extentTest.log(LogStatus.PASS, "menampilkan form detail activity");
    }

    // Detail History
    @When("klik tombol history")
    public void klik_tombol_history() {
        taskTodoPage.klikBtnHistory();
        extentTest.log(LogStatus.PASS, "klik tombol history");
    }

    @Then("Menampilkan form view history")
    public void menampilkan_form_view_history() {
        Hooks.delay(2);
        Assert.assertEquals(taskTodoPage.getResultShowHistory(), "Data History");
        extentTest.log(LogStatus.PASS, "Menampilkan form view history");
    }

    //Detail Biodata
    @When("klik tombol biodata")
    public void klik_tombol_biodata() {
        taskTodoPage.klikBtnClose();
        Hooks.delay(1);
        taskTodoPage.klikBtnBiodata();
        extentTest.log(LogStatus.PASS, "klik tombol biodata");
    }

    @Then("Menampilkan form view biodata")
    public void menampilkan_form_view_biodata() {
        Hooks.delay(1);
        Assert.assertEquals(taskTodoPage.getResultShowBiodata(), "View biodata");
        extentTest.log(LogStatus.PASS, "Menampilkan form view biodata");
        taskTodoPage.klikBtnClose();
        Hooks.delay(2);
    }

    //UPDATE STATUS ACTIVITY
    @When("pilih status {int}")
    public void pilih_status(int index) {
        Hooks.delay(2);
        taskTodoPage.selectStatus(index);
        extentTest.log(LogStatus.PASS, "Pilih status");
    }


    @When("pilih status call {int}")
    public void pilih_status_call(int index) {
        Hooks.delay(2);
        taskTodoPage.selectStatusCall(index);
        extentTest.log(LogStatus.PASS, "Pilih status call");
    }

    @When("pilih status result {int}")
    public void pilih_status_result(int index) {
        Hooks.delay(2);
        taskTodoPage.selectStatusResult(index);
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "Pilih status result");
    }

    @When("pilih tanggal ptp")
    public void pilih_tanggal_ptp() {
        Hooks.delay(2);
        taskTodoPage.klikTgl();
        extentTest.log(LogStatus.PASS, "Pilih tanggal ptp");
    }

    @When("pilih tanggal follow up")
    public void pilih_tanggal_follow_up() {
        Hooks.delay(2);
        taskTodoPage.klikTgl();
        extentTest.log(LogStatus.PASS, "Pilih tanggal ptp");
    }

    @When("input remarks {string}")
    public void input_remarks(String remarks) {
        taskTodoPage.setRemarks(remarks);
        extentTest.log(LogStatus.PASS, "Input remarks");
        Hooks.delay(2);
    }

    @When("pilih payment status {int}")
    public void pilih_payment_status(int statusPayment) {
        Hooks.delay(2);
        taskTodoPage.selectPaymentStatus(statusPayment);
        Hooks.delay(2);
        extentTest.log(LogStatus.PASS, "Pilih payment status");
    }

    @When("input nominal payment {int}")
    public void input_nominal_payment(int nominal) {
        Hooks.delay(2);
        taskTodoPage.setNominal(nominal);
        extentTest.log(LogStatus.PASS, "Input nominal payment");
    }

    @When("klik button save")
    public void klik_button_save() {
        taskTodoPage.klikBtnSave();
        extentTest.log(LogStatus.PASS, "Klik button save");
        Hooks.delay(3);
    }
    @When("klik button attachment")
    public void klik_button_attachment() {
        taskTodoPage.klikBtnAttachment();
        extentTest.log(LogStatus.PASS, "klik button attachment");
    }

    @When("upload file attachment")
    public void upload_file_attachment() {
        Hooks.delay(2);
        taskTodoPage.pathFile("C:\\Users\\sqa_d\\Downloads\\invoice.jpeg");
        //Runtime.getRuntime().exec("");
        extentTest.log(LogStatus.PASS, "upload file attachment");
    }

    @When("input name file")
    public void input_name_file() {
        taskTodoPage.setFileName("Bukti pembayaran");
        extentTest.log(LogStatus.PASS, "Input nama file");
    }

    @When("klik button upload")
    public void klik_button_upload() {
        taskTodoPage.klikBtnUpload();
        Hooks.delay(1);
        taskTodoPage.klikBtnSimpan();
        Hooks.delay(1);
        Hooks.Escape();
        extentTest.log(LogStatus.PASS, "Klik button upload");
    }

    @Then("berhasil update activity")
    public void berhasil_update_activity() {
        Assert.assertEquals(taskTodoPage.getResultUpdateActivity(), "Data Berhasil di Update !");
        taskTodoPage.klikBtnYes();
        Hooks.delay(2);
        Assert.assertEquals(taskTodoPage.getResultStatus(), "RELOAD");
        extentTest.log(LogStatus.PASS, "Berhasil update activity");
    }

    @Then("tidak berhasil update activity {string}")
    public void tidak_berhasil_update_activity(String result) {
        if (result.equals("[Status] tidak boleh kosong!")) {
            Assert.assertEquals(taskTodoPage.getStatusKosong(), result);
            Hooks.delay(2);
            Hooks.Escape();
            extentTest.log(LogStatus.PASS, "Tidak Berhasil update activity dengan Status kosong");
        } else if (result.contains("[Status Call] tidak boleh kosong!")) {
            Assert.assertEquals(taskTodoPage.getStatusCallKosong(), result);
            Hooks.delay(2);
            Hooks.Escape();
            extentTest.log(LogStatus.PASS, "Tidak Berhasil update activity dengan Status Call kosong");
        } else if (result.contains("[Status Result] tidak boleh kosong!")) {
            Assert.assertEquals(taskTodoPage.getStatusResultKosong(), result);
            Hooks.delay(2);
            Hooks.Escape();
            extentTest.log(LogStatus.PASS, "Tidak Berhasil update activity dengan Status Result kosong");
        } else if (result.contains("[Tanggal Follow Up] Tidak Boleh Kosong")) {
            Assert.assertEquals(taskTodoPage.getTglFollowUpKosong(), result);
            Hooks.delay(2);
            Hooks.Escape();
            extentTest.log(LogStatus.PASS, "Tidak Berhasil update activity dengan Tanggal Follow Up kosong");
        } else if (result.contains(" [Status Result] tidak boleh kosong!")) {
            Assert.assertEquals(taskTodoPage.getPaymentStatusKosong(), result);
            Hooks.delay(2);
            Hooks.Escape();
            Hooks.delay(2);
            extentTest.log(LogStatus.PASS, "Tidak Berhasil update activity dengan Status Result Up kosong");
        } else if (result.contains("[Tanggal PTP] Tidak Boleh Kosong")) {
            Assert.assertEquals(taskTodoPage.getTglPtpKosong(), result);
            Hooks.delay(2);
            Hooks.Escape();
            Hooks.delay(2);
            extentTest.log(LogStatus.PASS, "Tidak Berhasil update activity dengan Tanggal Ptp kosong");
        } else {
            System.err.println();
        }
    }
}