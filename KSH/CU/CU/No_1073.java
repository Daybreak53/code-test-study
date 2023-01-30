package KSH.CU;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1073 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String []tokens=str.split(" ");
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("0")){
                break;
            } else {
                System.out.println(tokens[i]);
            }
        }
    }
}
