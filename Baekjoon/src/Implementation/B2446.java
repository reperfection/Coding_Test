package Implementation;
// 별 찍기 - 9
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class B2446 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int line = Integer.parseInt(br.readLine());

        for(int i=0; i<line-1; i++) {
            for(int j=0; j<(line*2-i)-1; j++) {
                if(i>j)
                    bw.write(" ");
                else
                    bw.write("*");
            }
            bw.newLine();
        }

        for(int i=line-1; i>=0; i--) {
            for(int j=0; j<line; j++) {
                if(i>j)
                    bw.write(" ");
                else
                    bw.write("*");
            }
            bw.newLine();
            line++;
        }
        bw.flush();
        bw.close();
    }
}
