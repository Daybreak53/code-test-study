package KSH.CU;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1080 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i,n,sum=0;
        n = Integer.parseInt(br.readLine());
        for(i=1; i<=n; i++) {
            sum += i;
            if(sum >= n){
                System.out.println(i);
                break;
            }
        }
    }
}
