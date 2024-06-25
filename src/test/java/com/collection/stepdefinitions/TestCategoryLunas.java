package com.collection.stepdefinitions;

import com.collection.hooks.Hooks;
import com.collection.pages.CategoryLancarPage;
import com.collection.pages.CategoryLunasPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestCategoryLunas {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static CategoryLunasPage categoryLunasPage = new CategoryLunasPage();
    private String getNipp, getName, getClassName, getChannelName, getTotalBiayaPelatihan, getPayment, getTotalOutstanding, getStatus;

    public TestCategoryLunas() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("klik menu lunas")
    public void klik_menu_lunas() {
        Hooks.delay(1);
        categoryLunasPage.klikMenuLunas();
        extentTest.log(LogStatus.PASS, "Klik menu lancar");
    }

    @Then("Menampilkan view form lunas")
    public void menampilkan_view_form_lunas() {
        Hooks.delay(1);
        Assert.assertTrue(categoryLunasPage.txtResultLunasPage().contains("LUNAS"));
        extentTest.log(LogStatus.PASS, "Menampilkan view form lunas");
    }

    @When("input keyword search lunas {string}")
    public void input_keyword_search_lunas(String keyword) {
        Hooks.delay(1);
        categoryLunasPage.inputKeywordSearch(keyword);
        extentTest.log(LogStatus.PASS, "Input keyword search lancar");
    }

    @When("klik button search lunas")
    public void klik_button_search_lunas() {
        Hooks.delay(1);
        categoryLunasPage.klikBtnSearch();
        extentTest.log(LogStatus.PASS, "Klik button search lancar");
    }

    @Then("Menampilkan data lunas berdasarkan keyword yang di cari {string} {string}")
    public void menampilkan_data_lunas_berdasarkan_keyword_yang_di_cari(String result, String searchBy) {
        Hooks.delay(1);
        if (searchBy.contains("nipp")) {
            Assert.assertTrue(categoryLunasPage.getResultNipp().contains(result));
            extentTest.log(LogStatus.PASS, "Menampilkan data category lunas berdasarkan nipp");
        } else if (searchBy.equals("name")) {
            Assert.assertTrue(categoryLunasPage.getResultName().contains(result));
            extentTest.log(LogStatus.PASS, "Menampilkan data category lunas berdasarkan Name");
        } else if (searchBy.equals("class name")) {
            Assert.assertTrue(categoryLunasPage.getResultClassName().contains(result));
            extentTest.log(LogStatus.PASS, "Menampilkan data category lunas berdasarkan Class Name");
        } else if (searchBy.contains("channel payment")) {
            Assert.assertTrue(categoryLunasPage.getResultChannelName().contains(result));
            extentTest.log(LogStatus.PASS, "Menampilkan data category lunas berdasarkan Channel payment");
        } else if (searchBy.contains("negatif test")) {
            Assert.assertTrue(categoryLunasPage.getResultNoEntries().contains(result));
            extentTest.log(LogStatus.PASS, "Tidak menampilkan data Pembayaran");
        } else {
            System.err.println("Status tidak diketahui");
        }
    }

    @When("klik row data yang ingin di view detailnya")
    public void klik_row_data_yang_ingin_di_view_detailnya() {
        Hooks.delay(1);
        categoryLunasPage.klikMenuLunas();
        getNipp = categoryLunasPage.getResultNipp();
        getName = categoryLunasPage.getResultName();
        getClassName = categoryLunasPage.getResultClassName();
        getChannelName = categoryLunasPage.getResultChannelName();
        getStatus = categoryLunasPage.getResultStatus();
        getTotalOutstanding = categoryLunasPage.getResultTotalOutstanding();
        getTotalBiayaPelatihan = categoryLunasPage.getResultTotalBiayaPelatihan();
        Hooks.delay(1);
        categoryLunasPage.klikRowData();
        extentTest.log(LogStatus.PASS, "klik row data yang ingin di view detailnya");
    }

    @Then("Menampilkan form detail data lunas")
    public void menampilkan_form_detail_data_lunas() {
        Hooks.delay(1);
        Assert.assertEquals(categoryLunasPage.getResultDetailActivity(), "Data Pembayaran Tagihan");
        extentTest.log(LogStatus.PASS, "Menampilkan form detail data lunas");
    }

    @Then("Memastikan data pada tabel dengan data view detail sama")
    public void memastikan_data_pada_tabel_dengan_data_view_detail_sama() {
        Hooks.delay(1);
        Assert.assertTrue(categoryLunasPage.getResultDetailNipp().contains(getNipp));
        Assert.assertTrue(categoryLunasPage.getResultDetailName().contains(getName));
        Assert.assertTrue(categoryLunasPage.getResultDetailClassName().contains(getClassName));
        //Assert.assertEquals(categoryLunasPage.getResultDetailChannelName(),getChannelName);
        Assert.assertTrue(categoryLunasPage.getResultDetailStatus().contains(getStatus));
        //Assert.assertEquals(categoryLunasPage.getResultDetailTotalOutstanding(),getTotalOutstanding);
        //Assert.assertTrue(categoryLunasPage.getResultDetailTotalBiayaPelatihan().contains(getTotalBiayaPelatihan));
        extentTest.log(LogStatus.PASS, "Memastikan data pada tabel dengan data view detail sama");
    }

    @When("klik button history sertifikat")
    public void klik_button_history_sertifikat() {
        Hooks.delay(1);
        if (!categoryLunasPage.btnHistorySertifikat.isDisplayed()){
            Hooks.Escape();
            categoryLunasPage.klikBtnHistorySertifikat();
            extentTest.log(LogStatus.PASS, "klik button history sertifikat");
        }else if (categoryLunasPage.btnHistorySertifikat.isDisplayed()){
            categoryLunasPage.klikBtnHistorySertifikat();
            extentTest.log(LogStatus.PASS, "klik button history sertifikat");
        }

    }

    @Then("menampilkan form history sertifikat")
    public void menampilkan_form_history_sertifikat() {
        Hooks.delay(1);
        Assert.assertEquals(categoryLunasPage.getResultHistorySertifikat(), "History Sertifikat");
        extentTest.log(LogStatus.PASS, "Menampilkan form history sertifikat");
    }

    @When("pilih status pengiriman {int}")
    public void pilih_status_pengiriman(int index) {
        Hooks.delay(1);
            categoryLunasPage.setStatusPengiriman(index);
            extentTest.log(LogStatus.PASS, "Pilih status pengiriman");
    }

    @When("input nama pengirim {string}")
    public void input_nama_pengirim(String nama) {
        Hooks.delay(1);
        categoryLunasPage.setNamaPengiriman(nama);
        extentTest.log(LogStatus.PASS, "Input nama pengirim");
    }

    @When("pilih tanggal kirim")
    public void pilih_tanggal_kirim() {
        Hooks.delay(1);
        categoryLunasPage.setTanggalKirim();
        extentTest.log(LogStatus.PASS, "Pilih tanggal kirim");
    }

    @When("upload file {string}")
    public void upload_file(String path) {
        categoryLunasPage.setUploadFile(path);
        extentTest.log(LogStatus.PASS, "Upload file");
    }

    @When("klik button save sertifikat")
    public void klik_button_save_sertifikat() {
        Hooks.delay(1);
        categoryLunasPage.klikBtnSave();
        extentTest.log(LogStatus.PASS, "Klik button save sertifikat");
    }

    @When("konfirmasi alert upload sertifikat")
    public void konfirmasi_alert_upload_sertifikat() {
        Hooks.delay(1);
        categoryLunasPage.klikBtnSimpan();
        extentTest.log(LogStatus.PASS, "Konfirmasi alert upload sertifikat");
    }

    @Then("menampilkan pesan required {string} {string}")
    public void menampilkan_pesan_required(String result, String typeNegatif) {
        Hooks.delay(1);
        if (typeNegatif.contains("status empty")) {
            String actual= categoryLunasPage.getResultStatusEmpty();
            categoryLunasPage.klikBtnCloseAlert();
            categoryLunasPage.namaPengirim.click();
            Hooks.Escape();
            Assert.assertTrue(actual.contains(result));
            extentTest.log(LogStatus.PASS, "Validasi tidak bisa update sertifikat dengan status kosong");
        } else if (typeNegatif.contains("nama empty")) {
            String actual= categoryLunasPage.getResultNamaEmpty();
            categoryLunasPage.klikBtnCloseAlert();
            categoryLunasPage.namaPengirim.click();
            Hooks.Escape();
            Assert.assertTrue(actual.contains(result));
            extentTest.log(LogStatus.PASS, "Validasi tidak bisa update sertifikat dengan nama kosong");
        } else if (typeNegatif.contains("tanggal empty")) {
            String actual= categoryLunasPage.getResultTanggalEmpty();
            categoryLunasPage.klikBtnCloseAlert();
            categoryLunasPage.namaPengirim.click();
            Hooks.Escape();
            Assert.assertTrue(actual.contains(result));
            extentTest.log(LogStatus.PASS, "Validasi tidak bisa update sertifikat dengan tanggal kosong");
        } else if (typeNegatif.contains("file empty")) {
            String actual= categoryLunasPage.getResultFileEmpty();
            categoryLunasPage.klikBtnCloseAlert();
            categoryLunasPage.namaPengirim.click();
            Hooks.Escape();
            Assert.assertTrue(actual.contains(result));
            extentTest.log(LogStatus.PASS, "Validasi tidak bisa update sertifikat dengan file kosong");
        } else {
            System.out.println("Scenario tidak ditemukan");
        }

    }

    @Then("sertifikat berhasil di update")
    public void sertifikat_berhasil_di_update() {
        Hooks.delay(1);
        Assert.assertTrue(categoryLunasPage.getResultValidUpdateSertifikat().contains("Terkirim"));
        extentTest.log(LogStatus.PASS, "Berhasil melakukan update sertifikat");
    }
}