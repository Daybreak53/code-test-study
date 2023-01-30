
package KSH.CU;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class No_1096 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[19][19];
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int whichx = scanner.nextInt();
            int whichy = scanner.nextInt();

            for (int x = 0; x < arr.length; x++) {
                for (int y = 0; y < arr.length; y++) {
                    arr[whichx - 1][whichy - 1] = 1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
