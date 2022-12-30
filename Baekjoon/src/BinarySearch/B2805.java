package BinarySearch;

// 나무 자르기
// 나무를 잘랐을 때 0보다 크거나 같아야 하는 것을 파악. 범위 설정
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2805{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st=new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 나무의 수
        int m = Integer.parseInt(st.nextToken()); // 나무의 길이

        st = new StringTokenizer(br.readLine());

        int [] arr = new int [st.countTokens()];
        for(int i=0; i<arr.length; i++)
            arr[i] = Integer.parseInt(st.nextToken()); // 나무 
        Arrays.sort(arr);

        // long인 이유는 min 과 max를 더 했을 시 int 범위를 넘어서기 때문
        long min = 1;
        long mid = 0;
        long max = arr[arr.length-1];

        // 이분 탐색 시작
        while(max>=min) {
            mid = (max+min)/2;
            long sum = 0;
            for(int i=0; i<arr.length; i++) {
                if(arr[i]>=mid) // mid가 arr[i]보다 같거나 클 시를 생각했어야 했음!! 작으면 기댓값이 안 나옴
                    sum += arr[i]-mid;
            }

            // sum이 왜 >=인지에 대하여
            if(sum>=m)
                min = mid+1;
            else
                max = mid-1;
        }
        bw.write(Long.toString(max));
        bw.flush();
        bw.close();
    }
}