import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No_1047 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =  new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        System.out.printf("%d", a<<1);
    }
}
