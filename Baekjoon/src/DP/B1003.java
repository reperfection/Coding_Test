package DP;

// 피보나치 함수
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class B1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testcase; i++) {
            int N = Integer.parseInt(br.readLine());
            int[] fibonacci0 = new int[41];
            int[] fibonacci1 = new int[41];
            fibonacci0[0] = 1;
            fibonacci0[1] = 0;
            fibonacci1[0] = 0;
            fibonacci1[1] = 1;
            for (int k = 2; k <= N; k++) {
                fibonacci0[k] = fibonacci0[k - 1] + fibonacci0[k - 2];
                fibonacci1[k] = fibonacci1[k - 1] + fibonacci1[k - 2];
            }
            bw.write(Integer.toString(fibonacci0[N])+" "+Integer.toString(fibonacci1[N]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}