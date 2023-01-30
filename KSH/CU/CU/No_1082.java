package KSH.CU;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_1082 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i;
        StringTokenizer st =  new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken(), 16);
        for(i=1; i<16; i++)
            System.out.printf("%X*%X=%X\n", n, i, n*i);
    }
}
