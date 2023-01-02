package BinarySearch;
/*
B2470 : 두 용액
핵심은 절댓값!
배열을 오름차순 정렬 하면, 배열의 중간으로 갈수록 절댓값은 작아질 것
배열의 양 끝에서 시작해 left와 right의 배열 인덱스값의 합의 절댓값을 저장해 이전에 계산했던 절댓값과 비교
이전 절댓값보다 작은 경우 정답에 가깝기 때문에 두 원소를 따로 저장해 그 절댓값을 이번에 계산해 나온 절댓값으로 갱신
->조건문 반복
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2470{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int [] arr = new int [cnt];
        for(int i=0; i<cnt; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length-1;

        int gap = Integer.MAX_VALUE;
        int num1 = 0;
        int num2 = 0;

        int temp;
        int sum;
        while(right>left) {
            sum = arr[left]+arr[right];
            temp = Math.abs(sum); // 절댓값 반환

            if(temp<gap) {
                gap = temp;
                num1 = arr[left];
                num2 = arr[right];
            }
            if(sum>0)
                right--;
            else
                left++;
        }
        bw.write(Integer.toString(num1)+" "+Integer.toString(num2));
        bw.flush();
        bw.close();
    }
}