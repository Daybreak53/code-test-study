import java.io.*;

public class No_1035 {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine(), 16);

        System.out.printf("%o",n);

        br.close();
    }
}