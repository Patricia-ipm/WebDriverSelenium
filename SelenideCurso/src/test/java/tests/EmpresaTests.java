package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EmpresaPage;
import pages.LoginPage;
import suport.Web;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class EmpresaTests {


    @BeforeMethod
    public void setUp() {
        new Web().site();
        new LoginPage().login("admin", "admin");
    }

    @Test
    public void inserirDados() {
        new EmpresaPage()
                .clicarEmEmpresa()
                .clicarInserir()
                .dados("99999888889", "Empresa Testes e Automação");

        $("#Title_DVPANEL_TABLEATTRIBUTESContainer").shouldHave(text("Informações Gerais"));
    }

    @Test
    public void downloadExcelTest() {
        new EmpresaPage()
                .clicarEmEmpresa()
                .downloadExcel();

        $("#TEXTBLOCKTITLE_MPAGE").shouldHave(text("Empresa"));
    }

}




