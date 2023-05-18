package uitests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.ContentConfig;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import webDrivers.WebDriverProvider;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class TestsBase {

  //  ContentConfig contentConfig = ConfigFactory.create(ContentConfig.class, System.getProperties());
    @BeforeAll
    static void beforeAll() {

        WebDriverProvider.configuration();
        Configuration.browser="chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://it-work.pro/";


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
    }

    @BeforeEach
    public void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        step("Открываем " + baseUrl, () -> {
            open(baseUrl);
        });
    }

    @AfterEach
    public void addAttachment(){
       Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}
