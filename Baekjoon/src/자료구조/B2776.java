package 자료구조;

// 암기왕 - 이분탐색
// 예전에 못 풀 었던 이유 - 이분 탐색을 생각 못했음
// 이후에 오래걸린 이유 - stringtokenizer을 반복문 안에 넣어서 계속 1 혹은 0이 떳음.
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class B2776 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int testcase = Integer.parseInt(br.readLine());

        for(int i=0; i<testcase; i++) {
            int N = Integer.parseInt(br.readLine());
            String num = br.readLine();
            int M = Integer.parseInt(br.readLine());
            String find = br.readLine();

            int [] arr = new int [N];
            st = new StringTokenizer(num);
            for(int j=0; j<N; j++)
                arr[j] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);

            st = new StringTokenizer(find);
            for(int j=0; j<M; j++) {
                int low = 0;
                int high = arr.length-1;
                int key = Integer.parseInt(st.nextToken());
                int result = binarySearch(arr, key, low, high);
                bw.write(Integer.toString(result));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }

    //이진 검색 메소드 - 시간복잡도 O(log2n)
    static int binarySearch(int [] arr, int key, int low, int high) {
        if (low>high)
            return 0;
        else {
            int middle = (low+high)/2;
            if(key == arr[middle])
                return 1;
            else if(key<arr[middle])
                return binarySearch(arr, key, low, middle-1);
            else
                return binarySearch(arr, key, middle+1, high);
        }
    }
}

