package KSH.CU;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1022 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        if(a.length() <= 2000){
            System.out.printf("%s", a);
        }
    }
}
