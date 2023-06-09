package config;
import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})

public interface MobileConfig extends Config {

        @Key("app")
        @DefaultValue("bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c")
        String getApp();

        @Key("device")
        @DefaultValue("Google Pixel 3")
        String getDevice();

        @Key("os_version")
        @DefaultValue("9.0")
        String getOsVersion();

}
