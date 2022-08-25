// 별 찍기-7
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2444 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int num2 = num;
        for(int i=num-1; i>0; i--) {
            for(int j=0; j<num; j++) {
                if(j<i)
                    bw.write(" ");
                else
                    bw.write("*");
            }
            num++;
            bw.newLine();
        }
        for(int i=0; i<num2; i++) {
            for(int j=0; j<num; j++) {
                if(i>j)
                    bw.write(" ");
                else
                    bw.write("*");
            }
            bw.newLine();
            num--;
        }
        bw.flush();
    }
}
