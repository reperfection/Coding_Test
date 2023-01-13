package DP;
//1, 2, 3 더하기

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class B9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testcase = Integer.parseInt(br.readLine());
        int [] dp = new int [11];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i=4; i<=10; i++)
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];

        for (int i = 0; i < testcase; i++) {
            int temp = Integer.parseInt(br.readLine());
            bw.write(Integer.toString(dp[temp]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
