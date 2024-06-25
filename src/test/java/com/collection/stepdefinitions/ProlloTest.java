package com.collection.stepdefinitions;

import com.collection.hooks.Hooks;
import com.collection.pages.MasterPersonPage;
import com.collection.pages.ProlloPage;
import com.collection.pages.TaskTodoPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProlloTest {
    public static WebDriver driver;

    public static ExtentTest extentTest;
    public static ProlloPage prolloPage = new ProlloPage();

    public ProlloTest() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Given("Open prollo")
    public void open_prollo() {
        driver.get("https://dev.dikahadir.com/xpipe/authentication/login");
    }

    @When("login")
    public void login() {
        prolloPage.login();
    }

    @When("redirect to List client")
    public void redirecttolistclient() {
        driver.get("https://dev.dikahadir.com/xpipe/admin/projects");
    }

//    @When("klik list client")
//    public void klik_list_client() {
//        prolloPage.klikProspect();
//        Hooks.delay(1);
//        prolloPage.klikListClient();
//    }
//
    @When("klik card create client")
    public void klik_card_create_client() {
        prolloPage.klikCreateClient();
    }

    @When("input perusahaan {string}")
    public void input_perusahaan(String string) {
        Hooks.delay(1);
        prolloPage.setPerusahaan(string);
    }

    @When("input nama PIC {string}")
    public void input_nama_pic(String string) {
        Hooks.delay(1);
        prolloPage.setNamaPIC(string);
    }

    @When("input no telp {string}")
    public void input_no_telp(String string) {
        Hooks.delay(1);
        prolloPage.setNotelp(string);
    }

    @When("input email PIC {string}")
    public void input_email_pic(String string) {
        Hooks.delay(2);
        prolloPage.setEmail(string);
        Hooks.delay(2);
        Hooks.Escape();
    }

    @When("pilih source {int}")
    public void pilih_source(Integer int1) {
        Hooks.delay(1);
        prolloPage.selectSource(int1);
    }

    @When("klik create")
    public void klik_create() {
        Hooks.delay(1);
        prolloPage.clickCreate();
    }

}