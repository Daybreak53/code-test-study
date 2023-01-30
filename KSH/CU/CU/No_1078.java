package KSH.CU;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1078 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i,n,cnt=0;
        n = Integer.parseInt(br.readLine());
        for(i=1; i<=n; i++)
        {
            if(i%2 == 0){
                cnt += i;
            }

        }
        System.out.println(cnt);
    }
}
