
public class Restaurant {

    public void order(String food) {
        int price = 250;

        System.out.println("Order received: " + food);
        System.out.println("Price: " + price + " Taka");
    }

    public void order(String food, int quantity) {
        int price = 400 * quantity;

        System.out.println("Order received: " + quantity + " " + food);
        System.out.println("Price: " + price + " Taka");
    }

    public void order(String food, int quantity, boolean drinks) {
        int price = 450 * quantity;

        System.out.println("Order received: " + quantity + " " + food
                + (drinks ? " (With Drinks)" : ""));

        System.out.println("Price: " + price + " Taka");
    }
}
