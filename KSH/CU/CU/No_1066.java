package KSH.CU;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_1066 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =  new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        System.out.printf("%s\n", a%2 ==0 ? "even" : "odd");
        System.out.printf("%s\n", b%2 ==0 ? "even" : "odd");
        System.out.printf("%s\n", c%2 ==0 ? "even" : "odd");
    }
}
