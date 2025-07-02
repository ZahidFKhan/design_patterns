package com.design_patterns.behavioural.command.impl;

import com.design_patterns.behavioural.command.Command;
import com.design_patterns.behavioural.command.VimEditor;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CopyCommand implements Command {
  private final VimEditor editor;

  @Override
  public void execute() {
    editor.copy();
  }
}
