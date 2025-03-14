import java.util.Scanner;

public class CoffeeShopSimulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1.Espresso-2$");
        System.out.println("2.Cappuccino-3$");
        System.out.println("3.Latte-3.5$");
        System.out.println("4.Americano-2.5$");
        System.out.println("Choose a coffee:");
        String choice = in.nextLine();
        Coffee coffee = null;
        try {
            coffee = CoffeeFactory.createCoffee(choice);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            in.close();
            return;
        }
        System.out.println("Choose topping:");
        System.out.println("1.Milk-0.5$");
        System.out.println("2.Caramel syrup-0.7$");
        System.out.println("3.Whipped cream-0.6$");
        System.out.println("4.Chocolate syrup-0.8$");
        String toppings = in.nextLine();
        if (!toppings.isEmpty()) {
            String[] toppingChoices = toppings.split(",");
            for (String t : toppingChoices) {
                t = t.trim();
                switch(t) {
                    case "1":
                        coffee = new MilkDecorator(coffee);
                        break;
                    case "2":
                        coffee = new CaramelDecorator(coffee);
                        break;
                    case "3":
                        coffee = new WhippedCreamDecorator(coffee);
                        break;
                    case "4":
                        coffee = new ChocolateSyrupDecorator(coffee);
                        break;
                    default:
                        System.out.println("Error");
                }
            }
        }
        System.out.println("Your order: " + coffee.getDescription());
        System.out.println("Cost: " + coffee.getCost() + "$");
        in.close();
    }
}