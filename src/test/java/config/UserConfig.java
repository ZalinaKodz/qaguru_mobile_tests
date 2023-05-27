package config;
import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:user.properties"
})

public interface UserConfig extends Config {

        @Key("browserstack.user")
        @DefaultValue("zalinakodzova_4HPOF2")
        String getUser();

        @Key("browserstack.key")
        @DefaultValue("qJHfFPiqQFywDYgqzbBK")
        String getKey();

        @Key("remoteUrl")
        @DefaultValue("https://hub.browserstack.com/wd/hub")
        String getRemoteUrl();

}
