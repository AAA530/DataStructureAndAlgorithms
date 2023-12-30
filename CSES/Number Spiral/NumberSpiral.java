
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        long t = Long.parseLong(bufferedReader.readLine());

        while (t-- != 0) {
            String[] input = bufferedReader.readLine().split(" ");
            long x = Long.parseLong(input[0]);
            long y = Long.parseLong(input[1]);

            long ans = 0;
            long diag = Math.max(x, y);
            diag = diag * diag - (diag - 1);
            if (Math.max(x, y) % 2 == 0) {
                ans = diag + (x - y);
            } else {
                ans = diag - (x - y);
            }
            System.out.println(ans);
        }
    }

}