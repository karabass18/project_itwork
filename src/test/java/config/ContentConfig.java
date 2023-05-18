package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:menuContent.properties"})

public interface ContentConfig extends Config {

 /*   @Key("footerContent")
    String[] getFooterContent();

    @Key("headMenu1RowContent")
    String[] getHeadMenu1RowContent();

    @Key("headMenu2RowContent")
    String[] getHeadMenu2RowContent();*/
}
