package Math;
// 정수 N개의 합 - 메소드 연습
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class B15596 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int [] a = new int [n];
        for(int i=0; i<n; i++)
            a[i] = i;
        long sum = sum(a);
        bw.write(Long.toString(sum));
        bw.flush();
        bw.close();
    }

    static long sum(int[] a) {
        long ans = 0;
        for(int i=0; i<a.length; i++)
            ans += a[i];
        return ans;
    }
}
