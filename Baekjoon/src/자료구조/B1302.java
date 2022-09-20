package src.자료구조;

// 베스트셀러 - 해시맵
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class B1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<num; i++) {
            String str = br.readLine();
            if(map.containsKey(str)) {
                int cnt = map.get(str);
                cnt++;
                map.put(str, cnt);
            }
            else {
                int cnt = 1;
                map.put(str, cnt);
            }
        }
        br.close();

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        String [] arr = new String[keySet.size()];
        for(int i=0; i<keySet.size(); i++) {
            arr[i] = iterator.next();
        }
        Arrays.sort(arr);
        int max = 0;
        String maxstr = "";
        for(int i=0; i<keySet.size(); i++) {
            if(map.get(arr[i])>max) {
                max = map.get(arr[i]);
                maxstr = arr[i];
            }
            else if(map.get(arr[i])==max)
                continue;
        }
        bw.write(maxstr);

        bw.flush();
        bw.close();
    }
}