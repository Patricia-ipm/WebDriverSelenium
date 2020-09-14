package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import suport.Web;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class LoginTest {

    @BeforeMethod
    public void navegador() {
        new Web().site();
    }

    @Test
    public void loginSuccess() {
        new LoginPage().login("admin", "admin");

        $("#TEXTBLOCKTITLE_MPAGE").shouldHave(text("Inicio"));
    }

    @Test
    public void incorrectLogin() {
        new LoginPage().login("admin", "kkkkk").alert("Incorrect User/Password");


    }


}