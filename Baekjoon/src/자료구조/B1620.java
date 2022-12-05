package src.자료구조;
// 나는야 포켓몬 마스터 이다솜 - 해시맵
// 왜 연결리스트로 하고, 해시맵 2개로 했는데도 시간 초과가 떴는지
// 형변환 (int)를 해주었더니 되었는가? 찾아내기
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;

public class B1620 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Map<String, Integer> numMap = new HashMap<>();
        Map<Integer, String> monsterMap = new HashMap<>();
        //LinkedList<String> monsters = new LinkedList<>();

        String count = br.readLine();
        st = new StringTokenizer(count);
        int cnt = Integer.parseInt(st.nextToken());
        int find = Integer.parseInt(st.nextToken());


        for(int i=0; i<cnt; i++) {
            String poketmon = br.readLine();
            numMap.put(poketmon, i+1);
            monsterMap.put(i+1, poketmon);
        }


        for(int i=0; i<find; i++) {
            String str = br.readLine();
            if((int)str.charAt(0)>47&&(int)str.charAt(0)<58) {
                bw.write(monsterMap.get(Integer.parseInt(str)));
                bw.newLine();
            }
            else {
                bw.write(Integer.toString(numMap.get(str)));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }
}