package config;
import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
 }
)

public interface MobileConfig extends Config {

        @Key("browserstack.user")
        String getUser();

        @Key("browserstack.key")
        String getKey();

        @Key("remoteUrl")
        String getRemoteUrl();

        @Key("app")
        String getApp();

        @Key("device")
        String getDevice();

        @Key("os_version")
        String getOsVersion();

        @Key("project")
        String getProjectName();

        @Key("build")
        String getBuildName();

        @Key("name")
        String getTestName();

}
