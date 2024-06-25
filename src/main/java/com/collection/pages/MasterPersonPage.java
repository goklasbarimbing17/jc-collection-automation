package com.collection.pages;

import com.collection.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MasterPersonPage {
    private WebDriver driver;

    public MasterPersonPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[normalize-space()='OK']")
    WebElement btnAlertWelcome;
    @FindBy(xpath = "//h3[@id='ui-id-15']//span[@class='ui-accordion-header-icon ui-icon ui-icon-triangle-1-e']")
    WebElement navigationMasterdata;
    @FindBy(xpath = "//span[normalize-space()='Person']")
    WebElement menuPerson;
    @FindBy(xpath = "//input[@id='tl_person_data--10962_text']")
    WebElement fieldSearch;
    @FindBy(xpath = "//span[normalize-space()='SEARCH']")
    WebElement btnSearch;
    @FindBy(xpath = "//td[@id='tl_person_data--10959-cell-0-3']")
    WebElement txtSearchByName;
    @FindBy(xpath = "//td[@id='tl_person_data--10959-cell-0-2']")
    WebElement txtSearchByNipp;
    @FindBy(xpath = "//td[@id='tl_person_data--10959-cell-0-4']")
    WebElement txtSearchByEmail;
    @FindBy(xpath = "//td[@id='tl_person_data--10959-cell-0-5']")
    WebElement txtSearchByJenjangPendidikan;
    @FindBy(xpath = "//td[@id='tl_person_data--10959-cell-0-6']")
    WebElement txtSearchByClass;
    @FindBy(xpath = "//td[@id='tl_person_data--10959-cell-0-7']")
    WebElement txtSearchByChannelPayment;
    @FindBy(xpath = "//select[@id='tl_person_data--10968_text']")
    WebElement dropdownClass;
    @FindBy(xpath = "//select[@id='tl_person_data--10970_text']")
    WebElement dropdownChannelPayment;
    @FindBy(xpath = "//span[normalize-space()='GET DATA']")
    WebElement btnGetData;
    @FindBy(xpath = "//span[normalize-space()='YES']")
    WebElement btnAcceptAlert;
    @FindBy(xpath = "//span[normalize-space()='OK']")
    WebElement btnAlertSuccess;
    @FindBy(xpath = "//p[normalize-space()='Data berhasil ditambahkan']")
    WebElement txtSuccessGetData;
    public String txtResultGetData(){
        return this.txtSuccessGetData.getText();
    }
    public void klikBtnAlertSucces(){
        this.btnAlertSuccess.click();
    }
    public void klikBtnAcceptAlert(){
        this.btnAcceptAlert.click();
    }
    public void klikBtnGetData(){
        this.btnGetData.click();
    }
    public void SelectFilterClass(String value){
        Select drpFilter = new Select(dropdownClass);
        drpFilter.selectByValue(value);
    }
    public void SelectFilterChannelPayment(Integer value){
        Select drpFilter = new Select(dropdownChannelPayment);
        drpFilter.selectByIndex(value);
    }
    public String resultSearchByName() {
        return this.txtSearchByName.getText();
    }
    public String resultSearchByNipp() {
        return this.txtSearchByNipp.getText();
    }
    public String resultSearchByEmail() {
        return this.txtSearchByEmail.getText();
    }
    public String resultSearchByJenjangPendidikan() {
        return this.txtSearchByJenjangPendidikan.getText();
    }
    public String resultSearchByClass() {
        return this.txtSearchByClass.getText();
    }
    public String resultSearchByChannelPayment() {
        return this.txtSearchByChannelPayment.getText();
    }
    public void klikBtnSearch(){
        this.btnSearch.click();
    }
    public void setFieldSearch(String keyword){
        this.fieldSearch.clear();
        this.fieldSearch.sendKeys(keyword);
    }

    public void klikMenuPerson(){
        menuPerson.click();
    }
    public void klikNavigationMasterData(){
        this.navigationMasterdata.click();
    }
    public void klikBtnAlertWelcome(){
        this.btnAlertWelcome.click();
    }
}
