package 자료구조;

// N번째 큰 수 - 우선순위 큐
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.PriorityQueue;

public class B2075 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int num = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<num; i++) {
            String number = br.readLine();
            st = new StringTokenizer(number);
            for(int j=0; j<num; j++) {
                int numb = Integer.parseInt(st.nextToken());
                priorityQueue.add(numb);
            }
        }
        for(int i=0; i<num-1; i++) {
            priorityQueue.remove();
        }
        bw.write(Integer.toString(priorityQueue.peek()));
        bw.flush();
        bw.close();
    }
}
