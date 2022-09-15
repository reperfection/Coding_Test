package src.자료구조;

// 비밀번호 찾기
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;

public class B17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String num = br.readLine();
        StringTokenizer st;
        st =  new StringTokenizer(num);
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        Map<String, String> map = new HashMap<>();
        for(int i=0; i<num1; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str);
            String str1 = st.nextToken();
            String str2 = st.nextToken();
            map.put(str1, str2);
        }

        for(int j=0; j<num2; j++) {
            String check = br.readLine();
            if(map.containsKey(check)) {
                bw.write(map.get(check));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}