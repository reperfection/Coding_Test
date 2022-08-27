// 스택
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class B10828 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int num = Integer.parseInt(br.readLine());
        Stack <Integer> stack = new Stack<>();

        for(int i=0; i<num; i++) {
            String order = br.readLine();
            if(order.contains("push")) {
                st = new StringTokenizer(order);
                st.nextToken();
                int pushnum = Integer.parseInt(st.nextToken());
                stack.push(pushnum);
            }
            else if(order.contains("pop")) {
                if(stack.isEmpty()) {
                    bw.write("-1");
                    bw.newLine();
                }
                else {
                    bw.write(Integer.toString(stack.peek()));
                    stack.pop();
                    bw.newLine();
                }
            }
            else if(order.contains("top")) {
                if(stack.isEmpty()) {
                    bw.write("-1");
                    bw.newLine();
                }
                else {
                    bw.write(Integer.toString(stack.peek()));
                    bw.newLine();
                }
            }
            else if(order.contains("size")) {
                bw.write(Integer.toString(stack.size()));
                bw.newLine();
            }

            else if(order.contains("empty")) {
                if(stack.isEmpty()) {
                    bw.write("1");
                    bw.newLine();
                }
                else {
                    bw.write("0");
                    bw.newLine();
                }
            }
        }
        bw.flush();
        bw.close();
    }
}