import java.io.*;
import java.util.StringTokenizer;

public class No_1091 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        long result = a;

        for(int i=1; i<n; i++){
            result = result * m + d;
        }

        System.out.print(result);

        br.close();
    }
}