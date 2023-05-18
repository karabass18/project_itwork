package uitests;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class HeadMenuTests extends TestsBase{
    @Test
    public void checkLogo(){
        $(".custom-logo").shouldBe(Condition.visible);

    }
}
