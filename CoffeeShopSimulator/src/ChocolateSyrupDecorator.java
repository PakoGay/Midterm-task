public class ChocolateSyrupDecorator extends CoffeeDecorator {
    public ChocolateSyrupDecorator(Coffee coffee) { super(coffee); }
    public double getCost() { return coffee.getCost() + 0.8; }
    public String getDescription() { return coffee.getDescription() + " with Chocolate syrup"; }
}