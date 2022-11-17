package src.Math;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B4344 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        for(int i=0; i<cnt; i++) {
            String str = br.readLine();
            String avg = average(str);
            bw.write(avg+"%");
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();

    }
    static String average(String str) {
        StringTokenizer st;
        st = new StringTokenizer(str);
        int cnt = Integer.parseInt(st.nextToken());
        double [] arr = new double[cnt];
        double sum = 0;
        for(int i=0; st.hasMoreTokens()!=false; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
            sum += arr[i];
        }

        double avg = sum/cnt;
        double student = 0;
        for(int i=0; i<cnt; i++) {
            if(arr[i]>avg)
                student++;
        }

        double res = student/cnt*100;
        String result = String.format("%.3f", res);
        return result;
    }
}
