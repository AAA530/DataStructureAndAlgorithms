import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long prev = sc.nextLong();
        long ans =0;
        n--;
        while(n!=0){
            long num = sc.nextLong();
            if(num-prev<0){
                ans = ans + prev - num;
            }else{
                prev = num;
            }
            n--;
        }

        System.out.println(ans);
    }
    
}
