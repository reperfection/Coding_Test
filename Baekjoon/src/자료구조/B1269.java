package src.자료구조;

// 대칭 차집합
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class B1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String len = br.readLine();
        st = new StringTokenizer(len);
        int len1 = Integer.parseInt(st.nextToken());
        int len2 = Integer.parseInt(st.nextToken());
        HashSet<Integer> set1 = new HashSet<>();
        String str1 = br.readLine();
        st = new StringTokenizer(str1);
        for(int i=0; i<len1; i++) {
            int num = Integer.parseInt(st.nextToken());
            set1.add(num);
        }

        HashSet<Integer> set2 = new HashSet<>();
        String str2 = br.readLine();
        st = new StringTokenizer(str2);
        for(int i=0; i<len2; i++) {
            int num = Integer.parseInt(st.nextToken());
            set2.add(num);
        }

        int sum = 0;

        for(int num : set1) {
            if(!set2.contains(num)) {
                sum += 1;
            }
        }
        for(int num : set2) {
            if(!set1.contains(num)) {
                sum += 1;
            }
        }

        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();
    }
}