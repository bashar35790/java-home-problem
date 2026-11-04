public class TaxiLagbe {

    String taxiNumber;
    String area;

    String[] passengers = new String[4];

    int totalPassenger = 0;
    int totalFare = 0;

    public void storeInfo(String number, String location) {
        taxiNumber = number;
        area = location;
    }

    public void addPassenger(String name, int fare) {

        if (totalPassenger < 4) {
            passengers[totalPassenger] = name;
            totalPassenger++;

            totalFare += fare;

            System.out.println("Dear " + name + "! Welcome to TaxiLagbe");
        } else {
            System.out.println("Taxi Full! No more passengers can be added");
        }
    }

    public void addPassenger(String name1, int fare1,
                             String name2, int fare2) {

        addPassenger(name1, fare1);
        addPassenger(name2, fare2);
    }

    public void printDetails() {

        System.out.println("Taxi number: " + taxiNumber);
        System.out.println("This taxi can cover " + area + " area");

        System.out.println("Total Passenger: " + totalPassenger);

        System.out.println("Passenger Lists:");

        for (int i = 0; i < totalPassenger; i++) {
            System.out.print(passengers[i] + " ");
        }

        System.out.println();

        System.out.println("Total collected fare: " + totalFare + " Taka");
    }
}
