package com.collection.pages;

import com.collection.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SpecialCasePage {
    private WebDriver driver;

    public SpecialCasePage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h3[@id='ui-id-19']//span[@class='ui-accordion-header-icon ui-icon ui-icon-triangle-1-e']")
    WebElement navigationSpecialCase;
    @FindBy(xpath = "//span[normalize-space()='SPECIAL CASE']")
    WebElement btnMenuSpecialCase;
    @FindBy(xpath = "//input[@id='tl_special_case--11430_text']")
    WebElement resultSpecialCasePage;
    @FindBy(xpath = "//input[@id='tl_special_case--11420_text']")
    WebElement fieldSearch;
    @FindBy(xpath = "//span[normalize-space()='SEARCH']")
    WebElement btnSearch;
    @FindBy(xpath = "//select[@id='tl_special_case--11425_text']")
    WebElement dropdownClass;
    @FindBy(xpath = "//select[@id='tl_special_case--11427_text']")
    WebElement dropdownStatus;
    @FindBy(xpath = "//td[@id='tl_special_case--11417-cell-0-2']")
    WebElement resultNipp;
    @FindBy(xpath = "//td[@id='tl_special_case--11417-cell-0-3']")
    WebElement resultName;
    @FindBy(xpath = "//td[@id='tl_special_case--11417-cell-0-4']")
    WebElement resultEmail;
    @FindBy(xpath = "//td[@id='tl_special_case--11417-cell-0-5']")
    WebElement resultJenjangPendidikan;
    @FindBy(xpath = "//td[@id='tl_special_case--11417-cell-0-6']")
    WebElement resultClassName;
    @FindBy(xpath = "//td[@id='tl_special_case--11417-cell-0-7']")
    WebElement resultChannelPayment;
    @FindBy(xpath = "//div[@id='tele_menu--10500']//div[8]")
    WebElement resultNoEntries;
    @FindBy(xpath = "//body[1]/div[2]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[2]/div[6]/table[1]/tbody[1]/tr[1]/td[12]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/img[1]")
    WebElement btnDetail;
    @FindBy(xpath = "//body[1]/div[2]/div[2]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[2]/div[6]/table[1]/tbody[1]/tr[1]/td[12]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/img[1]")
    WebElement btnEdit;
    @FindBy(xpath = "/html/body/div[9]/div[1]/span")
    WebElement resultViewDetail;
    @FindBy(xpath = "//span[@class='ui-button-icon-primary ui-icon ui-icon-close']")
    WebElement btnCloseViewDetail;
    @FindBy(xpath = "//select[@id='tl_special_case_status-2-11432_text']")
    WebElement dropdownStatusSpecialCase;
    @FindBy(xpath = "//span[normalize-space()='SAVE']")
    WebElement btnSave;
    @FindBy(xpath = "//span[normalize-space()='YA']")
    WebElement btnYa;

    public void klikNavSpecialCase(){
        this.navigationSpecialCase.click();
    }
    public void klikMenuSpecialCase(){
        this.btnMenuSpecialCase.click();
    }
    public String txtResultSpecialCasePage(){
        return this.resultSpecialCasePage.getAttribute("value");
    }
    public void inputKeywordSearch(String keyword){
        this.fieldSearch.clear();
        this.fieldSearch.sendKeys(keyword);
    }
    public void klikBtnSearch(){
        this.btnSearch.click();
    }
    public String getResultNipp(){
        return this.resultNipp.getText();
    }
    public String getResultName(){
        return this.resultName.getText();
    }
    public String getResultEmail(){
        return this.resultEmail.getText();
    }
    public String getResultJenjangPendidikan(){
        return this.resultJenjangPendidikan.getText();
    }
    public String getResultClassName(){
        return this.resultClassName.getText();
    }
    public String getResultChannelPayment(){
        return this.resultChannelPayment.getText();
    }
    public String getResultNoEntries(){
        return this.resultNoEntries.getText();
    }
    public void setDropdownClass(int index){
        Select drpClass = new Select(dropdownClass);
        drpClass.selectByIndex(index);
    }
    public void setDropdownStatus(int index){
        Select drpStatus = new Select(dropdownStatus);
        drpStatus.selectByIndex(index);
    }
    public void klikBtnViewDetail(){
        this.btnDetail.click();
    }
    public String getResultViewDetailPage(){
        return this.resultViewDetail.getText();
    }
    public void klikBtnClose(){
        this.btnCloseViewDetail.click();
    }
    public void klikBtnEdit(){
        this.btnEdit.click();
    }
    public void setDropdownStatusSpecialCase(int index){
        Select drpStatusSpecialCase = new Select(dropdownStatusSpecialCase);
        drpStatusSpecialCase.selectByIndex(index);
    }
    public void klikBtnSave(){
        this.btnSave.click();
    }
    public void klikBtnYa(){
        this.btnYa.click();
    }





//    public void setNominal(int nominal){
//        this.nominal.sendKeys(String.valueOf(nominal));
//    }
//    public void setDropdownPaymentStatus(int index) {
//        Select drpPaymentStatus = new Select(paymentStatus);
//        drpPaymentStatus.selectByIndex(index);
//}
}