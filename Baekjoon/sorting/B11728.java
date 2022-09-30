package sorting;

// 배열 합치기
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;


public class B11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String len = br.readLine();
        st = new StringTokenizer(len);
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        String strA = br.readLine();
        st = new StringTokenizer(strA);
        int [] arr = new int [a+b];
        for(int i=0; i<a; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        String strB = br.readLine();
        st = new StringTokenizer(strB);
        for(int i=0; i<b; i++) {
            arr[a+i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++) {
            bw.write(Integer.toString(arr[i]));
            bw.write(" ");
        }
        bw.flush();
        bw.close();
    }
}