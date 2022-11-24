package src.DP;

// 피보나치 수 2 - 동적 프로그래밍(Top-down방식)
import java.io.*;

public class B2748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        //long result = fibonacci_bottomup(cnt);
        long[] arr = new long[cnt];
        for (long i : arr)
            arr[(int) i] = 0;
        long result = fibonacci_topdown(arr, cnt);
        bw.write(Long.toString(result));
        bw.flush();
        bw.close();
    }

    public static long fibonacci_topdown(long[] arr, int cnt) {
        if (arr[cnt - 1] != 0)
            return arr[cnt - 1];
        else {
            if (cnt == 1) {
                arr[0] = 1;
                return arr[0];
            } else if (cnt == 2) {
                arr[0] = 1;
                arr[1] = 1;
                return arr[1];
            } else
                arr[cnt - 1] = fibonacci_topdown(arr, cnt - 1) + fibonacci_topdown(arr, cnt - 2);
            return arr[cnt - 1];
        }
    }
}