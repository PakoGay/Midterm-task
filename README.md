# Midterm-task
Online Payment Gateway (Intermediate – 60 points)
Design Patterns to Apply:

Factory Method
Adapter
Task Overview
Create a Payment Platform that supports multiple payment methods (e.g., credit card, PayPal, cryptocurrency). This system should handle basic transactions and integrate at least one external or legacy API.

Requirements Breakdown
Factory Method Pattern

Encapsulate the creation of different payment method objects, such as CreditCardPayment, PayPalPayment, and CryptoPayment.
Each payment class implements a common interface, e.g., PaymentMethod with processPayment(amount).
Show how a PaymentFactory (or multiple factories) instantiates the correct payment class based on user selection or configuration.
Adapter Pattern

Integrate at least one external or mock API. For example:
A payment validation library for credit cards.
A simplified test service representing PayPal’s API calls.
The Adapter ensures external API calls conform to the internal PaymentMethod interface.
Additional Complexity or Features (to justify 60 points instead of 40):

Include transaction status (pending, completed, failed).
Maintain a transaction history or log.
Provide minimal error handling or exceptions (e.g., insufficient funds, invalid credentials).
(Optional) Implement partial or staged payments if appropriate.
Deliverables
Source Code:
Payment classes for each method, created via the Factory Method.
An Adapter class to communicate with at least one external/mock payment service.
Additional features such as transaction logging or error handling.
Demo Application:
A console or minimal GUI where users can:
Select the payment type.
Enter payment details (e.g., fake credit card info, PayPal account).
Process a transaction (simulate success/failure).
Possibly view a transaction history and statuses.
Point Allocation (Example)
Correct Factory Method implementation (25 points)
Adapter integration with an external or mock API (20 points)
Transaction management, logging, or error-handling features (15 points)

Coffee Shop Simulator (Easy – 40 points)
Description

This project is a simple Coffee Shop Simulator where users can order coffee and customize it with various toppings. The program is implemented using the Decorator Pattern, allowing dynamic addition of new properties (toppings) to coffee objects.
Features
1. The user selects a type of coffee from the available options:
Espresso ($2.0)
Cappuccino ($3.0)
Latte ($3.5)
Americano ($2.5)
2. The user can then add one or more toppings:
Milk (+$0.5)
Caramel syrup (+$0.7)
Whipped cream (+$0.6)
Chocolate syrup (+$0.8)
3. The program displays the final order description along with the total cost.
Code Structure
Main Classes
Coffee (interface) — Defines standard methods getCost() and getDescription() for all coffee types.
Espresso, Cappuccino, Latte, Americano (classes) — Concrete implementations of coffee with predefined costs and descriptions.
CоffeeDecorator (abstract class) — A base class for decorators that extend coffee functionality.
CaramelDecorator, ChocolateSyrupDecorator, MilkDecorator, WhippedCreamDecorator — Decorators adding toppings to coffee.
CoffeeFactory — A factory method that creates coffee objects based on user input.
