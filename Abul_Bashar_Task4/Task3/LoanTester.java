public class LoanTester {
    public static void main(String[] args) {

        BankLoan b = new BankLoan();

        System.out.println("1----------------");
        b.calculateLoan(100000);

        System.out.println("2----------------");
        b.calculateLoan(200000, 5);

        System.out.println("3----------------");
        b.calculateLoan(300000, 10, true);
    }
}
