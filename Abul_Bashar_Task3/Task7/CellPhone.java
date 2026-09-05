public class CellPhone {

    public String model = "unknown";
    public String[] contacts = new String[3];
    public int contactCount = 0;

    public void storeContact(String contact) {

        if (contactCount < 3) {
            contacts[contactCount] = contact;
            contactCount++;

            System.out.println("Contact Stored");
        } else {
            System.out.println("Memory full. New contact can't be stored.");
        }
    }

    public void printDetails() {

        System.out.println("Phone Model " + model);
        System.out.println("Contacts Stored " + contactCount + " Stored");

        if (contactCount > 0) {
            System.out.println("Contacts:");

            for (int i = 0; i < contactCount; i++) {
                System.out.println(contacts[i]);
            }
        }
    }
}
