public class CaramelDecorator extends CoffeeDecorator {
    public CaramelDecorator(Coffee coffee) { super(coffee); }
    public double getCost() { return coffee.getCost() + 0.7; }
    public String getDescription() { return coffee.getDescription() + " with Caramel syrup"; }
}