import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No_1079 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String []tokens=str.split(" ");
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("q")){
                System.out.println(tokens[i]);
                break;
            } else {
                System.out.println(tokens[i]);
            }
        }
    }
}
