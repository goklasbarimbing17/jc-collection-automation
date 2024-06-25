package com.collection.pages;

import com.collection.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryTidakLancarPage {
    private WebDriver driver;

    public CategoryTidakLancarPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //INITIATION LOCATOR / ELEMENT
    @FindBy(xpath = "//h3[@id='ui-id-23']//span[@class='ui-accordion-header-icon ui-icon ui-icon-triangle-1-e']")
    WebElement navigationCategory;
    @FindBy(xpath = "//span[normalize-space()='TIDAK LANCAR']")
    WebElement btnMenuTidakLancar;
    @FindBy(xpath = "//input[@id='tl_tidak_lancar--11224_text']")
    WebElement resultTidakLancarPage;
    @FindBy(xpath = "//input[@id='tl_tidak_lancar--11230_text']")
    WebElement fieldSearch;
    @FindBy(xpath = "//span[normalize-space()='Search']")
    WebElement btnSearch;
    @FindBy(xpath = "//td[@id='tl_tidak_lancar--11235-cell-0-0']")
    WebElement resultNipp;
    @FindBy(xpath = "//td[@id='tl_tidak_lancar--11235-cell-0-1']")
    WebElement resultName;
    @FindBy(xpath = "//td[@id='tl_tidak_lancar--11235-cell-0-2']")
    WebElement resultClassName;
    @FindBy(xpath = "//td[@id='tl_tidak_lancar--11235-cell-0-3']")
    WebElement resultChannelName;
    @FindBy(xpath = "//td[@id='tl_tidak_lancar--11235-cell-0-7']")
    WebElement resultStatus;
    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[3]/table/tbody/tr[1]/td[2]/div/div[1]/div[2]/div[8]")
    WebElement resultNoEntries;

    //METHOD ACTIVITY ELEMENT
    public void klikNavCategory() {
        this.navigationCategory.click();
    }
    public void klikMenuTidakLancar() {
        this.btnMenuTidakLancar.click();
    }
    public String txtResultTidakLancarPage() {
        return this.resultTidakLancarPage.getAttribute("value");
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
    public String getResultStatus(){
        return this.resultStatus.getText();
    }
    public String getResultNoEntries(){
        return this.resultNoEntries.getText();
    }

 }