package Implementation;
// 수 정렬하기
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class B2750 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int len = Integer.parseInt(br.readLine());
        int [] arr = new int [len];
        for(int i=0; i<len; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++) {
            bw.write(Integer.toString(arr[i]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}


