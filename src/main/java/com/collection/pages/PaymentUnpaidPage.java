package com.collection.pages;

import com.collection.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PaymentUnpaidPage {
    private WebDriver driver;

    public PaymentUnpaidPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //INITIATION LOCATOR / ELEMENT
    @FindBy(xpath = "//h3[@id='ui-id-21']//span[@class='ui-accordion-header-icon ui-icon ui-icon-triangle-1-e']")
    WebElement navigationPayment;
    @FindBy(xpath = "//span[normalize-space()='VERIFIKASI']")
    WebElement btnMenuVerifikasi;
    @FindBy(xpath = "//input[@id='tl_broken--11295_text']")
    WebElement resultUnpaidPage;
    @FindBy(xpath = "//input[@id='tl_broken--11294_text']")
    WebElement fieldSearch;
    @FindBy(xpath = "//span[normalize-space()='Search']")
    WebElement btnSearch;
    @FindBy(xpath = "//select[@id='tl_broken--11304_text']")
    WebElement dropdownClassName;
    @FindBy(xpath = "//select[@id='tl_broken--11305_text']")
    WebElement dropdownChannelName;
    @FindBy(xpath = "//td[@id='tl_broken--11298-cell-0-0']")
    WebElement resultNipp;
    @FindBy(xpath = "//td[@id='tl_broken--11298-cell-0-1']")
    WebElement resultName;
    @FindBy(xpath = "//td[@id='tl_broken--11298-cell-0-2']")
    WebElement resultClassName;
    @FindBy(xpath = "//td[@id='tl_broken--11298-cell-0-3']")
    WebElement resultChannelName;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[2]/div/div[1]/div[2]/div[8]")
    WebElement resultNoEntries;
    @FindBy(xpath = "//span[normalize-space()='UNPAID']")
    WebElement btnMenuUnpaid;
    @FindBy(xpath = "//span[@class='ui-button-icon-primary ui-icon ui-icon-close']")
    WebElement btnClose;

    //METHOD ACTIVITY ELEMENT
    public void klikNavPayment() {
        this.navigationPayment.click();
    }
    public void klikMenuUnpaid() {
        this.btnMenuUnpaid.click();
    }
    public String txtResultUnpaidPage() {
        return this.resultUnpaidPage.getAttribute("value");
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
 }