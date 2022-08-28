//ABC
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B3047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        String alpha = br.readLine();
        int [] arr = new int [3];
        StringTokenizer st = new StringTokenizer(num);
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        //String [] arr = num.split("\\s");
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++) {
            if(alpha.charAt(i)=='A')
                bw.write(arr[0]+ " ");
            else if(alpha.charAt(i)=='B')
                bw.write(arr[1]+ " ");
            else if(alpha.charAt(i)=='C')
                bw.write(arr[2]+ " ");
        }
        bw.flush();
        bw.close();
    }
}