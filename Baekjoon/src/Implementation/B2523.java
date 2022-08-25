// 별 찍기 - 13
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2523 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        for(int i=0; i<num-1; i++) {
            for(int j=0; j<i+1; j++) {
                bw.write("*");
            }
            bw.newLine();
        }
        int num2 = num;
        for(int i=0; i<num; i++) {
            for(int j=0; j<num2; j++) {
                bw.write("*");
            }
            bw.newLine();
            num2--;
        }
        bw.flush();
    }
}
