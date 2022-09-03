// 요세푸스 문제 - 큐
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Queue;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int howmany = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer>queue = new LinkedList<>();
        for(int i=0; i<howmany; i++) {
            queue.add(i+1);
        }

        bw.write("<");
        while(!queue.isEmpty()) {
            for(int i=0; i<k-1; i++) {
                int first = queue.peek();
                queue.remove();
                queue.add(first);
            }
            if(queue.size()!=1) {
                bw.write(queue.peek()+", ");
                queue.remove();
            }
            else {
                bw.write(Integer.toString(queue.peek()));
                queue.remove();
            }
        }
        bw.write(">");
        bw.flush();
        bw.close();
    }
}
