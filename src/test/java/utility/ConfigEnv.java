package utility;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/java/resources/application.properties"})
public interface ConfigEnv extends Config {

    String browser();

    @Key("${environment}.username")
    String username();

    @Key("${environment}.url")
    String url();

    String environment();


}
