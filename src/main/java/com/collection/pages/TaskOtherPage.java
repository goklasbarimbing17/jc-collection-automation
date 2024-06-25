package com.collection.pages;

import com.collection.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TaskOtherPage {
    private WebDriver driver;

    public TaskOtherPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //    @FindBy(xpath = "//h3[@id='ui-id-17']//span[@class='ui-accordion-header-icon ui-icon ui-icon-triangle-1-e']")
//    WebElement navigationTask;
    @FindBy(xpath = "//span[normalize-space()='OTHER']")
    WebElement btnMenuOther;
    @FindBy(xpath = "//input[@id='tl_other--8867_text']")
    WebElement resultPageOther;
    @FindBy(xpath = "//input[@id='tl_other--8866_text']")
    WebElement filedSearch;
    @FindBy(xpath = "//span[normalize-space()='Search']")
    WebElement btnSearch;
    @FindBy(xpath = "//td[@id='tl_other--8870-cell-0-2']")
    WebElement searchByNipp;
    @FindBy(xpath = "//td[@id='tl_other--8870-cell-0-3']")
    WebElement searchByName;
    @FindBy(xpath = "//td[@id='tl_other--8870-cell-0-4']")
    WebElement searchByClassName;
    @FindBy(xpath = "//td[@id='tl_other--8870-cell-0-5']")
    WebElement searchByChannelPayment;
    @FindBy(xpath = "//div[@id='tele_menu--8720']//div[8]")
    WebElement resultNoEntries;
    @FindBy(xpath = "//td[@id='tl_other--8870-cell-0-8']")
    WebElement resultStatus;
    @FindBy(xpath = "//select[@id='tl_other--8876_text']")
    WebElement dropdowmClassName;
    @FindBy(xpath = "//select[@id='tl_other--8877_text']")
    WebElement dropdowmChannelName;
    @FindBy(xpath = "//input[@id='tl_detail_activity-09876-9564_text']")
    WebElement resultDetailActivity;
    @FindBy(xpath = "//span[normalize-space()='History']")
    WebElement btnHistory;
    @FindBy(xpath = "//span[normalize-space()='Biodata']")
    WebElement btnBiodata;
    @FindBy(xpath = "//label[@id='tl_view_history--9877_text']")
    WebElement resultHistory;
    @FindBy(xpath = "/html/body/div[12]/div[1]/span")
    WebElement resultBiodata;
    @FindBy(xpath = "//select[@id='tl_detail_activity-09876-9570_text']")
    WebElement status;
    @FindBy(xpath = "//select[@id='tl_detail_activity-09876-9569_text']")
    WebElement statusCall;
    @FindBy(xpath = "//select[@id='tl_detail_activity-09876-9571_text']")
    WebElement statusResult;
    @FindBy(xpath = "//textarea[@id='tl_detail_activity-09876-9587_text']")
    WebElement remarks;
    @FindBy(xpath = "//img[@id='tl_detail_activity-09876-9599_finder']")
    WebElement tanggalPtp;
    @FindBy(xpath = "//a[normalize-space()='30']")
    WebElement tanggal;
    @FindBy(xpath = "//span[normalize-space()='SAVE']")
    WebElement btnSave;
    @FindBy(xpath = "//span[normalize-space()='Attachment']")
    WebElement btnAttachment;
    @FindBy(xpath = "//p[normalize-space()='Data Berhasil di Update !']")
    WebElement resultUpdateActivity;
    @FindBy(xpath = "//span[normalize-space()='YES']")
    WebElement btnYes;
    @FindBy(xpath = "//h3[@id='ui-id-23']//span[@class='ui-accordion-header-icon ui-icon ui-icon-triangle-1-e']")
    WebElement navigasiCategory;
    @FindBy(xpath = "//span[normalize-space()='DATA All']")
    WebElement dataAll;
    @FindBy(xpath = "//input[@id='tl_all--9959_text']")
    WebElement searchDataAll;
    @FindBy(xpath = "//td[@id='tl_all--9963-cell-0-10']//button[contains(text(),'PTP')]")
    WebElement statusDataAllPtp;
    @FindBy(xpath = "//td[@id='tl_all--9963-cell-0-10']//button[contains(text(),'Follow Up')]")
    WebElement statusDataAllFollowUp;
    @FindBy(xpath = "//td[@id='tl_all--9963-cell-0-10']//button[contains(text(),'Payment')]")
    WebElement statusDataAllPayment;
    @FindBy(xpath = "//td[@id='tl_all--9963-cell-0-10']//button[contains(text(),'Belum Bayar')]")
    WebElement statusDataAllBelumBayar;
    @FindBy(xpath = "//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-front ui-draggable ui-resizable']//span[@class='ui-button-icon-primary ui-icon ui-icon-close']")
    WebElement btnClose;
    @FindBy(xpath = "//input[@id='tl_detail_activity-09876-9573_text']")
    WebElement personName;
    @FindBy(xpath = "//h3[@id='ui-id-17']//span[@class='ui-accordion-header-icon ui-icon ui-icon-triangle-1-e']")
    WebElement navigationTask;
    @FindBy(xpath = "//img[@id='tl_detail_activity-09876-9603_finder']")
    WebElement tanggalFollowUp;
    @FindBy(xpath = "//input[@id='tl_upload_bukti_pembayaran--9844_text']")
    WebElement pathFile;
    @FindBy(xpath = "//input[@id='tl_upload_bukti_pembayaran--9845_text']")
    WebElement nameFile;
    @FindBy(xpath = "//span[normalize-space()='Upload']")
    WebElement btnUpload;
    @FindBy(xpath = "//button[@id='9869_query']//span[@class='ui-button-text'][normalize-space()='Simpan']")
    WebElement btnSimpan;
    @FindBy(xpath = "//select[@id='tl_detail_activity-09876-9597_text']")
    WebElement paymentStatus;
    @FindBy(xpath = "//input[@id='tl_detail_activity-09876-9592_text']")
    WebElement nominal;
    @FindBy(xpath = "//td[@id='tl_all--8595-cell-0-10']//button[contains(text(),'Nomer Salah')]")
    WebElement nomerSalahDataAll;
    @FindBy(xpath = "//td[@id='tl_all--8595-cell-0-10']//button[contains(text(),'Salah Sambung')]")
    WebElement salahSambungDataAll;
    @FindBy(xpath = "//td[@id='tl_all--8595-cell-0-10']//button[contains(text(),'Tidak Diangkat /Tidak Di Respon')]")
    WebElement tidakDiresponDataAll;
    @FindBy(xpath = "//td[@id='tl_all--8595-cell-0-10']//button[contains(text(),'Mailbox')]")
    WebElement mailboxDataAll;
    @FindBy(xpath = "//td[@id='tl_all--8595-cell-0-10']//button[contains(text(),'Tidak Ada Nomor Telepon')]")
    WebElement invalidNumberDataAll;
    @FindBy(xpath = "//td[@id='tl_all--8595-cell-0-10']//button[contains(text(),'Tidak Terdaftar')]")
    WebElement tidakTerdaftarDataAll;
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

    public String getStatusTidakTerdaftarDataAll(){
        return this.tidakTerdaftarDataAll.getText();
    }
    public String getStatusInvalidNumberDataAll(){
        return this.invalidNumberDataAll.getText();
    }
    public String getStatusMailboxDataAll(){
        return this.mailboxDataAll.getText();
    }
    public String getStatusTidakDiresponDataAll(){
        return this.tidakDiresponDataAll.getText();
    }
    public String getStatusSalahSambungDataAll(){
        return this.salahSambungDataAll.getText();
    }
    public String getStatusNomerSalahDataAll(){
        return this.nomerSalahDataAll.getText();
    }
    public void setNominal(int nominal){
        this.nominal.sendKeys(String.valueOf(nominal));
    }
    public void setDropdownPaymentStatus(int index) {
        Select drpPaymentStatus = new Select(paymentStatus);
        drpPaymentStatus.selectByIndex(index);
    }
    public void klikBtnSimpan(){
        this.btnSimpan.click();
    }
    public void klikBtnUpload(){
        this.btnUpload.click();
    }
    public void setPathFile(String path){
        this.pathFile.sendKeys(path);
    }
    public void setNameFile(String name){
        this.nameFile.sendKeys(name);
    }

    public String getPersonName(){
        return this.personName.getAttribute("value");
    }
    public String getStatusPtpDataAll(){
        return this.statusDataAllPtp.getText();
    }
    public String getStatusBelumBayarDataAll(){
        return this.statusDataAllBelumBayar.getText();
    }
    public String getStatusFollowUpDataAll(){
        return this.statusDataAllFollowUp.getText();
    }
    public String getStatusPaymentDataAll(){
        return this.statusDataAllPayment.getText();
    }
     public void klikBtnClose(){
        this.btnClose.click();
     }
    public void setSearchDataAll(String keyword){
        this.searchDataAll.sendKeys(keyword);
        this.btnSearch.click();
    }
    public void klikDataAll(){
        this.navigasiCategory.click();
        this.dataAll.click();
    }
    public void klikBtnYes(){
        this.btnYes.click();
    }
    public String getResultUpdateActivity(){
        return this.resultUpdateActivity.getText();
    }
    public void klikBtnSave(){
        this.btnSave.click();
    }
    public void klikBtnAttachment(){
        this.btnAttachment.click();
    }
    public void setDropdownStatus(int value) {
        Select drpStatus = new Select(status);
        drpStatus.selectByIndex(value);
    }
    public void setDropdownStatusCall(int value) {
        Select drpStatusCall = new Select(statusCall);
        drpStatusCall.selectByIndex(value);
    }
    public void setDropdownStatusResult(int value) {
        Select drpStatusResult = new Select(statusResult);
        drpStatusResult.selectByIndex(value);
    }
    public void setRemarks(String remarks){
        this.remarks.sendKeys(remarks);
    }
    public void setTanggal(){
        if (tanggalPtp.isDisplayed()) {
            this.tanggalPtp.click();
            this.tanggal.click();
        } else if (tanggalFollowUp.isDisplayed()) {
            this.tanggalFollowUp.click();
            this.tanggal.click();
        }
    }
    public void klikBtnHistory() {
        this.btnHistory.click();
    }

    public void klikBtnBiodata() {
        this.btnBiodata.click();
    }

    public String getResultHistory() {
        return this.resultHistory.getText();
    }

    public String getResultBiodata() {
        return this.resultBiodata.getText();
    }

    public String getResultDetailActivity() {
        return this.resultDetailActivity.getAttribute("value");
    }

    public void klikRow() {
        this.searchByName.click();
    }

    public void setDropdownClassName(int value) {
        Select drpFilter = new Select(dropdowmClassName);
        drpFilter.selectByIndex(value);
    }

    public void setDropdowmChannelName(String value) {
        Select drpFilter = new Select(dropdowmChannelName);
        drpFilter.selectByValue(value);
    }

    public String getResultSearchByNipp() {
        return this.searchByNipp.getText();
    }

    public String getResultSearchByName() {
        return this.searchByName.getText();
    }

    public String getResultSearchByClassName() {
        return this.searchByClassName.getText();
    }

    public String getResultSearchByChannelPayment() {
        return this.searchByChannelPayment.getText();
    }

    public String getResultNoEntries() {
        return this.resultNoEntries.getText();
    }

    public String getResultStatus() {
        return this.resultStatus.getText();
    }


    public void klikBtnSearch() {
        this.btnSearch.click();
    }

    public void setKeywordSearch(String keyword) {
        this.filedSearch.clear();
        this.filedSearch.sendKeys(keyword);
    }

    public String getResultPagePtp() {
        return this.resultPageOther.getAttribute("value");
    }

    public void klikNavigationTask() {
        this.navigationTask.click();
    }

    public void klikMenuPtp() {
        this.btnMenuOther.click();
    }

}
