
import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m, n; 
        int sum =0;
        System.out.println("Enter first number: ");
        m = scanner.nextInt();
        System.out.println("Enter second number: ");
        n = scanner.nextInt();
        for(int i=m; i<=n; i++){
            sum+=i;
        }
        System.out.println("The sum of numbers from " + m + " to " + n + " is: " + sum);
    }
}