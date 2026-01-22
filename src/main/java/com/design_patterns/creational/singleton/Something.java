package com.design_patterns.creational.singleton;

public class Something {
  private Something() {}

  public static class LazyHolder {
    static final Something INSTANCE = new Something();
  }

  public static Something getInstance() {
    return LazyHolder.INSTANCE;
  }
}
