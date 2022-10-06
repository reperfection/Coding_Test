package src.자료구조;
// 나는야 포켓몬 마스터 이다솜
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B1620 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Map<Integer, String> map = new HashMap<>();
        String str = br.readLine();
        st = new StringTokenizer(str);
        int input = Integer.parseInt(st.nextToken());
        int find = Integer.parseInt(st.nextToken());

        for(int i=0; i<input; i++) {
            String poketmon = br.readLine();
            map.put(i+1, poketmon);
        }

        for(int i=0; i<find; i++) {
            String finding = br.readLine();
            char temp = finding.charAt(0);
            if(Character.isDigit(temp)==true) {
                bw.write(map.get(Integer.parseInt(finding)));
                bw.newLine();
            }
            else {
                for(Integer j : map.keySet()) {
                    String value = map.get(j);
                    if(finding.equals(value)) {
                        bw.write(Integer.toString(j));
                        bw.newLine();
                    }
                }
            }
        }
        bw.flush();
        bw.close();
    }
}

