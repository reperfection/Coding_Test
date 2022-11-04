package Sorting;

// 중복 빼고 정렬하기 - 셋
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class B10867 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int cnt = Integer.parseInt(br.readLine());
        String num = br.readLine();
        st = new StringTokenizer(num);
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<cnt; i++) {
            int temp = Integer.parseInt(st.nextToken());
            set.add(temp);
        }

        Iterator iter = set.iterator();
        int [] arr = new int [set.size()];
        for(int i=0; i<arr.length; i++) {
            arr[i] = (int) iter.next();
        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++)
            bw.write(arr[i] + " ");
        bw.flush();
        bw.close();
    }

}
