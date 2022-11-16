package src.Arithmetic;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1546 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int cnt = Integer.parseInt(br.readLine());
        String str = br.readLine();
        st = new StringTokenizer(str);

        double [] arr = new double [cnt];

        for(int i=0; i<cnt; i++) {
            int temp = Integer.parseInt(st.nextToken());
            arr[i] = temp;
        }

        Arrays.sort(arr);

        double average = arrayAverage(arr);
        bw.write(Double.toString(average));
        bw.flush();
        bw.close();
    }
    static double arrayAverage(double [] arr) {
        double max = arr[arr.length-1];
        double [] newarr = new double [arr.length];

        for(int i=0; i<newarr.length; i++) {
            newarr[i] = arr[i]/max*100;
        }

        double avg = 0;
        for(int i=0; i<newarr.length; i++) {
            avg += newarr[i];
        }
        avg = avg/(newarr.length);
        return avg;

    }
}