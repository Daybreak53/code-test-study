package KSH.CU;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1076 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char x,t='a';
        x = br.readLine().charAt(0);
        do
        {
            System.out.print(t+ " ");
            t+=1;
        }while(t<x+1);

    }
}
