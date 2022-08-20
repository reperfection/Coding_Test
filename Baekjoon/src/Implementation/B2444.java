package Implementation;
// 별찍기 - 7 - 다음번에
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
public class B2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int star = Integer.parseInt(br.readLine());
        br.close();

        for(int i=0; i<star*2-1; i++) {
            for(int j=i; j<star-1; j++)
                bw.write(" ");
            for(int k=0; k<i*2+1; k++)
                bw.write("*");
            bw.flush();

            for(int j=1; j<star-1; j++) {
                bw.write(" ");
            }
            for(int k=(star-i-2)*2+1; k>0; )
                bw.write(" ");
            bw.flush();
        }

        bw.close();
    }
}
