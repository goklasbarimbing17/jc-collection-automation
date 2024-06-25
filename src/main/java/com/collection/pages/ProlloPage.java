package com.collection.pages;

import com.collection.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProlloPage {
    private WebDriver driver;

    public ProlloPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//input[@id='nik']")
    WebElement nik;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//button[normalize-space()='SIGN IN']")
    WebElement btnLogin;

    @FindBy(xpath = "//button[@id='menu-button-92']")
    WebElement prospect;

    @FindBy(xpath = "//button[@id='menu-list-92-menuitem-88']")
    WebElement listClient;

    @FindBy(xpath = "//button[@class='chakra-button css-ak59vf']")
    WebElement createClient;

    @FindBy(xpath = "//input[@id='company_name']")
    WebElement perusahaan;

    @FindBy(xpath = "//input[@id='name_pic']")
    WebElement namaPic;

    @FindBy(xpath = "//input[@id='phone_pic']")
    WebElement notelp;
    @FindBy(xpath = "/html/body/div[3]/div[4]/div/section/div/div/form/div[5]/div[1]/div/div[1]/div[2]/input")
    WebElement email;
    @FindBy(xpath = "//select[@id='source']")
    WebElement source;
    @FindBy(xpath = "//button[normalize-space()='Create']")
    WebElement btnCreate;



    public void login() {
        this.nik.sendKeys("D6211116");
        this.password.sendKeys("123");
        this.btnLogin.click();
    }

    public void klikProspect() {
        this.prospect.click();
    }

    public void klikListClient() {
        this.listClient.click();
    }

    public void klikCreateClient() {
        this.createClient.click();
    }

    public void setPerusahaan(String perusahaan) {
        this.perusahaan.sendKeys(perusahaan);
    }

    public void setNamaPIC(String nama) {
        this.namaPic.sendKeys(nama);
    }
    public void setNotelp(String telp) {
        this.notelp.sendKeys(telp);
    }

    public void setEmail(String email){
        this.email.sendKeys(email);
//        this.email.sendKeys(Keys.ENTER);
    }

    public void selectSource(int value) {
        Select drpFilter = new Select(source);
        drpFilter.selectByIndex(value);
    }

    public void clickCreate(){
        this.btnCreate.click();
    }
}
