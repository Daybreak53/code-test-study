
package KSH.CU;

import java.io.IOException;
import java.util.Scanner;

public class No_1093 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[24];

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            arr[num-1] += 1;
        }

        for (int i = 0; i < 23; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
