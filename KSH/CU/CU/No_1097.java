
package KSH.CU;

import java.io.IOException;
import java.util.Scanner;

public class No_1097 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[19][19];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int n = scanner.nextInt();
        int x, y;

        for (int i = 0; i < n; i++) {
            x = scanner.nextInt();

            for (int j = 0; j < arr.length; j++) {
                if (arr[x - 1][j] == 0) {
                    arr[x - 1][j] = 1;
                } else {
                    arr[x - 1][j] = 0;
                }
            }

            y = scanner.nextInt();

            for (int k = 0; k < arr.length; k++) {
                if (arr[k][y - 1] == 0) {
                    arr[k][y - 1] = 1;
                } else {
                    arr[k][y - 1] = 0;
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
