package com.collection.pages;

import com.collection.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='tl_login--10140_text']")
    WebElement txtUsername;
    @FindBy(xpath = "//input[@id='tl_login--10143_text']")
    WebElement txtPassword;
    @FindBy(xpath = "//button[normalize-space()='SIGN IN']")
    WebElement btnSignIn;

    @FindBy(xpath = "//p[normalize-space()='JuaraCoding Collection']")
    public WebElement txtDashboardPage;

    @FindBy(id = "//span[normalize-space()='JC COLLECTION']")
    WebElement txtLoginPage;
    @FindBy(xpath = "//strong[normalize-space()='Gagal!']")
    WebElement invalidCredentials;

    @FindBy(xpath = "//span[normalize-space()='Logout']")
    WebElement btnLogout;
    public void klikBtnLogout(){
        btnLogout.click();
    }


    public void setTxtUsername(String username) {
        this.txtUsername.clear();
        this.txtUsername.sendKeys(username);
    }

    public void setTxtPassword(String password) {
        this.txtPassword.clear();
        this.txtPassword.sendKeys(password);
    }

    public void clickBtnSignIn() {
        this.btnSignIn.click();
    }

    public void loginUser(String username, String password) {
        this.txtUsername.sendKeys(username);
        this.txtPassword.sendKeys(password);
        this.btnSignIn.click();
    }
    public String getTextInvalidCredentials(){
        return this.invalidCredentials.getText();
    }
    public String getTextDashboardPage() {
        return this.txtDashboardPage.getText();
    }

    public String getTxtLoginPage(){
        return txtLoginPage.getText();
    }

    public String getTitlePage() {
        String resultTitle= "";
        String titlePageNotFound= driver.getTitle();
        String titlePageLogin = driver.getTitle();
        if (titlePageNotFound.contains("Not Found")) {
            resultTitle = titlePageNotFound;
        }
        else if (titlePageLogin.contains("MAIN")) {
            resultTitle = titlePageLogin;
        }
        return resultTitle;
    }
    public String getRequired(){
        return this.txtUsername.getAttribute("required");
    }

}

