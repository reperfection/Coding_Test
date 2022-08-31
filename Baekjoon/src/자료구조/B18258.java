package src.자료구조;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B18258{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int howmany = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int num = 0;
        for(int i=0; i<howmany; i++) {
            String order = br.readLine();
            if(order.contains("push")) {
                st = new StringTokenizer(order);
                st.nextToken();
                num = Integer.parseInt(st.nextToken());
                queue.add(num);
            }
            else if(order.contains("pop")) {
                if(queue.isEmpty() != true) {
                    bw.write(Integer.toString(queue.poll()));
                    bw.newLine();
                }
                else {
                    bw.write("-1");
                    bw.newLine();
                }
            }
            else if(order.contains("size")) {
                bw.write(Integer.toString(queue.size()));
                bw.newLine();
            }
            else if(order.contains("empty")) {
                if(queue.isEmpty()) {
                    bw.write("1");
                    bw.newLine();
                }
                else {
                    bw.write("0");
                    bw.newLine();
                }
            }
            else if(order.contains("front")) {
                if(queue.isEmpty()) {
                    bw.write("-1");
                    bw.newLine();
                }
                else {
                    bw.write(Integer.toString(queue.peek()));
                    bw.newLine();
                }
            }
            else if(order.contains("back")) {
                if(queue.isEmpty()) {
                    bw.write("-1");
                    bw.newLine();
                }
                else {
                    bw.write(Integer.toString(num));
                    bw.newLine();
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
