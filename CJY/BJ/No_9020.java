import java.io.*;

public class No_9020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < T; i++) {
            int A = 0, B = 0;
            int n = Integer.parseInt(br.readLine());
            for (int j = n / 2; j >= 2; j--) {
                boolean a = false;
                boolean b = false;

                for (int k = 2; k < j; k++) {
                    if(j % k == 0) {
                        a = true;
                        break;
                    }
                }

                if(a) continue;

                for (int k = 2, l = n - j; k < l; k++) {
                    if(l % k == 0) {
                        b = true;
                        break;
                    }
                }

                if(b) continue;

                A = j;
                B = n - j;
                break;
            }
            bw.write(A + " " + B);
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
