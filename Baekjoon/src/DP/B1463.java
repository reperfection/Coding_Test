package DP;
// 1로 만들기 - bottom-up 방식
// 다시 공부할 것
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.lang.Math;

public class B1463{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int [] dp = new int [n+1];
        dp[0] = dp[1] = 0;
        // bottom-up 방식
        for(int i=2; i<=n; i++) {
            dp[i] = dp[i-1] + 1;
            if(i%2 == 0) dp[i] = Math.min(dp[i], dp[i/2]+1);
            if(i%3 == 0) dp[i] = Math.min(dp[i], dp[i/3]+1);
        }
        bw.write(Integer.toString(dp[n]));
        bw.flush();
        bw.close();
    }

}