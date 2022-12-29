package BinarySearch;

// 랜선 자르기 - 이분탐색, 다시 풀어볼 것
// B1072 -게임 문제와 마찬가지로 정수 범위 파악을 제대로 못했던 문제
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1654{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st=new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken()); // 랜선의 개수
        int N = Integer.parseInt(st.nextToken()); // 1이상 1이상 1,000,000이하의 정수
        int [] arr = new int [K];
        for(int i=0; i<arr.length; i++)
            arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);

        long max = arr[arr.length-1];
        long min = 1; // 랜선은 자연수
        long mid = 1;

        while(max>=min) { // 이분탐색으로 구하기
            mid = (max+min)/2;
            long arrSum = 0;

            for(int i=0; i<arr.length; i++)
                arrSum += arr[i]/mid;

            // 중간 값이 낮게 측정되어 N을 넘겼으니 최댓값을 줄이는게 아니라 최솟값을 늘려야 한다.
            // 왜 arrSum>N이 아니라 arrSum>=N인지 파악
            if(arrSum>=N)
                min = mid+1;
            else
                max = mid-1;
        }
        bw.write(Long.toString(max));

        bw.flush();
        bw.close();
    }
}