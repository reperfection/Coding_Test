package src.자료구조;

// 문자열 집합
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;

public class B14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String num = br.readLine();
        StringTokenizer st;
        st =  new StringTokenizer(num);
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<num1; i++) {
            String str = br.readLine();
            map.put(str, i);
        }
        int checknum = 0;

        for(int j=0; j<num2; j++) {
            String check = br.readLine();
            if(map.containsKey(check)) {
                checknum++;
            }
        }
        bw.write(Integer.toString(checknum));
        bw.flush();
        bw.close();
    }
}