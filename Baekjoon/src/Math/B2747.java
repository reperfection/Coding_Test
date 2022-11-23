package Math;
// 피보나치 수 - 시간 초과 -> 동적 프로그래밍 구현할 것
import java.io.*;

public class B2747 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        int result = fibonacci(cnt);
        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
    }
    public static int fibonacci(int cnt) {
        if(cnt<2)
            return cnt;
        else {
            return fibonacci(cnt-1) + fibonacci(cnt-2);
        }
    }
}
