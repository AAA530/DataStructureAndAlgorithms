import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long temp = n;
        long ans = 0;
        while (temp>1) {
            // long num = sc.nextInt();
            ans = ans + sc.nextInt();
            temp--;
        }

        System.out.println(((n*(n+1)/2) - ans));
        
    }
    
}
