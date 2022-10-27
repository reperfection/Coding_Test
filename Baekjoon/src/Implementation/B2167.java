package src.Implementation;

// 2차원 배열의 합
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B2167 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BㅎufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String arrlen = br.readLine();
        st = new StringTokenizer(arrlen);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int [][] arr = new int [n][m];
        for(int i=0; i<n; i++) {
            String temp = br.readLine();
            st = new StringTokenizer(temp);
            for(int j=0; j<m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int len = Integer.parseInt(br.readLine());

        while(len>0) {
            len--;
            //String [] temp = br.readLine().split(" ");
            String temp = br.readLine();
            st = new StringTokenizer(temp);
            int sum =0;
            int x1 = Integer.parseInt(st.nextToken())-1;
            int y1 = Integer.parseInt(st.nextToken())-1;
            int x2 = Integer.parseInt(st.nextToken())-1;
            int y2 = Integer.parseInt(st.nextToken())-1;

            for(int i=x1; i<=x2; i++) {
                for(int j=y1; j<=y2; j++) {
                    sum = sum + arr[i][j];
                }
            }
            bw.write(Integer.toString(sum));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}

