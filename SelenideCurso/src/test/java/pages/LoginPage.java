package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public LoginPage login(String email, String senha) {
        $("#vSECUSERNAME").setValue(email);
        $("#vSECUSERPASSWORD").setValue(senha);
        $("#BTNENTER").click();

        return this;
    }

    public SelenideElement alert(String mensagem) {

        return $(".gx-warning-message").shouldHave(text(mensagem));
    }


}


