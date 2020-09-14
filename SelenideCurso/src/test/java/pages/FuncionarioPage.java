package pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selectors.byText;

public class FuncionarioPage {
    public FuncionarioPage acessoFuncionario() {
        open("http://sistemas.gx2.com.br/RocketTest/funcionarioww.aspx");
        return this;
    }

    public FuncionarioPage inserirNovo() {
        $("#BTNINSERT").click();
        return this;
    }
    public FuncionarioPage clicarEliminar() {
        $("#vGRIDACTIONS_0001").click();
        return this;
    }
    public FuncionarioPage clicarConfirmar() {
        $("#BTNTRN_ENTER").click();
        return this;
    }

    public FuncionarioPage funcionario(String nome, String cpf, String email) {
        $("#FUNCIONARIONOME").setValue(nome);
        $("#FUNCIONARIOCPF").setValue(cpf);
        $("#FUNCIONARIOEMAIL").setValue(email);
        $("#BTNTRN_ENTER").click();

        return this;
    }
    public FuncionarioPage excluirRegistro() {
        $(byText("Eliminar")).click();
        return this;
    }

}
