public class WhippedCreamDecorator extends CoffeeDecorator {
    public WhippedCreamDecorator(Coffee coffee) { super(coffee); }
    public double getCost() { return coffee.getCost() + 0.6; }
    public String getDescription() { return coffee.getDescription() + " with Whipped cream"; }
}