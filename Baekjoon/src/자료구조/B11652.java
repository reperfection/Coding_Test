package src.자료구조;
// 카드 - 해시맵
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.HashMap;

public class B11652 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<Long, Integer> map = new HashMap<>();
        int cnt = Integer.parseInt(br.readLine());

        for(int i=0; i<cnt; i++) {
            long temp = Long.parseLong(br.readLine());
            if(map.containsKey(temp))
                map.put(temp, map.get(temp)+1);
            else
                map.put(temp, 1);
        }
        int maxValue = 0;
        long maxKey = 0l;
        for(long key : map.keySet()) {
            if(maxValue<map.get(key)) {
                maxValue = map.get(key);
                maxKey = key;
            }
            else if(maxValue==map.get(key)) {
                if(key<maxKey)
                    maxKey = key;
            }
        }
        bw.write(Long.toString(maxKey));
        bw.flush();
        bw.close();
    }
}


