package src.DP;

// 피보나치 수 4 - 동적 프로그래밍, 큰 수
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.math.BigInteger;

public class B10826{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        BigInteger result = fibonacci(cnt);
        bw.write(result.toString());
        bw.flush();
        bw.close();
    }
    public static BigInteger fibonacci(int cnt) {
        BigInteger [] arr = new BigInteger [cnt];
        if(cnt==0)
            return BigInteger.ZERO;

        else if(cnt==1)
            return BigInteger.ONE;

        else if(cnt==2)
            return BigInteger.ONE;

        else {
            arr[0] = BigInteger.ONE;
            arr[1] = BigInteger.ONE;
            for(int i=2; i<cnt; i++) {
                arr[i] = arr[i-1].add(arr[i-2]);
            }
            return arr[cnt-1];
        }
    }
}