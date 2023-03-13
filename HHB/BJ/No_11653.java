package HHB.BJ;

import java.io.*;

public class No_11653 {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int temp = N;

        if(N>1) { //N=1 이면 아무것도 출력하지 않음
            for(int j=2; j<=temp; j++){ //2~N까지 반복

                if(temp%j == 0){ //N이 j로 나눠질때
                    System.out.println(j);
                    temp /= j;
                    j--;
                }
            }
        }
        br.close();
    }
}
