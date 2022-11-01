package src.자료구조;
// 막대기 - 스택
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class B17608 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();

        int cnt = Integer.parseInt(br.readLine());
        for(int i=0; i<cnt; i++) {
            stack.add(Integer.parseInt(br.readLine()));
        }
        br.close();
        int max = 0;
        int count = 0;
        for(int i=0; i<cnt; i++) {
            if(i==0) {
                max = stack.pop();
                count++;
                continue;
            }
            int num = stack.peek();
            if(max<num) {
                max = stack.pop();
                count++;
            }
            else
                stack.pop();
        }
        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
    }
}

