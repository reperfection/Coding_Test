package Math;
// 소수찾기
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B1978 {
    private static int [] primearr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int cnt = Integer.parseInt(br.readLine());
        String str = br.readLine();
        st = new StringTokenizer(str);
        int prime = 0;
        for(int i=0; i<cnt; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if(temp==1)
                continue;
            else {
                int find = findprime(temp);
                prime += find;
                int find2 = primenum(temp);
                prime += find2;
            }
        }
        br.close();
        bw.write(Integer.toString(prime));
        bw.flush();
        bw.close();
    }

    public static int findprime(int temp) {
        int [] arr= {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for(int i=0; i<primearr.length; i++) {
            arr[i] = temp%primearr[i];
        }
        int answer =0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]!=0)
                answer = 1;
            else {
                answer =0;
                break;
            }
        }
        return answer;
    }
    public static int primenum(int temp) {
        for(int j=0; j<primearr.length; j++) {
            if(temp==primearr[j])
                return 1;
        }
        return 0;
    }
}
