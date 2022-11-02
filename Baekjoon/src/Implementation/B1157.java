package Implementation;
// 단어 공부
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.HashMap;

public class B1157 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<Character, Integer> map = new HashMap<>();

        String str = br.readLine();
        String str2 = str.toLowerCase();

        for(int i=0; i<str2.length(); i++) {
            char temp = str2.charAt(i);
            if(map.containsKey(temp))
                map.put(temp, map.get(temp)+1);
            else
                map.put(temp, 1);
        }
        int max = 0;
        char maxkey = 0;
        for(char key : map.keySet()) {
            if(max<map.get(key)) {
                max = map.get(key);
                maxkey = key;
            }
            else if(max==map.get(key)) {
                maxkey = '?';
                break;
            }
        }

        String upperkey = Character.toString(maxkey);
        bw.write(upperkey.toUpperCase());
        bw.flush();
        bw.close();
    }

}
