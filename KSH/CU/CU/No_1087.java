
package KSH.CU;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_1087 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =  new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int sum = 0;
        for(int i = 1; ; i++){
            sum += i;
            if(sum >= a){
                System.out.println(sum);
                break;
            }
        }
    }
}
