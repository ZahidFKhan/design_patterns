package com.design_patterns.behavioural.command;

import lombok.Setter;

@Setter
public class VimEditMenuOptions {
  private Command copyCommand;
  private Command cutCommand;
  private Command pasteCommand;

  public void copy() {
    copyCommand.execute();
  }

  public void cut() {
    cutCommand.execute();
  }

  public void paste() {
    pasteCommand.execute();
  }
}
