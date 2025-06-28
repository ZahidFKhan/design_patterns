package com.design_patterns.creational.singleton;

public class Main {
  public static void main(String[] args) {
    Configuration configuration = Configuration.getInstance();
    Configuration configuration1 = Configuration.getInstance();
    Configuration configuration2 = Configuration.getInstance();
    Configuration configuration3 = Configuration.getInstance();
    Configuration configuration4 = Configuration.getInstance();

    System.out.println(configuration.hashCode());
    System.out.println(configuration1.hashCode());
    System.out.println(configuration2.hashCode());
    System.out.println(configuration3.hashCode());
    System.out.println(configuration4.hashCode());
  }
}

class Configuration {
  public static class ConfigBuilder {
    public ConfigBuilder() {}

    private static final Configuration CONFIGURATION = new Configuration();
  }

  private Configuration() {}

  public static Configuration getInstance() {
    return ConfigBuilder.CONFIGURATION;
  }
}
