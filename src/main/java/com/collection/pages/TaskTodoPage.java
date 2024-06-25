package com.collection.pages;

import com.collection.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TaskTodoPage {
    private WebDriver driver;

    public TaskTodoPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h3[@id='ui-id-17']//span[@class='ui-accordion-header-icon ui-icon ui-icon-triangle-1-e']")
    WebElement navigationTask;
    @FindBy(xpath = "//span[normalize-space()='TODO']")
    WebElement btnMenuTodo;
    @FindBy(xpath = "//input[@id='tl_todo--10530_text']")
    WebElement resultPageTodo;
    @FindBy(xpath = "//input[@id='tl_todo--10529_text']")
    WebElement filedSearch;
    @FindBy(xpath = "//span[normalize-space()='Search']")
    WebElement btnSearch;
    @FindBy(xpath = "//td[@id='tl_todo--10533-cell-0-3']")
    WebElement resultSearchByNipp;
    @FindBy(xpath = "//td[@id='tl_todo--10533-cell-0-4']")
    WebElement resultSearchByName;//td[@id='tl_todo--5737-cell-0-4']
    @FindBy(xpath = "//td[@id='tl_todo--10533-cell-0-5']")
    WebElement resultSearchByClassName;
    @FindBy(xpath = "//td[@id='tl_todo--10533-cell-0-6']")
    WebElement resultSearchByChannelName;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[2]/div/div[1]/div[2]/div[8]")
    WebElement resultNoEntries;
    @FindBy(xpath = "//select[@id='tl_todo--10539_text']")
    WebElement dropdownClassName;
    @FindBy(xpath = "//select[@id='tl_todo--10540_text']")
    WebElement dropdownChannelName;
    @FindBy(xpath = "//input[@id='tl_detail_activity-09876-10542_text']")
    WebElement resultShowDetailActivity;
    @FindBy(xpath = "//span[normalize-space()='History']")
    WebElement btnHistory;
    @FindBy(xpath = "//label[@id='tl_view_history--10639_text']")
    WebElement resultShowHistory;
    @FindBy(xpath = "//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-front ui-draggable ui-resizable']//span[@class='ui-button-icon-primary ui-icon ui-icon-close']")
    WebElement btnClose;//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-front ui-draggable ui-resizable']//span[@class='ui-button-icon-primary ui-icon ui-icon-close']
    @FindBy(xpath = "//span[normalize-space()='Biodata']")
    WebElement btnBiodata;
    @FindBy(xpath = "/html/body/div[12]/div[1]/span")
    WebElement resultShowBiodata;
    @FindBy(xpath = "//select[@id='tl_detail_activity-09876-10548_text']")
    WebElement status;
    @FindBy(xpath = "//select[@id='tl_detail_activity-09876-10547_text']")
    WebElement statusCall;
    @FindBy(xpath = "//select[@id='tl_detail_activity-09876-10549_text']")
    WebElement statusResult;
    @FindBy(xpath = "//textarea[@id='tl_detail_activity-09876-10565_text']")
    WebElement remarks;
    @FindBy(xpath = "//span[normalize-space()='Attachment']")
    WebElement btnAttachment;
    @FindBy(xpath = "//span[normalize-space()='SAVE']")
    WebElement btnSave;
    @FindBy(xpath = "//p[normalize-space()='Data Berhasil di Update !']")
    WebElement resultUpdateActivity;
    @FindBy(xpath = "//span[normalize-space()='YES']")
    WebElement btnYes;
    @FindBy(xpath = "//td[@id='tl_todo--9390-cell-0-9']")
    WebElement txtStatus;
    @FindBy(xpath = "//img[@id='tl_detail_activity-09876-10577_finder']")
    WebElement tanggalPtp;
    @FindBy(xpath = "//img[@id='tl_detail_activity-09876-10581_finder']")
    WebElement tanggalFollowUp;
    @FindBy(xpath = "//a[normalize-space()='30']")
    WebElement tanggal;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[2]/div/div[1]/div[2]/div[6]/table/tbody/tr[1]/td[6]")
    WebElement row;
    @FindBy(xpath = "//select[@id='tl_detail_activity-09876-10575_text']")
    WebElement paymentStatus;
    @FindBy(xpath = "//input[@id='tl_detail_activity-09876-10570_text']")
    WebElement nominal;
    @FindBy(xpath = "//p[normalize-space()='[Status] tidak boleh kosong!']")
    WebElement statusKosong;
    @FindBy(xpath = "//p[normalize-space()='[Status Call] tidak boleh kosong!']")
    WebElement statusCallKosong;
    @FindBy(xpath = "//p[normalize-space()='[Status Result] tidak boleh kosong!']")
    WebElement statusResultKosong;
    @FindBy(xpath = "//p[normalize-space()='[Tanggal PTP] Tidak Boleh Kosong']")
    WebElement tglPtpKosong;
    @FindBy(xpath = "//p[normalize-space()='[Tanggal Follow Up] Tidak Boleh Kosong']")
    WebElement tglFollowUpKosong;
    @FindBy(xpath = "//p[normalize-space()='[Payment Status] Tidak Boleh Kosong']")
    WebElement paymentStatusKosong;
    @FindBy(xpath = "//span[@class='ui-button-icon-primary ui-icon ui-icon-closethick']")
    WebElement btnTutup;
    @FindBy(xpath = "//input[@id='tl_upload_bukti_pembayaran--10606_text']")
    WebElement browseFile;
    @FindBy(xpath = "//input[@id='tl_upload_bukti_pembayaran--10607_text']")
    WebElement fileName;
    @FindBy(xpath = "//span[normalize-space()='Upload']")
    WebElement btnUpload;
    @FindBy(xpath = "//button[@id='10631_query']//span[@class='ui-button-text'][normalize-space()='Simpan']")
    WebElement btnSimpan;

    public void klikBtnSimpan(){
        this.btnSimpan.click();
    }
    public void klikBtnUpload(){
        this.btnUpload.click();
    }
    public void setFileName(String fileName){
        this.fileName.sendKeys(fileName);
    }
    public void pathFile(String path){
        this.browseFile.sendKeys(path);
    }
    public void klikBtnTutup() {
        this.btnTutup.click();
    }

    public String getPaymentStatusKosong() {
        return this.paymentStatusKosong.getText();
    }
    public String getStatusKosong() {
        return this.statusKosong.getText();
    }

    public String getStatusCallKosong() {
        return this.statusCallKosong.getText();
    }

    public String getStatusResultKosong() {
        return this.statusResultKosong.getText();
    }

    public String getTglPtpKosong() {
        return this.tglPtpKosong.getText();
    }

    public String getTglFollowUpKosong() {
        return this.tglFollowUpKosong.getText();
    }

    public void setNominal(int nominal) {
        this.nominal.clear();
        this.nominal.sendKeys(String.valueOf(nominal));
    }

    public void selectPaymentStatus(int value) {
        Select drpFilter = new Select(paymentStatus);
        drpFilter.selectByIndex(value);
    }

    public void klikTgl() {
        if (tanggalPtp.isDisplayed()) {
            this.tanggalPtp.click();
            this.tanggal.click();
        } else if (tanggalFollowUp.isDisplayed()) {
            this.tanggalFollowUp.click();
            this.tanggal.click();
        }

    }

    public void setRemarks(String txtRemarks) {
        this.remarks.clear();
        this.remarks.sendKeys(txtRemarks);
    }

    public String getResultStatus() {
        return this.txtStatus.getText();
    }

    public void klikBtnYes() {
        this.btnYes.click();
    }

    public String getResultUpdateActivity() {
        return this.resultUpdateActivity.getText();
    }

    public void selectStatus(int value) {
        Select drpFilter = new Select(status);
        drpFilter.selectByIndex(value);
    }

    public void selectStatusCall(int value) {
        Select drpFilter = new Select(statusCall);
        drpFilter.selectByIndex(value);
    }

    public void selectStatusResult(int value) {
        Select drpFilter = new Select(statusResult);
        drpFilter.selectByIndex(value);
    }

    public void klikBtnAttachment() {
        this.btnAttachment.click();
    }

    public void klikBtnSave() {
        this.btnSave.click();
    }

    public String getResultShowBiodata() {
        return this.resultShowBiodata.getText();
    }

    public void klikBtnBiodata() {
        this.btnBiodata.click();
    }

    public void klikBtnClose() {
        this.btnClose.click();
    }

    public String getResultShowHistory() {
        return this.resultShowHistory.getText();
    }

    public void klikBtnHistory() {
        this.btnHistory.click();
    }

    public String getResultShowDetailActivity() {
        return this.resultShowDetailActivity.getAttribute("value");
    }

    public void klikDataRow() {
        this.row.click();
    }

    public void SelectFilterClassName(String value) {
        Select drpFilter = new Select(dropdownClassName);
        drpFilter.selectByValue(value);
    }

    public void SelectFilterChannelName(String value) {
        Select drpFilter = new Select(dropdownChannelName);
        drpFilter.selectByValue(value);
    }

    public String getResultSearchByClassName() {
        return this.resultSearchByClassName.getText();
    }

    public String getResultSearchByChannelName() {
        return this.resultSearchByChannelName.getText();
    }

    public String getResultSearchByName() {
        return this.resultSearchByName.getText();
    }

    public String getResultNoEntries() {
        return this.resultNoEntries.getText();
    }

    public String getResultSearchByNipp() {
        return this.resultSearchByNipp.getText();
    }

    public void klikBtnSearch() {
        this.btnSearch.click();
    }

    public void setKeywordSearch(String keyword) {
        this.filedSearch.clear();
        this.filedSearch.sendKeys(keyword);
    }

    public String getResultPageTodo() {
        return this.resultPageTodo.getAttribute("value");
    }

    public void klikNavigationTask() {
        this.navigationTask.click();
    }

    public void klikMenuTodo() {
        this.btnMenuTodo.click();
    }

}
