
public class TransportService {

    public void bookRide(String destination) {
        int fare = 100;

        System.out.println("Destination: " + destination);
        System.out.println("Fare: " + fare + " Taka");
    }

    public void bookRide(String destination, int distance) {
        int fare = 100 + (distance * 20);

        System.out.println("Destination: " + destination);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: " + fare + " Taka");
    }

    public void bookRide(String destination, int distance, boolean ac) {
        int fare = 100 + (distance * 20);

        if (ac) {
            fare += 100;
        }

        System.out.println("Destination: " + destination);
        System.out.println("Distance: " + distance + " km");

        if (ac) {
            System.out.println("AC Service Applied");
        }

        System.out.println("Fare: " + fare + " Taka");
    }
}
