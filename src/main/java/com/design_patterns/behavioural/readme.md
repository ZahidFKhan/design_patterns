# Strategy Pattern

## difference between Strategy and Dependency Injection

1. In strategy the algorithm differs at runtime, in dependency injection the algorithm remain static .
2. Use strategy pattern when we have large if else hell to decide which algo to run.

## When not to use Strategy?

1. When the no. of algorithm are very small say 2.

#Visitor Pattern
The Visitor pattern is a behavioral design pattern that allows you to separate an algorithm from the objects on which it
operates.
This means you can add new operations to existing object structures without modifying the structures themselves.

EXAMPLE:

You have keyboard mouse, cpu etc. Something went wrong, now there are many periphicals that
could go wrong.

We can add visitor of each peripherical in the Visitor and that will help us diagonalise the issue

# State Pattern

We have a context that is mutable which stores the states and we have concrete states
that are immutable and responsible for changing the states in the mutable context.

- Disadvantage: Adds more classes into the package.
- WHEN TO USE:  Use the pattern when you have a class polluted with massive conditionals that alter how the class
  behaves
  according to the current values of the class’s fields.

# Observer

Publisher and subscriber where we have 1:M relationship.
