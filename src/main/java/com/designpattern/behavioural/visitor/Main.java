package com.designpattern.behavioural.visitor;

import com.designpattern.behavioural.visitor.models.Book;
import com.designpattern.behavioural.visitor.models.CD;
import com.designpattern.behavioural.visitor.models.DVD;
import java.util.List;

/**
 * Main class to demonstrate the Visitor Pattern. It creates a list of Visitable elements and
 * applies different Visitors to them.
 */
public class Main {
  public static void main(String[] args) {
    // Create a list of different Visitable elements (products)
    List<Visitable> items =
        List.of(
            new Book("The Lord of the Rings", 25.00, 1.2),
            new CD("Abbey Road", 12.00, 17),
            new DVD("Inception", 15.00, 148),
            new Book("Clean Code", 40.00, 0.8),
            new CD("Dark Side of the Moon", 10.00, 9),
            new DVD("The Godfather", 20.00, 175));

    PriceCalculatorVisitor priceCalculator = new PriceCalculatorVisitor();
    ShippingCostVisitor shippingCostCalculator = new ShippingCostVisitor();

    System.out.println("--- Calculating Total Price ---");
    // Iterate through the items and "accept" the PriceCalculatorVisitor
    for (Visitable item : items) {
      item.accept(priceCalculator); // The item decides which visit method to call on the visitor
    }
    System.out.println(
        "Total Price of all items: $" + String.format("%.2f", priceCalculator.getTotalCost()));
    System.out.println("\n");

    System.out.println("--- Calculating Total Shipping Cost ---");
    // Iterate through the items again and "accept" the ShippingCostVisitor
    for (Visitable item : items) {
      item.accept(
          shippingCostCalculator); // The item decides which visit method to call on the visitor
    }
    System.out.println(
        "Total Shipping Cost for all items: $"
            + String.format("%.2f", shippingCostCalculator.getTotalShippingCost()));
  }
}
