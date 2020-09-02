package Suport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createChrome(){
        System.setProperty("webdriver.chrome.driver", "C:C:\\Users\\patricia.lemos\\drivers\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.get("http://sistemas.gx2.com.br/RocketTest/wwpbaseobjects.samplelogin.aspx");

        return navegador;
    }



    }








