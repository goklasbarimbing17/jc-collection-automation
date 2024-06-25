package com.collection.pages;

import com.collection.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PaymentVerifikasiPage {
    private WebDriver driver;

    public PaymentVerifikasiPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //INITIATION LOCATOR / ELEMENT
    @FindBy(xpath = "//h3[@id='ui-id-21']//span[@class='ui-accordion-header-icon ui-icon ui-icon-triangle-1-e']")
    WebElement navigationPayment;
    @FindBy(xpath = "//span[normalize-space()='VERIFIKASI']")
    WebElement btnMenuVerifikasi;
    @FindBy(xpath = "//input[@id='tl_verifikasi--10922_text']")
    WebElement resultVerifikasiPage;
    @FindBy(xpath = "//input[@id='tl_verifikasi--10921_text']")
    WebElement fieldSearch;
    @FindBy(xpath = "//span[normalize-space()='Search']")
    WebElement btnSearch;
    @FindBy(xpath = "//select[@id='tl_verifikasi--10931_text']")
    WebElement dropdownClassName;
    @FindBy(xpath = "//select[@id='tl_verifikasi--10932_text']")
    WebElement dropdownChannelName;
    @FindBy(xpath = "//td[@id='tl_verifikasi--10925-cell-0-2']")
    WebElement resultNipp;
    @FindBy(xpath = "//td[@id='tl_verifikasi--10925-cell-0-3']")
    WebElement resultName;
    @FindBy(xpath = "//td[@id='tl_verifikasi--10925-cell-0-4']")
    WebElement resultClassName;
    @FindBy(xpath = "//td[@id='tl_verifikasi--10925-cell-0-5']")
    WebElement resultChannelName;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[2]/div/div[1]/div[2]/div[8]")
    WebElement resultNoEntries;
    @FindBy(xpath = "//input[@id='tl_verifikasi_detail-7789-10950_text']")
    WebElement viewInformasiPayment;
    @FindBy(xpath = "//button[@id='10952_query']//span[@class='ui-button-text'][normalize-space()='UNPAID']")
    WebElement btnUnpaid;
    @FindBy(xpath = "//button[@id='10942_query']//span[@class='ui-button-text'][normalize-space()='VERIFIKASI']")
    WebElement btnVerifikasi;
    @FindBy(xpath = "//span[normalize-space()='PAID']")
    WebElement btnMenuPaid;
    @FindBy(xpath = "//td[@id='tl_paid--11266-cell-0-11']")
    WebElement resultPaidCode;
    @FindBy(xpath = "//td[@id='tl_broken--11298-cell-0-10']")
    WebElement resultUnpaidCode;
    @FindBy(xpath = "//input[@id='tl_verifikasi_detail-7789-10938_text']")
    WebElement personName;
    @FindBy(xpath = "//span[normalize-space()='UNPAID']")
    WebElement menuUnpaid;
    @FindBy(xpath = "//span[normalize-space()='PAID']")
    WebElement menuPaid;
    @FindBy(xpath = "//input[@id='tl_broken--11294_text']")
    WebElement searchUnpaid;
    @FindBy(xpath = "//input[@id='tl_paid--11262_text']")
    WebElement searchPaid;
    @FindBy(xpath = "//td[@id='tl_paid--11266-cell-0-2']")
    WebElement namePaid;
    @FindBy(xpath = "//span[normalize-space()='Search']")
    WebElement btnSearchUnpaid;
    @FindBy(xpath = "//td[@id='tl_broken--11298-cell-0-1']")
    WebElement nameUnpaid;
    @FindBy(xpath = "//span[normalize-space()='OK']")
    WebElement btnOkPopup;
    @FindBy(xpath = "//p[normalize-space()='Data telah diperbarui !']")
    WebElement resultVerifikasi;




    //METHOD ACTIVITY ELEMENT
    public void klikNavPayment() {
        this.navigationPayment.click();
    }
    public void klikMenuVerifikasi() {
        this.btnMenuVerifikasi.click();
    }

    public String txtResultVerifikasiPage() {
        return this.resultVerifikasiPage.getAttribute("value");
    }
    public void inputKeywordSearch(String keyword) {
        this.fieldSearch.clear();
        this.fieldSearch.sendKeys(keyword);
    }
    public void klikBtnSearch() {
        this.btnSearch.click();
    }
    public String getResultNipp(){
        return this.resultNipp.getText();
    }
    public String getResultName(){
        return this.resultName.getText();
    }
    public String getResultClassName(){
        return this.resultClassName.getText();
    }
    public String getResultChannelName(){
        return this.resultChannelName.getText();
    }
    public String getResultNoEntries(){
        return this.resultNoEntries.getText();
    }
    public void setDropdownClassName(int index){
        Select drpClassName = new Select(dropdownClassName);
        drpClassName.selectByIndex(index);
    }
    public void setDropdownChannelName(int index){
        Select drpChannelName = new Select(dropdownChannelName);
        drpChannelName.selectByIndex(index);
    }
    public void klikRowData(){
        this.resultName.click();
    }

    public String getResultDetailPayment(){
        return this.viewInformasiPayment.getAttribute("value");
    }
    public void klikBtnUnpaid(){
        this.btnUnpaid.click();
    }
    public void klikBtnVerifikasi(){
        this.btnVerifikasi.click();
    }
    public String getPersonName(){
        return this.personName.getAttribute("value");
    }
    public void klikMenuUnpaid(){
        this.menuUnpaid.click();
    }
    public void klikMenuPaid(){
        this.menuPaid.click();
    }
    public void setSearchUnpaid(String keyword){
        this.searchUnpaid.sendKeys(keyword);
        this.btnSearchUnpaid.click();
    }
    public void setSearchPaid(String keyword){
        this.searchPaid.sendKeys(keyword);
        this.btnSearchUnpaid.click();
    }
    public String getNamaUnpaid(){
        return this.nameUnpaid.getText();
    }
    public String getNamaPaid(){
        return this.namePaid.getText();
    }
    public void klikBtnOKPopup(){
        this.btnOkPopup.click();
    }
    public String getResultVerifikasi(){
        return this.resultVerifikasi.getText();
    }
}