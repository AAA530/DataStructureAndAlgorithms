
import java.util.Scanner;

public class Permutations {

    public static void main(String[] args) {
        // IO io = new IO();

        Scanner io = new Scanner(System.in);
        Long n = io.nextLong();
        if (n >= 4) {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    sb.append(i + " ");
                }
            }
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    sb.append(i + " ");
                }
            }

            System.out.println(sb.toString());

        } else if (n == 1) {
            System.out.print("1");
        } else {
            System.out.println("NO SOLUTION");
        }

    }
}