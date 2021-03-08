package lab2.classes;

// make Configuration immutable
public final class Configuration {

    private int x;
    private final ConfigurationItem configurationItem;

    public Configuration(ConfigurationItem configurationItem) {
        this.configurationItem = new ConfigurationItem(configurationItem.name);
    }

    public ConfigurationItem getConfigurationItem() {
        return configurationItem;
    }

}
