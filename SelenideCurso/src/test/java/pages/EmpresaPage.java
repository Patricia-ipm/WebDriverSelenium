package pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class EmpresaPage {

    public EmpresaPage clicarEmEmpresa() {
        open("http://sistemas.gx2.com.br/RocketTest/empresaww.aspx");
        return this;

    }

    public EmpresaPage clicarInserir() {
        $("#BTNINSERT").click();
        return this;
    }

    public EmpresaPage dados(String cnpj, String social) {
        $("#EMPRESACNPJ").setValue(cnpj);
        $("#EMPRESARAZAOSOCIAL").setValue(social);
        $("#BTNTRN_ENTER").click();
        return this;
    }

    public EmpresaPage downloadExcel() {
        $("#BTNEXPORT").click();
        return this;
    }

}
