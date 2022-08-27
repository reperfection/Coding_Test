// 나는 요리사다
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class B2953 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int [] arr = new int[5];
        for(int i=0; i<arr.length; i++) {
            String eva = br.readLine();
            st = new StringTokenizer(eva);
            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());
            int three = Integer.parseInt(st.nextToken());
            int four = Integer.parseInt(st.nextToken());
            arr[i] = one+two+three+four;
        }
        int maxnum = 0;
        int max = 0;
        for(int j=0; j<arr.length; j++) {
            if(max<arr[j]) {
                maxnum = j+1;
                max = arr[j];
            }
        }
        bw.write(Integer.toString(maxnum));
        bw.write(" ");
        bw.write(Integer.toString(max));
        bw.flush();
        bw.close();
    }
}