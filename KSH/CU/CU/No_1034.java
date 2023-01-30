package KSH.CU;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1034 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine(), 8);
        System.out.printf("%d", n);
    }
}
