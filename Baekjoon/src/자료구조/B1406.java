package src.자료구조;

// 에디터 - 스택
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class B1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Stack<String> stack = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        String str = br.readLine();

        for(int i=0; i<str.length(); i++) {
            String word = String.valueOf(str.charAt(i));
            stack.push(word);
        }
        int cnt = Integer.parseInt(br.readLine());
        //String exp = "";
        for(int i=0; i<cnt; i++) {
            String order = br.readLine();
            if(order.equals("L")) {
                if(stack.isEmpty())
                    continue;
                else
                    stack2.push(stack.peek());
                if(stack.isEmpty())
                    continue;
                else
                    stack.pop();
            }
            else if(order.equals("D")) {
                if(!stack2.isEmpty()) {
                    stack.push(stack2.peek());
                    stack2.pop();
                }
                else
                    continue;
            }
            else if(order.equals("B")) {
                if(stack.isEmpty())
                    continue;
                else
                    stack.pop();
            }
            else {
                st = new StringTokenizer(order);
                st.nextToken();
                String word = st.nextToken();
                stack.push(word);
            }
        }
        br.close();
        int size = stack.size();
        for(int i=0; i<size; i++) {
            stack2.push(stack.peek());
            stack.pop();
        }
        while(stack2.size()!=0) {
            bw.write(stack2.peek());
            stack2.pop();
        }
        bw.flush();
        bw.close();
    }
}