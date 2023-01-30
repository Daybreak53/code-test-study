
package KSH.CU;

import java.io.*;
import java.util.StringTokenizer;

public class No_1084 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =  new StringTokenizer(br.readLine());
        int cnt = 0;
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<a; i++) {
            for(int j=0; j<b; j++) {
                for(int k=0; k<c; k++) {
                    bw.write(i + " " + j + " " + k + "\n");
                    cnt++;
                }
            }
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
    }
}
