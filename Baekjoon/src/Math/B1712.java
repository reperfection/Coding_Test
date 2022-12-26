package Math;
// 손익분기점
/*
while문으로 처음에 구했더니 시간초과
사칙연산으로 O(1)으로 구할 수 있는 문제를 O(n)으로 구했던 문제.
방정식을 생각해서 계산했더니 해결
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class B1712{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st=new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());


        if(b>=c)
            bw.write("-1");
        else {
            long result = a/(c-b)+1;
            bw.write(Long.toString(result));
        }
        bw.flush();
        bw.close();
    }
}