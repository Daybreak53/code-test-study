package KSH.CU;

import java.io.IOException;
import java.util.Scanner;

public class No_1072 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[scanner.nextInt()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        for (int i : arr){
            System.out.println(i);
        }
    }
}
