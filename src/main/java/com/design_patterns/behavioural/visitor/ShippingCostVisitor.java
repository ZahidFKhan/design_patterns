package com.design_patterns.behavioural.visitor;

import com.design_patterns.behavioural.visitor.models.Book;
import com.design_patterns.behavioural.visitor.models.CD;
import com.design_patterns.behavioural.visitor.models.DVD;
import lombok.Getter;

/**
 * Concrete Visitor B: Calculates the total shipping cost based on item type and properties. It
 * implements the Visitor interface.
 */
@Getter
public class ShippingCostVisitor implements Visitor {
  private double totalShippingCost = 0.0;

  @Override
  public void visit(Book book) {
    // Shipping cost for books depends on weight
    double BOOK_SHIPPING_RATE_PER_KG = 1.50;
    double shipping = book.weight() * BOOK_SHIPPING_RATE_PER_KG;
    System.out.println(
        "Calculating shipping for Book: "
            + book.title()
            + " - Shipping: $"
            + String.format("%.2f", shipping));
    totalShippingCost += shipping;
  }

  @Override
  public void visit(CD cd) {
    // Flat shipping cost for CDs
    double CD_FLAT_SHIPPING_RATE = 2.00;
    System.out.println(
        "Calculating shipping for CD: "
            + cd.title()
            + " - Shipping: $"
            + String.format("%.2f", CD_FLAT_SHIPPING_RATE));
    totalShippingCost += CD_FLAT_SHIPPING_RATE;
  }

  @Override
  public void visit(DVD dvd) {
    // Flat shipping cost for DVDs
    double DVD_FLAT_SHIPPING_RATE = 3.00;
    System.out.println(
        "Calculating shipping for DVD: "
            + dvd.title()
            + " - Shipping: $"
            + String.format("%.2f", DVD_FLAT_SHIPPING_RATE));
    totalShippingCost += DVD_FLAT_SHIPPING_RATE;
  }
}
