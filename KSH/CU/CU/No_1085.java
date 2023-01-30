
package KSH.CU;

import java.io.*;
import java.util.StringTokenizer;

public class No_1085 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =  new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        float n = (float) h*b*c*s/8/1024/1024;
        System.out.printf("%.1f MB", n);
    }
}
