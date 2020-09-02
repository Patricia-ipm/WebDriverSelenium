package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

    public Login acessar(WebDriver navegador, String email, String senha){
        navegador.findElement(By.id("vSECUSERNAME")).sendKeys(email);
        navegador.findElement(By.id("vSECUSERPASSWORD")).sendKeys(senha);
        navegador.findElement(By.id("BTNENTER")).click();
        return this;
    }


}
