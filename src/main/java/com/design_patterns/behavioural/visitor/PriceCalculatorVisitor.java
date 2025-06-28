package com.design_patterns.behavioural.visitor;

import com.design_patterns.behavioural.visitor.models.Book;
import com.design_patterns.behavioural.visitor.models.CD;
import com.design_patterns.behavioural.visitor.models.DVD;
import lombok.Getter;

/**
 * Concrete Visitor A: Calculates the total price of items. It implements the Visitor interface and
 * provides specific logic for each element type.
 */
@Getter
public class PriceCalculatorVisitor implements Visitor {
    private double totalCost = 0.0;

    @Override
    public void visit(Book book) {
        // Logic to calculate price for a Book
        double bookCost = book.price();
        System.out.println("Visiting Book: " + book.title() + " - Price: $" + String.format("%.2f", bookCost));
        totalCost += bookCost;
    }

    @Override
    public void visit(CD cd) {
        // Logic to calculate price for a CD (e.g., adding a small handling fee)
        double cdCost = cd.price() + 0.50; // Add a small handling fee for CDs
        System.out.println("Visiting CD: " + cd.title() + " - Price: $" + String.format("%.2f", cdCost));
        totalCost += cdCost;
    }

    @Override
    public void visit(DVD dvd) {
        // Logic to calculate price for a DVD (e.g., adding a discount for longer duration)
        double dvdCost = dvd.price();
        if (dvd.durationMinutes() > 120) {
            dvdCost *= 0.90; // 10% discount for long DVDs
        }
        System.out.println("Visiting DVD: " + dvd.title() + " - Price: $" + String.format("%.2f", dvdCost));
        totalCost += dvdCost;
    }

}
