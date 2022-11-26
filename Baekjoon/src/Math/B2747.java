package Math;

import java.io.*;
// 피보나치 수 - 시간 초과 -> 동적 프로그래밍 구현할 것
/*
동적프로그래밍 구현->Bottom-up 방식(더 흔히 사용됨)
시간 복잡도 : O(n) 선형시간에 끝난다.
 */
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
        int [] arr = new int [cnt];
        if(cnt==1) {
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
