package src.자료구조;
// 제로
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class B10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i=0; i<num; i++) {
            int number = Integer.parseInt(br.readLine());
            if(number==0) {
                sum = sum-stack.peek();
                stack.pop();
            }
            else {
                stack.push(number);
                sum = sum+number;
            }
        }
        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();
    }
}

