package src.자료구조;
// 회사에 있는 사람 - 해시맵
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class B7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int num = Integer.parseInt(br.readLine());

        Map<String, String> map = new HashMap<>();
        for(int i=0; i<num; i++) {
            String str = br.readLine();
            st = new StringTokenizer(str);
            String name = st.nextToken();
            String choice = st.nextToken();
            if(choice.equals("enter")) {
                map.put(name, choice);
            }
            else {
                map.remove(name);
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
        for(int i=keySet.size()-1; i>=0; i--) {
            bw.write(arr[i]);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
