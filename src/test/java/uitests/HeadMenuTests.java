package uitests;

import org.junit.jupiter.api.Test;
import pages.HeadMenuPage;

public class HeadMenuTests extends TestsBase {

    HeadMenuPage headMenuPage = new HeadMenuPage();

    @Test
    public void checkLogo() {
        headMenuPage
                .checkLogoVisible()
                .checkLogoLink()
                .checkLogoSrc();

    }
}
