package com.collection.pages;

import com.collection.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CategoryLunasPage {
    private WebDriver driver;

    public CategoryLunasPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //INITIATION LOCATOR / ELEMENT
    @FindBy(xpath = "//h3[@id='ui-id-23']//span[@class='ui-accordion-header-icon ui-icon ui-icon-triangle-1-e']")
    WebElement navigationCategory;
    @FindBy(xpath = "//span[normalize-space()='LUNAS']")
    WebElement btnMenuLunas;
    @FindBy(xpath = "//input[@id='tl_lunas--11307_text']")
    WebElement resultLunasPage;
    @FindBy(xpath = "//input[@id='tl_lunas--11313_text']")
    WebElement fieldSearch;
    @FindBy(xpath = "//span[normalize-space()='Search']")
    WebElement btnSearch;
    @FindBy(xpath = "//td[@id='tl_lunas--11318-cell-0-2']")
    WebElement resultNipp;
    @FindBy(xpath = "//td[@id='tl_lunas--11318-cell-0-3']")
    WebElement resultName;
    @FindBy(xpath = "//td[@id='tl_lunas--11318-cell-0-4']")
    WebElement resultClassName;
    @FindBy(xpath = "//td[@id='tl_lunas--11318-cell-0-5']")
    WebElement resultChannelName;
    @FindBy(xpath = "//td[@id='tl_lunas--11318-cell-0-10']")
    WebElement resultStatus;
    @FindBy(xpath = "//td[@id='tl_lunas--11318-cell-0-7']")
    WebElement resultTotalOutstanding;
    @FindBy(xpath = "//td[@id='tl_lunas--11318-cell-0-6']")
    WebElement resultTotalBiayaPelatihan;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[2]/div/div[1]/div[2]/div[8]")
    WebElement resultNoEntries;
    @FindBy(xpath = "//label[@id='tl_history_lunas-09876-11322_text']")
    WebElement resultDetailActivity;
    @FindBy(xpath = "//input[@id='tl_history_lunas-09876-11328_text']")
    WebElement detailNipp;
    @FindBy(xpath = "//input[@id='tl_history_lunas-09876-11329_text']")
    WebElement detailName;
    @FindBy(xpath = "//input[@id='tl_history_lunas-09876-11330_text']")
    WebElement detailClassName;
    @FindBy(xpath = "//input[@id='tl_history_lunas-09876-11331_text']")
    WebElement detailChannelName;
    @FindBy(xpath = "//input[@id='tl_history_lunas-09876-11332_text']")
    WebElement detailStatus;
    @FindBy(xpath = "//input[@id='tl_history_lunas-09876-11333_text']")
    WebElement detailTotalBiayaPelatihan;
    @FindBy(xpath = "//input[@id='tl_history_lunas-09876-11335_text']")
    WebElement detailTotalOutstanding;
    @FindBy(xpath = "//span[normalize-space()='History Sertifikat']")
    public WebElement btnHistorySertifikat;
    @FindBy(xpath = "/html/body/div[11]/div[1]/span")
    WebElement resultHistorySertifikat;
    @FindBy(xpath = "//select[@id='history_sertifikat--11342_text']")
    WebElement statusPengiriman;
    @FindBy(xpath = "//input[@id='history_sertifikat--11343_text']")
    public WebElement namaPengirim;
    @FindBy(xpath = "//img[@id='history_sertifikat--11348_finder']")
    WebElement tanggalKirim;
    @FindBy(xpath = "//a[normalize-space()='30']")
    WebElement tanggal;
    @FindBy(xpath = "//input[@id='history_sertifikat--11349_text']")
    WebElement uploadFile;
    @FindBy(xpath = "//span[normalize-space()='SAVE']")
    WebElement btnSave;
    @FindBy(xpath = "//span[@class='ui-button-icon-primary ui-icon ui-icon-closethick']")
    public WebElement btnCloseAlert;//span[@class='ui-button-icon-primary ui-icon ui-icon-closethick']
    @FindBy(xpath = "/html/body/div[12]/div[1]/div/button/span[2]")
    public WebElement btnClose;
    @FindBy(xpath = "//span[normalize-space()='Simpan']")
    WebElement btnSimpan;
    @FindBy(xpath = "//p[normalize-space()='Status Pengiririm Tidak Boleh Kosong']")
    WebElement resultStatusEmpty;
    @FindBy(xpath = "//p[normalize-space()='Nama Pengiririm Tidak Boleh Kosong']")
    WebElement resultNamaEmpty;
    @FindBy(xpath = "//p[normalize-space()='Tanggal Kirim Tidak Boleh Kosong']")
    WebElement resultTanggalEmpty;
    @FindBy(xpath = "//p[normalize-space()='Upload File Terlebih Dahulu!']")
    WebElement resultFileEmpty;
    @FindBy(xpath = "//td[@id='history_sertifikat--11354-cell-0-4']")
    WebElement resultValidUpdateSertifikat;


    //METHOD ACTIVITY ELEMENT
    public void klikNavCategory() {
        this.navigationCategory.click();
    }

    public void klikMenuLunas() {
        this.btnMenuLunas.click();
    }

    public String txtResultLunasPage() {
        return this.resultLunasPage.getAttribute("value");
    }

    public void inputKeywordSearch(String keyword) {
        this.fieldSearch.clear();
        this.fieldSearch.sendKeys(keyword);
    }

    public void klikBtnSearch() {
        this.btnSearch.click();
    }

    public String getResultNipp() {
        return this.resultNipp.getText();
    }

    public String getResultName() {
        return this.resultName.getText();
    }

    public String getResultClassName() {
        return this.resultClassName.getText();
    }

    public String getResultChannelName() {
        return this.resultChannelName.getText();
    }

    public String getResultNoEntries() {
        return this.resultNoEntries.getText();
    }

    public String getResultStatus() {
        return this.resultStatus.getText();
    }

    public String getResultTotalOutstanding() {
        return this.resultTotalOutstanding.getText();
    }

    public String getResultTotalBiayaPelatihan() {
        return this.resultTotalBiayaPelatihan.getText();
    }

    public void klikRowData() {
        this.resultName.click();
    }

    public String getResultDetailActivity() {
        return this.resultDetailActivity.getText();
    }

    public String getResultDetailNipp() {
        return this.detailNipp.getAttribute("value");
    }

    public String getResultDetailName() {
        return this.detailName.getAttribute("value");
    }

    public String getResultDetailClassName() {
        return this.detailClassName.getAttribute("value");
    }

    public String getResultDetailChannelName() {
        return this.detailChannelName.getAttribute("value");
    }

    public String getResultDetailStatus() {
        return this.detailStatus.getAttribute("value");
    }

    public String getResultDetailTotalOutstanding() {
        return this.detailTotalOutstanding.getAttribute("value");
    }

    public String getResultDetailTotalBiayaPelatihan() {
        return this.detailTotalBiayaPelatihan.getAttribute("value");
    }

    public void klikBtnHistorySertifikat() {
        this.btnHistorySertifikat.click();
    }

    public String getResultHistorySertifikat() {
        return this.resultHistorySertifikat.getText();
    }

    public void setStatusPengiriman(int index) {
        Select drpStatus = new Select(this.statusPengiriman);
        drpStatus.selectByIndex(index);
    }

    public void setNamaPengiriman(String namaPengirim) {
        this.namaPengirim.clear();
        this.namaPengirim.sendKeys(namaPengirim);
    }

    public void setTanggalKirim() {
        this.tanggalKirim.click();
        this.tanggal.click();
    }

    public void setUploadFile(String path) {
        this.uploadFile.sendKeys(path);
    }

    public void klikBtnSave() {
        this.btnSave.click();
    }

    public void klikBtnClose() {
        this.btnClose.click();
    }
    public void klikBtnCloseAlert() {
        this.btnCloseAlert.click();
    }

    public void klikBtnSimpan() {
        this.btnSimpan.click();
    }

    public String getResultStatusEmpty() {
        return this.resultStatusEmpty.getText();
    }

    public String getResultNamaEmpty() {
        return this.resultNamaEmpty.getText();
    }

    public String getResultTanggalEmpty() {
        return this.resultTanggalEmpty.getText();
    }

    public String getResultFileEmpty() {
        return this.resultFileEmpty.getText();
    }
    public String getResultValidUpdateSertifikat(){
        return this.resultValidUpdateSertifikat.getText();
    }
}