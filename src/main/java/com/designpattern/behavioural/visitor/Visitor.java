package com.designpattern.behavioural.visitor;

import com.designpattern.behavioural.visitor.models.Book;
import com.designpattern.behavioural.visitor.models.CD;
import com.designpattern.behavioural.visitor.models.DVD;

/**
 * The Visitor interface declares a visit method for each concrete element type. This allows the
 * visitor to perform specific operations on different element types.
 */
public interface Visitor {
  void visit(Book book);

  void visit(CD cd);

  void visit(DVD dvd);
}
