// 홀수
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class B2576 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int [] arr = new int[7];
        for(int i=0; i<7; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }
        Arrays.sort(arr);
        int max = 0;
        int min = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%2!=0)
                max += arr[i];
        }
        for(int j=0; j<arr.length; j++) {
            if(arr[j]%2!=0) {
                min = arr[j];
                break;
            }
        }
        if(max!=0) {
            bw.write(Integer.toString(max));
            bw.newLine();
            bw.write(Integer.toString(min));
        }
        else
            bw.write("-1");
        bw.flush();
        bw.close();
    }
}