package BinarySearch;
// 예산
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2512{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine()); // 지방의 수 3이상 10,000이하
        st=new StringTokenizer(br.readLine());
        int [] arr = new int[n];
        for(int i=0; i<arr.length; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        int m = Integer.parseInt(br.readLine()); // 총 예산

        long min = 1;
        long mid = 0;
        long max = arr[arr.length-1];
        while(max>=min) {
            mid = (min+max)/2;
            long sum = 0;
            for(int i=0; i<arr.length; i++) {
                if(arr[i]-mid>0) {
                    sum += mid;
                    //System.out.println(arr[i]+" "+sum);
                }
                else {
                    sum += arr[i];
                    //System.out.println(arr[i]+" "+sum);
                }
            }
            //System.out.println(mid+" "+sum);
            // 이전과는 달리 mid값이 각 배열의 원소값보다 작으면 mid값을 sum에 더해 그대로 배정. mid값이 예산 요청 금액
            // sum += arr[i]-mid;는 틀린 계산
            // 그래서 sum이 총 예산보다 작으면 mid값이 작은 것이므로 최솟값(예산 상한액)을 증가해야 함
            if(sum>m) // 왜 sum>=m 이 아니라 sum>m 인지
                max = mid-1;
            else
                min = mid+1;
        }
        bw.write(Long.toString(max));
        bw.flush();
        bw.close();
    }
}