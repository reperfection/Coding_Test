package Greedy;

// 한조서열정리하고옴ㅋㅋ
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B14659 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int len = Integer.parseInt(br.readLine());
        String str = br.readLine();
        st = new StringTokenizer(str);
        int [] arr = new int [len];
        int [] arrmax = new int [len];
        for(int i=0; i<arr.length; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<len; j++) {
                if(arr[i]>arr[j])
                    arrmax[i]++;
                else
                    break;
            }
        }

        int max = find(arrmax);
        bw.write(Integer.toString(max));
        bw.flush();
        bw.close();
    }

    public static int find(int [] arr) {
        int max = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
}
