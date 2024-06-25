package com.collection.pages;

import com.collection.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MasterPaymentPage {
    private WebDriver driver;

    public MasterPaymentPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Payment']")
    WebElement btnMenuPayment;
    @FindBy(xpath = "//input[@id='tl_master_payment--11169_text']")
    WebElement fieldSearch;
    @FindBy(xpath = "//span[normalize-space()='SEARCH']")
    WebElement btnSearch;
    @FindBy(xpath = "//tbody/tr[@class='nikitahorizontallayout-div']/td[@class='nikitahorizontallayout-div']/div[@id='tele_menu--15601']/div[@id='tl_master_payment-']/div[@id='tl_master_payment--14874']/div[1]")
    WebElement resultNoEntries;
    @FindBy(xpath = "//td[@id='tl_master_payment--11173-cell-0-1']")
    WebElement resultSearchByClassName;
    @FindBy(xpath = "//td[@id='tl_master_payment--11173-cell-0-2']")
    WebElement resultSearchByChannelName;
    @FindBy(xpath = "//td[@id='tl_master_payment--11173-cell-0-7']")
    WebElement resultSearchByCreatedBy;
    @FindBy(xpath = "//select[@id='tl_master_payment--11176_text']")
    WebElement dropdownClassName;
    @FindBy(xpath = "//span[normalize-space()='GET DATA']")
    WebElement btnGetData;
    @FindBy(xpath = "//span[normalize-space()='YES']")
    WebElement btnAcceptAlert;
    @FindBy(xpath = "//span[normalize-space()='OK']")
    WebElement btnAlertSuccess;
    @FindBy(xpath = "//p[normalize-space()='Berhasil']")
    public WebElement resultGetData;

    public String getResultGetData() {
        return resultGetData.getText();
    }

    public void klikBtnAlertSucces() {
        this.btnAlertSuccess.click();
    }

    public void klikBtnAcceptAlert() {
        this.btnAcceptAlert.click();
    }

    public void klikBtnGetData() {
        this.btnGetData.click();
    }

    public void SelectFilterClassName(String value) {
        Select drpFilter = new Select(dropdownClassName);
        drpFilter.selectByValue(value);
    }

    public String resultSearchByChannelName() {
        return resultSearchByChannelName.getText();
    }

    public String resultSearchByClassName() {
        return resultSearchByClassName.getText();
    }

    public String resultSearchByCreatedBy() {
        return resultSearchByCreatedBy.getText();
    }

    public String resultNoEntries() {
        return resultNoEntries.getText();
    }

    public void klikBtnSearch() {
        this.btnSearch.click();
    }

    public void setKeywordSearch(String keyword) {
        this.fieldSearch.clear();
        this.fieldSearch.sendKeys(keyword);
    }

    public void klikMenuPayment() {
        this.btnMenuPayment.click();
    }

}
