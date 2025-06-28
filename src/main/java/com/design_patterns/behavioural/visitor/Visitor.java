package com.design_patterns.behavioural.visitor;

import com.design_patterns.behavioural.visitor.models.Book;
import com.design_patterns.behavioural.visitor.models.CD;
import com.design_patterns.behavioural.visitor.models.DVD;

/**
 * The Visitor interface declares a visit method for each concrete element type. This allows the
 * visitor to perform specific operations on different element types.
 */
public interface Visitor {
  void visit(Book book);

  void visit(CD cd);

  void visit(DVD dvd);
}
