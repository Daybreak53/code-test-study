package HHB.BJ;

import java.io.*;

public class No_9020 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); //케이스의 개수
        int[] arr = new int[T];

        boolean[] conf = new boolean[10001];

        conf[0] = true; //1은 소수가 아님 -> 소수아닌건 true로 바꿔줄것

        for(int i=2; i*i<=conf.length; i++) {
            if(!conf[i-1]) { //arr2[1] = 2 부터 시작
                for(int j = i*i; j<=conf.length; j+=i) { //j+=i -> i의 배수
                    conf[j-1] = true; //소수아니면 true
                }
            }
        }

        for(int i=0; i<T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int caseNum : arr) {
            int a = caseNum/2;
            int b = caseNum/2;

            while(true) {
                if(conf[a-1]==false && conf[b-1]==false) {
                    System.out.println(a + " " + b);
                    break;
                }
                a--;
                b++;
            }
        }

        br.close();
    }
}
