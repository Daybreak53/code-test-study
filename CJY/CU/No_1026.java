import java.io.*;

public class No_1026 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(Integer.parseInt(br.readLine().split(":")[1])));

        br.close();
        bw.flush();
        bw.close();
    }
}