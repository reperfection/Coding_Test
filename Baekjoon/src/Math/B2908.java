package Math;
// 상수
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class B2908{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer(st.nextToken());
        int num1 = Integer.parseInt(sb.reverse().toString());
        sb = new StringBuffer(st.nextToken());
        int num2 = Integer.parseInt(sb.reverse().toString());

        if(num1>num2)
            bw.write(Integer.toString(num1));
        else
            bw.write(Integer.toString(num2));
        bw.flush();
        bw.close();
    }
}
