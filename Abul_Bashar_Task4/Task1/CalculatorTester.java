
public class CalculatorTester {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("1----------------");
        System.out.println("Sum: " + c.compute(10, 20));

        System.out.println("2----------------");
        System.out.println("Product: " + c.compute(4, 5, 2));

        System.out.println("3----------------");
        System.out.println("Division: " + c.compute(20.0, 4));

        System.out.println("4----------------");
        System.out.println("Average: " + c.compute(10.0, 20.0, 30.0));
    }
}
