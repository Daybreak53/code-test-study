package KSH.CU;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_1067 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =  new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        System.out.printf("%s\n", a>0 ? "plus" : "minus");
        System.out.printf("%s\n", a%2 ==0 ? "even" : "odd");
    }
}
