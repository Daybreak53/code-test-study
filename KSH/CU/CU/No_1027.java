package KSH.CU;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1027 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String[] arrays = n.split("\\.");
        int y = Integer.parseInt(arrays[0]);
        int m = Integer.parseInt(arrays[1]);
        int d = Integer.parseInt(arrays[2]);
        System.out.printf("%02d-%02d-%04d", d, m, y);
    }
}
