package KSH.CU;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1021 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char arrays[] = new char[51];
        arrays = br.readLine().toCharArray();
        System.out.printf("%s", new String(arrays));
    }
}
