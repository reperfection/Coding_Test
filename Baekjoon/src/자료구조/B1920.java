// 수 찾기 - 이분 탐색
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringTokenizer st;
        st = new StringTokenizer(str);
        int [] arr = new int [n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int findnum = Integer.parseInt(br.readLine());
        String findstr = br.readLine();
        st = new StringTokenizer(findstr);
        for(int i=0; i<findnum; i++) {
            int findnumber = Integer.parseInt(st.nextToken());
            bw.write(Integer.toString(binarySearch(findnumber, arr)));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
    public static int binarySearch(int key, int arr[]) {

        int mid;
        int left = 0;
        int right = arr.length -1;

        while(right >= left) {
            mid = (right + left) /2;
            if(key ==arr[mid]) {
                return 1;
            }

            if (key < arr[mid])
                right = mid - 1;

            else
                left = mid +1;
        }
        return 0;
    }
}
