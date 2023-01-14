package String;
// 접미사 배열
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.io.IOException;

public class B11656 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        sb.append(br.readLine());
        String [] arr = new String[sb.length()];
        for(int i=0; i<sb.length(); i++) {
            arr[i] = sb.substring(i, sb.length());
        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++)
            bw.write(arr[i]+'\n');
        bw.flush();
        bw.close();
    }
}