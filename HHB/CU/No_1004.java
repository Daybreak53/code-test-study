import java.io.*;

public class No_1004 {
    public static void main (String args[]) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("\'Hello\'");

        bw.flush();
        bw.close();
    }
}
