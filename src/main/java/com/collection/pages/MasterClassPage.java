package com.collection.pages;

import com.collection.drivers.DriverSingleton;
import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MasterClassPage {
    private WebDriver driver;

    public MasterClassPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//button[@id='6024_query']")
    WebElement btnMenuClass;
    @FindBy(xpath = "//input[@id='tl_master_class--6033_text']")
    WebElement fieldSearch;
    @FindBy(xpath = "//span[normalize-space()='SEARCH']")
    WebElement btnSearch;
    @FindBy(xpath = "//tbody/tr[@class='nikitahorizontallayout-div']/td[@class='nikitahorizontallayout-div']/div[@id='tele_menu--7324']/div[@id='tl_master_class-']/div[@id='tl_master_class--6037']/div[1]")
    WebElement resultNoEntries;
    @FindBy(xpath = "//td[@id='tl_master_class--6037-cell-0-1']")
    WebElement resultSearchByClassName;
    @FindBy(xpath = "//td[@id='tl_master_class--6037-cell-0-2']")
    WebElement resultSearchByClassCode;
    @FindBy(xpath = "//td[@id='tl_master_class--6037-cell-0-6']")
    WebElement resultFilterByISactive;
    @FindBy(xpath = "//select[@id='tl_master_class--6172_text']")
    WebElement dropdownClassName;
    @FindBy(xpath = "//select[@id='tl_master_class--6174_text']")
    WebElement dropdownClassCode;
    @FindBy(xpath = "//span[normalize-space()='GET DATA']")
    WebElement btnGetData;
    @FindBy(xpath = "//span[normalize-space()='YES']")
    WebElement btnAcceptAlert;
    @FindBy(xpath = "//span[normalize-space()='OK']")
    WebElement btnAlertSuccess;
    @FindBy(xpath = "//p[normalize-space()='Berhasil']")
    WebElement resultGetData;

    public String getResultGetData(){
        return resultGetData.getText();
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
    public void SelectFilterClassName(String value){
        Select drpFilter = new Select(dropdownClassName);
        drpFilter.selectByValue(value);
    }
    public void SelectFilterClassCode(String value){
        Select drpFilter = new Select(dropdownClassCode);
        drpFilter.selectByValue(value);
    }
    public String resultFilterByIsActive(){
        return resultFilterByISactive.getText();
    }
    public String resultSearchByClassCode(){
        return resultSearchByClassCode.getText();
    }
    public String resultSearchByClassName(){
        return resultSearchByClassName.getText();
    }
    public String resultNoEntries(){
        return resultNoEntries.getText();
    }
    public void klikBtnSearch(){
        this.btnSearch.click();
    }
    public void setKeywordSearch(String keyword){
        this.fieldSearch.clear();
        this.fieldSearch.sendKeys(keyword);
    }
    public void klikMenuClass(){
        this.btnMenuClass.click();
    }

}
