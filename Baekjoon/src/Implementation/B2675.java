package Implementation;
// 문자열 반복
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B2675 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int cnt = Integer.parseInt(br.readLine());
        for(int i=0; i<cnt; i++) {
            String temp = br.readLine();
            st = new StringTokenizer(temp);
            int count = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            for(int j=0; j<str.length(); j++) {
                for(int k=0; k<count; k++) {
                    bw.write(str.charAt(j));
                }
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
