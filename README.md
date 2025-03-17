# Midterm-task
Online Payment Gateway (Intermediate – 60 points)
Description
This project is a Payment Gateway Simulator that allows users to process payments using different payment methods, including Credit Card, PayPal, and Cryptocurrency. The system incorporates the Factory Method Pattern to dynamically create payment method objects and the Adapter Pattern to integrate external APIs. A transaction logging mechanism is also included.
Features
1. The user selects a payment method:
Credit Card
PayPal
Cryptocurrency
2. The system collects the necessary details based on the selected method.
3. The payment is processed, and its outcome (completed or failed) is determined randomly (except for PayPal, which always succeeds if login is valid).
4. The transaction details are logged with a timestamp
Code Structure
Main Classes
PaymentMethod (interface) — Defines a processPayment(double amount) method for all payment types.
CreditCardPayment, PayPalPayment, CryptoPayment (classes) — Implement different payment methods.
PaymentFactory — Uses the Factory Method Pattern to create payment objects dynamically.
CreditCardValidatorAdapter, PayPalAPIAdapter — Implement the Adapter Pattern to interact with external validation APIs.
TransactionLogger — Logs all transactions, including payment method, amount, status, and timestamp.
PaymentGateway — The main class that runs the simulation.

  
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
