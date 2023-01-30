package KSH.CU;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1024 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char arrays[] = new char[20];
        arrays = br.readLine().toCharArray();
        for (char a: arrays) {
            System.out.printf("\'%c\'\n", a);
        }

    }
}
