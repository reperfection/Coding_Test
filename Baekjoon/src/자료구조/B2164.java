// 카드 2 - 큐
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Queue;
import java.util.Arrays;
import java.util.LinkedList;

public class B2164 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int howmany = Integer.parseInt(br.readLine());
        Queue<Integer>queue = new LinkedList<>();
        for(int i=0; i<howmany; i++) {
            queue.add(i+1);
        }
        while(true) {
            if(queue.size()==1) {
                bw.write(Integer.toString(queue.peek()));
                break;
            }
            queue.remove();
            int last = queue.peek();
            queue.remove();
            queue.add(last);
        }
        bw.flush();
        bw.close();
    }
}
