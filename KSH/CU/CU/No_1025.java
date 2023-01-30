package KSH.CU;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1025 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int a = n.charAt(0) - '0';
        int b = n.charAt(1) - '0';
        int c = n.charAt(2) - '0';
        int d = n.charAt(3) - '0';
        int e = n.charAt(4) - '0';
        System.out.printf("[%d0000]\n", a);
        System.out.printf("[%d000]\n", b);
        System.out.printf("[%d00]\n", c);
        System.out.printf("[%d0]\n", d);
        System.out.printf("[%d]\n", e);
    }
}
