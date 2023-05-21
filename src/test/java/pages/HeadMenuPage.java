package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Condition.attributeMatching;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class HeadMenuPage {

    public HeadMenuPage checkLogoVisible() {
        step("Проверка Видимости Logo", () -> {
            $(".custom-logo").shouldBe(Condition.visible);
        });
        return this;
    }

    public HeadMenuPage checkLogoLink() {
        step("Проверка Видимости Logo", () -> {
            $(".custom-logo-link").shouldBe(attributeMatching("href",".*it-work.pro.*"));
        });
        return this;
    }

    public HeadMenuPage checkLogoSrc() {
        step("Проверка Видимости Logo", () -> {
            $(".custom-logo").shouldBe(attributeMatching("src",baseUrl +
                    "wp-content/uploads/2022/10/logo_5.jpg"));
        });
        return this;
    }
}
