package Math;
// 피보나치 수 5 - 동적 프로그래밍
import java.io.*;

public class B10870 {
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
        int [] arr = new int [cnt];
        if(cnt==0)
            return 0;
        else if(cnt==1) {
            arr[0] = 1;
            return arr[0];
        }
        else if(cnt==2) {
            arr[0] = 1;
            arr[1] = 1;
            return arr[1];
        }
        else {
            arr[0] = 1;
            arr[1] = 1;
            for(int i=2; i<cnt; i++)
                arr[i] = arr[i-1] + arr[i-2];
            return arr[cnt-1];
        }
    }
}