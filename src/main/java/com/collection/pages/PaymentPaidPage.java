package com.collection.pages;

import com.collection.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PaymentPaidPage {
    private WebDriver driver;

    public PaymentPaidPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //INITIATION LOCATOR / ELEMENT
    @FindBy(xpath = "//h3[@id='ui-id-21']//span[@class='ui-accordion-header-icon ui-icon ui-icon-triangle-1-e']")
    WebElement navigationPayment;
    @FindBy(xpath = "//span[normalize-space()='VERIFIKASI']")
    WebElement btnMenuVerifikasi;
    @FindBy(xpath = "//input[@id='tl_paid--11263_text']")
    WebElement resultPaidPage;
    @FindBy(xpath = "//input[@id='tl_paid--11262_text']")
    WebElement fieldSearch;
    @FindBy(xpath = "//span[normalize-space()='Search']")
    WebElement btnSearch;
    @FindBy(xpath = "//select[@id='tl_paid--11272_text']")
    WebElement dropdownClassName;
    @FindBy(xpath = "//select[@id='tl_paid--11273_text']")
    WebElement dropdownChannelName;
    @FindBy(xpath = "//td[@id='tl_paid--11266-cell-0-1']")
    WebElement resultNipp;
    @FindBy(xpath = "//td[@id='tl_paid--11266-cell-0-2']")
    WebElement resultName;
    @FindBy(xpath = "//td[@id='tl_paid--11266-cell-0-3']")
    WebElement resultClassName;
    @FindBy(xpath = "//td[@id='tl_paid--11266-cell-0-4']")
    WebElement resultChannelName;
    @FindBy(xpath = "//td[@id='tl_paid--11266-cell-0-5']")
    WebElement resultTotalBiayaPelatihan;
    @FindBy(xpath = "//td[@id='tl_paid--11266-cell-0-6']")
    WebElement resultPayment;
    @FindBy(xpath = "//td[@id='tl_paid--11266-cell-0-7']")
    WebElement resultTotalOutstanding;
    @FindBy(xpath = "//td[@id='tl_paid--11266-cell-0-10']")
    WebElement resultStatus;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[2]/div/div[1]/div[2]/div[8]")
    WebElement resultNoEntries;
    @FindBy(xpath = "//label[@id='tl_history_paid-09876-11277_text']")
    WebElement viewDetailPaid;
    @FindBy(xpath = "//span[normalize-space()='PAID']")
    WebElement btnMenuPaid;
    @FindBy(xpath = "//input[@id='tl_history_paid-09876-11283_text']")
    WebElement detailNipp;
    @FindBy(xpath = "//input[@id='tl_history_paid-09876-11284_text']")
    WebElement detailNama;
    @FindBy(xpath = "//input[@id='tl_history_paid-09876-11285_text']")
    WebElement detailClassName;
    @FindBy(xpath = "//input[@id='tl_history_paid-09876-11286_text']")
    WebElement detailChannelName;
    @FindBy(xpath = "//input[@id='tl_history_paid-09876-11287_text']")
    WebElement detailStatus;
    @FindBy(xpath = "//input[@id='tl_history_paid-09876-11288_text']")
    WebElement detailTotalBiayaPelatihan;
    @FindBy(xpath = "//input[@id='tl_history_paid-09876-11290_text']")
    WebElement detailTotalOutstanding;
    @FindBy(xpath = "//td[@id='tl_history_paid-09876-11291-cell-0-4']")
    WebElement detailPayment;
    @FindBy(xpath = "//span[@class='ui-button-icon-primary ui-icon ui-icon-close']")
    WebElement btnClose;

    //METHOD ACTIVITY ELEMENT
    public void klikNavPayment() {
        this.navigationPayment.click();
    }
    public void klikMenuPaid() {
        this.btnMenuPaid.click();
    }

    public String txtResultPaidPage() {
        return this.resultPaidPage.getAttribute("value");
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
    public String getResultTotalBiayaPelatihan(){
        return this.resultTotalBiayaPelatihan.getText();
    }
    public String getResultTotalOutstanding(){
        return this.resultTotalOutstanding.getText();
    }
    public String getResultPayment(){
        return this.resultPayment.getText();
    }
    public String getResultStatus(){
        return this.resultStatus.getText();
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
        Select drpChannelName = new Select(this.dropdownChannelName);
        drpChannelName.selectByIndex(index);
    }
    public void klikRowData(){
        this.resultName.click();
    }
    public String getViewDetailPaid(){
        return this.viewDetailPaid.getText();
    }
    public String getDetailNipp(){
        return this.detailNipp.getAttribute("value");
    }
    public String getDetailNama(){
        return this.detailNama.getAttribute("value");
    }
    public String getDetailClassName(){
        return this.detailClassName.getAttribute("value");
    }
    public String getDetailChannelName(){
        return this.detailChannelName.getAttribute("value");
    }
    public String getDetailStatus(){
        return this.detailStatus.getAttribute("value");
    }
    public String getDetailTotalBiayaPelatihan(){
        return this.detailTotalBiayaPelatihan.getAttribute("value");
    }
    public String getDetailTotalOutstanding(){
        return this.detailTotalOutstanding.getAttribute("value");
    }
    public String getDetailPayment(){
        return this.detailPayment.getText();
    }

 }