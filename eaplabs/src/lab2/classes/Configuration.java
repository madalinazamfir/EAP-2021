package lab2.classes;

// make Configuration immutable
public class Configuration {

    private final ConfigurationItem configurationItem;

    public Configuration(ConfigurationItem configurationItem) {
        this.configurationItem = configurationItem;
    }

    public ConfigurationItem getConfigurationItem() {
        return configurationItem;
    }

}
