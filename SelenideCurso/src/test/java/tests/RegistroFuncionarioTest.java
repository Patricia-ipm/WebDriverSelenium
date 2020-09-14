package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FuncionarioPage;
import pages.LoginPage;
import suport.Web;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class RegistroFuncionarioTest {

    @BeforeMethod
    public void setUp() {
        new Web().site();
        new LoginPage().login("admin", "admin");
    }

    @Test
    public void registroFuncionarioTest() {
        new FuncionarioPage()
                .acessoFuncionario()
                .inserirNovo()
                .funcionario("Joao Carlos", "11122233344", "joao.carlos@live360.com.br");


        $("#Title_DVPANEL_TABLEATTRIBUTESContainer").shouldHave(text("Informações Gerais"));
    }

}