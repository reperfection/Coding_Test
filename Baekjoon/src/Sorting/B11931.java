package src.Sorting;
// 수 정렬하기 4
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


public class B11931 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        int [] arr = new int [cnt];
        for(int i=0; i<cnt; i++)
            arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);
        for(int i=arr.length-1; i>=0; i--) {
            bw.write(Integer.toString(arr[i]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

}
