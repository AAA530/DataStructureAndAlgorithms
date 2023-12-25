import java.util.Scanner;

public class RepetetionSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int ans = 1;
        int c=1;
        Character prev = s.charAt(0);

        for(int i=1;i<s.length();i++){
            if(prev==s.charAt(i)){
                c++;
                ans = Math.max(c,ans);
            }else{
                c = 1;
                prev = s.charAt(i);
            }
        }
        
        System.out.println(ans);
    }
    
}
