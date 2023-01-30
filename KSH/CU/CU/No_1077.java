package KSH.CU;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1077 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i,n;
        n = Integer.parseInt(br.readLine());
        for(i=0; i<=n; i++)
        {
            System.out.println(i);
        }
    }
}
