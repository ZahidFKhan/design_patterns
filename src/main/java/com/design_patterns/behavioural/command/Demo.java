package com.design_patterns.behavioural.command;

import com.design_patterns.behavioural.command.impl.CopyCommand;
import com.design_patterns.behavioural.command.impl.CutCommand;
import com.design_patterns.behavioural.command.impl.PasteCommand;

class Demo {
  public static void main(String[] args) {

    VimEditor editor = new VimEditor();

    Command copyCommand = new CopyCommand(editor);
    Command pasteCommand = new PasteCommand(editor);
    Command cutCommand = new CutCommand(editor);

    VimEditMenuOptions vimEditMenuOptions = new VimEditMenuOptions();
    vimEditMenuOptions.setCutCommand(cutCommand);
    vimEditMenuOptions.setPasteCommand(pasteCommand);
    vimEditMenuOptions.setCopyCommand(copyCommand);

    editor.addText("Hello");
    vimEditMenuOptions.cut();
    vimEditMenuOptions.copy();
    vimEditMenuOptions.paste();
  }
}
