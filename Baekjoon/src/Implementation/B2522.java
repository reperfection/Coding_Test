import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2522 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        br.close();
        for(int i=num-1; i>0; i--) {
            for(int j=0; j<num; j++) {
                if(j<i)
                    bw.write(" ");
                else
                    bw.write("*");
            }
            bw.newLine();
        }
        for(int i=0; i<num; i++) {
            for(int j=0; j<num; j++) {
                if(i>j)
                    bw.write(" ");
                else
                    bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
