
public class RestaurantTester {
    public static void main(String[] args) {

        Restaurant r = new Restaurant();

        System.out.println("1----------------");
        r.order("Burger");

        System.out.println("2----------------");
        r.order("Pizza", 2);

        System.out.println("3----------------");
        r.order("Pasta", 3, true);
    }
}

