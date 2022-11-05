package Implementation;

// 성적 통계
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B5800 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int cnt = Integer.parseInt(br.readLine());
        for(int i=0; i<cnt; i++) {
            String temp = br.readLine();
            st = new StringTokenizer(temp);
            int count = Integer.parseInt(st.nextToken());
            int [] arr = new int [count];
            bw.write("Class "+(i+1));
            bw.newLine();
            for(int j=0; st.hasMoreTokens()!=false; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            int maxgap = 0;
            for(int j=0; j<arr.length-1; j++) {
                int gap = arr[j+1] - arr[j];
                if(maxgap<gap)
                    maxgap = gap;
            }
            bw.write("Max " + arr[arr.length-1] +", Min " + arr[0] + ", Largest gap "+maxgap);
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }

}
