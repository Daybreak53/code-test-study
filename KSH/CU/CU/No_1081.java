package KSH.CU;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_1081 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i, j;
        StringTokenizer st =  new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for(i=1; i<=n; i++)
            for(j=1; j<=m; j++)
                System.out.printf("%d %d\n", i, j);
    }
}
