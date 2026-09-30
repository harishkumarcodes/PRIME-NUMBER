import java.util.Scanner;

public class Prime_check{
    static boolean is_prime(int n){
        if (n==0 || n==1) {
            return false; 
        }
        for(int i = 2; i <= n/2 ; i++){
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
    static void prime_range(int n){
        int i = 0;
        if (n == 0 || n == 1) {
            System.out.println("No prime number is available");
            System.exit(0);
        }
        System.out.println("All the prime numbers till: "+n);
        while (true) {
            if (!is_prime(i)) {
                i++;
                continue;        
            }
            if (i >= n) {
                break;     
            }
            System.out.print(i+"\t");
            i++;
        }
    }
    public static void main(String[] args) {
        int num,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be checked: ");
        num = sc.nextInt();
        if (is_prime(num)) {
            System.out.println("Entered number is a prime number");
        }
        else
            System.out.println("Entered number is not a prime number");
        System.out.print("Enter range for prime numbers: ");
        r = sc.nextInt();
        prime_range(r);
        sc.close();
    }
}