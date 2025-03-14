public class CoffeeFactory {
    public static Coffee createCoffee(String choice) throws Exception {
        switch(choice) {
            case "1": return new Espresso();
            case "2": return new Cappuccino();
            case "3": return new Latte();
            case "4": return new Americano();
            default: throw new Exception("Error");
        }
    }
}