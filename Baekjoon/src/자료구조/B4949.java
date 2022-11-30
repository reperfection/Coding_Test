package 자료구조;

// 균형잡힌 세상 - 자료구조(스택)
// 출력형식의 문제로 계속 틀렸음. 개행문자의 문제일까?
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Stack;

public class B4949{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> stack = new Stack<>();

        while(true){
            String str = br.readLine();

            if(str.charAt(0)=='.')
                break;

            for(int i=0; i<str.length(); i++) {
                if(str.charAt(i)=='(' || str.charAt(i)=='[')
                    stack.add(str.charAt(i));

                else if((str.charAt(i)==')' && stack.isEmpty())||(str.charAt(i)==']'&&stack.isEmpty())) {
                    bw.write("no"+"\r\n");
                    break;
                }

                else if(str.charAt(i)==')'&&stack.peek()=='[') {
                    bw.write("no"+"\r\n");
                    break;
                }

                else if(str.charAt(i)==']'&&stack.peek()=='(') {
                    bw.write("no"+"\r\n");
                    break;
                }

                else if(str.charAt(i)==')'&&stack.peek()=='(')
                    stack.pop();

                else if(str.charAt(i)==']'&&stack.peek()=='[')
                    stack.pop();

                else if(str.charAt(i)=='.'&&stack.isEmpty())
                    bw.write("yes"+"\r\n");

                else if(str.charAt(i)=='.'&&stack.isEmpty()==false)
                    bw.write("no"+"\r\n");
            }
            stack.clear();
        }
        bw.flush();
        bw.close();
    }
}