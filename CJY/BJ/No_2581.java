import java.io.*;

public class No_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        br.close();

        int cnt = 0; // 소수의 합
        int min = 0; // 최솟값인 소수

        for (int i = M; i <= N; i++) {
            boolean b = false;
            for (int j = 2; j < i; j++) {
                if(i % j == 0) {
                    b = true;
                    break;
                }
            }
            if(b || i == 1) continue;
            if(min == 0) min = i;
            cnt += i;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(min > 0) {
            bw.write(String.valueOf(cnt));
            bw.newLine();
            bw.write(String.valueOf(min));
        } else {
            bw.write("-1");
        }
        bw.flush();
        bw.close();
    }
}
