import java.util.Scanner;
public class PrintAllOddNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m, n;
        System.out.println("Enter first number:");
        m = scanner.nextInt();
        System.out.println("Enter second number:");
        n = scanner.nextInt();
        System.out.println("The odd numbers from " + m + " to " + n + " are:");
        for(int i=m; i<=n; i++){
            if(i%2!=0){
                System.out.print(i + " "); 
            }
        }
    }
}