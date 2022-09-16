package src.자료구조;

// 숫자카드 2 - 해시맵으로 풀기
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;

public class B10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());

        String str = br.readLine();
        StringTokenizer st;
        st = new StringTokenizer(str);
        Map<Integer, Integer> map = new HashMap<>();
        //while(st.hasMoreTokens()!=false) {
        for(int i=0; i<num; i++) {
            int number = Integer.parseInt(st.nextToken());
            if(map.containsKey(number)) {
                int cnt = map.get(number);
                cnt += 1;
                map.put(number, cnt);
            }
            else {
                map.put(number, 1);
            }
        }

        int findNum = Integer.parseInt(br.readLine());
        String findStr = br.readLine();
        st = new StringTokenizer(findStr);
        br.close();
        //while(st.hasMoreTokens()!=false) {
        for(int j=0; j<findNum; j++) {
            int check = Integer.parseInt(st.nextToken());
            if(map.containsKey(check)) {
                bw.write(Integer.toString(map.get(check)));
                bw.write(" ");
            }
            else {
                bw.write("0 ");
            }
        }
        bw.flush();
        bw.close();
    }
}