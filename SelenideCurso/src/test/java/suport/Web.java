package suport;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.isChrome;

public class Web {

    public Web site() {
        isChrome();
        open("http://sistemas.gx2.com.br/RocketTest/wwpbaseobjects.samplelogin.aspx");
        return this;
    }

}
