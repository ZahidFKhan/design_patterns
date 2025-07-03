package com.design_patterns.behavioural.command;

import lombok.extern.slf4j.Slf4j;

/**
 *  Producer of the event.
 * */
@Slf4j
public class VimEditor {
  private StringBuilder text = new StringBuilder();
  private StringBuilder clipboard = new StringBuilder();

  public void copy() {
    if (text.isEmpty()) {
      log.info("Nothing to be copied.");
    }
    clipboard.append(text);
    log.info("Copied {} to the textboard.\n TEXTBOX : {}\n CLIPBOARD: {}", text, text, clipboard);
  }

  public void cut() {
    if (text.isEmpty()) {
      log.info("Nothing to be copied.");
    }
    clipboard.append(text);
    text = new StringBuilder();
    log.info("Cut {} from the textboard.\n TEXTBOX : {}\n CLIPBOARD: {}", text, text, clipboard);
  }

  public void paste() {
    if (clipboard.isEmpty()) {
      log.info("Nothing to be pasted.");
    }
    text.append(clipboard);
    log.info("Paste into {} the textboard.\n TEXTBOX : {}\n CLIPBOARD: {}", text, text, clipboard);
  }

  public void addText(final String value) {
    log.info("Added {} into the text box.", value);
    text.append(value);
  }
}
