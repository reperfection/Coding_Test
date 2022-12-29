package BinarySearch;

// 게임 - 이분탐색으로도, 수학적으로도 해결 가능한 문제
// 내가 무엇이 부족한지, 왜 틀렸는지 그리고 어떻게 해결할지 얻어갈 것이 굉장히 많았던 문제
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class B1072{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long x = Long.parseLong(st.nextToken()); // 게임 횟수
        long y = Long.parseLong(st.nextToken()); // 이긴 게임
        long z = y*100/x; // 승률
        if(z>=99)
            bw.write("-1");
        else {
            long left = 0;
            long mid = 0;
            long right = x;
            while(right>=left) {
                mid = (left+right) / 2;
                if(z<(y+mid)*100/(x+mid)) {
                    right = mid -1;
                }
                else
                    left = mid + 1;
            }
            bw.write(Long.toString(left));
        }
        bw.flush();
        bw.close();
    }
}
