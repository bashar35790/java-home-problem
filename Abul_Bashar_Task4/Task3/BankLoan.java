
public class BankLoan {

    public void calculateLoan(double amount) {
        double rate = 8;
        double total = amount + (amount * rate / 100);

        System.out.println("Loan Amount: " + (int) amount);
        System.out.println("Interest Rate: " + (int) rate + "%");
        System.out.println("Total Payable: " + (int) total);
    }

    public void calculateLoan(double amount, int years) {
        double rate = 10;
        double total = amount + (amount * rate * years / 100);

        System.out.println("Loan Amount: " + (int) amount);
        System.out.println("Years: " + years);
        System.out.println("Interest Rate: " + (int) rate + "%");
        System.out.println("Total Payable: " + (int) total);
    }

    public void calculateLoan(double amount, int years, boolean special) {
        double rate = special ? 6 : 10;
        double total = amount + (amount * rate * years / 100);

        System.out.println("Loan Amount: " + (int) amount);
        System.out.println("Years: " + years);
        System.out.println("Special Customer Interest Rate: "
                + (int) rate + "%");
        System.out.println("Total Payable: " + (int) total);
    }
}
