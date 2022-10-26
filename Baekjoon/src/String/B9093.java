package String;
// 단어 뒤집기
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B9093 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int num = Integer.parseInt(br.readLine());

        for(int i=0; i<num; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str);
            while(st.hasMoreTokens()==true) {
                StringBuffer sb = new StringBuffer(st.nextToken());
                String reverse = sb.reverse().toString();
                bw.write(reverse+ " ");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
