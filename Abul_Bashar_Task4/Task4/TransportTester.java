public class TransportTester {
    public static void main(String[] args) {

        TransportService t = new TransportService();

        System.out.println("1----------------");
        t.bookRide("Dhaka");

        System.out.println("2----------------");
        t.bookRide("Chittagong", 15);

        System.out.println("3----------------");
        t.bookRide("Sylhet", 20, true);
    }
}
